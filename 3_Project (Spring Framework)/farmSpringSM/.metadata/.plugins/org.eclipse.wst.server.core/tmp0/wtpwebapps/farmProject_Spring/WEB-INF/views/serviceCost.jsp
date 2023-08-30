<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<script type="text/javascript">
	let sessionId = null
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
	String contextPath = request.getContextPath();
%>
</script>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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

    <link rel="stylesheet" href="<%= contextPath %>/resources/css/serviceCost.css" />
        
<!--     <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script> -->
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"> -->

	<!-- 컨펌 꾸미기 -->
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	
</head>
<body>
<script>
	//매출 분석시 농작물, 지역, 매출액을 저장
  const crop = '${crop}';
  const area = '${area}';
  const salesResult = '${salesResult}';
  
  // 가져온 속성값 확인
  console.log(crop);  // "Potato"
  console.log(area);  // "1000"
  console.log(salesResult); // "500"
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
    <div
      class="container-fluid header_img py-5 mb-5"
      data-wow-delay="0.1s"
    >
      <div class="container text-center py-5">
        <h1 class="display-3 text-white mb-4 slideInDown">
          비용 조회
        </h1>
      </div>
    </div>

    <div
      class="text-center mx-auto pb-4 wow fadeInUp"
      data-wow-delay="0.3s"
      style="max-width: 500px"
    >
      <p class="section-title bg-white text-center text-primary px-3">
        소요비용
      </p>
      <h1 class="mb-5">농작물별 비용과 정책을<br />간편히 확인하세요.</h1>
    </div>
    <!-- Page Header End -->


	<!-- Page Main Start -->
	    <main class="container-xxl wow fadeInUp" data-wow-delay="0.3s">
      <form class="filter_box" name="conditionForm">
        <h1 class="filter_title">농작물별 비용과 정책 계산하기</h1>
        <div class="filter_wrap">
          <div class="filter_list mb-3">
            <div class="filter_policy_box col-sm-8 col-xs-8">
              <input
                type="radio"
                name="filter_list_name"
                id="tab_0"
                class="filter_list_checked"
                value="crop"
                onclick="select_box_change(0)"
                checked
              />
              <label for="tab_0" class="condition col-sm-2 col-xs-5"
                >농작물<span> ▼</span></label
              >
              <input
                type="radio"
                name="filter_list_name"
                id="tab_1"
                class="filter_list_checked"
                value="area"
                onclick="select_box_change(1)"
              />
              <label for="tab_1" class="condition col-sm-2 col-xs-5"
                >정책 조건<span> ▼</span></label
              >
              
            </div>
            <div class="filter_button_box col-sm-4 col-xs-4">
              <input
                type="button"
                name="filter_list_reset"
                id="filter_list_reset"
                class="filter_list_checked"
              />
              <label
                for="filter_list_reset"
                class="condition offset-sm-1 col-sm-5 offset-xs-1 col-xs-5"
                >초기화</label
              >
              <input
                type="button"
                name="filter_list_submit"
                id="filter_list_submit"
                class="filter_list_checked"
              />
              <label
                for="filter_list_submit"
                class="condition col-sm-5 col-xs-5"
                >검색</label
              >
            </div>
          </div>
        </div>

        <!-- 농작물 셀렉박스 시작 -->
        <div id="select_crop" class="select_box">
          <!-- 검색창 파트 시작 -->
          <div class="search_header">
            <label for="search_text" class="search_style"></label>
            <input
              type="search"
              class="search_text"
              id="search_text_id"
              onkeyup="filter_crop()"
              placeholder="농작물 검색"
            />
            <!-- <div class="search_icon">
                <img src="img/search.png" alt="search">
              </div> -->
          </div>

          <!-- 선택 목록 파트 시작 -->
          <div class="select_main grid_5">
            <!-- 조미채소 -->
            <div class="jomi_vegetable border_default">
              <div class="selet_title area_title">조미채소</div>
              <ul class="jomi_vegetable_ul crop_ul">

                <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="garlic"
                    value="garlic"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="garlic" class="policy_checkbox_label_crop"
                    >마늘</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="onion"
                    value="onion"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="onion" class="policy_checkbox_label_crop"
                    >양파</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="greenonion"
                    value="greenonion"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="greenonion" class="policy_checkbox_label_crop"
                    >대파</label
                  >
                </li>
                 <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="chives"
                    value="chives"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="chives" class="policy_checkbox_label_crop"
                    >쪽파</label
                  >
                </li>
              </ul>
            </div>

            <!-- 과채류 -->
            <div class="fruit_and_vegetable border_default">
              <div class="selet_title area_title">과채류</div>
              <ul class="fruit_and_vegetable_ul crop_ul">
              <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="pepper"
                    value="pepper"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="pepper" class="policy_checkbox_label_crop"
                    >고추</label
                  >
                </li>

                <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="cucumber"
                    value="cucumber"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="cucumber" class="policy_checkbox_label_crop"
                    >오이</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="tomato"
                    value="tomato"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="tomato" class="policy_checkbox_label_crop"
                    >토마토</label
                  >
                </li>
                 <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="spinach"
                    value="spinach"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="spinach" class="policy_checkbox_label_crop"
                    >시금치</label
                  >
                </li>
              </ul>
            </div>

            <!-- 식량작물 -->
            <div class="food_crop border_default">
              <div class="selet_title area_title">식량작물</div>
              <ul class="food_crop_ul">
                <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="rice"
                    value="rice"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="rice" class="policy_checkbox_label_crop"
                    >정곡</label
                  >
                </li>
              </ul>
            </div>

            <!-- 과실류 -->
            <div class="fruits_kind border_default">
              <div class="selet_title area_title">과실류</div>
              <ul class="fruits_kind_ul">
                <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="kiwi"
                    value="kiwi"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="kiwi" class="policy_checkbox_label_crop"
                    >참다래</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="grape"
                    value="grape"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="grape" class="policy_checkbox_label_crop"
                    >포도</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="stberry"
                    value="stberry"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="stberry" class="policy_checkbox_label_crop"
                    >딸기</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="peach"
                    value="peach"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="peach" class="policy_checkbox_label_crop"
                    >복숭아</label
                  >
                </li>
              </ul>
            </div>

            <!-- 서류 -->
            <div class="seolyu_kink border_default">
              <div class="selet_title area_title">서류</div>
              <ul class="seolyu_kink_ul">
                <li>
                  <input
                    type="radio"
                    name="crop_policy_checkbox"
                    id="sweet_potato"
                    value="spotato"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="sweet_potato" class="policy_checkbox_label_crop"
                    >고구마</label
                  >
                </li>
              </ul>
            </div>
          </div>
        </div>

        <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 지역 선택창 시작@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
        <div id="select_area" class="select_box toggle_hide">
          <!-- 검색창 파트 시작 -->
          <div class="search_header" style="height: 50px;">
