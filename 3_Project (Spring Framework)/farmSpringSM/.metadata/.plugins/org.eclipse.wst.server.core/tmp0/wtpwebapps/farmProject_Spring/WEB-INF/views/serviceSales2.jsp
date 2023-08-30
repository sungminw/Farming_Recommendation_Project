<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
	let sessionId = null;
</script>
<%
// 	String name = (String)session.getAttribute("name");
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
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html charset=utf-8" />
    <title>WYC - Turn to farming</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta content="" name="keywords" />
    <meta content="" name="description" />

    <!-- Favicon -->
    <link href="<%= contextPath %>/resources/img/favicon.ico" rel="icon" />

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Libre+Baskerville:wght@700&family=Open+Sans:wght@400;500;600&display=swap"
      rel="stylesheet"
    />
    <link
      href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@700&display=swap"
      rel="stylesheet"
    />

    <!-- Icon Font Stylesheet -->
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
      rel="stylesheet"
    />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
      rel="stylesheet"
    />

    <!-- Libraries Stylesheet -->
    <link href="<%= contextPath %>/resources/lib/animate/animate.min.css" rel="stylesheet" />
    <link href="<%= contextPath %>/resources/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet" />
    <link href="<%= contextPath %>/resources/lib/lightbox/css/lightbox.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="<%= contextPath %>/resources/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Template Stylesheet -->
    <link href="<%= contextPath %>/resources/css/style.css" rel="stylesheet" />
    <link href="<%= contextPath %>/resources/css/header.css" rel="stylesheet" />
    <!-- mine -->
    <link rel="stylesheet" href="<%= contextPath %>/resources/css/serviceSales2.css" />
    <link href="<%= contextPath %>/resources/css/chart2.css" rel="stylesheet" />
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    
	<!-- 컨펌 꾸미기 -->
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>
<body>
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
	
	<!--Header Moving Picture Start-->
    <div
      class="container-fluid header_img py-5 mb-5"
      data-wow-delay="0.1s"
    >
      <div class="container text-center py-5">
        <h1 class="display-3 text-white mb-4 slideInDown">
          매출확인(지역 우선)
        </h1>
      </div>
    </div>
    <!--Header Moving Picture End-->

    <div class="container-fluid wyc-background gutter_0">
      <div class="row revenue2 gutter_0">
        <div
          class="text-center mx-auto pb-4 wow fadeInUp sec1"
          data-wow-delay="0.3s"
          style="max-width: 500px"
        >
          <p class="section-title bg-white text-center text-primary px-3">
            매출 확인
          </p>
          <h1 class="mb-5">
            선호하는 지역의<br />추천 농작물과 매출을<br />확인해보세요.
          </h1>
        </div>
        <!--Select Area of Map Start-->
        <div
          class="col-md-12 col-sm-12 col-xs-12 wyc-map wow fadeInUp 1seq"
          data-wow-delay="0.3s"
        >
          <div class="wyc-area">
            <img src="<%= contextPath %>/resources/img/target_map3.png" alt="전라남도" class="wyc-mapimg" />
 
            <div class="wyc-damyang wyc_area_button">
              <img src="<%= contextPath %>/resources/img/damyang.png" alt="담양" />
            </div>
            <div class="wyc-boseong wyc_area_button">
              <img src="<%= contextPath %>/resources/img/boseong.png" alt="보성" />
            </div>
            <div class="wyc-gangjin wyc_area_button">
              <img src="<%= contextPath %>/resources/img/gangjin.png" alt="강진" />
            </div>
            <div class="wyc-goheung wyc_area_button">
              <img src="<%= contextPath %>/resources/img/goheung.png" alt="고흥" />
            </div>
            <div class="wyc-gokseong wyc_area_button">
              <img src="<%= contextPath %>/resources/img/gokseong.png" alt="곡성" />
            </div>
            <div class="wyc-gurye wyc_area_button">
              <img src="<%= contextPath %>/resources/img/gurye.png" alt="구례" />
            </div>
            <div class="wyc-gwangyang wyc_area_button">
              <img src="<%= contextPath %>/resources/img/gwangyang.png" alt="광양" />
            </div>
            <div class="wyc-haenam wyc_area_button">
              <img src="<%= contextPath %>/resources/img/haenam.png" alt="해남" />
            </div>
            <div class="wyc-hampyeong wyc_area_button">
              <img src="<%= contextPath %>/resources/img/hampyeong.png" alt="함평" />
            </div>
            <div class="wyc-hwasun wyc_area_button">
              <img src="<%= contextPath %>/resources/img/hwasun.png" alt="화순" />
            </div>
            <div class="wyc-jangheung wyc_area_button">
              <img src="<%= contextPath %>/resources/img/jangheung.png" alt="장흥" />
            </div>
            <div class="wyc-jangseong wyc_area_button">
              <img src="<%= contextPath %>/resources/img/jangseong.png" alt="장성" />
            </div>
            <div class="wyc-jindo wyc_area_button">
            	<img src="<%= contextPath %>/resources/img/jindo.png" alt="진도" />
            </div>
            <div class="wyc-mokpo wyc_area_button">
            	<img src="<%= contextPath %>/resources/img/mokpo.png" alt="목포" />
            </div>
            <div class="wyc-muan wyc_area_button">
           		<img src="<%= contextPath %>/resources/img/muan.png" alt="무안" />
            </div>
            <div class="wyc-naju wyc_area_button">
            	<img src="<%= contextPath %>/resources/img/naju.png" alt="나주" />
            </div>
            <div class="wyc-sinan wyc_area_button">
            	<img src="<%= contextPath %>/resources/img/sinan.png" alt="신안" />
            </div>
            <div class="wyc-suncheon wyc_area_button">
             	<img src="<%= contextPath %>/resources/img/suncheon.png" alt="순천" />
            </div>
            <div class="wyc-wando wyc_area_button">
            	<img src="<%= contextPath %>/resources/img/wando.png" alt="완도" />
            </div>
            <div class="wyc-yeongam wyc_area_button">
            	<img src="<%= contextPath %>/resources/img/yeongam.png" alt="영암" />
            </div>
            <div class="wyc-yeonggwang wyc_area_button">
            	<img src="<%= contextPath %>/resources/img/yeonggwang.png" alt="영광" />
            </div>
            <div class="wyc-yeosu wyc_area_button">
            	<img src="<%= contextPath %>/resources/img/yeosu.png" alt="여수" />
            </div>
          </div>
        </div>
        <!--Select Area of Map End-->
        
        
        <!--Select Crop of Area Start-->
        <div
          class="text-center mx-auto pb-4 wow fadeInUp sec2"
          data-wow-delay="0.3s"
          style="max-width: 500px"
        >
          <h1 class="select_list_title">농작물을 선택해 주세요.</h1>
        </div>
        
        <div
          class="col-md-12 col-sm-12 col-xs-12 wyc-select-crop wow bounceInLeft"
        >
          <div class="wyc-select-crop-title">
            <h3><b class="wyc_table_title"></b></h3>
          </div>
          <div class="wyc-table">
          
			<!-- 추천 농작물 3개 리스트 자리 -->
          
          </div>
        </div>
        <!--Select Crop of Area End-->
        
        
        <!--View Crop's InfoUp Selected Start-->
        <div
          class="text-center mx-auto wow fadeInUp sec3"
          data-wow-delay="0.3s"
          style="max-width: 500px"
        >
          <h1 class="">농작물 정보를 확인하세요.</h1>
        </div>
      
        <div
          class="offset-md-1 col-md-10 col-sm-12 col-xs-12 wyc-info-crop wow bounceInLeft"
        >
          <div class="crop-info-up">
          
		<!--     농작물 세부 정보 프로필 자리	 -->
		
          </div>
          <!--View Crop's InfoUp Selected end-->
          
          
          <!--View Crop's InfoDown Selected Start-->
          <div class="crop-info-down">
            <h3>농작물 경매단가 & 생산량</h3>
            
            <div class="info-down-crop row">
              <div class="col-md-6 col-sm-12 col-xs-12" id="chartContainer_price">
                <canvas id="chart_price" class=""></canvas>
              </div>
              <div class="col-md-6 col-sm-12 col-xs-12" id="chartContainer_yield">
                <canvas id="chart_yield" class=""></canvas>
              </div>
            </div>
            <div>※ 경매단가 분석은 10a(300평)기준이며 최근 5년간의 농수산물유통정보의 도매 가격 데이터를 기준으로 제공 하고 통계청의 생산량 데이터를 기준으로 제공 합니다.</div>
          </div>
        </div>
       </div>
        <!--View Crop's InfoDown Selected end-->
        
        
        
      <div class="wyc-reset">
         <button class="reset_button_custom">다시선택</button>
      </div>
      <form action="serviceCostGo.do" method="post" name="sales2Form">
      <div class="wyc-btn-box">
        <div id="total_cost" class="border_default">
          <div class="total_cost_inner">
            <div class="wyc-submit">
              <button type="button" id="modalButton" class="total_cost_submit2" data-toggle="modal" data-target="#myModal">매출 확인</button>
            </div>
            <div class="wyc-sales">
            
