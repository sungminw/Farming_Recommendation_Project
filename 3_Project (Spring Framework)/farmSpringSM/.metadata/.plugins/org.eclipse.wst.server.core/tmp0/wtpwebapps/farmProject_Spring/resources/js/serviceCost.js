// document.querySelector('input[name="crop_policy_checkbox"]:checked').value;
// 체크박스 체크 여부



//작물 검색 기능
const policy_checkbox_label_crop = document.querySelectorAll(".policy_checkbox_label_crop");

function filter_crop() {
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

//지역 검색 기능 - 왜 안될까
//const policy_checkbox_label_area = document.querySelectorAll(".policy_checkbox_label_area");
//
//function filter_area() {
//	  for (let i = 0; i < policy_checkbox_label_area.length; i++) {
//		  policy_checkbox_label_area[i].classList.add("display_hide");
//	  }
//	  const search_text = document.querySelector("#search_text_area").value;
//
//	  for (let i = 0; i < policy_checkbox_label_area.length; i++) {
//	    const name = policy_checkbox_label_area[i].innerText;
//	    if (name.indexOf(search_text) > -1) {
//	      policy_checkbox_label_area[i].classList.remove("display_hide");
//	    }
//	  }
//	}
//지역 검색 기능 - 수정 필요
//const policy_checkbox_label_area = document.querySelectorAll(
//  ".policy_checkbox_label_area"
//);
//const select_si_gun_gu = document.querySelectorAll(".select_si_gun_gu");
//
//function filter_area() {
//  // 일치하는 검색어 제외 요소 display_none
//  for (let i = 0; i < policy_checkbox_label_area.length; i++) {
//    policy_checkbox_label_area[i].classList.add("toggle_hide");
//  }
//  const search_text_area = document.querySelector("#search_text_area").value;
////  const select_si_do = document.querySelectorAll(".select_si_do");
//
//  for (let i = 0; i < policy_checkbox_label_area.length; i++) {
//    const name = policy_checkbox_label_area[i].innerHTML;
//    if (name.indexOf(search_text_area) > -1) {
////      // 일치하는 검색어 제외 시군구 div display_none
////      for (let j = 0; j < select_si_gun_gu.length; j++) {
////        select_si_gun_gu[j].classList.add("toggle_hide");
////      }
////      // 광역시/도 버튼 해제
////      for (let k = 0; k < select_si_do.length; k++) {
////        select_si_do[k].removeAttribute("checked");
////      }
//      // 일치하는 검색어만 display_none해제
////      policy_checkbox_label_area[i].classList.remove("toggle_hide");
//      // 일치하는 검색어가 있는 시군구 div 표시
////      policy_checkbox_label_area[i].parentNode.parentNode.parentNode.classList.remove("toggle_hide");
//    }
//  }
//}

//원래 여러 지역을 할 경우 지역마다 시군구 변경
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

//농작물 선택시 이전 선택 정보 제거 후 다시 생성
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
//  getSelectCropKor();
}

//지역 선택시 이전 선택 정보 제거 후 다시 생성
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

//나이 선택시 이전 선택 정보 제거 후 다시 생성
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

//거주 기간 선택시 이전 선택 정보 제거 후 다시 생성
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


//초기화 버튼 클릭시 이벤트
const filter_list_reset = document.querySelector("#filter_list_reset");

filter_list_reset.addEventListener("click", () => {
  const result_innerText = document.querySelectorAll(".result_innerText");

  for (let i = 0; i < result_innerText.length; i++) {
    result_innerText[i].remove();
  }
  
  //정책 지원금 초기화
  const checkboxes = document.querySelectorAll('input[name=resultList]');
  
  checkboxes.forEach(function(checkbox) {
	  if(checkbox.checked === true){
		  checkbox.click();
	  }
})

  //정책 리스트 초기화
  const policyList = document.querySelector("#policyList");
  policyList.innerHTML = "";
  
  
  //매출에서 넘어온 값이 있을 경우와 없을경우 초기화 구분해서 설정
  if(area && crop){
	  request_value()
  }else {
	  const crop_table = document.querySelector("#tab_0");
	  crop_table.click();
	  document.conditionForm.reset();
  }
//  //나이 선택 초기화
//  const select_age_radio = document.querySelectorAll("input[name='select_age_radio']");
//  select_age_radio[0].click();
//  
//  //거주 기간 선택 초기화
//  const select_live_radio = document.querySelectorAll("input[name='select_live_radio']");
//  select_live_radio[0].click();

});






