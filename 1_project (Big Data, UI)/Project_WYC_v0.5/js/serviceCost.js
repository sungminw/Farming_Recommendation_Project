// document.querySelector('input[name="crop_policy_checkbox"]:checked').value;
// 체크박스 체크 여부

const policy_checkbox_label_crop = document.querySelectorAll(
  ".policy_checkbox_label_crop"
);

// const ch_crop = document.querySelectorAll(".ch_crop")

function filter() {
  for (let i = 0; i < policy_checkbox_label_crop.length; i++) {
    policy_checkbox_label_crop[i].classList.add("display_hide");
  }
  const search_text = document.querySelector("#search_text_id").value;

  for (let i = 0; i < policy_checkbox_label_crop.length; i++) {
    const name = policy_checkbox_label_crop[i].innerText;
    if (name.indexOf(search_text) > -1) {
      policy_checkbox_label_crop[i].classList.remove("display_hide");
    }
  }
}

const policy_checkbox_label_area = document.querySelectorAll(
  ".policy_checkbox_label_area"
);
const select_si_gun_gu = document.querySelectorAll(".select_si_gun_gu");

function filter_area() {
  // 일치하는 검색어 제외 요소 display_none
  for (let i = 0; i < policy_checkbox_label_area.length; i++) {
    policy_checkbox_label_area[i].classList.add("toggle_hide");
  }
  const search_text_area = document.querySelector("#search_text_area").value;
  const select_si_do = document.querySelectorAll(".select_si_do");

  for (let i = 0; i < policy_checkbox_label_area.length; i++) {
    const name = policy_checkbox_label_area[i].innerHTML;
    if (name.indexOf(search_text_area) > -1) {
      // 일치하는 검색어 제외 시군구 div display_none
      for (let j = 0; j < select_si_gun_gu.length; j++) {
        select_si_gun_gu[j].classList.add("toggle_hide");
      }
      // 광역시/도 버튼 해제
      for (let k = 0; k < select_si_do.length; k++) {
        select_si_do[k].removeAttribute("checked");
      }
      // 일치하는 검색어만 display_none해제
      policy_checkbox_label_area[i].classList.remove("toggle_hide");
      // 일치하는 검색어가 있는 시군구 div 표시
      policy_checkbox_label_area[
        i
      ].parentNode.parentNode.parentNode.classList.remove("toggle_hide");
    }
  }
}

function select_si_do_fun() {
  // 광역시/도 별 시군구 리스트
  const select_si_do = document.querySelectorAll(".select_si_do");
  const select_si_gun_gu = document.querySelectorAll(".select_si_gun_gu");

  for (let i = 0; i < select_si_do.length; i++) {
    select_si_gun_gu[i].classList.add("toggle_hide");
    select_si_gun_gu[i].checked == null;
  }
  for (let i = 0; i < select_si_do.length; i++) {
    if (select_si_do[i].checked == true) {
      select_si_gun_gu[i].classList.add("toggle_show");
      select_si_gun_gu[i].classList.remove("toggle_hide");
    }
  }
}

// 4개 조건마다 다른 선택화면 띄우기
const select_main = document.querySelectorAll(".select_main");
const select_box = document.querySelectorAll(".select_box");

function select_box_change(index) {
  for (let i = 0; i < select_box.length; i++) {
    select_box[i].classList.add("toggle_hide");
    select_box[i].classList.remove("toggle_show");
  }

  select_box[index].classList.add("toggle_show");
  select_box[index].classList.remove("toggle_hide");
}

//검색창 아래 선택한 옵션 이름 표시
const result_box = document.querySelector(".result_box");

function checked_crop_fun() {
  // const checked_crop = document.querySelector('input[name="crop_policy_checkbox"]:checked');
  const result_box = document.querySelector(".result_box");

  for (let i = 0; i < result_box.children.length; i++) {
    if (result_box.children[i].classList.contains("result_innerText_crop")) {
      result_box.children[i].remove();
    }
  }

  let newResult = document.querySelector(
    "input[name=crop_policy_checkbox]:checked"
  ).nextElementSibling.textContent;

  let newDiv = document.createElement("div");
  let newClass = document.createAttribute("class");
  newClass.value = "result_innerText result_innerText_crop wow slideInRight";
  newDiv.setAttributeNode(newClass);

  const newText = document.createTextNode(`${newResult}`);

  newDiv.appendChild(newText);
  result_box.appendChild(newDiv);
}