<!-- 	            <input type="hidden" class="wycId" name="wycId" value="testId2"> -->
<!-- 	            <input type="hidden" class="selectCropKor" name="selectCropKor" value=""> -->
<!-- 	            <input type="hidden" name="revenue2" value="revenue2.do"> -->
	            <input type="hidden" class="selectCrop" name="flexRadioDefault" value="">
            	<input type="hidden" class="selectArea" name="areaEng" value="">
	            <input type="hidden" class="salesResult" name="salesResult" value="">
            	<button type="button" class="total_cost_submit2 submit_cost">비용 분석</button>
            
            </div>

          </div>
        </div>
      </div>
    </div>
    </form>
    
<!--     ------------------------------------------------------------------------------------------------ -->
    <div class="modal fade bs-example-modal-lg" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <div class="modal-header">        
        <h6 class="modal-title" id="myModalLabel">매출 분석</h6>
        <button type="button" class="btn btn-default btn-sm" data-dismiss="modal">X</button>
      </div>
      <div class="modal-body">
        <div class="container-xxl">
              <div class="text-center mx-auto wow fadeInUp" style="visibility: none;" data-wow-delay="0.3s">
                  <div class="cost_title"><span class="cost_sigungu"></span><span> </span><span class="cost_crop"></span>의 내년 예상 매출은 <span class=cost_total></span>원 입니다</div>
                </div>             