////-----------------------------------------------------------
//
//// // 페이징 하기
//
////  // Array of policies (replace with your own data)
//var policies = [
//  "정부 지원 정책1",
//  "정부 지원 정책2",
//  "정부 지원 정책3",
//  "정부 지원 정책4",
//  "정부 지원 정책5",
//  "정부 지원 정책6",
//  "정부 지원 정책7",
//  "정부 지원 정책8",
//  "정부 지원 정책9",
//  "정부 지원 정책10",
//  "정부 지원 정책11",
//  "정부 지원 정책12",
//  "정부 지원 정책13",
//  "정부 지원 정책14",
//  "정부 지원 정책15",
//  "정부 지원 정책16",
//  "정부 지원 정책17",
//  "정부 지원 정책18",
//  // Add more policies as needed
//];
//
//var itemsPerPage = 5; // Number of items to display per page
//var currentPage = 1; // Current page
//
//// Function to render the policies on the page
//function renderPolicies() {
//  var policyList = document.getElementById("policyList");
//  policyList.innerHTML = ""; // Clear previous policies
//
//  var startIndex = (currentPage - 1) * itemsPerPage;
//  var endIndex = startIndex + itemsPerPage;
//
//  for (var i = startIndex; i < endIndex && i < policies.length; i++) {
//    var policy = policies[i];
//    var listItem = document.createElement("li");
//    listItem.classList.add("list_item");
//    listItem.innerHTML =
//      '<div class="policy_text">' +
//      policy +
//      "</div>" +
//      '<div class="policy_checkbox">' +
//      '  <input type="checkbox" name="resultList" id="resultList' +
//      (i + 1) +
//      '" class="resultList">' +
//      '  <label for="resultList' +
//      (i + 1) +
//      '" class="resultList_label"></label>' +
//      "</div>";
//
//    policyList.appendChild(listItem);
//  }
//
//  // policy detail start
//  const opens = document.querySelectorAll(".policy_text");
//  const modalBox = document.querySelector("#modal_box");
//  const close = document.querySelector("#modal_close");
//
//  for (const open of opens) {
//    open.addEventListener("click", () => {
//      modalBox.classList.toggle("active");
//    });
//
//    close.addEventListener("click", () => {
//      modalBox.classList.toggle("active");
//    });
//
//    window.addEventListener("click", (e) => {
//      e.target === modalBox ? modalBox.classList.remove("active") : false;
//      // console.log(e.target===modalBox)
//    });
//
//    window.addEventListener("keyup", (e) => {
//      if (modalBox.style.display === "flex" && e.key === "Escape") {
//        modalBox.style.display = "none";
//      }
//    });
//  }
//  // policy detail end
//
//  updatePagination();
//}
//
//// Function to update the pagination information
//function updatePagination() {
//  var totalPages = Math.ceil(policies.length / itemsPerPage);
//  var prevPageButton = document.getElementById("prevPage");
//  var nextPageButton = document.getElementById("nextPage");
//  var pageButtonsContainer = document.getElementById("pageButtons");
//
//  // Clear previous buttons
//  pageButtonsContainer.innerHTML = "";
//
//  // Add page buttons
//  for (var i = 1; i <= totalPages; i++) {
//    var pageButton = document.createElement("button");
//    pageButton.classList.add("pageButton");
//    if (i === currentPage) {
//      pageButton.classList.add("currentPageButton");
//    }
//    pageButton.textContent = i;
//
//    // Set the onclick event handler for each page button
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
//// Event listener for previous page button
//document.getElementById("prevPage").addEventListener("click", function () {
//  if (currentPage > 1) {
//    currentPage--;
//    renderPolicies();
//  }
//});
//
//// Event listener for next page button
//document.getElementById("nextPage").addEventListener("click", function () {
//  var totalPages = Math.ceil(policies.length / itemsPerPage);
//  if (currentPage < totalPages) {
//    currentPage++;
//    renderPolicies();
//  }
//});
//
//// Initial rendering
//renderPolicies();
////-----------------------------------------------------------








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



