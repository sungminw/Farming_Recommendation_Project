(function ($) {
  "use strict";

  // Spinner
  var spinner = function () {
    setTimeout(function () {
      if ($("#spinner").length > 0) {
        $("#spinner").removeClass("show");
      }
    }, 1);
  };
  spinner();

  // Initiate the wowjs
  new WOW().init();

  // Sticky Navbar
  $(window).scroll(function () {
    if ($(this).scrollTop() > 300) {
      $(".sticky-top").addClass("shadow-sm").css("top", "0px");
    } else {
      $(".sticky-top").removeClass("shadow-sm").css("top", "-100px");
    }
  });

  // Back to top button
  $(window).scroll(function () {
    if ($(this).scrollTop() > 300) {
      $(".back-to-top").fadeIn("slow");
    } else {
      $(".back-to-top").fadeOut("slow");
    }
  });
  $(".back-to-top").click(function () {
    $("html, body").animate({ scrollTop: 0 }, 1500, "easeInOutExpo");
    return false;
  });

  const btnCrop = document.querySelectorAll(".btn-crop");
  const area = document.querySelector("#area");
  const page = document.querySelector(".page");
  const possibleArea = {
    tomato: ["나주시", "고흥군", "장성군", "화순군", "담양군", "광양시"],
    stberry: [
      "나주시",
      "장흥군",
      "영광군",
      "보성군",
      "곡성군",
      "담양군",
      "화순군",
      "강진군",
    ],
    spotato: ["무안군", "영암군", "해남군", "영광군"],
    chili: ["고흥군", "진도군", "함평군"],
    greenonion: ["진도군"],
    garlic: ["고흥군", "함평군", "무안군", "여수시"],
    peach: ["화순군", "순천시"],
    rice: ["고흥군", "완도군", "무안군", "영암군", "해남군", "화순군"],
    onion: ["고흥군", "영광군", "함평군", "여수시", "무안군"],
    cucumber: ["고흥군", "구례군", "순천시"],
    kiwi: ["고흥군", "보성군"],
    // greenonion: ["진도군"],
    grape: ["장성군", "담양군"],
    spinach: ["신안군"],
    chives: ["보성군"],
  };
  const cropInfo = {
    tomato: ["토마토.jpg"],
    stberry: ["딸기.jpg"],
    spotato: ["고구마.jpg"],
    chili: ["고추.jpg"],
    // greenonion: ["대파.jpg"],
    garlic: ["마늘.jpg"],
    peach: ["복숭아.jpg"],
    rice: ["쌀.jpg"],
    onion: ["양파.jpg"],
    cucumber: ["오이.jpg"],
    kiwi: ["키위.jpg"],
    greenonion: ["파.jpg"],
    grape: ["포도.jpg"],
    spinach: ["시금치.jpg"],
    chives: ["쪽파.jpg"],
  };

  btnCrop.forEach((item) => {
    item.addEventListener("click", (e) => {
      area.innerHTML = "";
      for (let key in possibleArea) {
        if (item.value == key) {
          for (let i = 0; i < possibleArea[key].length; i++) {
            let str =
              "<tr><td class ='select_area_td'>" +
              "<input type='radio'" +
              "name='select_area_radio_name'" +
              "id='" +
              possibleArea[key][i] +
              "'" +
              "value='" +
              possibleArea[key][i] +
              "'" +
              "class='select_area_radio'/>" +
              "<label for='" +
              possibleArea[key][i] +
              "'" +
              "class='select_area_radio_label'" +
              ">" +
              possibleArea[key][i] +
              "</label>" +
              "</td></tr>";
            area.innerHTML = area.innerHTML + str;
          }
          for (let n = 0; n < cropInfo[key].length; n++) {
            const crops_map = document.querySelectorAll(
              'input[name="flexRadioDefault"]'
            );

            let checkedIndex_crop = -1;

            crops_map.forEach((crop_map, index_crop) => {
              if (crop_map.checked) {
                checkedIndex_crop = index_crop;
              }
            });

            const form_check_label =
              document.querySelectorAll(".form-check-label");

            const crop_true = form_check_label[checkedIndex_crop].innerText;

            page.innerHTML =
              `
            <div class="page-content page-container" id="page-content">
            <div class="row">
            <div class="card">
            <div class="card-header">
            <strong>` +
              crop_true +
              ` 재배 가능 지역</strong>
            </div>
            <div class="card-body">
            </div>`;
            const cardBody = document.querySelector(".card-body");
            cardBody.innerHTML = "";
            const img = new Image();
            img.src = `img/${cropInfo[key][n]}`;
            cardBody.appendChild(img);
          }
        }
      }
    });
  });
})(jQuery);

//매출확인 버튼 클릭 시 기능
const total_sales_chart = document.querySelector("#total_sales_chart");

