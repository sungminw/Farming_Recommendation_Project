/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-08-30 12:36:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class serviceProfit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/eGovernment/eGovFrameDev-3.9.0-64bit/farmSpringSM/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/farmProject_Spring/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1690418505182L));
  }

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	let sessionId = null;\r\n");
      out.write("</script>\r\n");

	if(session.getAttribute("id") != null){
		String id = (String)session.getAttribute("id");

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	sessionId = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("</script>\r\n");

	}
	//정적 파일 경로를 지정하기 위함
	String contextPath = request.getContextPath();

      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("    <title>WYC - Turn to farming / 수익 확인</title>\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("    <meta content=\"\" name=\"keywords\">\r\n");
      out.write("    <meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link href=\"");
      out.print( contextPath );
      out.write("/resources/img/favicon.ico\" rel=\"icon\">\r\n");
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
      out.write("    <link href=\"");
      out.print( contextPath );
      out.write("/resources/lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print( contextPath );
      out.write("/resources/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print( contextPath );
      out.write("/resources/lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("    <link href=\"");
      out.print( contextPath );
      out.write("/resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Stylesheet -->\r\n");
      out.write("    <link href=\"");
      out.print( contextPath );
      out.write("/resources/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- <link href=\"");
      out.print( contextPath );
      out.write("/resources/css/chart.css\" rel=\"stylesheet\"> -->\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( contextPath );
      out.write("/resources/css/serviceProfit.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- 컨펌 꾸미기 -->\r\n");
      out.write("	<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	let crop = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${selectCrop}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("	let area = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${selectArea}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("	let salesResult = parseInt('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${salesResult}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("	let costPolicy = parseInt('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${costPolicy}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("	let	 costResult = parseInt('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${costResult}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("	\r\n");
      out.write("	console.log(crop);\r\n");
      out.write("	console.log(area);\r\n");
      out.write("	console.log(\"salesResult : \" + salesResult);\r\n");
      out.write("	console.log(\"costPolicy : \" + costPolicy);\r\n");
      out.write("	console.log(\"costResult : \" + costResult);\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("    <!-- Spinner Start -->\r\n");
      out.write("    <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\r\n");
      out.write("        <div class=\"spinner-border text-primary\" role=\"status\" style=\"width: 3rem; height: 3rem;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Spinner End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Navbar Start -->\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg bg-white navbar-light sticky-top px-4 px-lg-5\">\r\n");
      out.write("  <a href=\"index.do\" class=\"navbar-brand d-flex align-items-center\">\r\n");
      out.write("    <h1 class=\"m-0\"><img src=\"");
      out.print( contextPath );
      out.write("/resources/img/logo.png\" style=\"width: 16vw\" /></h1>\r\n");
      out.write("  </a>\r\n");
      out.write("  <button type=\"button\" class=\"navbar-toggler me-0\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("    <div class=\"navbar-nav ms-auto p-4 p-lg-0\">\r\n");
      out.write("      <a href=\"index.do\" class=\"nav-item nav-link active\">Home</a>\r\n");
      out.write("<!--       <a href=\"recomend.do\" class=\"nav-item nav-link\">추천서비스</a> -->\r\n");
      out.write("      <div class=\"nav-item dropdown\">\r\n");
      out.write("        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">수익 분석</a>\r\n");
      out.write("        <div class=\"dropdown-menu bg-light m-0\">\r\n");
      out.write("\r\n");
      out.write("          <!-- 비용 조회 메뉴의 세부 요소 추가 -->\r\n");
      out.write("          <div class=\"dropdown\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-item dropdown-toggle plusUp\" data-bs-toggle=\"dropdown\">매출 분석</a>\r\n");
      out.write("            <div class=\"dropdown-menu plus\">\r\n");
      out.write("              <a href=\"serviceSales1.do\" class=\"dropdown-item\">농작물 우선 선택</a>\r\n");
      out.write("              <a href=\"serviceSales2.do\" class=\"dropdown-item\">지역  우선 선택</a>\r\n");
      out.write("              <!-- 추가적인 서브 메뉴 항목들... -->\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <a href=\"serviceCost.do\" class=\"dropdown-item\">비용 조회</a>\r\n");
      out.write("          <a href=\"serviceProfit.do\" class=\"dropdown-item\">수익 예측</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <a href=\"servicePolicyCheck.do\" class=\"nav-item nav-link\">지원정책</a>\r\n");
      out.write("      <div class=\"nav-item dropdown\">\r\n");
      out.write("        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">커뮤니티</a>\r\n");
      out.write("        <div class=\"dropdown-menu bg-light m-0\">\r\n");
      out.write("          <a href=\"festival.do\" class=\"dropdown-item\">지역축제 & 문화행사</a>\r\n");
      out.write("          <a href=\"success.do\" class=\"dropdown-item\">귀농 성공사례</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <a href=\"login.do\" class=\"nav-item nav-link loginNav\">로그인</a>\r\n");
      out.write("      <a href=\"joinMember.do\" class=\"nav-item nav-link joinNav\">회원가입</a>\r\n");
      out.write("      <a href=\"logout.do\" class=\"nav-item nav-link logoutNav\" style=\"display: none\">로그아웃</a>\r\n");
      out.write("      <a href=\"mypage.do?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"nav-item nav-link myPageNav\" style=\"display: none\">마이페이지</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("    <!-- Navbar End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Page Header Start -->\r\n");
      out.write("    <div class=\"container-fluid header_img py-5 mb-5 wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("      <div class=\"container text-center py-5\">\r\n");
      out.write("          <h1 class=\"display-3 text-white mb-4 animated slideInDown\">수익 확인</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"text-center mx-auto pb-4 wow fadeInUp\" data-wow-delay=\"0.1s\" style=\"max-width: 500px;\">\r\n");
      out.write("      <p class=\"section-title bg-white text-center text-primary px-3\">수익 예측</p>\r\n");
      out.write("      <h1 class=\"mb-5\">매출과 비용을 고려한<br>수익을 확인해보세요.</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page Header End -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"visualization_box_container container-xxl\">\r\n");
      out.write("          <div class=\"visualization_box\">\r\n");
      out.write("            <div class=\"visualization_text\">\r\n");
      out.write("              <div class=\"default_message\">원하는 경작면적과 노동인구를 선택하세요.</div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("    </div><br/>\r\n");
      out.write("\r\n");
      out.write("    <main class=\"container-xxl py-5\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("       <!-- onsubmit=\"return false\" DB연동시 삭제 -->\r\n");
      out.write("        <form class=\"select_box row\" action=\"#\" method=\"post\" id=\"resultForm\">\r\n");
      out.write("          <div class=\"se-lect_option_box row col-lg-8 col-md-8 col-xs-12\">\r\n");
      out.write("            <div id=\"buttonContainer\"class=\"select_sales col-lg-3 col-xs-6\">\r\n");
      out.write("              <!-- <input type=\"text\" name=\"cost_datalist\" list=\"cost_datalist\"> -->\r\n");
      out.write("              <select class=\"select_option_sales select_box_style\" id=\"filterSelect\" name=\"select_crop_select\">\r\n");
      out.write("                <option value=\"sales\">농작물 선택</option>\r\n");
      out.write("                <!-- 테스트 테스트 -->\r\n");
      out.write("                <option value=\"spotato\">고구마</option>\r\n");
      out.write("                <option value=\"pepper\">고추</option>\r\n");
      out.write("                <option value=\"greenonion\">대파</option>\r\n");
      out.write("                <option value=\"stberry\">딸기</option>\r\n");
      out.write("                <option value=\"garlic\">마늘</option>\r\n");
      out.write("                <option value=\"peach\">복숭아</option>\r\n");
      out.write("                <option value=\"spinach\">시금치</option>\r\n");
      out.write("                <option value=\"onion\">양파</option>\r\n");
      out.write("                <option value=\"cucumber\">오이</option>\r\n");
      out.write("                <option value=\"rice\">정곡</option>\r\n");
      out.write("                <option value=\"chives\">쪽파</option>\r\n");
      out.write("                <option value=\"kiwi\">참다래</option>\r\n");
      out.write("                <option value=\"tomato\">토마토</option>\r\n");
      out.write("                <option value=\"grape\">포도</option>\r\n");
      out.write("                \r\n");
      out.write("              </select>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"select_cost col-lg-3 col-xs-6\">\r\n");
      out.write("              <select class=\"select_option_cost select_box_style\" id=\"regionSelect\" name=\"select_region_select\">\r\n");
      out.write("                <option value=\"cost\">지역 선택</option>\r\n");
      out.write("                <!-- 테스트 테스트 -->\r\n");
      out.write("                <option class=\"filterButton stberry chives cucumber\" value=\"gangjin\">강진군</option>\r\n");
      out.write("                <option class=\"filterButton pepper rice garlic\" value=\"goheung\">고흥군</option>\r\n");
      out.write("                <option class=\"filterButton stberry spinach kiwi\" value=\"gokseong\">곡성군</option>\r\n");
      out.write("                <option class=\"filterButton tomato chives peach\" value=\"gwangyang\">광양시</option>\r\n");
      out.write("                <option class=\"filterButton cucumber chives greenonion\" value=\"gurye\">구례군</option>\r\n");
      out.write("                <option class=\"filterButton tomato stberry onion\" value=\"naju\">나주시</option>\r\n");
      out.write("                <option class=\"filterButton grape stberry tomato\" value=\"damyang\">담양군</option>\r\n");
      out.write("                <option class=\"filterButton chives cucumber grape\" value=\"mokpo\">목포시</option>\r\n");
      out.write("                <option class=\"filterButton spatao garlic rice\" value=\"muan\">무안군</option>\r\n");
      out.write("                <option class=\"filterButton stberry kiwi onion\" value=\"boseong\">보성군</option>\r\n");
      out.write("                <option class=\"filterButton peach cucumber stberry\" value=\"suncheon\">순천시</option>\r\n");
      out.write("                <option class=\"filterButton spinach kiwi greenonion\" value=\"sinan\">신안군</option>\r\n");
      out.write("                <option class=\"filterButton onion garlic grape\" value=\"yeosu\">여수시</option>\r\n");
      out.write("                <option class=\"filterButton stberry spatao onion\" value=\"yeonggwang\">영광군</option>\r\n");
      out.write("                <option class=\"filterButton spatao rice pepper\" value=\"yeongam\">영암군</option>\r\n");
      out.write("                <option class=\"filterButton rice spinach greenonion\" value=\"wando\">완도군</option>\r\n");
      out.write("                <option class=\"filterButton tomato grape stberry\" value=\"jangseung\">장성군</option>\r\n");
      out.write("                <option class=\"filterButton stberry spinach peach\" value=\"jangheung\">장흥군</option>\r\n");
      out.write("                <option class=\"filterButton pepper greenonion onion\" value=\"jindo\">진도군</option>\r\n");
      out.write("                <option class=\"filterButton pepper onion garlic\" value=\"hampyeong\">함평군</option>\r\n");
      out.write("                <option class=\"filterButton spatao rice greenonion\" value=\"haenam\">해남군</option>\r\n");
      out.write("                <option class=\"filterButton tomato rice peach\" value=\"hwasun\">화순군</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"select_cost col-lg-3 col-xs-6\">\r\n");
      out.write("              <select class=\"select_option_cost select_box_style\" name=\"select_area_select\" id=\"select_area_select\">\r\n");
      out.write("                <option value=\"cost\">경작 면적 선택</option>\r\n");
      out.write("                <!-- 테스트 테스트 -->\r\n");
      out.write("                <option value=\"1\" selected>10a</option>\r\n");
      out.write("                <option value=\"2\">20a</option>\r\n");
      out.write("                <option value=\"3\">30a</option>\r\n");
      out.write("                <option value=\"4\">40a</option>\r\n");
      out.write("                <option value=\"5\">50a</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"select_cost col-lg-3 col-xs-6\">\r\n");
      out.write("              <select class=\"select_option_cost select_box_style\" name=\"select_work_select\" id=\"select_work_select\">\r\n");
      out.write("                <option value=\"cost\">노동 인구 선택</option>\r\n");
      out.write("                <!-- 테스트 테스트 -->\r\n");
      out.write("                <option value=\"0\" selected>1명</option>\r\n");
      out.write("                <option value=\"1\">2명</option>\r\n");
      out.write("                <option value=\"2\">3명</option>\r\n");
      out.write("                <option value=\"3\">4명</option>\r\n");
      out.write("                <option value=\"4\">5명</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"reset_sumbmit_box row col-lg-4 col-md-4\">\r\n");
      out.write("<!--             <div class=\"col-lg-6\"> -->\r\n");
      out.write("<!--               <input type=\"reset\" name=\"reset_button\" id=\"reset_button\" value=\"초기화\" class=\"select_box_button\"> -->\r\n");
      out.write("<!--             </div> -->\r\n");
      out.write("            <!-- <label for=\"reset_button\" class=\"select_box_button_label\"></label> -->\r\n");
      out.write("            <div class=\"offset-lg-6 col-lg-6\">\r\n");
      out.write("              <input type=\"submit\" name=\"submit_button\" id=\"submit_button\" value=\"검색\" class=\"select_box_button\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- <label for=\"submit_button\" class=\"select_box_button_label\"></label> -->\r\n");
      out.write("          </div>\r\n");
      out.write("        </form><br/>\r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row gx-4 modal-onion\" id=\"chartContainer\">\r\n");
      out.write("                <canvas id=\"myChart\"></canvas>\r\n");
      out.write("        </div><br/>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"sales_element\">※ 해당 비용은 농작물, 지역, 경작 면적, 노동 인구를 종합한 비용입니다.</div>   \r\n");
      out.write("        \r\n");
      out.write("        <table class=\"select_profit\" id=\"dataTable\" width=100%>\r\n");
      out.write("         <tr>\r\n");
      out.write("            <th>매출</th>\r\n");
      out.write("            <th>비용</th>\r\n");
      out.write("            <th>정책 지원금</th>\r\n");
      out.write("            <th>수익</th>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr id=\"myChartContainer\">\r\n");
      out.write("            <td class=\"salesResultTd\">0</td>\r\n");
      out.write("            <td class=\"costResultTd\">0</td>\r\n");
      out.write("            <td class=\"costPolicyTd\">0</td>\r\n");
      out.write("            <td class=\"profitTd\">0</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("       \r\n");
      out.write("    </main>            \r\n");
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
      out.write("                        <a class=\"btn btn-square btn-secondary rounded-circle me-2\" href=\"https://github.com/Sanghokim91/WYC\"><i class=\"fab fa-github\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\r\n");
      out.write("                    <h5 class=\"text-white mb-4\">Quick Links</h5>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"serviceSales1.do\">매출 확인(농작물우선)</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"serviceSales2.do\">매출 확인(지역우선)</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"serviceCost.do\">비용 조회</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"serviceProfit.do\">수익 확인</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"servicePolicyCheck.do\">정부지원 정책들</a>\r\n");
      out.write("                    <a class=\"btn btn-link\" href=\"festival.do\">지역축제 & 문화행사</a>\r\n");
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
      out.write("      <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\r\n");
      out.write("                  &copy; <a class=\"fw-semi-bold\" href=\"#\">WYC - Turning to Farm</a>, All Right Reserved.\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6 text-center text-md-end\">\r\n");
      out.write("                  <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\r\n");
      out.write("                  Designed By <a class=\"fw-semi-bold\" href=\"https://github.com/sungminw/WYC_profit_Prediction.git\">Team WYC</a>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Copyright End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Back to Top -->\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- JavaScript Libraries -->\r\n");
      out.write("    <!-- <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script> -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/lib/wow/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/lib/easing/easing.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/lib/counterup/counterup.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/lib/parallax/parallax.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/lib/lightbox/js/lightbox.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Javascript -->\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/serviceProfit.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.print( contextPath );
      out.write("/resources/js/userMgmt.js\"></script>\r\n");
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