//08.03

//수익 계산 버튼 클릭시
const total_cost_submit = document.querySelector("#total_cost_submit");

total_cost_submit.addEventListener("click", () => {
	const costResult = document.querySelector(".costResult");
	
	console.log("costResult.value : " + costResult.value)
	if(costResult.value == 0){
		var costSwal = swal({
		    title: "WYC",
		    text: "소요비용 및 정책 조건을 검색 해주세요",
		    icon: "info" //"info,success,warning,error" 중 택1
		})
	}else {
		//선택된 지역의 한글명
		getSelectAreaKor();
		//선택된 농작물 한글명
		getSelectCropKor();

		
		var profitSwal = swal({
		    title: "WYC",
		    text: "수익 분석 페이지로 이동 합니다",
		    icon: "success" //"info,success,warning,error" 중 택1
		}).then( () => {
			//수익 페이지로 전송
			document.costForm.submit();
		})

	}
  
});

//조건 4가지 선택 후 검색
const filter_lists_submit = document.querySelector("#filter_list_submit");
const cropButtons = document.getElementsByName("crop_policy_checkbox");
const areaButtons = document.getElementsByName("select_area_radio_2");
const ageButtons = document.getElementsByName("select_age_radio");
const periodButtons = document.getElementsByName("select_live_radio");


filter_list_submit.addEventListener("click", ()=>{
	  //정책 지원금 초기화
	  const checkboxes = document.querySelectorAll('input[name=resultList]');
	  
	  checkboxes.forEach(function(checkbox) {
		  if(checkbox.checked === true){
			  checkbox.click();
		  }
	})

	  //정책 리스트 초기화
	  const policyList = document.querySelector("#policyList");
	  policyList.innerHTML = "";
	
	let selectCrop = null;
	let selectArea = null;
	let selectAge = null;
	let selectPeriod = null;
	
	
	// 라디오 버튼 그룹에서 선택된 농작물을 가져오는 함수
	for (const cropButton of cropButtons) {
	  if (cropButton.checked) {
	    selectCrop =  cropButton.value;
	    console.log(selectCrop);
	  }
	}
	
	// 라디오 버튼 그룹에서 선택된 나이를 가져오는 함수
	for (const ageButton of ageButtons) {
	  if (ageButton.checked) {
	    selectAge =  ageButton.value;
	    console.log(selectAge);
	  }
	}
	
	// 라디오 버튼 그룹에서 선택된 지역을 가져오는 함수
	for (const areaButton of areaButtons) {
	  if (areaButton.checked) {
	    selectArea =  areaButton.value;
//	    alert("selectArea : " +selectArea);
	    const selectAreaClass = document.querySelector(".selectArea");
	    selectAreaClass.value = selectArea;
	  }
	}
	
	// 라디오 버튼 그룹에서 선택된 거주기간 가져오는 함수
	for (const periodButton of periodButtons) {
	  if (periodButton.checked) {
	    selectPeriod =  periodButton.value;
	    console.log(selectPeriod);
	  }
	}
	
		
	//정책 리스트 제공 코드
    $.ajax({
	      type: "GET",
	      url: "policySelect.do", // 서버에서 데이터를 가져올 URL
	      data: { selectCrop: selectCrop,
			  selectArea: selectArea,
			  selectAge: selectAge,
			  selectPeriod: selectPeriod, }, // 요청 파라미터로 선택된 농작물 전달
	      success: function(model) {
//	    	alert("policySelect 연결 성공");
	        console.log("model : "+ model);
	        
	        const policyList = document.querySelector("#policyList");
            
	        let policyStr = "";
	        
	        for(let i=0; i<model.length; i++){
	        	policyStr +=
	        	  '<li class="list_item">'+
	              '<div class="policy_text" data-toggle="modal" data-target="#policyModal">'+model[i].policyName +"</div>" +
	              "<div style='display:flex;'><div class='policy_custom'>"+model[i].cost.toLocaleString()+"원</div>" +
	              '<div class="policy_checkbox">' +
	              '<input type="checkbox" name="resultList" id="resultList'+(i + 1) +'" class="resultList" value="'+model[i].cost+'">' +
	              '<label for="resultList'+(i + 1) +'" class="resultList_label"></label></div>' +
	              "</div>"+
	              '</li>';


	        }
	        policyList.innerHTML = policyStr;
	        
	        //정책 클릭시
	        clickPolicyList(selectArea)
	        
	        //소요 비용 계산
	        oper_cost(selectCrop, selectArea)
	        
            const checkboxes = document.querySelectorAll('input[name=resultList]');

	        //정책 선택이 정책비용 합산 함수
            checkboxes.forEach((checkbox) => {
              checkbox.addEventListener('change', polict_check_fun);
            });
	        
	      },
	      error: function() {
	        console.log("서버 요청 실패");
	      }
	    });
	
	
});



