<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
	let sessionId = null;
</script>
<%
	if(session.getAttribute("id") != null){
		String id = (String)session.getAttribute("id");
%>
<script type="text/javascript">
	sessionId = '${id}';
</script>
<%
	}
	//정적 파일 경로를 지정하기 위함
	String contextPath = request.getContextPath();
%>
</script>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>WYC - Turn to farming / 수익 확인</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="<%= contextPath %>/resources/img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Libre+Baskerville:wght@700&family=Open+Sans:wght@400;500;600&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@700&display=swap" rel="stylesheet">

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="<%= contextPath %>/resources/lib/animate/animate.min.css" rel="stylesheet">
    <link href="<%= contextPath %>/resources/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="<%= contextPath %>/resources/lib/lightbox/css/lightbox.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="<%= contextPath %>/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="<%= contextPath %>/resources/css/style.css" rel="stylesheet">
    <!-- <link href="<%= contextPath %>/resources/css/chart.css" rel="stylesheet"> -->

    <link rel="stylesheet" href="<%= contextPath %>/resources/css/serviceProfit.css">
    
    <!-- 컨펌 꾸미기 -->
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	
</head>
<body>

<script type="text/javascript">
	let crop = '${selectCrop}';
	let area = '${selectArea}';
	let salesResult = parseInt('${salesResult}');
	let costPolicy = parseInt('${costPolicy}');
	let	 costResult = parseInt('${costResult}');
	
	console.log(crop);
	console.log(area);
	console.log("salesResult : " + salesResult);
	console.log("costPolicy : " + costPolicy);
	console.log("costResult : " + costResult);
	
</script>
    <!-- Spinner Start -->
    <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
        <div class="spinner-border text-primary" role="status" style="width: 3rem; height: 3rem;"></div>
    </div>
    <!-- Spinner End -->

    <!-- Navbar Start -->
<nav class="navbar navbar-expand-lg bg-white navbar-light sticky-top px-4 px-lg-5">
  <a href="index.do" class="navbar-brand d-flex align-items-center">
    <h1 class="m-0"><img src="<%= contextPath %>/resources/img/logo.png" style="width: 16vw" /></h1>
  </a>
  <button type="button" class="navbar-toggler me-0" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarCollapse">
    <div class="navbar-nav ms-auto p-4 p-lg-0">
      <a href="index.do" class="nav-item nav-link active">Home</a>
<!--       <a href="recomend.do" class="nav-item nav-link">추천서비스</a> -->
      <div class="nav-item dropdown">
        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">수익 분석</a>
        <div class="dropdown-menu bg-light m-0">

          <!-- 비용 조회 메뉴의 세부 요소 추가 -->
          <div class="dropdown">
            <a href="#" class="dropdown-item dropdown-toggle plusUp" data-bs-toggle="dropdown">매출 분석</a>
            <div class="dropdown-menu plus">
              <a href="serviceSales1.do" class="dropdown-item">농작물 우선 선택</a>
              <a href="serviceSales2.do" class="dropdown-item">지역  우선 선택</a>
              <!-- 추가적인 서브 메뉴 항목들... -->
            </div>
          </div>
          <a href="serviceCost.do" class="dropdown-item">비용 조회</a>
          <a href="serviceProfit.do" class="dropdown-item">수익 예측</a>
        </div>
      </div>
      <a href="servicePolicyCheck.do" class="nav-item nav-link">지원정책</a>
      <div class="nav-item dropdown">
        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">커뮤니티</a>
        <div class="dropdown-menu bg-light m-0">
          <a href="festival.do" class="dropdown-item">지역축제 & 문화행사</a>
          <a href="success.do" class="dropdown-item">귀농 성공사례</a>
        </div>
      </div>
      <a href="login.do" class="nav-item nav-link loginNav">로그인</a>
      <a href="joinMember.do" class="nav-item nav-link joinNav">회원가입</a>
      <a href="logout.do" class="nav-item nav-link logoutNav" style="display: none">로그아웃</a>
      <a href="mypage.do?id=${id }" class="nav-item nav-link myPageNav" style="display: none">마이페이지</a>
    </div>
  </div>
