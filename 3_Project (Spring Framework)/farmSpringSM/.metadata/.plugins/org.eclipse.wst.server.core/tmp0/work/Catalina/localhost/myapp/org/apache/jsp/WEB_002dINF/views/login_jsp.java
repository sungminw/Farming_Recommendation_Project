/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-08-08 16:28:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta http-equiv=\"Content-Type\" content=\"text.html; charset=UTF-8\">\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("    <meta content=\"\" name=\"keywords\">\r\n");
      out.write("    <meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Web Fonts -->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Libre+Baskerville:wght@700&family=Open+Sans:wght@400;500;600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Icon Font Stylesheet -->\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Libraries Stylesheet -->\r\n");
      out.write("    <link href=\"../lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Stylesheet -->\r\n");
      out.write("    <link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../css/header.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../css/chart.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../css/login.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Spinner Start -->\r\n");
      out.write("    <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\r\n");
      out.write("        <div class=\"spinner-border text-primary\" role=\"status\" style=\"width: 3rem; height: 3rem;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Spinner End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <!-- Navbar Start -->\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg bg-white navbar-light sticky-top px-4 px-lg-5\">\r\n");
      out.write("  <a href=\"index.jsp\" class=\"navbar-brand d-flex align-items-center\">\r\n");
      out.write("    <h1 class=\"m-0\"><img src=\"../img/logo.png\" style=\"width: 16vw\" /></h1>\r\n");
      out.write("  </a>\r\n");
      out.write("  <button type=\"button\" class=\"navbar-toggler me-0\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("    <div class=\"navbar-nav ms-auto p-4 p-lg-0\">\r\n");
      out.write("      <a href=\"index.html\" class=\"nav-item nav-link active\">Home</a>\r\n");
      out.write("      <a href=\"recomend.html\" class=\"nav-item nav-link\">추천서비스</a>\r\n");
      out.write("      <div class=\"nav-item dropdown\">\r\n");
      out.write("        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">수익 분석</a>\r\n");
      out.write("        <div class=\"dropdown-menu bg-light m-0\">\r\n");
      out.write("\r\n");
      out.write("          <!-- 비용 조회 메뉴의 세부 요소 추가 -->\r\n");
      out.write("          <div class=\"dropdown\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-item dropdown-toggle plusUp\" data-bs-toggle=\"dropdown\">매출 분석</a>\r\n");
      out.write("            <div class=\"dropdown-menu plus\">\r\n");
      out.write("              <a href=\"revenue1.do\" class=\"dropdown-item\">농작물 우선 선택</a>\r\n");
      out.write("              <a href=\"revenue2.do\" class=\"dropdown-item\">지역  우선 선택</a>\r\n");
      out.write("              <!-- 추가적인 서브 메뉴 항목들... -->\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <a href=\"serviceCost.jsp\" class=\"dropdown-item\">비용 조회</a>\r\n");
      out.write("          <a href=\"serviceProfit.jsp\" class=\"dropdown-item\">수익 예측</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <a href=\"servicePolicyCheck.html\" class=\"nav-item nav-link\">지원정책</a>\r\n");
      out.write("      <div class=\"nav-item dropdown\">\r\n");
      out.write("        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">커뮤니티</a>\r\n");
      out.write("        <div class=\"dropdown-menu bg-light m-0\">\r\n");
      out.write("          <a href=\"serviceEsidence.html\" class=\"dropdown-item\">농지 & 거주지 현황</a>\r\n");
      out.write("          <a href=\"festival.html\" class=\"dropdown-item\">지역축제 & 문화행사</a>\r\n");
      out.write("          <a href=\"success.html\" class=\"dropdown-item\">귀농 성공사례</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <a href=\"login.jsp\" class=\"nav-item nav-link\">로그인</a>\r\n");
      out.write("      <a href=\"joinMember.jsp\" class=\"nav-item nav-link\">회원가입</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("    <!-- Navbar End -->\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--Header Moving Picture Start-->\r\n");
      out.write("    <div class=\"container-fluid header_img py-5 mb-5 wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("        <div class=\"container text-center py-5\">\r\n");
      out.write("            <h1 class=\"display-3 text-white mb-4 animated slideInDown\">로그인</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--Header Moving Picture End-->\r\n");
      out.write("\r\n");
      out.write("    <main class=\"container\" id=\"content\">\r\n");
      out.write("      <form class=\"login_box\" action=\" \">\r\n");
      out.write("        <div class=\"login_id_box input_box_design\">\r\n");
      out.write("          <!-- col-sm-offset-3 col-sm-6 col-sm-offset-3 col-xs-12 -->\r\n");
      out.write("          <label for=\"login_id\">아이디&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>\r\n");
      out.write("          <input type=\"text\" name=\"login_id\" id=\"login_id\" placeholder=\"ID를 입력 하세요\" autocomplete=\"off\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"login_pw_box input_box_design\">\r\n");
      out.write("          <label for=\"login_pw\">비밀번호&nbsp;</label>\r\n");
      out.write("          <input type=\"password\" name=\"login_pw\" id=\"login_pw\" placeholder=\"PW를 입력 하세요\" autocomplete=\"off\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"login_button\">\r\n");
      out.write("          <!-- <label for=\"submit_button\"> -->\r\n");
      out.write("            <button type=\"submit\" name=\"submit_button\" id=\"submit_button\"><a href=\"#\">로그인</a></button>\r\n");
      out.write("          <!-- </label> -->\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"service_box\">\r\n");
      out.write("        <div class=\"find_id border_right padding_10\">\r\n");
      out.write("          <a href=\"find_id.jsp\">ID찾기</a>\r\n");
      out.write("        </div> \r\n");
      out.write("        <div class=\"find_pw border_right padding_10\">\r\n");
      out.write("          <a href=\"find_pw.jsp\">PW찾기</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"create_id padding_10\">\r\n");
      out.write("          <a href=\"joinMember.jsp\">회원가입</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer Start -->\r\n");
      out.write("    <div class=\"container-fluid bg-dark footer mt-5 py-5 wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("        <div class=\"container py-5\">\r\n");
      out.write("            <div class=\"row g-5\">\r\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                    <h5 class=\"text-white mb-4\">Our Office</h5>\r\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>서울시 마포구 신촌로 104 4층, 5층<br>그린컴퓨터</p>\r\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>02-715-2111</p>\r\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>http://sinchon.greenart.co.kr/</p>\r\n");
      out.write("                    <div class=\"d-flex pt-3\">\r\n");
      out.write("                        <!-- <a class=\"btn btn-square btn-secondary rounded-circle me-2\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-square btn-secondary rounded-circle me-2\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-square btn-secondary rounded-circle me-2\" href=\"\"><i class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-square btn-secondary rounded-circle me-2\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a> -->\r\n");
      out.write("                        <a class=\"btn btn-square btn-secondary rounded-circle me-2\" href=\"https://github.com/Sanghokim91/WYC\"><i class=\"fab fa-github\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                    <h5 class=\"text-white mb-4\">Quick Links</h5>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"revenue1.html\">매출 확인(농작물우선)</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"revenue2.html\">매출 확인(지역우선)</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"serviceCost.html\">비용 조회</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"serviceProfit.html\">수익 확인</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"servicePolicyCheck.html\">정부지원 정책들</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"festival.html\">지역축제 & 문화행사</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                    <h5 class=\"text-white mb-4\">Business Hours</h5>\r\n");
      out.write("                    <p class=\"mb-1\">Monday - Friday</p>\r\n");
      out.write("                    <h6 class=\"text-light\">09:30 am - 06:20 pm</h6>\r\n");
      out.write("                    <p class=\"mb-1\">Saturday</p>\r\n");
      out.write("                    <h6 class=\"text-light\">Closed</h6>\r\n");
      out.write("                    <p class=\"mb-1\">Sunday</p>\r\n");
      out.write("                    <h6 class=\"text-light\">Closed</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Footer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Copyright Start -->\r\n");
      out.write("    <div class=\"container-fluid bg-secondary text-body copyright py-4\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\r\n");
      out.write("                    &copy; <a class=\"fw-semi-bold\" href=\"#\">WYC - Turning to Farm</a>, All Right Reserved.\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6 text-center text-md-end\">\r\n");
      out.write("                    <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\r\n");
      out.write("                    Designed By <a class=\"fw-semi-bold\" href=\"https://github.com/Sanghokim91/WYC\">Team WYC</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Copyright End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Back to Top -->\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- JavaScript Libraries -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/wow/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/easing/easing.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/counterup/counterup.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/parallax/parallax.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/lightbox/js/lightbox.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Javascript -->\r\n");
      out.write("    <script src=\"../js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