//소요비용 계산 후 제공
let responseOperCost = 0;

function oper_cost(selectCrop, selectArea) {
    $.ajax({
	      type: "GET",
	      url: "operCost.do", // 서버에서 데이터를 가져올 URL
	      data: { selectCrop: selectCrop,
			  selectArea: selectArea, }, // 요청 파라미터로 선택된 농작물 전달
	      success: function(model) {
	        responseOperCost = parseInt(model, 10);		//정책 비용 int형으로 변환
	        
	        const operCost = document.querySelector(".operCost");	//화면에 뿌릴 태그요소	
	        operTotalDefualt = document.querySelector(".operTotal");
	        
	        operCost.innerHTML = responseOperCost.toLocaleString();			//소요비용
	        operTotalDefualt.innerHTML = responseOperCost.toLocaleString();	//총 소요비용
	        
	        const costResultDefualt = document.querySelector(".costResult");
	        costResultDefualt.value = responseOperCost;			//수익 분석 페이지로 넘길 비용 저장
	      },
	      error: function() {
	        console.log("operCost 서버 요청 실패");
	      }
	    });
}



//정책 체크박스 선택 시 정책 지원금에 적용
function polict_check_fun() {
	const checkboxes = document.querySelectorAll('input[name=resultList]:checked');
	const selectedValues = [];

	// 선택된 체크박스들의 값을 수집하여 배열에 저장
	checkboxes.forEach((checkbox) => {
	  selectedValues.push(parseInt(checkbox.value, 10));
	});

	// 배열의 모든 값 더하기
	const sum = selectedValues.reduce((accumulator, currentValue) => {
	  return accumulator + currentValue;
	}, 0);

	// 결과 출력
	console.log("총 합계: " + sum);
	    
	//정책 지원금 화면에 표시
	const policyCost = document.querySelector(".policyCost");
	policyCost.innerHTML = sum.toLocaleString();;
	
	//정책 지원금 히스토리 저장시 사용
	const costPolicy = document.querySelector(".costPolicy");
	costPolicy.value = sum;
	console.log("costPolicy : " + sum);
	    
	//정책금액을 합한 총 예상 비용 계산
	const operTotal = document.querySelector(".operTotal");
	operTotal.innerHTML = (responseOperCost-sum).toLocaleString();
	    
//	const costResult = document.querySelector(".costResult");
//	costResult.value = (responseOperCost-sum);
//	console.log("costResult : " + (responseOperCost-sum));
}


