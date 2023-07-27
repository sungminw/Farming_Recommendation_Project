<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text.html; charset=UTF-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Libre+Baskerville:wght@700&family=Open+Sans:wght@400;500;600&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@700&display=swap" rel="stylesheet">

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="../lib/animate/animate.min.css" rel="stylesheet">
    <link href="../lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="../lib/lightbox/css/lightbox.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="../css/style.css" rel="stylesheet">
    <title>WYC - Turn to farming</title>
</head>
<body>
    <!-- Spinner Start -->
    <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
        <div class="spinner-border text-primary" role="status" style="width: 3rem; height: 3rem;"></div>
    </div>
    <!-- Spinner End -->
    
    <!-- Navbar Start -->
<nav class="navbar navbar-expand-lg bg-white navbar-light sticky-top px-4 px-lg-5">
  <a href="index.jsp" class="navbar-brand d-flex align-items-center">
    <h1 class="m-0"><img src="../img/logo.png" style="width: 16vw" /></h1>
  </a>
  <button type="button" class="navbar-toggler me-0" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarCollapse">
    <div class="navbar-nav ms-auto p-4 p-lg-0">
      <a href="index.html" class="nav-item nav-link active">Home</a>
      <a href="recomend.html" class="nav-item nav-link">추천서비스</a>
      <div class="nav-item dropdown">
        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">수익 분석</a>
        <div class="dropdown-menu bg-light m-0">

          <!-- 비용 조회 메뉴의 세부 요소 추가 -->
          <div class="dropdown">
            <a href="#" class="dropdown-item dropdown-toggle plusUp" data-bs-toggle="dropdown">매출 분석</a>
            <div class="dropdown-menu plus">
              <a href="revenue1.do" class="dropdown-item">농작물 우선 선택</a>
              <a href="revenue2.do" class="dropdown-item">지역  우선 선택</a>
              <!-- 추가적인 서브 메뉴 항목들... -->
            </div>
          </div>
          <a href="serviceCost.jsp" class="dropdown-item">비용 조회</a>
          <a href="serviceProfit.jsp" class="dropdown-item">수익 예측</a>
        </div>
      </div>
      <a href="servicePolicyCheck.html" class="nav-item nav-link">지원정책</a>
      <div class="nav-item dropdown">
        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">커뮤니티</a>
        <div class="dropdown-menu bg-light m-0">
          <a href="serviceEsidence.html" class="dropdown-item">농지 & 거주지 현황</a>
          <a href="festival.html" class="dropdown-item">지역축제 & 문화행사</a>
          <a href="success.html" class="dropdown-item">귀농 성공사례</a>
        </div>
      </div>
      <div class="nav-item dropdown">
        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">회원관리</a>
        <div class="dropdown-menu bg-light m-0">
          <a href="login.html" class="dropdown-item">로그인</a>
          <a href="mypage.html" class="dropdown-item">마이 페이지</a>
        </div>
      </div>
    </div>
  </div>
