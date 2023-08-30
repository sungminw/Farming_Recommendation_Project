//boardWrite - 글 작성시 빈 부분이 있을시 경고
function writeBoard() {
	if(document.writeForm.bName.value.length == 0){
		var bNameSawl = swal({
		    title: "WYC",
		    text: "이름을 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		return;
	}
	
	if(document.writeForm.bTitle.value.length == 0){
		var bTitleSawl = swal({
		    title: "WYC",
		    text: "제목을 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		return;
	}
	
	if(document.writeForm.bContent.value.length == 0){
		var bContentSawl = swal({
		    title: "WYC",
		    text: "내용을 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		return;
	}
	
	document.writeForm.submit();
}


function modifyBoard() {
	if(document.modifyForm.bTitle.value.length == 0){
		var mBTitleSawl = swal({
		    title: "WYC",
		    text: "제목을 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		return;
	}
	
	if(document.modifyForm.bContent.value.length == 0){
		var mBContentSawl = swal({
		    title: "WYC",
		    text: "내용을 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		return;
	}
	
	document.modifyForm.submit();
	
}

function replyBoard() {
	if(document.replyForm.bName.value.length == 0){
		var rBnameSawl = swal({
		    title: "WYC",
		    text: "이름을 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		return;
	}
	
	if(document.replyForm.bTitle.value.length == 0){
		var rBTitleSawl = swal({
		    title: "WYC",
		    text: "제목을 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		return;
	}
	
	if(document.replyForm.bContent.value.length == 0){
		var rBContentSawl = swal({
		    title: "WYC",
		    text: "내용을 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		return;
	}
	
	document.replyForm.submit();
	
}


//게시판 불러오기
//let itemsPerPage = 10; //한 페이지에 보일 데이터의 갯수
//let currentPage = 1; //현재 페이지 번호
//let modelLength = null;
//
//const board_tBody = document.querySelector(".board_tBody")
//
////모든 정책 리스트 불러오는 함수
//function board_table() {
//	$.ajax({
//	    type: "GET",
//	    url: "getList.do",
//	    dataType: "json",
//	    success: function(model) {
//	    	console.log("getList 연결 성공")
//	    	console.log("model : " + model);
//	    	
//	    	modelLength = model.length;
//	    	row_count.innerHTML = modelLength;
//	    	
//	    	let startIndex = (currentPage - 1) * itemsPerPage;	// 데이터 시작 인덱스 번호
//	    	let endIndex = startIndex + itemsPerPage;			// 데이터 끝 인덱스 번호
//	    	
//	    	policy_list_tbody.innerHTML = "";
//	    	let str = "";
//	   
//	    	for(let i = startIndex; i < endIndex && i < model.length; i++){
//	    	str += `
//		<tr>
//			<td>`+model[i].bId+`</td>
//			<td>${dto.bName }</td>
//			<td class="title">`
//			for(let j=1; j<model[i].bIndent; j++){
//				"▷"
////				<c:forEach begin="1" end="`+model[i].bIndent+`">▷ </c:forEach>
//				`<a href="content_view.do?bId=`+model[i].bId +`">`+model[i].bTitle+`</a>
//			</td>
//			<td>`+model[i].bDate +`</td>
//			<td>`+model[i].bHit+`</td>
//		</tr>
//		`
//			}
//	    }
//	    	//페이지 네이션 기능 구현하는 함수 실행
////	    	policy_pagenation(model);
//	    	
//	    	board_tBody.innerHTML = str;
//	    },
//	    error: function() {
//	      console.log("getList 서버 요청 실패");
//	    }
//	  });
//
//}

//
////정책 리스트 페이지 네이션는 함수
//function policy_pagenation(model) {
//	let totalPages = Math.ceil(model.length / itemsPerPage);	//총 페이지의 갯수
//	let prevPageButton = document.getElementById("prevPage");	//이전 버튼
//	let nextPageButton = document.getElementById("nextPage");	//다음 버튼
//	let pageButtonsContainer = document.getElementById("pageButtons");	//페이지 번호 버튼을 생성할 공간
//	
//	pageButtonsContainer.innerHTML = "";	//페이지 번호 버튼 초기화
//	
//    // 표시할 페이지 버튼의 최대 개수
//    const maxPageButtons = 10;
//    
//    let startPage = 1;
//    let endPage = totalPages;
//
//    if (totalPages > maxPageButtons) {
//        // 현재 페이지를 중심으로 앞뒤로 최대 5개의 페이지 버튼만 표시
//        startPage = Math.max(currentPage - 5, 1);
//        endPage = Math.min(currentPage + 4, totalPages);
//
//        if (currentPage <= 5) {
//            endPage = maxPageButtons;
//        } else if (currentPage >= totalPages - 4) {
//            startPage = totalPages - maxPageButtons + 1;
//        }
//    }
//	
//	  //페이지 버튼 추가
//	  for (let i = 1; i <= totalPages; i++) {
//	    var pageButton = document.createElement("button");
//	    pageButton.classList.add("pageButton");
//	    if (i === currentPage) {
//	      pageButton.classList.add("currentPageButton");
//	    }
//	    pageButton.textContent = i;
//
//	    // 버튼 클릭 시 정책 리스트 바뀜
//	    pageButton.addEventListener("click", function (event) {
//	      currentPage = parseInt(event.target.textContent);
//	      policy_list_all();
//	    });
//
//	    pageButtonsContainer.appendChild(pageButton);
//	  }
//	  
//	  prevPageButton.disabled = currentPage === 1;
//	  nextPageButton.disabled = currentPage === totalPages;
//}
//
//function paganation_button() {
//	//Event listener for previous page button
//	document.getElementById("prevPage").addEventListener("click", function () {
//	  if (currentPage > 1) {
//	    currentPage--;
//	    policy_list_all();
//	  }
//	});
//
//	// Event listener for next page button
//	document.getElementById("nextPage").addEventListener("click", function () {
//	  var totalPages = Math.ceil(modelLength / itemsPerPage);
//	  if (currentPage < totalPages) {
//	    currentPage++;
//	    policy_list_all();
//	  }
//	});
//}
//paganation_button();

//모든 게시판 불러오기 실행
//board_table()