//선택된 지역의 한글 명
function getSelectAreaKor() {
	  const select_area_radios = document.getElementsByName('select_area_radio_2');

	  let selectedValue = '';
	  let selectedLabel = '';

	  for (const select_area_radio of select_area_radios) {
	    if (select_area_radio.checked) {
	      selectedValue = select_area_radio.value;
	      selectedLabel = document.querySelector(`label[for="${select_area_radio.id}"]`).innerHTML;
	      break;
	    }
	  }
	  
	  //지역 한글명 히스토리에 저장할 값 설정
//	  const selectArea = document.querySelector(".selectArea");
//	  selectArea.value = selectedLabel;
//	  
//	  console.log('selectArea:', selectArea);
	  
	  if (selectedValue) {
	    console.log('Selected Label:', selectedLabel);
	  } else {
	    console.log('No option selected.');
	  }
	}


//선택된 작물 한글명
function getSelectCropKor() {
	  const crop_policy_radios = document.getElementsByName('crop_policy_checkbox');

	  let selectedValue = '';
	  let selectedLabel = '';

	  for (const crop_policy_radio of crop_policy_radios) {
	    if (crop_policy_radio.checked) {
	      selectedValue = crop_policy_radio.value;
	      selectedLabel = document.querySelector(`label[for="${crop_policy_radio.id}"]`).innerHTML;
	      break;
	    }
	  }
	  
	  //작물 한글명 히스토리에 저장할 값 설정
//	  const selectCropKor = document.querySelector(".selectCropKor");
//	  selectCropKor.value = selectedLabel;

	  //농작물 영어 이름 설정
	  const selectCrop = document.querySelector(".selectCrop");
	  selectCrop.value = selectedValue;
	  
	  //매출 값 설정
	  const salesResultForm = document.querySelector(".salesResult");
	  salesResultForm.value = salesResult;
	}



//정책 선택 시 모달창 
function clickPolicyList(selectArea){
    const policy_texts = document.querySelectorAll(".policy_text");
    
    policy_texts.forEach((policy_text) => {
    	policy_text.addEventListener("click", ()=>{
    		let selectPolicyName = policy_text.innerHTML;
    		console.log("Clicked on:", selectPolicyName);
    		console.log("selectArea on:", selectArea);
    		$.ajax({
    		      type: "GET",
    		      url: "policyInfo.do", // 서버에서 데이터를 가져올 URL
    		      data: { 
    		    	  selectArea, selectArea,
    		    	  selectPolicyName : selectPolicyName,},
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
    		        policyCondition.innerHTML = "최대 "+ policyConditionInteger.toLocaleString() + "원 이내 지원";
    		        policyDocumentation.innerHTML = model[0].policyDocumentation;
    		        policySupport.innerHTML = model[0].policySupport;
    		        policyPhone.innerHTML = model[0].policyPhone;
    		        
    		      },
    		      error: function() {
    		        console.log("policyInfo 서버 요청 실패");
    		      }
    		    });
    		
    		
    	})
    });
	    // 클릭 이벤트 발생 시 처리할 코드 작성
	    
}

