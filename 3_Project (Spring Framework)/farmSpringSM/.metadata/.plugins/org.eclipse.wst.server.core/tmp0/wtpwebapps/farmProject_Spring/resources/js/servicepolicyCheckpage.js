// 모달 창 기능
//const open = document.querySelector(".policy_detail");
//const modalBox = document.querySelector("#modal_box");
//const close = document.querySelector("#modal_close");
//
//open.addEventListener("click", () => {
//    modalBox.classList.toggle("active");
//});
//
//close.addEventListener("click", () => {
//    modalBox.classList.toggle("active");
//});
//
//window.addEventListener("keyup", e => {
//  if(modalBox.style.display === "flex" && e.key === "Escape") {
//      modalBox.style.display = "none"
//  }
//})

//ㅁ모달 관련 삭제
//function policy_detail_modal(){
//  modalBox.classList.toggle("active");
//}


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



// 검색 기능
const policy_tr = document.querySelectorAll(".policy_tr")

function filter(){

  const value_filter = document.querySelector("#search_text").value.toUpperCase();

  for(let i=0;i<policy_tr.length;i++){
    const name = policy_tr[i].querySelector(".policy_title_name");
    if(name.innerHTML.toUpperCase().indexOf(value_filter) > -1){
      policy_tr[i].style.display = "";
    }else{
      policy_tr[i].style.display = "none";
    }
  }
}

// 시도 셀렉트
const policy_sido = document.querySelectorAll(".policy_sido")

function select_sido_fun() {
    const value_sido = select_si_do[select_si_do.selectedIndex].innerHTML

    for(let i=0; i<policy_sido.length; i++){
      if(value_sido == policy_tr[i].querySelector(".policy_sido").innerHTML){
        policy_tr[i].style.display = "";
      }else{
        policy_tr[i].style.display = "none";
      }
    }
}

// 시군구 셀렉트
const policy_sigungu = document.querySelectorAll(".policy_sigungu")

function select_sigungu_fun() {
    const value_sigungu = select_sigungu[select_si_do.selectedIndex][select_sigungu[select_si_do.selectedIndex].selectedIndex].innerHTML

    if(select_si_do.selectedIndex == 0){
      for(let j=0; j<policy_tr.length; j++){
        policy_tr[j].style.display = "";
      }
    } else{
    for(let i=0; i<10; i++){
      const sigungu = policy_tr[i].querySelector(".policy_sigungu").innerHTML
      // if(value_sigungu == policy_tr[i].children[2].querySelector(".policy_sigungu").innerHTML){
      if(value_sigungu == sigungu){
        policy_tr[i].style.display = "";
      }else{
        policy_tr[i].style.display = "none";
      }
    }
  }

}


const row_count = document.querySelector(".row_count");	//총 정책 갯수 표시
let itemsPerPage = 10; //한 페이지에 보일 데이터의 갯수
let currentPage = 1; //현재 페이지 번호
let modelLength = null;

//모든 정책 리스트 불러오는 함수
function policy_list_all() {
	$.ajax({
	    type: "GET",
	    url: "servicePolicy.do",
	    dataType: "json",
	    success: function(model) {
	    	console.log("servicePolicy 연결 성공")
	    	console.log("model : " + model);
	    	
	    	modelLength = model.length;
	    	row_count.innerHTML = modelLength;
	    	
	    	const policy_list_tbody = document.querySelector(".policy_list_tbody");
	    	
	    	let startIndex = (currentPage - 1) * itemsPerPage;	// 데이터 시작 인덱스 번호
	    	let endIndex = startIndex + itemsPerPage;			// 데이터 끝 인덱스 번호
	    	
	    	policy_list_tbody.innerHTML = "";
	    	let str = "";
	   
	    	for(let i = startIndex; i < endIndex && i < model.length; i++){
	    	str += `
          	<tr class="policy_tr">
        	  <td>`+(model.length-i)+`</td>
        	  <td class="policy_sido">`+model[i].city+`</td>
        	  <td class="policy_sigungu">`+model[i].areaKor+`</td>
        	  <td class="policy_title_name">`+model[i].policyName+`</td>
        	  <td>
        	    <div class="policy_detail" data-toggle="modal" data-target="#policyModal">
        	    	<img src="/myapp/resources/img/Magnifier.png" />자세히보기
              </div>
        	  </td>
	    	</tr>
	    		`
	    	}
	    	//페이지 네이션 기능 구현하는 함수 실행
	    	policy_pagenation(model);
	    	
	    	policy_list_tbody.innerHTML = str;
	    	//정책 상세 정보 확인 함수 실행
	    	policy_detail();
	    },
	    error: function() {
	      console.log("servicePolicy 서버 요청 실패");
	    }
	  });

}