<!--             <label for="search_text" class="search_style"></label> -->
<!--             <input -->
<!--               type="search" -->
<!--               class="search_text" -->
<!--               id="search_text_area" -->
<!--               onkeyup="filter_area()" -->
<!--               placeholder="지역 검색" -->
<!--             /> -->
          </div>

          <!-- 선택 목록 파트 시작 -->
          <div class="select_main grid_25">
            <!-- 광역시/도 -->
            <div class="select_area border_default">
              <div class="selet_title">광역시/도</div>
              <ul class="select_area_ul">
               <li>
                  <input
                    type="radio"
                    name="select_area_radio"
                    id="junlanamdo"
                    value="junlanamdo"
                    class="checked_filter select_si_do"
                    onclick="select_si_do_fun()"
                    checked
                  />
                  <label for="junlanamdo" class="policy_checkbox_label"
                    >전라남도</label
                  >
                </li>
              </ul>
            </div>

            <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 지역 시군구 시작@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->


            <div
              id="junlanamdo_si_gun_gu"
              class="select_area border_default select_si_gun_gu over_hidden"
            >
              <div class="selet_title">시군구</div>
              <div class="junlanamdo_si_gun_gu_ul_wrap scroll_add">
              <ul class="junlanamdo_si_gun_gu_ul">
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_gangjingun"
                    value="gangjin"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_gangjingun"
                    class="policy_checkbox_label_area stberry chives cucumber "
                    >강진군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_goheunggun"
                    value="goheung"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_goheunggun"
                    class="policy_checkbox_label_area pepper rice garlic"
                    >고흥군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_gokseonggun"
                    value="gokseong"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_gokseonggun"
                    class="policy_checkbox_label_area stberry kiwi spinach"
                    >곡성군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_gwangyanggun"
                    value="gwangyang"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_gwangyanggun"
                    class="policy_checkbox_label_area tomato chives peach" 
                    >광양시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_guryegun"
                    value="gurye"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_guryegun"
                    class="policy_checkbox_label_area cucumber chives greenonion"
                    >구례군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_naju"
                    value="naju"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_naju"
                    class="policy_checkbox_label_area stberry tomato chives"
                    >나주시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_damyanggun"
                    value="damyang"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_damyanggun"
                    class="policy_checkbox_label_area stberry grape tomato"
                    >담양군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_mokposi"
                    value="mokpo"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_mokposi"
                    class="policy_checkbox_label_area chives cucumber grape"
                    >목포시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_muangun"
                    value="muan"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_muangun"
                    class="policy_checkbox_label_area spotato rice garlic"
                    >무안군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_boseonggun"
                    value="boseong"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_boseonggun"
                    class="policy_checkbox_label_area stberry kiwi onion"
                    >보성군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_suncheonsi"
                    value="suncheon"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_suncheonsi"
                    class="policy_checkbox_label_area stberry peach cucumber"
                    >순천시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_sinangun"
                    value="sinan"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_sinangun"
                    class="policy_checkbox_label_area spinach kiwi greenonion"
                    >신안군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_yeosusi"
                    value="yeosu"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_yeosusi"
                    class="policy_checkbox_label_area garlic grape onion"
                    >여수시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_yeonggwanggun"
                    value="yeonggwang"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_yeonggwanggun"
                    class="policy_checkbox_label_area stberry spotato onion"
                    >영광군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_yeongamgun"
                    value="yeongam"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_yeongamgun"
                    class="policy_checkbox_label_area spotato rice pepper"
                    >영암군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_wandogun"
                    value="wando"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_wandogun"
                    class="policy_checkbox_label_area rice spinach greenonion"
                    >완도군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_jangseong"
                    value="jangseong"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_jangseong"
                    class="policy_checkbox_label_area stberry grape tomato"
                    >장성군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_jangheunggun"
                    value="jangheung"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_jangheunggun"
                    class="policy_checkbox_label_area stberry spinach peach"
                    >장흥군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_jindogun"
                    value="jindo"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_jindogun"
                    class="policy_checkbox_label_area pepper greenonion onion"
                    >진도군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_hampyeonggun"
                    value="hampyeong"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_hampyeonggun"
                    class="policy_checkbox_label_area pepper garlic onion"
                    >함평군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_haenamgun"
                    value="haenam"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_haenamgun"
                    class="policy_checkbox_label_area spotato rice greenonion"
                    >해남군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_hwasungun"
                    value="hwasun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_hwasungun"
                    class="policy_checkbox_label_area tomato rice peach"
                    >화순군</label
                  >
                </li>
              </ul>
              </div>
            </div>
            <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 지역 시군구 끝 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
            
            <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 나이 선택창 시작@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
            <div class="select_age border_default over_hidden">
              <div class="selet_title">나이</div>
              <div class="select_age_ul_wrap scroll_add">
                <ul class="select_age_ul">
                  <li>
                    <input
                      type="radio"
                      name="select_age_radio"
                      id="twenty_thirty"
                      value="30"
                      class="checked_filter"
                      onclick="checked_age_fun()"
                    />
                    <label for="twenty_thirty" class="policy_checkbox_label"
                      >20~30살</label
                    >
                  </li>
                  <li>
                    <input
                      type="radio"
                      name="select_age_radio"
                      id="thirty_fourty"
                      value="40"
                      class="checked_filter"
                      onclick="checked_age_fun()"
                    />
                    <label for="thirty_fourty" class="policy_checkbox_label"
                      >30~40살</label
                    >
                  </li>
                  <li>
                    <input
                      type="radio"
                      name="select_age_radio"
                      id="fourty_fifty"
                      value="50"
                      class="checked_filter"
                      onclick="checked_age_fun()"
                    />
                    <label for="fourty_fifty" class="policy_checkbox_label"
                      >40~50살</label
                    >
                  </li>
                  <li>
                    <input
                      type="radio"
                      name="select_age_radio"
                      id="fifty_sixty"
                      value="60"
                      class="checked_filter"
                      onclick="checked_age_fun()"
                    />
                    <label for="fifty_sixty" class="policy_checkbox_label"
                      >50~60살</label
                    >
                  </li>
                  <li>
                    <input
                      type="radio"
                      name="select_age_radio"
                      id="sixty_over"
                      value="70"
                      class="checked_filter"
                      onclick="checked_age_fun()"
                    />
                    <label for="sixty_over" class="policy_checkbox_label"
                      >66살 이상</label
                    >
                  </li>
                </ul>
              </div>
            </div>
            <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 나이 선택창 끝@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->

            <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 거주 기간 선택창 시작@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
            <div class="select_live border_default">
              <div class="selet_title">거주 기간</div>
              <ul class="select_live_ul">
                <!-- <li>
                      <input type="radio" name="select_live_radio" id="zeroyear" value="zeroyear" class="checked_filter" onclick="checked_live_fun()">
                      <label for="onezeroyearyear" class="policy_checkbox_label">예비귀농인</label>
                    </li> -->
                <li>
                  <input
                    type="radio"
                    name="select_live_radio"
                    id="oneyear"
                    value="1"
                    class="checked_filter"
                    onclick="checked_live_fun()"
                  />
                  <label for="oneyear" class="policy_checkbox_label"
                    >1년차(예비귀농인 포함)</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_live_radio"
                    id="twoyear"
                    value="2"
                    class="checked_filter"
                    onclick="checked_live_fun()"
                  />
                  <label for="twoyear" class="policy_checkbox_label"
                    >2년차</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_live_radio"
                    id="threeyear"
                    value="3"
                    class="checked_filter"
                    onclick="checked_live_fun()"
                  />
                  <label for="threeyear" class="policy_checkbox_label"
                    >3년차</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_live_radio"
                    id="fouryear_over"
                    value="4"
                    class="checked_filter"
                    onclick="checked_live_fun()"
                  />
                  <label for="fouryear_over" class="policy_checkbox_label"
                    >4년차 이상</label
                  >
                </li>
              </ul>
            </div>
            <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 거주 기간 선택창 끝@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
          </div>
        </div>

        <div class="result_box">
          <!-- <div class="result_innerText">고추</div> -->
        </div>
      </form>

      <div class="result_list_wrap">
        <ul id="policyList"></ul>
      </div>