//08.06
//자동으로 농작물 및 지역, 정책 조건 등을 선택
function request_value() {
	// 농작물에 해당하는 라디오 항목 클릭
	  let cropRadios = document.getElementsByName("crop_policy_checkbox");
	  cropRadios.forEach(function(radio) {
	    if (radio.value === crop) {
	      radio.click();
	    }else {
		    //선택한 값을 제외한 나머지 라디오 버튼 숨김
		    radio.style.display = "none";
		    const associatedLabel = document.querySelector(`label[for="${radio.id}"]`);
		    if (associatedLabel) {
		      associatedLabel.style.display = "none"; // 연결된 라벨 숨김
		    }
		  }
	  });

	  // 지역명에 해당하는 라디오 항목 클릭
	  let regionRadios = document.getElementsByName("select_area_radio_2");
	  regionRadios.forEach(function(radio) {
	    if (radio.value === area) {
	      radio.click();
	    }else {
	      //선택한 값을 제외한 나머지 라디오 버튼 숨김
	      radio.style.display = "none";
	      const associatedLabel = document.querySelector(`label[for="${radio.id}"]`);
	      if (associatedLabel) {
	        associatedLabel.style.display = "none"; // 연결된 라벨 숨김
	      }
	    }
	  });
	  
	  //기본으로 정책 나이 기본값 클릭
	  let select_age_radio = document.getElementsByName("select_age_radio");
	  select_age_radio[0].click();
	  
	  //기본으로 정책 거주기간 기본값 클릭
	  let select_live_radio = document.getElementsByName("select_live_radio");
	  select_live_radio[0].click();
	  
	  document.getElementById('tab_1').click();
}

//매출분석 후 이동시, 농작물과 지역 자동으로 선택
if(crop && area ) {
	document.addEventListener("DOMContentLoaded", request_value);
	
	
} else{//매출에서가 아닌 바로 넘어온 경우(농작물, 지역 값이 없을 경우)
//	confirm("매출액이 없을 경우 수익 계산이 불가능 합니다.\n매출액을 먼저 확인 하시겠습니까 ?");
	var flag;
	var swalForSales = swal({
	    title: "WYC",
	    text: "※ 예상 매출액이 없을 경우 비용 분석만 가능하고 수익 계산이 불가능 합니다. 매출액을 먼저 확인 하시겠습니까 ?",
	    icon: "success",		//"info,success,warning,error" 중 택1
	    buttons: ["NO", "YES"]
	}).then((YES) => {
	    if (YES) {
	    	window.location.href = "serviceSales1.do"        
	    }else{
	        flag = false;
	        const profitButton = document.querySelector(".profitButton");
	        profitButton.style.display = "none";
	    }
	});

}




/** 작물 - 지역 필터**/
//버튼 목록을 가져옵니다.
const buttonContainer = document.getElementById('buttonFilter');
const filterButtons = document.querySelectorAll('.policy_checkbox_label_area');

//라디오 버튼 요소를 가져옵니다.
const radioButtons = document.querySelectorAll('input[name="crop_policy_checkbox"]');

//라디오 버튼 변경 시 필터링 함수 호출
radioButtons.forEach(radioButton => {
radioButton.addEventListener('change', filterButtonsByCondition);
});

//필터링 함수 정의
function filterButtonsByCondition() {
// 조건 선택
let selectedCondition = '';
radioButtons.forEach(radioButton => {
  if (radioButton.checked) {
    selectedCondition = radioButton.value;
  }
});

// 모든 버튼 숨김
filterButtons.forEach(button => {
  button.style.display = 'none';
});

//선택한 조건에 맞는 버튼만 표시
const filteredButtons = document.querySelectorAll(`.${selectedCondition}`);
filteredButtons.forEach(button => {
  button.style.display = 'block';
});

}


const area_table = document.querySelector("#tab_1");
const crop_table = document.querySelector("#tab_0");

//농작물 선택 후 지역 조건 선택 가능하게 하기
area_table.addEventListener("click", (event) => {
	const cropCheckboxes = document.querySelectorAll("input[name='crop_policy_checkbox']");
	let allUnchecked = true;
	cropCheckboxes.forEach(function(checkbox) {
	  if (checkbox.checked) {
	    allUnchecked = false;
	  }
	});

	if (allUnchecked) {
		  swal({
		    title: "WYC",
		    text: "지역을 먼저 선택해주세요.",
		    icon: "success" //"info,success,warning,error" 중 택1
		  }).then(() => {
		    crop_table.click();
		  });
		}
})

//필터링 함수 실행
//filterButtonsByCondition();