//정책 리스트 페이지 네이션는 함수
function policy_pagenation(model) {
	let totalPages = Math.ceil(model.length / itemsPerPage);	//총 페이지의 갯수
	let prevPageButton = document.getElementById("prevPage");	//이전 버튼
	let nextPageButton = document.getElementById("nextPage");	//다음 버튼
	let pageButtonsContainer = document.getElementById("pageButtons");	//페이지 번호 버튼을 생성할 공간
	
	pageButtonsContainer.innerHTML = "";	//페이지 번호 버튼 초기화
	
    // 표시할 페이지 버튼의 최대 개수
    const maxPageButtons = 10;
    
    let startPage = 1;
    let endPage = totalPages;

    if (totalPages > maxPageButtons) {
        // 현재 페이지를 중심으로 앞뒤로 최대 5개의 페이지 버튼만 표시
        startPage = Math.max(currentPage - 5, 1);
        endPage = Math.min(currentPage + 4, totalPages);

        if (currentPage <= 5) {
            endPage = maxPageButtons;
        } else if (currentPage >= totalPages - 4) {
            startPage = totalPages - maxPageButtons + 1;
        }
    }
	
	  //페이지 버튼 추가
	  for (let i = 1; i <= totalPages; i++) {
	    var pageButton = document.createElement("button");
	    pageButton.classList.add("pageButton");
	    if (i === currentPage) {
	      pageButton.classList.add("currentPageButton");
	    }
	    pageButton.textContent = i;

	    // 버튼 클릭 시 정책 리스트 바뀜
	    pageButton.addEventListener("click", function (event) {
	      currentPage = parseInt(event.target.textContent);
	      policy_list_all();
	    });

	    pageButtonsContainer.appendChild(pageButton);
	  }
	  
	  prevPageButton.disabled = currentPage === 1;
	  nextPageButton.disabled = currentPage === totalPages;
}

function paganation_button() {
	//Event listener for previous page button
	document.getElementById("prevPage").addEventListener("click", function () {
	  if (currentPage > 1) {
	    currentPage--;
	    policy_list_all();
	  }
	});

	// Event listener for next page button
	document.getElementById("nextPage").addEventListener("click", function () {
	  var totalPages = Math.ceil(modelLength / itemsPerPage);
	  if (currentPage < totalPages) {
	    currentPage++;
	    policy_list_all();
	  }
	});
}
paganation_button();

//모든 정책 불러오기 실행
policy_list_all()


//정책 검색하기
const search_button = document.querySelector("#search_button");
search_button.addEventListener("click", () =>{
	const select_sigungu = document.querySelector("#select_si_gun_gu_junlanamdo");
	let sigungu = select_sigungu.value;
	console.log("sigungu : " + sigungu);
	
	const search_text = document.querySelector("#search_text");
	let search = search_text.value;
	console.log("search : " + search);
	
	
	if (sigungu === "default" && search === ""){
//		alert("지역, 사업명 중 하나는 필수 입력 입니다.")
		swal({
		    title: "WYC",
		    text: "지역, 사업명 중 하나는 필수 입력 입니다.",
		    icon: "info" //"info,success,warning,error" 중 택1
		})
	}else {
	$.ajax({
	    type: "GET",
	    url: "searchPolicyList.do",
	    data: { sigungu : sigungu,
	    	search : search,},
	    dataType: "json",
	    success: function(model) {
	    	console.log("searchPolicyList 연결 성공")
	    	console.log("model : " + model);
	    	
	    	modelLength = model.length;
	    	row_count.innerHTML = modelLength;
	    	
	    	const policy_list_tbody = document.querySelector(".policy_list_tbody");
	    	
	    	policy_list_tbody.innerHTML = "";
	    	let str = "";
	   
	    	for(let i=0; i<model.length; i++){
	    	str += `
          	<tr class="policy_tr">
        	  <td>`+(model.length-i)+`</td>
        	  <td class="policy_sido">`+model[i].city+`</td>
        	  <td class="policy_sigungu">`+model[i].areaKor+`</td>
        	  <td class="policy_title_name">`+model[i].policyName+`</td>
        	  <td>
        	    <div class="policy_detail" data-toggle="modal" data-target="#policyModal">
        	    	<img src="/myapp/resources/img/Magnifier.png" />자세히보기
              </div>
        	  </td>
	    	</tr>
	    		`
	    	}
	    	//페이지 네이션 기능 구현하는 함수 실행
	    	policy_pagenation(model);
	    	
	    	const pagination = document.querySelector(".pagination")
	    	pagination.style.display = "none";
	    	
	    	policy_list_tbody.innerHTML = str;
	    	//정책 상세 정보 확인 함수 실행
	    	policy_detail();
	    },
	    error: function() {
	      console.log("searchPolicyList 서버 요청 실패");
	    }
	  });
	}
})

