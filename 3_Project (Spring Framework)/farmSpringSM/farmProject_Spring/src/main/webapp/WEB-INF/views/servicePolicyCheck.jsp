<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
    <link rel="stylesheet" href="<%= contextPath %>/resources/css/servicepolicyCheckpage.css">
    
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

    <!-- Page Header Start -->
    <div class="container-fluid header_img py-5 mb-5 wow fadeIn" data-wow-delay="0.1s">
        <div class="container text-center py-5">
            <h1 class="display-3 text-white mb-4 animated slideInDown">정부지원 정책들</h1>
        </div>
    </div>

    <div class="text-center mx-auto pb-4 wow fadeInUp" data-wow-delay="0.3s" style="max-width: 500px;">
        <p class="section-title bg-white text-center text-primary px-3">정부지원 정책</p>
        <h1 class="mb-5">전라남도 정부지원 정책을<br>검색해보세요.</h1>
    </div>
    <!-- Page Header End -->


    <!-- Gallery Start -->
    <main class="container wow fadeInUp" data-wow-delay="0.3s">
        <form class="search_box">
          <h1 class="policy_large_title">지원 정책 검색</h1>
          <div class="search_box_inner">
            <div class="select_area">
              <select id="select_si_do" name="select_si_do" class="xs_font" onchange="">
                <option value="">시도 선택</option>
                <option value="">전라남도</option>
<!--                 <option value="">전라북도</option> -->
              </select>
              <select class="select_sigungu xs_font" id="select_default">
                <option value="">시군구 선택</option>
              </select>
              <select
                class="display_hide select_sigungu xs_font"
                id="select_si_gun_gu_junlanamdo"
              >
                <option value="default">시군구 선택</option>
                <option value="gangjin">강진군</option>
                <option value="goheung">고흥군</option>
                <option value="gokseong">곡성군</option>
                <option value="gwangyang">광양시</option>
                <option value="gurye">구례군</option>
                <option value="naju">나주시</option>
                <option value="damyang">담양군</option>
                <option value="mokpo">목포시</option>
                <option value="muan">무안군</option>
                <option value="boseong">보성군</option>
                <option value="suncheon">순천시</option>
                <option value="sinan">신안군</option>
                <option value="yeosu">여수시</option>
                <option value="yeonggwang">영광군</option>
                <option value="yeongam">영암군</option>
                <option value="wando">완도군</option>
                <option value="jangseong">장성군</option>
                <option value="jangheung">장흥군</option>
                <option value="jindo">진도군</option>
                <option value="hampyeong">함평군</option>
                <option value="haenam">해남군</option>
                <option value="hwasun">화순군</option>
              </select>
<!--               <select class="display_hide select_sigungu xs_font" id="select_si_gun_gu_junlabukdo"> -->
<!--                 <option value="null">시군구 선택</option> -->
<!--                 <option value="">익산시</option> -->
<!--                 <option value="">군산시</option> -->
<!--                 <option value="">완주군</option> -->
<!--                 <option value="">전주시</option> -->
<!--               </select> -->
            </div>


            <div class="search_text_box">
              <input
                type="text"
                id="search_text"
                name="policySerch"
                placeholder="사업명 입력"
              />
            </div>

            <div class="search_submit_box">
              <button type="button" id="search_button">검색</button>
            </div>
          </div>
        </form>

        <div class="policy_box">
          <div class="policy_info_title_box">
            <h2 class="policy_small_title">지자체별 지원 정책</h2>
            <span class="policy_count">총 <span class="row_count"></span>건</span>
          </div>
          <div class="policy_list_box">
            <div class="policy_list">
              <table class="policy_table table-hover">
                <colgroup>
                  <col style="width: 8%" />
                  <col style="width: 11%" />
                  <col style="width: 11%" />
                  <col style="width: 54%" />
                  <col style="width: 16%" />
                </colgroup>
                <thead>
                  <tr>
                    <th>번호</th>
                    <th>시도</th>
                    <th>시군구</th>
                    <th>세부사업명</th>
                    <th>자세히보기</th>
                  </tr>
                </thead>
                <tbody class="policy_list_tbody">

                  <c:forEach items="${policyList }" var="policy" varStatus="loop">
                  	<tr class="policy_tr">
                  	  <td>${policyLength-loop.index}</td>
                  	  <td class="policy_sido">${policy.city}</td>
                  	  <td class="policy_sigungu">${policy.areaKor}</td>
                  	  <td class="policy_title_name">${policy.policyName}</td>
                  	  <td>
                  	    <div class="policy_detail" data-toggle="modal" data-target="#policyModal">
                  	    	<img src="<%= contextPath %>/resources/img/Magnifier.png" />자세히보기
                        </div>
                  	  </td>
                  </tr>
                  </c:forEach>
                  
                </tbody>
        
              </table>
            </div>
          </div>
        </div>
		
