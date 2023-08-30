<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<meta http-equiv="Content-Type" content="text.html; charset=UTF-8">
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
      class="container-fluid header_img py-5 mb-5 wow fadeIn"
      data-wow-delay="0.1s"
    >
      <div class="container text-center py-5">
        <h1 class="display-3 text-white mb-4 animated slideInDown">
          지역축제 & 문화행사
        </h1>
      </div>
    </div>
    <!--Header Moving Picture End-->

    <!-- Event Service Start -->
    <div class="container-xxl py-5">
      <div class="container">
        <div
          class="text-center mx-auto wow fadeInUp"
          data-wow-delay="0.1s"
          style="max-width: 500px"
        >
          <p class="section-title bg-white text-center text-primary px-3">
            Local Festival & Cultural Event
          </p>
          <h1 class="mb-5">
            전라남도에서 제공하는<br />다양한 농촌 체험 활동을<br />즐겨보세요.
          </h1>
        </div>
        <div class="row gx-4">
          <div
            class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp"
            data-wow-delay="0.1s"
          >
            <div class="product-item">
              <div class="position-relative">
                <a href="https://ggeutdeul.modoo.at/">
                  <img class="img-event" src="<%= contextPath %>/resources/img/event-1.jpeg" alt="" />
                </a>
              </div>
              <div class="text-center p-4">
                <a class="d-block h5" href="https://ggeutdeul.modoo.at/"
                  >섬진강 끝들마을</a
                >
              </div>
            </div>
          </div>
          <div
            class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp"
            data-wow-delay="0.3s"
          >
            <div class="product-item">
              <div class="position-relative">
                <a href="http://www.xn--hq1b37i55ll3as6p.kr/">
                  <img class="img-event" src="<%= contextPath %>/resources/img/event-2.jpg" alt="" />
                </a>
              </div>
              <div class="text-center p-4">
                <a class="d-block h5" href="http://www.xn--hq1b37i55ll3as6p.kr/"
                  >완도 신학마을</a
                >
              </div>
            </div>
          </div>
          <div
            class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp"
            data-wow-delay="0.5s"
          >
            <div class="product-item">
              <div class="position-relative">
                <a href="https://ecowg.modoo.at/">
                  <img class="img-event" src="<%= contextPath %>/resources/img/event-3.jpeg" alt="" />
                </a>
              </div>
              <div class="text-center p-4">
                <a class="d-block h5" href="https://ecowg.modoo.at/"
                  >에코왕곡마을</a
                >
              </div>
            </div>
          </div>
          <div
            class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp"
            data-wow-delay="0.7s"
          >
            <div class="product-item">
              <div class="position-relative">
                <a href="http://echovill.com/">
                  <img class="img-event" src="<%= contextPath %>/resources/img/event-4.jpg" alt="" />
                </a>
              </div>
              <div class="text-center p-4">
                <a class="d-block h5" href="http://echovill.com/"
                  >메아리 창조마을</a
                >
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- Event Service End -->

    <!-- Festival Service Start -->
    <div class="container-xxl py-5">
      <div class="container">
        <div
          class="text-center mx-auto wow fadeInUp"
          data-wow-delay="0.1s"
          style="max-width: 500px"
        >
          <p class="section-title bg-white text-center text-primary px-3">
            Local Festival & Cultural Event
          </p>
          <h1 class="mb-5">
            전라남도에서 제공하는 <br />문화행사를 경험해보세요.
          </h1>
        </div>
        <div class="row gx-4">
          <div
            class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp"
            data-wow-delay="0.1s"
          >
            <div class="product-item">
              <div class="position-relative">
                <a href="https://www.gokseong.go.kr/tour/festivity">
                  <img class="img-festival" src="<%= contextPath %>/resources/img/festival-1.jpg" alt="" />
                </a>
              </div>
              <div class="text-center p-4">
                <a
                  class="d-block h5"
                  href="https://www.gokseong.go.kr/tour/festivity"
                  >곡성 세계 장미축제</a
                >
                <span class="text-primary me-1">23.05.20 ~ 23.05.29</span>
              </div>
            </div>
          </div>
          <div
            class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp"
            data-wow-delay="0.3s"
          >
            <div class="product-item">
              <div class="position-relative">
                <a href="http://www.bspdanoje.co.kr/">
                  <img class="img-festival" src="<%= contextPath %>/resources/img/festival-2.png" alt="" />
                </a>
              </div>
              <div class="text-center p-4">
                <a class="d-block h5" href="http://www.bspdanoje.co.kr/"
                  >영광 법성포 단오제</a
                >
                <span class="text-primary me-1">23.06.22 ~ 23.06.25</span>
              </div>
            </div>
          </div>
          <div
            class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp"
            data-wow-delay="0.5s"
          >
            <div class="product-item">
              <div class="position-relative">
                <a href="https://www.gokseong.go.kr/tour/festivity/icecream">
                  <img class="img-festival" src="<%= contextPath %>/resources/img/festival-3.jpg" alt="" />
                </a>
              </div>
              <div class="text-center p-4">
                <a
                  class="d-block h5"
                  href="https://www.gokseong.go.kr/tour/festivity/icecream"
                  >곡성 아이스크림 페스티벌</a
                >
                <span class="text-primary me-1">23.07.14 ~ 23.07.16</span>
              </div>
            </div>
          </div>
          <div
            class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp"
            data-wow-delay="0.7s"
          >
            <div class="product-item">
              <div class="position-relative">
                <a href="https://festival.jangheung.go.kr/festival">
                  <img class="img-festival" src="<%= contextPath %>/resources/img/festival-4.jpg" alt="" />
                </a>
              </div>
              <div class="text-center p-4">
                <a
                  class="d-block h5"
                  href="https://festival.jangheung.go.kr/festival"
                  >정남진 장흥 물축제</a
                >
                <span class="text-primary me-1">23.07.29 ~ 23.08.06</span>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- Festival Service End -->

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
    <a
      href="#"
      class="btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top"
      ><i class="bi bi-arrow-up"></i
    ></a>

    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
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
  </body>
</html>
