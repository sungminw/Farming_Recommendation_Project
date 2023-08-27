
// 지역 셀렉 박스 기능
const select_sigungu = document.querySelectorAll(".select_sigungu")
const select_si_do = document.querySelector("#select_si_do")

select_si_do.addEventListener("change", ()=>{
    for(let i=0; i<select_si_do.length; i++){
      select_sigungu[i].classList.add("display_hide")
      select_sigungu[i].classList.remove("display_show")
      select_sigungu[i].selectedIndex = null
    }
    select_sigungu[select_si_do.selectedIndex].classList.remove("display_hide")
})


var data = [
  {
    type: "주택/농지",
    address: "전라남도 나주시 청계면 월선리 695-1",
    area: "349m2",
    designation: "대",
    price: "<span class='color_blue'>매매</span> 10,000,000"
  },
  {
    type: "주택/농지",
    address: "전라남도 무안군 청계면 청계리 123-44",
    area: "349m2",
    designation: "대",
    price: "<span class='color_blue'>매매</span> 10,000,000"
  },
  {
    type: "주택/농지",
    address: "전라남도 일번군 일번면 일번리 1-46",
    area: "349m2",
    designation: "대",
    price: "<span class='color_blue'>매매</span> 10,000,000"
  },
  {
    type: "주택/농지",
    address: "전라남도 나주시 나주면 나주리 41-2",
    area: "349m2",
    designation: "대",
    price: "<span class='color_blue'>매매</span> 10,000,000"
  },
  {
    type: "주택/농지",
    address: "전라남도 일번군 일번면 일번리 151",
    area: "349m2",
    designation: "대",
    price: "<span class='color_blue'>매매</span> 10,000,000"
  },
  {
    type: "주택/농지",
    address: "전라남도 무안군 무안면 무안리 66",
    area: "349m2",
    designation: "대",
    price: "<span class='color_blue'>매매</span> 10,000,000"
  },
  {
    type: "주택/농지",
    address: "전라남도 목포시 목포면 목포리 7",
    area: "349m2",
    designation: "대",
    price: "<span class='color_blue'>매매</span> 10,000,000"
  },
  {
    type: "주택/농지",
    address: "전라남도 광양시 광양면 광양리 88",
    area: "349m2",
    designation: "대",
    price: "<span class='color_blue'>매매</span> 10,000,000"
  },
  {
    type: "주택/농지",
    address: "전라남도 나주시 나주면 나주리 229",
    area: "349m2",
    designation: "대",
    price: "<span class='color_blue'>매매</span> 10,000,000"
  },
  {
    type: "주택/농지",
    address: "전라남도 광양시 광양면 광양리 6010",
    area: "349m2",
    designation: "대",
    price: "<span class='color_blue'>매매</span> 10,000,000"
  },
  // Add more data rows here
];

// Number of rows per page
var rowsPerPage = 5;

// Calculate the number of pages
var totalPages = Math.ceil(data.length / rowsPerPage);

// Current page
var currentPage = 1;

// Display the specified page
function showPage(page) {
  currentPage = page;
  var start = (page - 1) * rowsPerPage;
  var end = start + rowsPerPage;
  var tableBody = document.getElementById("tableBody");
  tableBody.innerHTML = "";

  for (var i = start; i < end && i < data.length; i++) {
    var row = document.createElement("tr");
    row.classList.add("policy_tr");
    row.setAttribute("onclick", "detail_page()");
    row.innerHTML = `
      <td><span>${data[i].type}</span></td>
      <td>${data[i].address}</td>
      <td>${data[i].area}</td>
      <td>${data[i].designation}</td>
      <td>${data[i].price}</td>
    `;
    tableBody.appendChild(row);
  }
    // 총 갯수 표시
    const row_count = document.querySelector(".row_count")
    row_count.innerHTML = data.length;
  
  

  updatePagination();
}

// Update pagination buttons
function updatePagination() {
  var pagination = document.getElementById("pagination");
  pagination.innerHTML = "";

  // Create previous button
  var previousBtn = document.createElement("a");
  previousBtn.href = "javascript:void(0);";
  previousBtn.textContent = "이전";
  previousBtn.addEventListener("click", function () {
    if (currentPage > 1) {
      showPage(currentPage - 1);
    }
  });
  pagination.appendChild(previousBtn);

  // Create number buttons
  for (var i = 1; i <= totalPages; i++) {
    var link = document.createElement("a");
    link.href = "javascript:void(0);";
    link.textContent = i;
    link.classList.add("page-link");

    // Highlight the current page
    if (i === currentPage) {
      link.classList.add("active");
    }

    // Add event listener to each link
    link.addEventListener("click", function (page) {
      return function () {
        showPage(page);
      };
    }(i));

    pagination.appendChild(link);
  }

  // Create next button
  var nextBtn = document.createElement("a");
  nextBtn.href = "javascript:void(0);";
  nextBtn.textContent = "다음";
  nextBtn.addEventListener("click", function () {
    if (currentPage < totalPages) {
      showPage(currentPage + 1);
    }
  });
  pagination.appendChild(nextBtn);
}

// Show the first page on page load
showPage(1);


 // 지역 검색


function total(){
  const policy_tr = document.querySelectorAll(".policy_tr")
  const sido_value = select_si_do[select_si_do.selectedIndex].innerHTML

  if(!select_si_do.selectedIndex == 0 && select_sigungu[select_si_do.selectedIndex].selectedIndex ==0)
    for(let i=0; i<policy_tr.length; i++){ 
      if(policy_tr[i].children[1].innerHTML.indexOf(sido_value) > -1){
        policy_tr[i].style.display = "";
      }else{
        policy_tr[i].style.display = "none";
      }
    }else if(!select_si_do.selectedIndex == 0 && !select_sigungu[select_si_do.selectedIndex].selectedIndex ==0){
      const sigungu_value = select_sigungu[select_si_do.selectedIndex][select_sigungu[select_si_do.selectedIndex].selectedIndex].innerHTML
      for(let i=0; i<policy_tr.length; i++){
        if(policy_tr[i].children[1].innerHTML.indexOf(sigungu_value) > -1 && policy_tr[i].children[1].innerHTML.indexOf(sido_value) > -1){
          policy_tr[i].style.display = "";
        }else{
          policy_tr[i].style.display = "none";
        }
      }
    }else{
      for(let k=0; k<policy_tr.length; k++){
        policy_tr[k].style.display = "";
      }
    }
}


function detail_page(){
  location.href='serviceEsidence_detail.html';
}