total_sales_chart.addEventListener("click", (e) => {
  const radio_crop = $("input[name=flexRadioDefault]:checked").val();
  const radio_area = $("input[name=select_area_radio_name]:checked").val();

  if (radio_crop == null || radio_area == null) {
    alert("농작물과 지역 모두 선택 해주세요.");
    e.stopPropagation();
    e.preventDefault(); // 기본 동작 방지
  } else {
    const modal = document.querySelector(".modal-button");
    modal.addEventListener("click", () => {
      let radioButtons = document.querySelectorAll(
        'input[name="flexRadioDefault"]'
      );
      let checkedValue;
      radioButtons.forEach((radioButton) => {
        if (radioButton.checked) {
          checkedValue = radioButton.value;
        }
      });
      if (checkedValue == "tomato") {
        $(".crop").hide();
        $(".tomato").show();
      } else if (checkedValue == "stberry") {
        $(".crop").hide();
        $(".stberry").show();
      } else if (checkedValue == "greenonion") {
        $(".crop").hide();
        $(".greenonion").show();
      } else if (checkedValue == "cucumber") {
        $(".crop").hide();
        $(".cucumber").show();
      } else if (checkedValue == "onion") {
        $(".crop").hide();
        $(".onion").show();
      } else if (checkedValue == "peach") {
        $(".crop").hide();
        $(".peach").show();
      } else if (checkedValue == "chili") {
        $(".crop").hide();
        $(".chili").show();
      } else if (checkedValue == "kiwi") {
        $(".crop").hide();
        $(".kiwi").show();
      } else if (checkedValue == "rice") {
        $(".crop").hide();
        $(".rice").show();
      } else if (checkedValue == "garlic") {
        $(".crop").hide();
        $(".garlic").show();
      } else if (checkedValue == "spotato") {
        $(".crop").hide();
        $(".spotato").show();
      } else if (checkedValue == "spinach") {
        $(".crop").hide();
        $(".spinach").show();
      } else if (checkedValue == "chives") {
        $(".crop").hide();
        $(".chives").show();
      } else if (checkedValue == "grape") {
        $(".crop").hide();
        $(".grape").show();
      }
    });
  }

  modal_cost_title();
});

//매출 안내 문구
function modal_cost_title() {
  const modal_title_crops = document.querySelectorAll(
    'input[name="flexRadioDefault"]'
  );
  const mdal_title_areas = document.querySelectorAll(
    'input[name="select_area_radio_name"]'
  );

  let checkedIndex_crop = -1;
  let checkedIndex_area = -1;

  modal_title_crops.forEach((modal_title_crop, index_crop) => {
    if (modal_title_crop.checked) {
      checkedIndex_crop = index_crop;
    }
  });
  mdal_title_areas.forEach((mdal_title_area, index_area) => {
    if (mdal_title_area.checked) {
      checkedIndex_area = index_area;
    }
  });

  const form_check_label = document.querySelectorAll(".form-check-label");
  const cost_crop = document.querySelector(".cost_crop");
  const select_area_radio_label = document.querySelectorAll(
    ".select_area_radio_label"
  );
  const cost_sigungu = document.querySelector(".cost_sigungu");

  cost_crop.innerText = form_check_label[checkedIndex_crop].innerText;
  cost_sigungu.innerText = select_area_radio_label[checkedIndex_area].innerText;
}

const total_sales_submit = document.querySelector("#total_sales_submit");

total_sales_submit.addEventListener("click", () => {
  //if문으로 데이터 null시 데이터를 분석 하라는 메세지와 함께 저장하기
  //저장할때 더 직관적으로 보이는 데이터 값 생각 해보기
  alert("저장되었습니다");
});

// const modal = document.querySelector(".modal-button");
// modal.addEventListener("click", () => {
//   let radioButtons = document.querySelectorAll(
//     'input[name="flexRadioDefault"]'
//   );
//   let checkedValue;
//   radioButtons.forEach((radioButton) => {
//     if (radioButton.checked) {
//       checkedValue = radioButton.value;
//     }
//   });
//   if (checkedValue == "tomato") {
//     $(".crop").hide();
//     $(".tomato").show();
//   } else if (checkedValue == "stberry") {
//     $(".crop").hide();
//     $(".stberry").show();
//   } else if (checkedValue == "greenonion") {
//     $(".crop").hide();
//     $(".greenonion").show();
//   } else if (checkedValue == "cucumber") {
//     $(".crop").hide();
//     $(".cucumber").show();
//   } else if (checkedValue == "onion") {
//     $(".crop").hide();
//     $(".onion").show();
//   } else if (checkedValue == "peach") {
//     $(".crop").hide();
//     $(".peach").show();
//   } else if (checkedValue == "chili") {
//     $(".crop").hide();
//     $(".chili").show();
//   } else if (checkedValue == "kiwi") {
//     $(".crop").hide();
//     $(".kiwi").show();
//   } else if (checkedValue == "rice") {
//     $(".crop").hide();
//     $(".rice").show();
//   } else if (checkedValue == "garlic") {
//     $(".crop").hide();
//     $(".garlic").show();
//   } else if (checkedValue == "spotato") {
//     $(".crop").hide();
//     $(".spotato").show();
//   } else if (checkedValue == "spinach") {
//     $(".crop").hide();
//     $(".spinach").show();
//   } else if (checkedValue == "chives") {
//     $(".crop").hide();
//     $(".chives").show();
//   } else if (checkedValue == "grape") {
//     $(".crop").hide();
//     $(".grape").show();
//   }
// });

// window.onload = function () {
//   const cards = document.querySelectorAll(".card");

//   for (let card in cards) {
//     card.style.margin = 0;
//     card.style.padding = 0;
//   }
// };

// // Facts counter
// $('[data-toggle="counter-up"]').counterUp({
//     delay: 10,
//     time: 2000
// });

// // Testimonials carousel
// $(".testimonial-carousel").owlCarousel({
//     autoplay: true,
//     smartSpeed: 1000,
//     items: 1,
//     dots: false,
//     loop: true,
//     nav: true,
//     navText : [
//         '<i class="bi bi-chevron-left"></i>',
//         '<i class="bi bi-chevron-right"></i>'
//     ]
// });