//정책 상세정보 보이기
function policy_detail() {
	  let policyDetailLinks = document.querySelectorAll(".policy_detail");

	  // 각 링크에 클릭 이벤트 리스너 추가
	  policyDetailLinks.forEach(function (link) {
	    link.addEventListener("click", function (event) {
	      // 클릭된 링크의 부모 행 찾기
	      let parentRow = link.closest(".policy_tr");

	      // policy_title_name 요소 가져오기
	      let policyTitle = parentRow.querySelector(".policy_title_name").textContent;
	      let policySigungu = parentRow.querySelector(".policy_sigungu").textContent;
	      
	      // policy_title_name 값을 출력하거나 다른 작업 수행
	      console.log("Clicked policy title:", policyTitle.trim());
	      console.log("Clicked policy sigungu:", policySigungu.trim());
  		$.ajax({
		      type: "GET",
		      url: "policyDetail.do", // 서버에서 데이터를 가져올 URL
		      data: {
		    	  policySigungu : policySigungu,
		    	  policyTitle, policyTitle,
		    	  },
			  dataType: "json",
		      success: function(model) {

		        console.log("model : "+ model);
		        
		        const policyTarget = document.querySelector(".policyTarget");
		        const policyName = document.querySelector(".policyName");
		        const policyCondition = document.querySelector(".policyCondition");
		        const policyDocumentation = document.querySelector(".policyDocumentation");
		        const policySupport = document.querySelector(".policySupport");
		        const policyPhone = document.querySelector(".policyPhone");
		        
		        let policyConditionInteger =  parseInt(model[0].policyCondition, 10)
		        
		        policyTarget.innerHTML = model[0].policyTarget;
		        policyName.innerHTML = model[0].policyName;
		        policyCondition.innerHTML = "최대 " + policyConditionInteger.toLocaleString() + "원 이내 지원";
		        policyDocumentation.innerHTML = model[0].policyDocumentation;
		        policySupport.innerHTML = model[0].policySupport;
		        policyPhone.innerHTML = model[0].policyPhone;
		        
		      },
		      error: function() {
		        console.log("getPolicyInfo 서버 요청 실패");
		      }
		    });
	    });
	  });	
}
//정책 상세내역 모달 화면
document.addEventListener("DOMContentLoaded", policy_detail)


//------------------------
//var itemsPerPage = 5; // 페이지당 표시할 항목 수
//var currentPage = 1; // 현재 페이지
//
//// 정책 데이터 예시 (이 부분은 실제 데이터로 대체되어야 함)
//
//
//// 페이지 초기 로딩 시 실행되는 함수
//function init() {
//  renderPolicies();
//  updatePagination();
//}
//
//// 정책을 페이지에 렌더링하는 함수
//function renderPolicies() {
//  var policyList = document.getElementById("policyLists");
//  policyList.innerHTML = ""; // 이전 정책 내용 초기화
//
//  var startIndex = (currentPage - 1) * itemsPerPage;
//  var endIndex = startIndex + itemsPerPage;
//
//  for (var i = startIndex; i < endIndex && i < policies.length; i++) {
//    var policy = policies[i];
//    var listItem = document.createElement("tr");
//    listItem.classList.add("policy_tr");
//    listItem.innerHTML = `
//      <td>${policyLength - i}</td>
//      <td class="policy_sido">${policy.city}</td>
//      <td class="policy_sigungu">${policy.areaKor}</td>
//      <td class="policy_title_name">${policy.policyName}</td>
//      <td>
//        <div class="policy_detail" data-toggle="modal" data-target="#policyModal">
//          <img src="${path}/resources/img/Magnifier.png" />자세히보기
//        </div>
//      </td>`;
//    
//    policyList.appendChild(listItem);
//  }
//  
//  // 페이징 업데이트
//  updatePagination();
//}
//
//// 페이징 정보 업데이트 함수
//function updatePagination() {
//  var totalPages = Math.ceil(policies.length / itemsPerPage);
//  var prevPageButton = document.getElementById("prevPage");
//  var nextPageButton = document.getElementById("nextPage");
//  var pageButtonsContainer = document.getElementById("pageButtons");
//
//  // 페이지 버튼 초기화
//  pageButtonsContainer.innerHTML = "";
//
//  // 페이지 버튼 추가
//  for (var i = 1; i <= totalPages; i++) {
//    var pageButton = document.createElement("button");
//    pageButton.classList.add("pageButton");
//    if (i === currentPage) {
//      pageButton.classList.add("currentPageButton");
//    }
//    pageButton.textContent = i;
//
//    // 페이지 버튼 클릭 시 페이지 변경 및 렌더링
//    pageButton.addEventListener("click", function (event) {
//      currentPage = parseInt(event.target.textContent);
//      renderPolicies();
//    });
//
//    pageButtonsContainer.appendChild(pageButton);
//  }
//
//  prevPageButton.disabled = currentPage === 1;
//  nextPageButton.disabled = currentPage === totalPages;
//}
//
//// 이전 페이지 버튼 클릭 시
//document.getElementById("prevPage").addEventListener("click", function () {
//  if (currentPage > 1) {
//    currentPage--;
//    renderPolicies();
//  }
//});
//
//// 다음 페이지 버튼 클릭 시
//document.getElementById("nextPage").addEventListener("click", function () {
//  var totalPages = Math.ceil(policies.length / itemsPerPage);
//  if (currentPage < totalPages) {
//    currentPage++;
//    renderPolicies();
//  }
//});
//
//// 페이지 초기화
//init();