<!--               농작물 매출                          -->
           	  <div class="row col-lg-12 col-sm-12 col-md-12 col-xs-12" id="chartContainer">
                 <canvas class="" id="mychart"></canvas>              
              </div>

            <div class="modal-footer">
            <div class="sales_element">※ 매출 분석은 10a(300평)기준이며 분석 요소는 온도, 강수량, 일조시간, 일사량, 생산비용, 경작면적, 생산량, 상등품 도매가격, 유통 비율, GDP 을 분석하여 도출해낸 매출 금액 입니다.</div>
              </div>
          </div>
      </div>
      </div>
      </div>
      </div>
    
    
    
    
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
                        <a class="btn btn-square btn-secondary rounded-circle me-2" href="https://github.com/sungminw/WYC_profit_Prediction.git"><i class="fab fa-github"></i></a>
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
            &copy; <a class="fw-semi-bold" href="#">WYC - Turning to Farm</a>,
            All Right Reserved.
          </div>
          <div class="col-md-6 text-center text-md-end">
            <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from "https://htmlcodex.com/credit-removal". Thank you for your support. ***/-->
            Designed By
            <a class="fw-semi-bold" href="https://github.com/Sanghokim91/WYC"
              >Team WYC</a
            >
          </div>
        </div>
      </div>
    </div>
    <!-- Copyright End -->
    
    
    
    <!-- Back to Top -->
    <a
      href="#"
      class="btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top"
      ><i class="bi bi-arrow-up"></i
    ></a>

    <!-- <script src="http:/pjax.googleapis.compjax/libs/jquery/1.11.2/jquery.min/js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.js"></script> -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/wow/wow.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/easing/easing.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/waypoints/waypoints.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/counterup/counterup.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/parallax/parallax.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/lightbox/js/lightbox.min.js"></script>
    
    <script src="<%= contextPath %>/resources/js/serviceSales2.js"></script>
<%-- <!--     <script src="<%= contextPath %>/resources/js/chart.js"></script> --> --%>
    <script src="<%= contextPath %>/resources/js/main.js"></script>
    <script src="<%= contextPath %>/resources/js/userMgmt.js"></script>

</body>
</html>