</nav>
    <!-- Navbar End -->
	
	
	<!-- Carousel start -->
	<div class="container-fluid px-0 mb-5">
        <div id="header-carousel" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="w-100" src="../img/1.jpg" alt="Image">
                    <div class="carousel-caption">
                        <div class="container">
                            <div class="row justify-content-start">
                                <div class="col-lg-8 text-start">
                                    <p class="fs-4 text-white"> 내가 선택한 농작물의 매출을 알아보세요! </p>
                                    <h1 class="display-1 text-white mb-5 animated slideInRight">Welcome to Jeonnam!</h1>
                                    <a href="revenue1.html" class="btn btn-secondary rounded-pill py-3 px-5 animated slideInRight">농작물 선택</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="w-100" src="../img/2.jpg" alt="Image">
                    <div class="carousel-caption">
                        <div class="container">
                            <div class="row justify-content-end">
                                <div class="col-lg-8 text-end">
                                    <p class="fs-4 text-white">원하는 지역을 선택하여 귀농 정보를 알아보세요!</p>
                                    <h1 class="display-1 text-white mb-5 animated slideInRight">Welcome to  Jeonnam!</h1>
                                    <a href="revenue2.html" class="btn btn-secondary rounded-pill py-3 px-5 animated slideInLeft">지역 선택</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                
                <div class="carousel-item">
                    <img class="w-100" src="../img/3.jpg" alt="Image">
                    <div class="carousel-caption">
                        <div class="container">
                            <div class="row justify-content-end">
                                <div class="col-lg-8 text-end">
                                    <p class="fs-4 text-white">궁금한 농작물의 비용을 알아보세요!</p>
                                    <h1 class="display-1 text-white mb-5 animated slideInRight">Welcome to  Jeonnam!</h1>
                                    <a href="serviceCost.html" class="btn btn-secondary rounded-pill py-3 px-5 animated slideInLeft">비용 분석</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                
                <div class="carousel-item">
                    <img class="w-100" src="../img/4.jpg" alt="Image">
                    <div class="carousel-caption">
                        <div class="container">
                            <div class="row justify-content-end">
                                <div class="col-lg-8 text-end">
                                    <p class="fs-4 text-white">귀농후 얻게될 수익을 알아보세요!</p>
                                    <h1 class="display-1 text-white mb-5 animated slideInRight">Welcome to  Jeonnam!</h1>
                                    <a href="serviceProfit.html" class="btn btn-secondary rounded-pill py-3 px-5 animated slideInLeft">수익 조회</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        
            <button class="carousel-control-prev" type="button" data-bs-target="#header-carousel"
                data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#header-carousel"
                data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    </div>
    </div>
    <!-- Carousel End -->
	

