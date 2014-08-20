package com.myhome.member;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myhome.common.DBConnect;

public class MemberDao {

	DBConnect db = new DBConnect();

	public List getList(MemberDto dto) throws SQLException {

		Connection conn = db.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "select * from member";
		ResultSet rs;

		ArrayList<MemberDto> list = new ArrayList<MemberDto>();

		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			MemberDto temp = new MemberDto();
			temp.setSeq(rs.getInt("SEQ"));
			temp.setUserid(rs.getString("USERID"));
			temp.setPassword(rs.getString("PASSWORD"));
			temp.setUsername(rs.getString("USERNAME"));
			temp.setZipcode(rs.getString("ZIPCODE"));
			temp.setAddress1(rs.getString("ADDRESS1"));
			temp.setAddress2(rs.getString("ADDRESS2"));
			temp.setEmail(rs.getString("EMAIL"));
			temp.setPhone(rs.getString("PHONE"));
			temp.setWdate(rs.getString("WDATE"));
			temp.setMdate(rs.getString("MDATE"));
			temp.setDelyn(rs.getString("DELYN"));

			list.add(temp);
		}

		rs.close();
		stmt.close();
		conn.close();

		return list;
	}

	// 로그인용 쿼리 메소드
	public boolean login(String userid, String password) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		boolean result = false;

		String sql = "select count(*) from member where userid='" + userid
				+ "' and password='" + password + "'";

		System.out.println(sql);

		try {
			conn = db.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int cnt = rs.getInt(1);
				if (cnt != 0)
					result = true;
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ex) {
			}
		}
		return result;
	}

	// 회원정보 입력
	public void insert(MemberDto dto) throws SQLException {
		String sql = "insert into member "
				+ "values((select nvl(max(seq+1),1) from member), '"
				+ dto.getUserid() + "', '" + dto.getPassword() + "', '"
				+ dto.getUsername() + "', '" + dto.getZipcode() + "', '"
				+ dto.getAddress1() + "', '" + dto.getAddress2() + "', '"
				+ dto.getEmail() + "', '" + dto.getPhone() + "', " + "sysdate"
				+ ", null" + ", 'N')";

		System.out.println(sql);
		Connection conn = db.getConnection();
		Statement stmt = conn.createStatement();
		stmt.execute(sql);

		stmt.close();
		conn.close();
	}

	// 중복된 아이디 체크
	public boolean isExist(String userid) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		boolean result = false;

		String sql = "select count(*) from member where userid='" + userid + "'";

		System.out.println(sql);

		try {
			conn = db.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int cnt = rs.getInt(1);
				if (cnt != 0)
					result = true;
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ex) {
			}
		}
		return result;
	}
}