function checked_area_fun() {
  const result_box = document.querySelector(".result_box");

  for (let i = 0; i < result_box.children.length; i++) {
    if (result_box.children[i].classList.contains("result_innerText_area")) {
      result_box.children[i].remove();
    }
  }

  let newResult = document.querySelector(
    "input[name=select_area_radio_2]:checked"
  ).nextElementSibling.textContent;

  let newDiv = document.createElement("div");
  let newClass = document.createAttribute("class");
  newClass.value = "result_innerText result_innerText_area wow slideInRight";
  newDiv.setAttributeNode(newClass);

  const newText = document.createTextNode(`${newResult}`);

  newDiv.appendChild(newText);
  result_box.appendChild(newDiv);
}

function checked_age_fun() {
  const result_box = document.querySelector(".result_box");

  for (let i = 0; i < result_box.children.length; i++) {
    if (result_box.children[i].classList.contains("result_innerText_age")) {
      result_box.children[i].remove();
    }
  }

  let newResult = document.querySelector("input[name=select_age_radio]:checked")
    .nextElementSibling.textContent;

  let newDiv = document.createElement("div");
  let newClass = document.createAttribute("class");
  newClass.value = "result_innerText result_innerText_age wow slideInRight";
  newDiv.setAttributeNode(newClass);

  const newText = document.createTextNode(`${newResult}`);

  newDiv.appendChild(newText);
  result_box.appendChild(newDiv);
}

function checked_live_fun() {
  const result_box = document.querySelector(".result_box");

  for (let i = 0; i < result_box.children.length; i++) {
    if (result_box.children[i].classList.contains("result_innerText_live")) {
      result_box.children[i].remove();
    }
  }

  let newResult = document.querySelector(
    "input[name=select_live_radio]:checked"
  ).nextElementSibling.textContent;

  let newDiv = document.createElement("div");
  let newClass = document.createAttribute("class");
  newClass.value = "result_innerText result_innerText_live wow slideInRight";
  newDiv.setAttributeNode(newClass);

  const newText = document.createTextNode(`${newResult}`);

  newDiv.appendChild(newText);
  result_box.appendChild(newDiv);
}

// function checked_army_fun() {
//   const result_box = document.querySelector(".result_box");

//   for (let i = 0; i < result_box.children.length; i++) {
//     if (result_box.children[i].classList.contains("result_innerText_army")) {
//       result_box.children[i].remove();
//     }
//   }

//   let newResult = document.querySelector(
//     "input[name=select_army_radio]:checked"
//   ).nextElementSibling.textContent;

//   let newDiv = document.createElement("div");
//   let newClass = document.createAttribute("class");
//   newClass.value = "result_innerText result_innerText_army";
//   newDiv.setAttributeNode(newClass);

//   const newText = document.createTextNode(`${newResult}`);

//   newDiv.appendChild(newText);
//   result_box.appendChild(newDiv);
// }

const filter_list_reset = document.querySelector("#filter_list_reset");

filter_list_reset.addEventListener("click", () => {
  const result_innerText = document.querySelectorAll(".result_innerText");

  for (let i = 0; i < result_innerText.length; i++) {
    result_innerText[i].remove();
  }
});

// // 페이징 하기

//  // Array of policies (replace with your own data)
var policies = [
  "정부 지원 정책1",
  "정부 지원 정책2",
  "정부 지원 정책3",
  "정부 지원 정책4",
  "정부 지원 정책5",
  "정부 지원 정책6",
  "정부 지원 정책7",
  "정부 지원 정책8",
  "정부 지원 정책9",
  "정부 지원 정책10",
  "정부 지원 정책11",
  "정부 지원 정책12",
  "정부 지원 정책13",
  "정부 지원 정책14",
  "정부 지원 정책15",
  "정부 지원 정책16",
  "정부 지원 정책17",
  "정부 지원 정책18",
  // Add more policies as needed
];

var itemsPerPage = 5; // Number of items to display per page
var currentPage = 1; // Current page