</nav>
    <!-- Navbar End -->

    <!-- Page Header Start -->
    <div class="container-fluid header_img py-5 mb-5 wow fadeIn" data-wow-delay="0.1s">
      <div class="container text-center py-5">
          <h1 class="display-3 text-white mb-4 animated slideInDown">수익 확인</h1>
      </div>
  </div>

    <div class="text-center mx-auto pb-4 wow fadeInUp" data-wow-delay="0.1s" style="max-width: 500px;">
      <p class="section-title bg-white text-center text-primary px-3">수익 예측</p>
      <h1 class="mb-5">매출과 비용을 고려한<br>수익을 확인해보세요.</h1>
  </div>

    <!-- Page Header End -->
    
    <div class="visualization_box_container container-xxl">
          <div class="visualization_box">
            <div class="visualization_text">
              <div class="default_message">원하는 경작면적과 노동인구를 선택하세요.</div>
            </div>
          </div>
    </div><br/>

    <main class="container-xxl py-5">
    
    
       <!-- onsubmit="return false" DB연동시 삭제 -->
        <form class="select_box row" action="#" method="post" id="resultForm">
          <div class="se-lect_option_box row col-lg-8 col-md-8 col-xs-12">
            <div id="buttonContainer"class="select_sales col-lg-3 col-xs-6">
              <!-- <input type="text" name="cost_datalist" list="cost_datalist"> -->
              <select class="select_option_sales select_box_style" id="filterSelect" name="select_crop_select">
                <option value="sales">농작물 선택</option>
                <!-- 테스트 테스트 -->
                <option value="spotato">고구마</option>
                <option value="pepper">고추</option>
                <option value="greenonion">대파</option>
                <option value="stberry">딸기</option>
                <option value="garlic">마늘</option>
                <option value="peach">복숭아</option>
                <option value="spinach">시금치</option>
                <option value="onion">양파</option>
                <option value="cucumber">오이</option>
                <option value="rice">정곡</option>
                <option value="chives">쪽파</option>
                <option value="kiwi">참다래</option>
                <option value="tomato">토마토</option>
                <option value="grape">포도</option>
                
              </select>
            </div>
            <div class="select_cost col-lg-3 col-xs-6">
              <select class="select_option_cost select_box_style" id="regionSelect" name="select_region_select">
                <option value="cost">지역 선택</option>
                <!-- 테스트 테스트 -->
                <option class="filterButton stberry chives cucumber" value="gangjin">강진군</option>
                <option class="filterButton pepper rice garlic" value="goheung">고흥군</option>
                <option class="filterButton stberry spinach kiwi" value="gokseong">곡성군</option>
                <option class="filterButton tomato chives peach" value="gwangyang">광양시</option>
                <option class="filterButton cucumber chives greenonion" value="gurye">구례군</option>
                <option class="filterButton tomato stberry onion" value="naju">나주시</option>
                <option class="filterButton grape stberry tomato" value="damyang">담양군</option>
                <option class="filterButton chives cucumber grape" value="mokpo">목포시</option>
                <option class="filterButton spatao garlic rice" value="muan">무안군</option>
                <option class="filterButton stberry kiwi onion" value="boseong">보성군</option>
                <option class="filterButton peach cucumber stberry" value="suncheon">순천시</option>
                <option class="filterButton spinach kiwi greenonion" value="sinan">신안군</option>
                <option class="filterButton onion garlic grape" value="yeosu">여수시</option>
                <option class="filterButton stberry spatao onion" value="yeonggwang">영광군</option>
                <option class="filterButton spatao rice pepper" value="yeongam">영암군</option>
                <option class="filterButton rice spinach greenonion" value="wando">완도군</option>
                <option class="filterButton tomato grape stberry" value="jangseung">장성군</option>
                <option class="filterButton stberry spinach peach" value="jangheung">장흥군</option>
                <option class="filterButton pepper greenonion onion" value="jindo">진도군</option>
                <option class="filterButton pepper onion garlic" value="hampyeong">함평군</option>
                <option class="filterButton spatao rice greenonion" value="haenam">해남군</option>
                <option class="filterButton tomato rice peach" value="hwasun">화순군</option>
              </select>
            </div>
            <div class="select_cost col-lg-3 col-xs-6">
              <select class="select_option_cost select_box_style" name="select_area_select" id="select_area_select">
                <option value="cost">경작 면적 선택</option>
                <!-- 테스트 테스트 -->
                <option value="1" selected>10a</option>
                <option value="2">20a</option>
                <option value="3">30a</option>
                <option value="4">40a</option>
                <option value="5">50a</option>
              </select>
            </div>
            <div class="select_cost col-lg-3 col-xs-6">
              <select class="select_option_cost select_box_style" name="select_work_select" id="select_work_select">
                <option value="cost">노동 인구 선택</option>
                <!-- 테스트 테스트 -->
                <option value="0" selected>1명</option>
                <option value="1">2명</option>
                <option value="2">3명</option>
                <option value="3">4명</option>
                <option value="4">5명</option>
              </select>
            </div>
          </div>

          <div class="reset_sumbmit_box row col-lg-4 col-md-4">
