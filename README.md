대학 벼룩시장
===========

프로젝트 다운로드는 화면 우측 Download ZIP으로 다운로드 가능<br>
이클립스 Existing Projects into Workspace로 import 하면 되며,<br>
import후 톰캣 오류 시 컨텍스트.xml 파일을 꼭 확인 해보시기 바랍니다.<br>

<b><수정사항></b><br>
1. 각 페이지의 파일명을 추적하는 기능 추가.
   - 로그인 기능에서 로그인 후 index.jsp로만 이동하던 문제를 해결
   - 각 게시판 이동 시 헤더에서 해당 게시판의 버튼을 active로 설정 가능
2. 글쓰기 페이지 CSS 추가
3. 회원가입페이지 수정
   - 정보입력 시 조건에 부합하지 않을 시 바로 경고해줌
   - 아이디 입력 조건 수정

<b><각 화면 구성></b><br>
0. 헤더
   - 좌측 : HOME, 게시판1, 게시판2, ....
   - 우측 : (로그인 전) - 로그인, 회원가입
            (로그인 후) - 닉네임(아이디)_방명록링크, 쪽지, 로그아웃

1. 메인화면
   - 학교 홈페이지의 최신 공지글 리스트 출력
   - 각 게시판별 최신글 리스트 출력

2. 게시판화면
   - 뷰 : 게시글형, 앨범형
   - 벼룩시장게시판 : 팝니다, 삽니다로 구분
   - 원룸정보게시판
   - 자유게시판
   - 페이징 : 한페이지에 보이는 게시글의 수 정하고, 한페이지에 페이징 숫자는 1~5까지 보이는게 적당할 것으로 예상
   - 글쓰기 : 글쓰기 화면 만들어야됨
   - 검색 : 제목, 이름으로 검색
   - 작성자명 링크 : 링크 선택 시 작성자명으로 검색, 방명록가기 버튼 출력

3. 로그인화면
   - ID : 영문, 숫자, _ 조합으로 된 문자열만 입력 가능
   - 비밀번호 : RSA를 이용한 암호화
   - 아이디 찾기 : 회원가입 시 등록한 이메일 입력받고, 일치하는 이메일이 있으면 메일로 아이디를 알려줌
   - 비밀번호 찾기 : 아이디와 이메일을 입력받고, 조건이 맞으면 해당 이메일로 비밀번호 변경이 가능한 링크를 전송
   
4. 회원가입 화면
   - 중복체크 : 회원ID, 닉네임
   - 바로 입력 불가 항목 : 회원ID, 주소, 닉네임
   - 이메일 인증 : 최소한의 정보인증을 위함. 회원가입이 완료 된 후 이메일 인증을 보냄. 인증안된 회원은 회원권한 없음
   - 이메일 입력 형식 : 이메일 아이디는 직접 입력하고 도메인은 선택 할 수 있는 폼으로 구성
   - 연락처 입력 형식 : 010 등의 번호는 선택 방식, 중간중간 '-' 으로 구분, 나머지 번호는 직접 입력
   
5. 방명록 화면
   - 방명록 주인의 공개 정보, 방명록 주인이 쓴 게시글 리스트 보기 링크, 방명록 남기기 기능(댓글기능 응용)
   - 자신의 방명록에 들어가면 좌측에 정보수정 등의 네비게이션버튼들을 출력
   - 타인의 방명록에 들어가면 네비게이션은 제외하고 출력
   