// Function to render the policies on the page
function renderPolicies() {
  var policyList = document.getElementById("policyList");
  policyList.innerHTML = ""; // Clear previous policies

  var startIndex = (currentPage - 1) * itemsPerPage;
  var endIndex = startIndex + itemsPerPage;

  for (var i = startIndex; i < endIndex && i < policies.length; i++) {
    var policy = policies[i];
    var listItem = document.createElement("li");
    listItem.classList.add("list_item");
    listItem.innerHTML =
      '<div class="policy_text">' +
      policy +
      "</div>" +
      '<div class="policy_checkbox">' +
      '  <input type="checkbox" name="resultList" id="resultList' +
      (i + 1) +
      '" class="resultList">' +
      '  <label for="resultList' +
      (i + 1) +
      '" class="resultList_label"></label>' +
      "</div>";

    policyList.appendChild(listItem);
  }

  // policy detail start
  const opens = document.querySelectorAll(".policy_text");
  const modalBox = document.querySelector("#modal_box");
  const close = document.querySelector("#modal_close");

  for (const open of opens) {
    open.addEventListener("click", () => {
      modalBox.classList.toggle("active");
    });

    close.addEventListener("click", () => {
      modalBox.classList.toggle("active");
    });

    window.addEventListener("click", (e) => {
      e.target === modalBox ? modalBox.classList.remove("active") : false;
      // console.log(e.target===modalBox)
    });

    window.addEventListener("keyup", (e) => {
      if (modalBox.style.display === "flex" && e.key === "Escape") {
        modalBox.style.display = "none";
      }
    });
  }
  // policy detail end

  updatePagination();
}

// Function to update the pagination information
function updatePagination() {
  var totalPages = Math.ceil(policies.length / itemsPerPage);
  var prevPageButton = document.getElementById("prevPage");
  var nextPageButton = document.getElementById("nextPage");
  var pageButtonsContainer = document.getElementById("pageButtons");

  // Clear previous buttons
  pageButtonsContainer.innerHTML = "";

  // Add page buttons
  for (var i = 1; i <= totalPages; i++) {
    var pageButton = document.createElement("button");
    pageButton.classList.add("pageButton");
    if (i === currentPage) {
      pageButton.classList.add("currentPageButton");
    }
    pageButton.textContent = i;

    // Set the onclick event handler for each page button
    pageButton.addEventListener("click", function (event) {
      currentPage = parseInt(event.target.textContent);
      renderPolicies();
    });

    pageButtonsContainer.appendChild(pageButton);
  }

  prevPageButton.disabled = currentPage === 1;
  nextPageButton.disabled = currentPage === totalPages;
}

// Event listener for previous page button
document.getElementById("prevPage").addEventListener("click", function () {
  if (currentPage > 1) {
    currentPage--;
    renderPolicies();
  }
});

// Event listener for next page button
document.getElementById("nextPage").addEventListener("click", function () {
  var totalPages = Math.ceil(policies.length / itemsPerPage);
  if (currentPage < totalPages) {
    currentPage++;
    renderPolicies();
  }
});

// Initial rendering
renderPolicies();

// -----------------------------------------------------------

// page이동 코드

// window.onload = function () {
//   const pageButton = document.querySelectorAll(".pageButton");

//   for (let i = 0; i < pageButton.length; i++) {
//     pageButton[i].addEventListener("click", (e) => {
//       pageButton.forEach(function (btn, i) {
//         if (e.currentTarget == btn) {
//           btn.classList.add("active");
//         } else {
//           btn.classList.remove("active");
//         }
//       });
//     });
//   }
// };

// function change_btn(e) {
//   var btns = document.querySelectorAll(".pageButton");
//   btns.forEach(function (btn, i) {
//     if (e.currentTarget == btn) {
//       btn.classList.add("active");
//     } else {
//       btn.classList.remove("active");
//     }
//   });
//   console.log(e.currentTarget);
// }

const total_cost_submit = document.querySelector("#total_cost_submit");

total_cost_submit.addEventListener("click", () => {
  alert("저장에 성공 했습니다");
});

// function policy_detail(){
//   const open = document.querySelectorAll(".policy_text");
//   const modalBox = document.querySelector("#modal_box");
//   const close = document.querySelector("#modal_close");

//     open.addEventListener("click", () => {
//       modalBox.classList.toggle("active");
//   });

//   close.addEventListener("click", () => {
//       modalBox.classList.toggle("active");
//   });

//   window.addEventListener('click', (e) => {
//     e.target === modalBox ? modalBox.classList.remove('active') : false
//     // console.log(e.target===modalBox)
//   })

//   window.addEventListener("keyup", e => {
//     if(modalBox.style.display === "flex" && e.key === "Escape") {
//         modalBox.style.display = "none"
//     }
//   })
// }
