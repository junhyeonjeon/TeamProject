/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2014-08-20 12:09:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<title>회원가입</title>\r\n");
      out.write("\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link href=\"./css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"./assets/css/docs.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery Version 1.11.0 -->\r\n");
      out.write("<script src=\"js/jquery-1.11.0.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- script -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/member.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #e3e3e3\">\r\n");
      out.write("\t<form name=\"join\" method=\"post\" class=\"form-horizontal\" role=\"form\" autocomplete=\"off\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"idcheck\" id=\"idcheck\" value=\"N\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-plus\"></span>&nbsp;Join In\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-lg-3 control-label\">회원 ID</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-5\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"userid\" id=\"userid\" type=\"text\" class=\"form-control\" placeholder=\"중복체크 버튼을 누르세요\" readonly> \r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"btn btn-default btn-xs\" type=\"button\" value=\"ID 중복체크\" style=\"margin-top: 5px\" onclick=\"openIDCheck()\"> \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-lg-3 control-label\">비밀번호</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"password1\" type=\"password\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-lg-3 control-label\">비밀번호 확인</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"password2\" type=\"password\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Check Password\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-lg-3 control-label\">닉네임</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"username\" type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Name\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-lg-3\"></label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"btn btn-default btn-sm\" type=\"button\" value=\"주소 찾기\" style=\"margin-top: 5px\" onclick=\"goFindZipcode()\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-lg-3 control-label\">우편번호</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"zipcode\" id=\"zipcode\" type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Zip-Code\" readonly>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-lg-3 control-label\">주소</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-7\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"address1\" id=\"address1\" type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Address1\" readonly>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-lg-3 control-label\">상세주소</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-7\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"address2\" type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Address2\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-lg-3 control-label\">이메일</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"email\" type=\"email\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"E-mail\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-lg-3 control-label\">연락처</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"phone\" type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Phone\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" onclick=\"javascript:history.back(-1)\">취소</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" onclick=\"goJoin()\">회원가입</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
