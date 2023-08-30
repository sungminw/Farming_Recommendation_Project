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
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>WYC - Turn to farming</title>
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
    <link href="<%= contextPath %>/resources/css/header.css" rel="stylesheet">
    <!-- <link href="css/chart.css" rel="stylesheet"> -->
    <link rel="stylesheet" href="<%= contextPath %>/resources/css/mypage.css">

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
    <div class="container-fluid header_img py-5 mb-5 wow fadeIn" data-wow-delay="0.1s">
        <div class="container text-center py-5">
            <h1 class="display-3 text-white mb-4 animated slideInDown">마이 페이지</h1>
        </div>
    </div>
    <!--Header Moving Picture End-->

    <main class="container">
      <div class="content row" >
        <div class="member_info_box offset-md-3 col-md-6 col-sm-12">
          <div class="member_info_title my_button">회원정보</div>
<!--           <form action="modify.do"> -->
		<form action="pwCheck.do">
          <div id="member_id" class="member_box_design">아이디 : ${memberInfo.id }</div>
          <input type="hidden" name="id" value="${memberInfo.id}">
          <div id="member_pw" class="member_box_design">비밀번호 : <input type="password" name="pw" value="${memberInfo.pw }" readonly style="border:none"></div>
          <div id="member_name" class="member_box_design">이름 : ${memberInfo.name }</div>
          <div id="member_address" class="member_box_design">주소 : ${memberInfo.address }</div>
          <div id="member_email" class="member_box_design">이메일 : ${memberInfo.eMail }</div>
          <div id="member_birth" class="member_box_design">생년월일 : ${memberInfo.ssn }</div>
          <div id="member_update_button_box">
          <input type="submit"  class="my_button" value="정보 수정">
          </div>
         </form>
         
      </div>
<!--           <div id="correction_btn" class="my_button"><a href="modify.do">수정 하기</a></div> -->
<!-- 			<input type="button" value="정보 수정" class="my_button" onclick="javascript:window.location='modify.jsp'"> -->


<!--         <div class="member_info_box_update col-md-6 col-sm-12 dis_none"> -->
<!--           <div class="member_info_title my_button">회원정보</div> -->
<!--           <div id="member_id" class="member_box_design">아이디 : gildong12</div> -->
<!--           <div id="member_pw" class="member_box_design">비밀번호 : <input type="password" name="update_passwd" id="update_passwd" value="gildongpw12"></div> -->
<!--           <div id="member_name" class="member_box_design">이름 : <input type="text" name="update_name" id="update_name" value="홍길동"></div> -->
<!--           <div id="member_tel" class="member_box_design">전화번호 : <input type="tel" name="update_tel" id="update_tel" value="010-1234-5678"></div> -->
<!--           <div id="member_email" class="member_box_design">이메일 : <input type="email" name="update_email" id="update_email" value="gildong12@gmail.com"></div> -->
<!--           <div id="member_birth" class="member_box_design">주민등록번호  : 000220-3******</div> -->
<!--           <div id="correction_btn_box"> -->
<!--             <button type="button" id="member_cancel_btn" class="my_button"><a href="#">취소</a></button> -->
<!--             <button type="button" id="member_save_btn" class="my_button"><a href="#">저장</a></button> -->
<!--           </div> -->
<!--         </div> -->



<!--         <div class="history_box col-md-6 col-sm-12"> -->
<!--           <div class="history_title my_button">홍길동님의 매출, 비용 정보</div> -->

<!--           <div class="history_salse_box history_box_design default_border"> -->
<!--             <div class="slaes_title"><span class="glyphicon glyphicon-triangle-right"></span> 홍길동님의 매출 예측 정보</div> -->
<!--             <div class="slaes_list history_list"> -->
<!--               <ul class="slaes_list_ul"> -->
                