<!--             <div class="col-lg-6"> -->
<!--               <input type="reset" name="reset_button" id="reset_button" value="초기화" class="select_box_button"> -->
<!--             </div> -->
            <!-- <label for="reset_button" class="select_box_button_label"></label> -->
            <div class="offset-lg-6 col-lg-6">
              <input type="submit" name="submit_button" id="submit_button" value="검색" class="select_box_button">
            </div>
            <!-- <label for="submit_button" class="select_box_button_label"></label> -->
          </div>
        </form><br/>
          
        
        <div class="row gx-4 modal-onion" id="chartContainer">
                <canvas id="myChart"></canvas>
        </div><br/>
        
        <div class="sales_element">※ 해당 비용은 농작물, 지역, 경작 면적, 노동 인구를 종합한 비용입니다.</div>   
        
        <table class="select_profit" id="dataTable" width=100%>
         <tr>
            <th>매출</th>
            <th>비용</th>
            <th>정책 지원금</th>
            <th>수익</th>
         </tr>
         <tr id="myChartContainer">
            <td class="salesResultTd">0</td>
            <td class="costResultTd">0</td>
            <td class="costPolicyTd">0</td>
            <td class="profitTd">0</td>
         </tr>
      </table>
       
    </main>            

    <!-- Footer Start -->
    <div class="container-fluid bg-dark footer mt-5 py-5 wow fadeIn" data-wow-delay="0.1s">
        <div class="container py-5">
            <div class="row g-5">
                <div class="col-lg-4 col-md-6">
                    <h5 class="text-white mb-4">Our Office</h5>
                    <p class="mb-2"><i class="fa fa-map-marker-alt me-3"></i>서울시 마포구 신촌로 104 4층, 5층<br>그린컴퓨터</p>
                    <p class="mb-2"><i class="fa fa-phone-alt me-3"></i>02-715-2111</p>
                    <p class="mb-2"><i class="fa fa-envelope me-3"></i>http://sinchon.greenart.co.kr/</p>
                    <div class="d-flex pt-3">
                        <a class="btn btn-square btn-secondary rounded-circle me-2" href="https://github.com/Sanghokim91/WYC"><i class="fab fa-github"></i></a>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <h5 class="text-white mb-4">Quick Links</h5>
                    <a class="btn btn-link" href="serviceSales1.do">매출 확인(농작물우선)</a>
                    <a class="btn btn-link" href="serviceSales2.do">매출 확인(지역우선)</a>
                    <a class="btn btn-link" href="serviceCost.do">비용 조회</a>
                    <a class="btn btn-link" href="serviceProfit.do">수익 확인</a>
                    <a class="btn btn-link" href="servicePolicyCheck.do">정부지원 정책들</a>
                    <a class="btn btn-link" href="festival.do">지역축제 & 문화행사</a>
                </div>
                <div class="col-lg-4 col-md-6">
                    <h5 class="text-white mb-4">Business Hours</h5>
                    <p class="mb-1">Monday - Friday</p>
                    <h6 class="text-light">09:30 am - 06:20 pm</h6>
                    <p class="mb-1">Saturday</p>
                    <h6 class="text-light">Closed</h6>
                    <p class="mb-1">Sunday</p>
                    <h6 class="text-light">Closed</h6>
                </div>
            </div>
        </div>
    </div>
    <!-- Footer End -->


    <!-- Copyright Start -->
    <div class="container-fluid bg-secondary text-body copyright py-4">
      <div class="container">
          <div class="row">
              <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
                  &copy; <a class="fw-semi-bold" href="#">WYC - Turning to Farm</a>, All Right Reserved.
              </div>
              <div class="col-md-6 text-center text-md-end">
                  <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from "https://htmlcodex.com/credit-removal". Thank you for your support. ***/-->
                  Designed By <a class="fw-semi-bold" href="https://github.com/sungminw/WYC_profit_Prediction.git">Team WYC</a>
              </div>
          </div>
      </div>
  </div>
  <!-- Copyright End -->


    <!-- Back to Top -->
    <a href="#" class="btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top"><i class="bi bi-arrow-up"></i></a>


    <!-- JavaScript Libraries -->
    <!-- <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script> -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/wow/wow.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/easing/easing.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/waypoints/waypoints.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/counterup/counterup.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/parallax/parallax.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/lightbox/js/lightbox.min.js"></script>

    <!-- Template Javascript -->
    <script src="<%= contextPath %>/resources/js/main.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <script src="<%= contextPath %>/resources/js/serviceProfit.js"></script>
<%--     <script src="<%= contextPath %>/resources/js/profit_chart.js"></script> --%>
    <script src="<%= contextPath %>/resources/js/userMgmt.js"></script>
</body>

</html>