<!--       <div class="pagination"> -->
<!--         <button id="prevPage">이전</button> -->
<!--         <div id="pageButtons"></div> -->
<!--         <button id="nextPage">다음</button> -->
<!--       </div> -->
<!-- 페이지 네이션 해야함 -->



      <!-- 
          <div class="result_list_wrap">
            <ul id="policyList">
            </ul>
          </div>
        
          <div class="pagination">
            <button id="prevPage">Previous</button>
            <span id="currentPage">1</span>
            <button id="nextPage">Next</button>
          </div> -->

      <!-- <div id="list"></div>
          <div class="pagination"></div>
        </div> -->

      <!-- <div id="result"></div> -->

      <!-- --------------------------------------------------------- -->
    </main>
    <!-- Page Main End -->
    
    
    <!-- Page Modal Start -->
    <div class="modal fade bs-example-modal-lg" id="policyModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg modal_cutom">
    <div class="modal-content">
      <div class="modal-header">        
        <h6 class="modal-title" id="myModalLabel">정책 세부 내역</h6>
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
    
    <!-- Page Submit Start -->
    <div class="cost_description mt-5">※ 소요비용은 10a(300평)기준이며 분석 요소는 초기재료비, 투자비, 토지비용 등 이고 정책금액과 합산한 총 소요비용을 계산합니다.</div>
    
    <form id="total_cost" class="border_default" action="serviceProfitGo.do" method="post" name="costForm">
      <div class="total_cost_inner row">
        <div class="col-lg-2 col-md-4 col-sm-6 col-xs-12">
          소요비용<br /><span class="operCost">0</span>
        </div>
        <div class="col-lg-2 col-md-4 col-sm-6 col-xs-12">-</div>
        <div class="col-lg-2 col-md-4 col-sm-6 col-xs-12">
          정책지원<br /><span class="policyCost">0</span>
        </div>
        <div class="col-lg-2 col-md-4 col-sm-6 col-xs-12">=</div>
        <div class="col-lg-2 col-md-4 col-sm-6 col-xs-12">
          연간 총 비용<br /><span class="operTotal">0</span>
        </div>
        <div class="col-lg-2 col-md-4 col-sm-6 col-xs-12 profitButton">
<!--         <input type="hidden" name="wycId" value="testId3"> -->
        <input type="hidden" name="selectCrop" class="selectCrop" value="">
        <input type="hidden" name="selectArea" class="selectArea" value="">
        <input type="hidden" name="salesResult" class="salesResult" value="0">
        <input type="hidden" name="costPolicy" class="costPolicy" value="0">
        <input type="hidden" name="costResult" class="costResult" value="0">
          <button type="button" id="total_cost_submit">수익 계산</button>
        </div>
      </div>
    </form>
    <!-- Page Submit End -->

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
	
	<!-- 08.08 modal 때문에 추가함-->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

    <!-- Template Javascript -->
    <script src="<%= contextPath %>/resources/js/main.js"></script>

    <script src="<%= contextPath %>/resources/js/serviceCost.js"></script>
    <script src="<%= contextPath %>/resources/js/userMgmt.js"></script>

</body>
</html>