<!-- About Start -->
    <div class="container-xxl py-5">
        <div class="container">
            <div class="row g-5 align-items-end">
                <div class="col-lg-6">
                    <div class="row g-2">
                        <div class="col-6 wow fadeIn" data-wow-delay="0.1s">
                            <img class="img-fluid rounded" src="../img/service-1.jpg">
                        </div>
                        <div class="col-6 wow fadeIn" data-wow-delay="0.1s">
                            <img class="img-fluid rounded" src="../img/service-2.jpg">
                        </div>
                        <div class="col-6 wow fadeIn" data-wow-delay="0.3s">
                            <img class="img-fluid rounded" src="../img/service-3.jpg">
                        </div>
                        <div class="col-6 wow fadeIn" data-wow-delay="0.5s">
                            <img class="img-fluid rounded" src="../img/service-4.jpg">
                        </div>
                    </div>
                </div>
                <div class="col-lg-6 wow fadeIn" data-wow-delay="0.5s">
                    <p class="section-title bg-white text-start text-primary pe-3">About Us</p>
                    <h1 class="mb-4">다양한 귀농정보를 경험해 보세요</h1>
                    <p class="mb-4">귀농시 수익에 대한 불안정성과 정보 부족으로 고민이신가요?<br>우리 서비스와 함께 고민을 해결해 봅시다!</p>
                    <div class="row g-5 pt-2 mb-5">
                        <div class="col-sm-6">
                            <img class="img-fluid mb-4" src="../img/service.png" alt="">
                            <h5 class="mb-3">수익분석 서비스</h5>
                            <span>선호하는 농작물과 선호하는 지역에서 수익 예측 기능 제공</span>
                        </div>
                        <div class="col-sm-6">
                            <img class="img-fluid mb-4" src="../img/award.png" alt="">
                            <h5 class="mb-3">정부지원 정책들</h5>
                            <span>전라남도 22개 지역별 정부지원 정책 확인 기능 제공</span>
                        </div>
                    </div>
                    <a class="btn btn-secondary rounded-pill py-3 px-5" href="login.html">Explore More</a>
                </div>
            </div>
        </div>
    </div>
    <!-- About End -->



     <!-- Main Service Start -->
    <div class="container-xxl py-5">
        <div class="container">
            <div class="text-center mx-auto pb-4 wow fadeInUp" data-wow-delay="0.1s" style="max-width: 500px;">
                <p class="section-title bg-white text-center text-primary px-3">Main Services</p>
                <h1 class="mb-5">주요 기능</h1>
            </div>
            <div class="row gy-5 gx-4">
                <div class="col-lg-3 col-md-6 pt-5 wow fadeInUp" data-wow-delay="0.1s">
                    <div class="service-item d-flex h-100">
                        <div class="service-img">
                            <img class="img-fluid" src="../img/main-4.jpg" alt="">
                        </div>
                        <div class="service-text p-5 pt-0">
                            <div class="service-icon">
                                <img class="img-fluid rounded-circle" src="../img/main-4.jpg" alt="">
                            </div>
                            <h5 class="mb-3">추천 서비스</h4>
                            <p class="mb-4">당신에게 맞는 농작물을 확인해보세요.</p>
                            <a class="btn btn-square rounded-circle" href="recomend.jsp"><i class="bi bi-chevron-double-right"></i></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 pt-5 wow fadeInUp" data-wow-delay="0.1s">
                    <div class="service-item d-flex h-100">
                        <div class="service-img">
                            <img class="img-fluid" src="../img/main-1.jpg" alt="">
                        </div>
                        <div class="service-text p-5 pt-0">
                            <div class="service-icon">
                                <img class="img-fluid rounded-circle" src="../img/main-1.jpg" alt="">
                            </div>
                            <h5 class="mb-3">매출 확인</h4>
                            <p class="mb-4">당신이 선호하는 지역과 농작물의 매출을 확인해보세요.</p>
                            <a class="btn btn-square rounded-circle" href="revenue1.do"><i class="bi bi-chevron-double-right"></i></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 pt-5 wow fadeInUp" data-wow-delay="0.3s">
                    <div class="service-item d-flex h-100">
                        <div class="service-img">
                            <img class="img-fluid" src="img/main-2.jpg" alt="">
                        </div>
                        <div class="service-text p-5 pt-0">
                            <div class="service-icon">
                                <img class="img-fluid rounded-circle" src="../img/main-2.jpg" alt="">
                            </div>
                            <h5 class="mb-3">수익 확인</h5>
                            <p class="mb-4">농작물 매출과 귀농시 필요한 초기 비용, 운영 비용을 종합한 수익을 확인해보세요.</p>
                            <a class="btn btn-square rounded-circle" href="serviceProfit.jsp"><i class="bi bi-chevron-double-right"></i></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 pt-5 wow fadeInUp" data-wow-delay="0.5s">
                    <div class="service-item d-flex h-100">
                        <div class="service-img">
                            <img class="img-fluid" src="../img/main-3.jpg" alt="">
                        </div>
                        <div class="service-text p-5 pt-0">
                            <div class="service-icon">
                                <img class="img-fluid rounded-circle" src="../img/main-3.jpg" alt="">
                            </div>
                            <h5 class="mb-3">정부지원 정책 확인</h5>
                            <p class="mb-4">지자체별 정부지원 정책을 확인해보세요.</p>
                            <a class="btn btn-square rounded-circle" href="servicePolicyCheck.html"><i class="bi bi-chevron-double-right"></i></a>
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
    </div>
    <!-- Main Service End -->


    <!-- Community Service_1 Start -->
    <div class="container-xxl py-5">
        <div class="container">
            <div class="text-center mx-auto pb-4 wow fadeInUp" data-wow-delay="0.1s" style="max-width: 500px;">
                <p class="section-title bg-white text-center text-primary px-3">Community Services</p>
                <h1 class="mb-5">커뮤니티 서비스</h1>
            </div>
            <div class="row gy-5 gx-4">
                <div class="col-lg-6 pt-5 wow fadeInUp" data-wow-delay="0.3s">
                    <div class="service-item d-flex h-100">
                        <div class="service-img">
                            <img class="img-fluid" src="../img/community-2.jpg" alt="">
                        </div>
                        <div class="service-text p-5 pt-0">
                            <div class="service-icon">
                                <img class="img-fluid rounded-circle" src="../img/community-2.jpg" alt="">
                            </div>
                            <h5 class="mb-3">지역축제 & 문화행사</h5>
                            <p class="mb-4">전라남도에서 제공하는 다양한 농촌 체험 활동 및 문화행사를 즐겨보세요.</p>
                            <a class="btn btn-square rounded-circle" href="festival.html"><i class="bi bi-chevron-double-right"></i></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6 pt-5 wow fadeInUp" data-wow-delay="0.5s">
                    <div class="service-item d-flex h-100">
                        <div class="service-img">
                            <img class="img-fluid" src="../img/community-3.jpg" alt="">
                        </div>
                        <div class="service-text p-5 pt-0">
                            <div class="service-icon">
                                <img class="img-fluid rounded-circle" src="../img/community-3.jpg" alt="">
                            </div>
                            <h5 class="mb-3">귀농 성공사례</h5>
                            <p class="mb-4">당신의 성공 노하우를 다른 사람들과 공유해보세요.</p>
                            <a class="btn btn-square rounded-circle" href="success.html"><i class="bi bi-chevron-double-right"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Community Service_1 End -->



    <!-- Event Service Start -->
    <div class="container-xxl py-5">
        <div class="container">
            <div class="text-center mx-auto wow fadeInUp" data-wow-delay="0.1s" style="max-width: 500px;">
                <p class="section-title bg-white text-center text-primary px-3">Local Festival & Cultural Event</p>
                <h1 class="mb-5">전라남도에서 제공하는<br>다양한 농촌 체험 활동을<br>즐겨보세요.</h1>
            </div>
            <div class="row gx-4">
                <div class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp" data-wow-delay="0.1s">
                    <div class="product-item">
                        <div class="position-relative">
                            <a href="https://ggeutdeul.modoo.at/">
                                <img class="img-event" src="../img/event-1.jpeg" alt="">
                            </a>
                        </div>
                        <div class="text-center p-4">
                            <a class="d-block h5" href="https://ggeutdeul.modoo.at/">섬진강 끝들마을</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp" data-wow-delay="0.3s">
                    <div class="product-item">
                        <div class="position-relative">
                            <a href="http://www.xn--hq1b37i55ll3as6p.kr/">
                                <img class="img-event" src="../img/event-2.jpg" alt="">
                            </a>
                        </div>
                        <div class="text-center p-4">
                            <a class="d-block h5" href="http://www.xn--hq1b37i55ll3as6p.kr/">완도 신학마을</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp" data-wow-delay="0.5s">
                    <div class="product-item">
                        <div class="position-relative">
                            <a href="https://ecowg.modoo.at/">
                                <img class="img-event" src="../img/event-3.jpeg" alt="">
                            </a>
                        </div>
                        <div class="text-center p-4">
                            <a class="d-block h5" href="https://ecowg.modoo.at/">에코왕곡마을</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp" data-wow-delay="0.7s">
                    <div class="product-item">
                        <div class="position-relative">
                            <a href="http://echovill.com/">
                                <img class="img-event" src="../img/event-4.jpg" alt="">
                            </a>
                        </div>
                        <div class="text-center p-4">
                            <a class="d-block h5" href="http://echovill.com/">메아리 창조마을</a>
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
            <div class="text-center mx-auto wow fadeInUp" data-wow-delay="0.1s" style="max-width: 500px;">
                <p class="section-title bg-white text-center text-primary px-3">Local Festival & Cultural Event</p>
                <h1 class="mb-5">전라남도에서 제공하는 <br>문화행사를 경험해보세요.</h1>
            </div>
            <div class="row gx-4">
                <div class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp" data-wow-delay="0.1s">
                    <div class="product-item">
                        <div class="position-relative">
                            <a href="https://www.gokseong.go.kr/tour/festivity">
                                <img class="img-festival" src="../img/festival-1.jpg" alt="">
                            </a>
                        </div>
                        <div class="text-center p-4">
                            <a class="d-block h5" href="https://www.gokseong.go.kr/tour/festivity">곡성 세계 장미축제</a>
                            <span class="text-primary me-1">23.05.20 ~ 23.05.29</span>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp" data-wow-delay="0.3s">
                    <div class="product-item">
                        <div class="position-relative">
                            <a href="http://www.bspdanoje.co.kr/">
                                <img class="img-festival" src="../img/festival-2.png" alt="">
                            </a>
                        </div>
                        <div class="text-center p-4">
                            <a class="d-block h5" href="http://www.bspdanoje.co.kr/">영광 법성포 단오제</a>
                            <span class="text-primary me-1">23.06.22 ~ 23.06.25</span>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp" data-wow-delay="0.5s">
                    <div class="product-item">
                        <div class="position-relative">
                            <a href="https://www.gokseong.go.kr/tour/festivity/icecream">
                                <img class="img-festival" src="../img/festival-3.jpg" alt="">
                            </a>
                        </div>
                        <div class="text-center p-4">
                            <a class="d-block h5" href="https://www.gokseong.go.kr/tour/festivity/icecream">곡성 아이스크림 페스티벌</a>
                            <span class="text-primary me-1">23.07.14 ~ 23.07.16</span>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-4 col-xl-3 wow fadeInUp" data-wow-delay="0.7s">
                    <div class="product-item">
                        <div class="position-relative">
                            <a href="https://festival.jangheung.go.kr/festival">
                                <img class="img-festival" src="../img/festival-4.jpg" alt="">
                            </a>
                        </div>
                        <div class="text-center p-4">
                            <a class="d-block h5" href="https://festival.jangheung.go.kr/festival">정남진 장흥 물축제</a>
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
                        <!-- <a class="btn btn-square btn-secondary rounded-circle me-2" href=""><i class="fab fa-twitter"></i></a>
                        <a class="btn btn-square btn-secondary rounded-circle me-2" href=""><i class="fab fa-facebook-f"></i></a>
                        <a class="btn btn-square btn-secondary rounded-circle me-2" href=""><i class="fab fa-youtube"></i></a>
                        <a class="btn btn-square btn-secondary rounded-circle me-2" href=""><i class="fab fa-linkedin-in"></i></a> -->
                        <a class="btn btn-square btn-secondary rounded-circle me-2" href="https://github.com/Sanghokim91/WYC"><i class="fab fa-github"></i></a>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <h5 class="text-white mb-4">Quick Links</h5>
                    <a class="btn btn-link" href="recomend.jsp">농작물 추천</a>
                    <a class="btn btn-link" href="revenue1.do">매출 확인(농작물우선)</a>
                    <a class="btn btn-link" href="revenue2.do">매출 확인(지역우선)</a>
                    <a class="btn btn-link" href="serviceCost.jsp">비용 조회</a>
                    <a class="btn btn-link" href="serviceProfit.jsp">수익 확인</a>
                    <a class="btn btn-link" href="servicePolicyCheck.html">정부지원 정책들</a>
                    <a class="btn btn-link" href="festival.html">지역축제 & 문화행사</a>
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
                    Designed By <a class="fw-semi-bold" href="https://github.com/Sanghokim91/WYC">Team WYC</a>
                </div>
            </div>
        </div>
    </div>
    <!-- Copyright End -->


    <!-- Back to Top -->
    <a href="#" class="btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top"><i class="bi bi-arrow-up"></i></a>


    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="../lib/wow/wow.min.js"></script>
    <script src="../lib/easing/easing.min.js"></script>
    <script src="../lib/waypoints/waypoints.min.js"></script>
    <script src="../lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="../lib/counterup/counterup.min.js"></script>
    <script src="../lib/parallax/parallax.min.js"></script>
    <script src="../lib/lightbox/js/lightbox.min.js"></script>

    <!-- Template Javascript -->
    <script src="../js/main.js"></script>
</body>

</html>