<!-- 		<div class="pagination"> -->
<!--     		<button id="prevPage">이전</button> -->
<!--     		<div id="pageButtons"></div> -->
<!--     		<button id="nextPage">다음</button> -->
<!-- 		</div> -->
<!-- 		<div id="pagination"> -->
<!--  			<button id="prevPage">이전</button> -->
<!--   			<span id="currentPage">1</span> -->
<!--   			<button id="nextPage">다음</button> -->
<!-- 		</div> -->
<!-- <div id="pagination"> -->
<!--   <ul class="pagination-list"> -->
<!--     페이지 번호가 들어갈 자리 -->
<!--   </ul> -->
<!--   <button id="prevPageBtn">이전</button> -->
<!--   <button id="nextPageBtn">다음</button> -->
<!-- </div> -->
<!-- <div class="pagination"> -->
<!--     <button id="prevButton">이전</button> -->
<!--     <div id="pageButtons"></div> -->
<!--     <button id="nextButton">다음</button> -->
<!-- </div> -->
      <div class="pagination">
        <button id="prevPage">이전</button>
        <div id="pageButtons"></div>
        <button id="nextPage">다음</button>
      </div>

        <!-- -------- -->
        <!-- <div class="policy_box2">
          <div class="policy_info_title_box">
            <h2 class="policy_small_title">지자체별 지원 정책</h2>
            <span class="policy_count">총 <span>23</span>건</span>
          </div>
          <div class="policy_list_box2">
            <div class="policy_list2">
              <table class="policy_table2 table-hover">
                <colgroup>
                  <col style="width: 8%" />
                  <col style="width: 11%" />
                  <col style="width: 11%" />
                  <col style="width: 54%" />
                  <col style="width: 16%" />
                </colgroup>
                <thead>
                  <tr>
                    <th>번호</th>
                    <th>시도</th>
                    <th>시군구</th>
                    <th>세부사업명</th>
                    <th>자세히보기</th>
                  </tr>
                </thead>
                <tbody id="tableBody2">
                </tbody>
              </table>
            </div>
          </div>
        </div> -->

        <!-- <div class="pagination">
          <button id="prevPage">이전</button>
          <div id="pageButtons">
            <button class="pageButton">1</button>
            <button class="pageButton">2</button>
            <button class="pageButton">3</button>
          </div>
          <button id="nextPage">다음</button>
        </div> -->

        <!-- ----- -->
      </main>

    <!-- Page Modal Start -->
    <div class="modal fade bs-example-modal-lg" id="policyModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg modal_cutom">
    <div class="modal-content">
      <div class="modal-header">        
        <div class="modal-title" id="myModalLabel">정책 세부 내역</div>
      </div>
      <div class="modal-body">
        <div class="container-xxl">
              <div class="text-center mx-auto wow fadeInUp" style="visibility: none;" data-wow-delay="0.3s">
                </div>             
 	<div id="modal_desc" style="width: 100%; overflow: auto">
          <table class="policy_modal_table">
<!--            style="white-space: nowrap" -->
            <tr>
              <th>지원 대상 및 자격조건</th>
              <td class="policyTarget"></td>
            </tr>
            <tr>
              <th>사업내용</th>
              <td class="policyName"></td>
            </tr>
            <tr>
              <th>지원 조건</th>
              <td class="policyCondition"></td>
            </tr>
            <tr>
              <th>증빙서류</th>
              <td class="policyDocumentation"></td>
            </tr>
            <tr>
              <th>사업량</th>
              <td class="policySupport"></td>
            </tr>
            <tr>
              <th>접수 및 문의</th>
              <td class="policyPhone"></td>
            </tr>
          </table>
          </div>

            <div class="modal-footer">
              <button type="button" class="btn btn-default btn-sm" data-dismiss="modal">Close</button>
              </div>
          </div>
      </div>
      </div>
      </div>
      </div>
<!-- 	Page Modal End -->


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
    <script src="<%= contextPath %>/resources/lib/wow/wow.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/easing/easing.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/waypoints/waypoints.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/counterup/counterup.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/parallax/parallax.min.js"></script>
    <script src="<%= contextPath %>/resources/lib/lightbox/js/lightbox.min.js"></script>

	<!-- 08.08 modal 때문에 추가함-->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    
    <!-- Template Javascript -->
    <script src="<%= contextPath %>/resources/js/main.js"></script>

    <script src="<%= contextPath %>/resources/js/servicepolicyCheckpage.js"></script>
    <script src="<%= contextPath %>/resources/js/userMgmt.js"></script>
</body>

</html>