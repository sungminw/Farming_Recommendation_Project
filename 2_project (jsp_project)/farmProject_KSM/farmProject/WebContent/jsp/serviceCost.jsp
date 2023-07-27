<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>WYC - Turn to farming</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta content="" name="keywords" />
    <meta content="" name="description" />

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon" />

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
    <link href="../lib/animate/animate.min.css" rel="stylesheet" />
    <link href="../lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet" />
    <link href="../lib/lightbox/css/lightbox.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="../css/bootstrap.min.css" rel="stylesheet" />

    <!-- Template Stylesheet -->
    <link href="../css/style.css" rel="stylesheet" />

    <link rel="stylesheet" href="../css/serviceCost.css" />
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	
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
      <h1 class="mb-5">농작물별 비용과 정책을<br />간단히 확인하세요.</h1>
    </div>
    <!-- Page Header End -->


	<!-- Page Main Start -->
	    <main class="container-xxl wow fadeInUp" data-wow-delay="0.3s">
      <form class="filter_box">
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
                >지역<span> ▼</span></label
              >
              <input
                type="radio"
                name="filter_list_name"
                id="tab_2"
                class="filter_list_checked"
                value="age"
                onclick="select_box_change(2)"
              />
              <label for="tab_2" class="condition col-sm-2 col-xs-5"
                >나이<span> ▼</span></label
              >
              <input
                type="radio"
                name="filter_list_name"
                id="tab_3"
                class="filter_list_checked"
                value="live"
                onclick="select_box_change(3)"
              />
              <label for="tab_3" class="condition col-sm-2 col-xs-5"
                >독립 경영<span> ▼</span></label
              >
              <!-- <input
                type="radio"
                name="filter_list_name"
                id="tab_4"
                class="filter_list_checked"
                value="live"
                onclick="select_box_change(4)"
              />
              <label for="tab_4" class="condition col-sm-2 col-xs-5"
                >병역<span> ▼</span></label
              > -->
            </div>
            <div class="filter_button_box col-sm-4 col-xs-4">
              <input
                type="reset"
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
              onkeyup="filter()"
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
                    id="chili"
                    value="chili"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="chili" class="policy_checkbox_label_crop"
                    >고추</label
                  >
                </li>
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
                    id="strawberry"
                    value="strawberry"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="strawberry" class="policy_checkbox_label_crop"
                    >딸기</label
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
                    id="junggok"
                    value="junggok"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="junggok" class="policy_checkbox_label_crop"
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
                    id="dalae"
                    value="dalae"
                    class="checked_filter"
                    onclick="checked_crop_fun()"
                  />
                  <label for="dalae" class="policy_checkbox_label_crop"
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
                    value="sweet_potato"
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
          <div class="search_header">
            <label for="search_text" class="search_style"></label>
            <input
              type="search"
              class="search_text"
              id="search_text_area"
              onkeyup="filter_area()"
              placeholder="지역 검색"
            />
            <!-- <div class="sear ch_icon"><img src="img/search.png" alt="search"></div> -->
          </div>

          <!-- 선택 목록 파트 시작 -->
          <div class="select_main grid_2">
            <!-- 광역시/도 -->
            <div class="select_area border_default">
              <div class="selet_title">광역시/도</div>
              <ul class="select_area_ul">
                <li>
                  <input
                    type="radio"
                    name="select_area_radio"
                    id="gyeonggido"
                    vlaue="gyeonggido"
                    class="checked_filter select_si_do"
                    onclick="select_si_do_fun()"
                    checked
                  />
                  <label for="gyeonggido" class="policy_checkbox_label"
                    >경기도</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio"
                    id="junlanamdo"
                    vlaue="junlanamdo"
                    class="checked_filter select_si_do"
                    onclick="select_si_do_fun()"
                  />
                  <label for="junlanamdo" class="policy_checkbox_label"
                    >전라남도</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio"
                    id="junlabukdo"
                    vlaue="junlabukdo"
                    class="checked_filter select_si_do"
                    onclick="select_si_do_fun()"
                  />
                  <label for="junlabukdo" class="policy_checkbox_label"
                    >전라북도</label
                  >
                </li>

                <li>
                  <input
                    type="radio"
                    name="select_area_radio"
                    id="chungcheongnamdo"
                    vlaue="chungcheongnamdo"
                    class="checked_filter select_si_do"
                    onclick="select_si_do_fun()"
                  />
                  <label for="chungcheongnamdo" class="policy_checkbox_label"
                    >충청남도</label
                  >
                </li>
              </ul>
            </div>

            <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 지역 시군구 시작@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->

            <div id="gyeonggido_si_gun_gu" class="select_area select_si_gun_gu">
              <div class="selet_title">시군구</div>
              <ul class="gyeonggido_si_gun_gu_ul">
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="gyeonggido_pajusi"
                    value="gyeonggido_pajusi"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="gyeonggido_pajusi"
                    class="policy_checkbox_label_area"
                    >파주시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="gyeonggido_yangpyeonggun"
                    value="gyeonggido_yangpyeonggun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="gyeonggido_yangpyeonggun"
                    class="policy_checkbox_label_area"
                    >양평군</label
                  >
                </li>
              </ul>
            </div>
            <!-- ---------------------------------------------------------------------------------- -->
            <div
              id="junlanamdo_si_gun_gu"
              class="select_area border_default select_si_gun_gu toggle_hide scroll_add"
            >
              <div class="selet_title">시군구</div>
              <ul class="junlanamdo_si_gun_gu_ul">
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_kanggingun"
                    value="kanggin"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_kanggingun"
                    class="policy_checkbox_label_area"
                    >강진군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_goheunggun"
                    value="junlanamdo_goheunggun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_goheunggun"
                    class="policy_checkbox_label_area"
                    >고흥군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_gokseonggun"
                    value="junlanamdo_gokseonggun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_gokseonggun"
                    class="policy_checkbox_label_area"
                    >곡성군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_gwangyanggun"
                    value="junlanamdo_gwangyanggun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_gwangyanggun"
                    class="policy_checkbox_label_area"
                    >광양시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_guryegun"
                    value="junlanamdo_guryegun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_guryegun"
                    class="policy_checkbox_label_area"
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
                    class="policy_checkbox_label_area"
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
                    class="policy_checkbox_label_area"
                    >담양군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_mokposi"
                    value="junlanamdo_mokposi"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_mokposi"
                    class="policy_checkbox_label_area"
                    >목포시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_muangun"
                    value="junlanamdo_muangun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_muangun"
                    class="policy_checkbox_label_area"
                    >무안군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_bosunggun"
                    value="junlanamdo_bosunggun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_bosunggun"
                    class="policy_checkbox_label_area"
                    >보성군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_suncheonsi"
                    value="junlanamdo_suncheonsi"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_suncheonsi"
                    class="policy_checkbox_label_area"
                    >순천시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_sinangun"
                    value="junlanamdo_sinangun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_sinangun"
                    class="policy_checkbox_label_area"
                    >신안군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_yeosusi"
                    value="junlanamdo_yeosusi"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_yeosusi"
                    class="policy_checkbox_label_area"
                    >여수시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_yeonggwanggun"
                    value="junlanamdo_yeonggwanggun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_yeonggwanggun"
                    class="policy_checkbox_label_area"
                    >영광군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_yeongamgun"
                    value="junlanamdo_yeongamgun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_yeongamgun"
                    class="policy_checkbox_label_area"
                    >영암군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="jjunlanamdo_wandogun"
                    value="junlanamdo_wandogun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_wandogun"
                    class="policy_checkbox_label_area"
                    >완도군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_jangsung"
                    value="junlanamdo_jangsung"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_jangsung"
                    class="policy_checkbox_label_area"
                    >장성군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_jangheunggun"
                    value="junlanamdo_jangheunggun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_jangheunggun"
                    class="policy_checkbox_label_area"
                    >장흥군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_jindogun"
                    value="junlanamdo_jindogun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_jindogun"
                    class="policy_checkbox_label_area"
                    >진도군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_hampyeonggun"
                    value="junlanamdo_hampyeonggun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_hampyeonggun"
                    class="policy_checkbox_label_area"
                    >함평군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_haenamgun"
                    value="junlanamdo_haenamgun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_haenamgun"
                    class="policy_checkbox_label_area"
                    >해남군</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlanamdo_hwasungun"
                    value="junlanamdo_hwasungun"
                    class="checked_filter"
                    onclick="checked_area_fun()"
                  />
                  <label
                    for="junlanamdo_hwasungun"
                    class="policy_checkbox_label_area"
                    >화순군</label
                  >
                </li>
              </ul>
            </div>

            <!-- ------------------------------------------------------ -->

            <div
              id="junlabukdo_si_gun_gu"
              class="select_area border_default toggle_hide select_si_gun_gu"
            >
              <div class="selet_title">시군구</div>
              <ul class="junlabukdo_si_gun_gu_ul">
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlabukdo_lksan"
                    value="junlabukdo_lksan"
                    class="checked_filter"
                  />
                  <label
                    for="junlabukdo_lksan"
                    class="policy_checkbox_label_area"
                    >익산시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="junlabukdo_gunsan"
                    value="junlabukdo_gunsan"
                    class="checked_filter"
                  />
                  <label
                    for="junlabukdo_gunsan"
                    class="policy_checkbox_label_area"
                    >군산시</label
                  >
                </li>
              </ul>
            </div>
            <!-- ---------------------------------------------------------------------------------- -->
            <div
              id="chungcheongnamdo_si_gun_gu"
              class="select_area border_default toggle_hide select_si_gun_gu"
            >
              <div class="selet_title">시군구</div>
              <ul class="chungcheongnamdo_si_gun_gu_ul">
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="chungcheongnamdo_nonsan"
                    value="chungcheongnamdo_nonsan"
                    class="checked_filter"
                  />
                  <label
                    for="chungcheongnamdo_nonsan"
                    class="policy_checkbox_label_area"
                    >논산시</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_2"
                    id="chungcheongnamdo_chungju"
                    value="chungcheongnamdo_chungju"
                    class="checked_filter"
                  />
                  <label
                    for="chungcheongnamdo_chungju"
                    class="policy_checkbox_label_area"
                    >청주시</label
                  >
                </li>
              </ul>
            </div>
            <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 지역 시군구 끝@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->

            <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 지역 읍면동 시작@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
            <div
              id="junlanamdo_eup_myeon_dong"
              class="select_area border_default toggle_hide"
            >
              <div class="selet_title">읍면동</div>
              <ul>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_3"
                    id="najueup"
                    class="checked_filter"
                  />
                  <label for="najueup" class="policy_checkbox_label"
                    >나주읍</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_3"
                    id="najumyeon"
                    class="checked_filter"
                  />
                  <label for="najumyeon" class="policy_checkbox_label"
                    >나주면</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_area_radio_3"
                    id="najudong"
                    class="checked_filter"
                  />
                  <label for="najudong" class="policy_checkbox_label"
                    >나주동</label
                  >
                </li>
              </ul>
            </div>
            <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 지역 읍면동 끝@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
          </div>
          <!-- <div class="result_box">
              <div class="result_innerText">
                빈칸
              </div>
              <div class="result_innerText">
                빈칸
              </div>
            </div> -->
        </div>
        <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 지역 선택창 시작@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->

        <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 나이 선택창 시작@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
        <div id="select_age" class="select_box toggle_hide">
          <!-- 검색창 파트 시작 -->
          <div class="search_header">
            <!-- <label for="search_text" class="search_style"></label>
              <input type="text" class="search_text" placeholder="검색">
              <div class="search_icon"><img src="" alt=""></div> -->
          </div>

          <!-- 선택 목록 파트 시작 -->
          <div class="select_main grid_1">
            <!-- 나이 -->
            <div class="select_age border_default scroll_add">
              <div class="selet_title">나이</div>
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
          <!-- 
            <div class="result_box">
              <div class="result_innerText">
                빈칸
              </div>
              <div class="result_innerText">
                빈칸
              </div>
            </div> -->
        </div>
        <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 나이 선택창 끝@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->

        <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 거주기간 선택창 시작@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
        <div id="select_live" class="select_box toggle_hide">
          <!-- 검색창 파트 시작 -->
          <div class="search_header">
            <!-- <label for="search_text" class="search_style"></label>
              <input type="text" class="search_text" placeholder="검색">
              <div class="search_icon"><img src="" alt=""></div> -->
          </div>

          <!-- 선택 목록 파트 시작 -->
          <div class="select_main grid_1">
            <!-- 나이 -->
            <div class="select_live border_default">
              <div class="selet_title">독립 경영 기간</div>
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
          </div>
        </div>
        <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 거주기간 선택창 끝@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->

        <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@병역 확인@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
        <!-- <div id="select_army" class="select_box toggle_hide">
          검색창 파트 시작
          <div class="search_header">
            <label for="search_text" class="search_style"></label>
              <input type="text" class="search_text" placeholder="검색">
              <div class="search_icon"><img src="" alt=""></div>
          </div>

          선택 목록 파트 시작
          <div class="select_main grid_1">
            나이
            <div class="select_army border_default">
              <div class="selet_title">병역 확인</div>
              <ul class="select_army_ul">
                <li>
                  <input
                    type="radio"
                    name="select_army_radio"
                    id="army_mipil"
                    value="army_mipil"
                    class="checked_filter"
                    onclick="checked_army_fun()"
                  />
                  <label for="army_mipil" class="policy_checkbox_label"
                    >미필</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_army_radio"
                    id="army_gunpil"
                    value="army_gunpil"
                    class="checked_filter"
                    onclick="checked_army_fun()"
                  />
                  <label for="army_gunpil" class="policy_checkbox_label"
                    >군필</label
                  >
                </li>
                <li>
                  <input
                    type="radio"
                    name="select_army_radio"
                    id="army_myeonje"
                    value="army_myeonje"
                    class="checked_filter"
                    onclick="checked_army_fun()"
                  />
                  <label for="army_myeonje" class="policy_checkbox_label"
                    >군 면제</label
                  >
                </li>
              </ul>
            </div>
          </div>
        </div> -->

        <!-- ------------------------------------------------- -->
        <div class="result_box">
          <!-- <div class="result_innerText">고추</div> -->
        </div>
      </form>

      <!-- 정책리스트 -->
      <!-- <div class="result_list_wrap">
          <ul>
            <li class="list_item">
              <div class="policy_text">청년노후 지원정책1</div>
              <div class="policy_checkbox">
                <input type="checkbox" vlaue="exlist1" name="resultList" id="resultList1" class="resultList">
                    <label for="resultList1" class="resultList_label"></label>
              </div>
            </li>
            <li class="list_item">
              <div class="policy_text">청년노후 지원정책2</div>
              <div class="policy_checkbox">
                <input type="checkbox" name="resultList" id="resultList2" class="resultList">
                    <label for="resultList2" class="resultList_label"></label>
              </div>
            </li>
            <li class="list_item">
              <div class="policy_text">청년노후 지원정책3</div>
              <div class="policy_checkbox">
                <input type="checkbox" name="resultList" id="resultList3" class="resultList">
                <label for="resultList3" class="resultList_label"></label>
              </div>
            </li>
          </ul>
        </div> -->
      <!-- ----------------------------------------------------- -->

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
          <table class="policy_modal_table" style="white-space: nowrap">
            <tr>
              <th>지원 대상 및 자격조건</th>
              <td class="policyTarget"></td>
            </tr>
            <tr>
              <th>사업내용</th>
              <td class="policyContent"></td>
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
    
    
    