<!--                 <li class="jangsung_strawberry_salse">장성시 딸기 매출 -->
<!--                   <div id="jangsung_strawberry_salse_detail" class="salse_detail dis_none"> -->
<!--                     <table class="table_border"> -->
<!--                       <tr> -->
<!--                         <th>연간 매출</th> -->
<!--                         <td>20,000,000원</td> -->
<!--                       </tr> -->
<!--                     </table> -->
<!--                   </div> -->
<!--                 </li> -->

                
<!--                 <li onclick="sales_detail(1)">나주시 고추 매출 -->
<!--                   <div id="naju_chili_salse_detail" class="salse_detail dis_none"> -->
<!--                     <table class="table_border"> -->
<!--                       <tr> -->
<!--                         <th>연간 매출</th> -->
<!--                         <td>50,000,000원</td> -->
<!--                       </tr> -->
<!--                     </table> -->
<!--                   </div> -->
<!--                 </li> -->

<!--                 <li onclick="sales_detail(2)"> -->
<!--                   광양시 쌀 매출 -->
<!--                   <div id="gwangyang_rice_salse_detail" class="salse_detail dis_none"> -->
<!--                     <table class="table_border"> -->
<!--                       <tr> -->
<!--                         <th>연간 매출</th> -->
<!--                         <td>30,000,000원</td> -->
<!--                       </tr> -->
<!--                     </table> -->
<!--                   </div> -->
<!--                 </li> -->
<!--                 <li onclick="sales_detail(3)">목포시 포도 매출 -->
<!--                   <div id="mokpo_grape_salse_detail" class="salse_detail dis_none"> -->
<!--                     <table class="table_border"> -->
<!--                       <tr> -->
<!--                         <th>연간 매출</th> -->
<!--                         <td>80,000,000원</td> -->
<!--                       </tr> -->
<!--                     </table> -->
<!--                   </div> -->
<!--                 </li> -->
<!--               </ul> -->
<!--             </div> -->
<!--           </div> -->


<!--           <div class="history_cost_box history_box_design default_border"> -->
<!--             <div class="cost_title"><span class="glyphicon glyphicon-triangle-right"></span> 홍길동님의 비용 예측 정보</div> -->
<!--             <div class="cost_list history_list"> -->
<!--               <ul class="cost_list_ul"> -->
<!--                 <li onclick="detail_table(0)">장성시 딸기 비용 -->
<!--                   <div id="jangsung_strawberry_cost_detail" class="cost_detail dis_none"> -->
<!--                     <table class="table_border"> -->
<!--                       <tr> -->
<!--                         <th>연간 비용</th> -->
<!--                         <td>5,000,000원</td> -->
<!--                       </tr> -->
<!--                     </table> -->
<!--                 </li> -->
<!--                 <li onclick="detail_table(1)">나주시 고추 비용 -->
<!--                   <div id="naju_chili_cost_detail" class="cost_detail dis_none"> -->
<!--                     <table class="table_border"> -->
<!--                       <tr> -->
<!--                         <th>연간 비용</th> -->
<!--                         <td>10,000,000원</td> -->
<!--                       </tr> -->
<!--                     </table> -->
<!--                 </li> -->

<!--                 <li onclick="detail_table(2)">목포시 포도 비용 -->
<!--                   <div id="mokpo_grape_cost_detail" class="cost_detail dis_none"> -->
<!--                     <table class="table_border"> -->
<!--                       <tr> -->
<!--                         <th>연간 비용</th> -->
<!--                         <td>10,000,000원</td> -->
<!--                       </tr> -->
<!--                     </table> -->
<!--                 </li> -->
<!--               </ul> -->
<!--             </div> -->
<!--           </div> -->
<!--           <div class="profitpage_btn"> -->
<!--             <button id="profitPrediction_page" type="button" class="my_button"><a href="serviceProfit.html">수익 분석하기</a></button> -->
<!--           </div> -->
<!--         </div> -->
      </div>
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
    <a href="#" class="btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top"><i class="bi bi-arrow-up"></i></a>


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
    <script src="<%= contextPath %>/resources/js/mypage.js"></script>
    <script src="<%= contextPath %>/resources/js/userMgmt.js"></script>
</body>

</html>