<!--         <div id="modal_box" value="modal_box"> -->
<!--       <div id="modal_contents"> -->
<!--         <button id="modal_close">&times;</button> -->
<!--         <h1 id="modal_title">정책 세부 내역</h1> -->
<!--         <div id="modal_desc" style="width: 100%; overflow: auto"> -->
<!--           <table class="policy_modal_table" style="white-space: nowrap"> -->
<!--             <tr> -->
<!--               <th>지원 대상 및 자격조건</th> -->
<!--               <td>만 40세 미만 청년 농업인</td> -->
<!--             </tr> -->
<!--             <tr> -->
<!--               <th>사업내용</th> -->
<!--               <td>영농정착지원금 지원</td> -->
<!--             </tr> -->
<!--             <tr> -->
<!--               <th>지원 조건</th> -->
<!--               <td>독렵경영 0~3년차 차등 지원</td> -->
<!--             </tr> -->
<!--             <tr> -->
<!--               <th>증빙서류</th> -->
<!--               <td>신청서, 사업계획서,교육실적 등</td> -->
<!--             </tr> -->
<!--             <tr> -->
<!--               <th>사업량</th> -->
<!--               <td>예산배정 한도 내</td> -->
<!--             </tr> -->
<!--             <tr> -->
<!--               <th>접수 및 문의</th> -->
<!--               <td>농정과</td> -->
<!--             </tr> -->
<!--           </table> -->
<!--         </div> -->
<!--       </div> -->
<!--     </div> -->
	<!-- Page Modal End -->
    
    <!-- Page Submit Start -->
    <form id="total_cost" class="border_default mt-5" action="historySaveCost.do">
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
        <div class="col-lg-2 col-md-4 col-sm-6 col-xs-12">
        <input type="hidden" name="wycId" value="testId3">
        <input type="hidden" name="selectCrop" class="selectCrop" value="">
        <input type="hidden" name="selectCropKor" class="selectCropKor" value="">
        <input type="hidden" name="selectArea" class="selectArea" value="">
        <input type="hidden" name="costPolicy" class="costPolicy" value="">
        <input type="hidden" name="costResult" class="costResult" value="">
          <button type="submit" id="total_cost_submit">저장</button>
        </div>
      </div>
    </form>
    <!-- Page Submit End -->



    <!-- Footer Start -->
    <div
      class="container-fluid bg-dark footer mt-5 py-5 wow fadeIn"
      data-wow-delay="0.1s"
    >
      <div class="container py-5">
        <div class="row g-5">
          <div class="col-lg-4 col-md-6">
            <h5 class="text-white mb-4">Our Office</h5>
            <p class="mb-2">
              <i class="fa fa-map-marker-alt me-3"></i>서울시 마포구 신촌로 104
              4층, 5층<br />그린컴퓨터
            </p>
            <p class="mb-2"><i class="fa fa-phone-alt me-3"></i>02-715-2111</p>
            <p class="mb-2">
              <i class="fa fa-envelope me-3"></i>http://sinchon.greenart.co.kr/
            </p>
            <div class="d-flex pt-3">
              <!-- <a class="btn btn-square btn-secondary rounded-circle me-2" href=""><i class="fab fa-twitter"></i></a>
                      <a class="btn btn-square btn-secondary rounded-circle me-2" href=""><i class="fab fa-facebook-f"></i></a>
                      <a class="btn btn-square btn-secondary rounded-circle me-2" href=""><i class="fab fa-youtube"></i></a>
                      <a class="btn btn-square btn-secondary rounded-circle me-2" href=""><i class="fab fa-linkedin-in"></i></a> -->
              <a
                class="btn btn-square btn-secondary rounded-circle me-2"
                href="https://github.com/Sanghokim91/WYC"
                ><i class="fab fa-github"></i
              ></a>
            </div>
          </div>
          <div class="col-lg-4 col-md-6">
            <h5 class="text-white mb-4">Quick Links</h5>
            <a class="btn btn-link" href="recomend.html">농작물 추천</a>
            <a class="btn btn-link" href="revenue1.html"
              >매출 확인(농작물우선)</a
            >
            <a class="btn btn-link" href="revenue2.html">매출 확인(지역우선)</a>
            <a class="btn btn-link" href="serviceCost.html">비용 조회</a>
            <a class="btn btn-link" href="serviceProfit.html">수익 확인</a>
            <a class="btn btn-link" href="servicePolicyCheck.html"
              >정부지원 정책들</a
            >
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

    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

    <!-- Template Javascript -->
    <script src="../js/main.js"></script>

    <script src="../js/serviceCost.js"></script>

</body>
</html>