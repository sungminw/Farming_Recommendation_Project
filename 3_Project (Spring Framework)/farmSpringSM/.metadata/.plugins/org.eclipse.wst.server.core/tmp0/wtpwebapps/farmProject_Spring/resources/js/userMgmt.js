//로그인시 (세션존재) 로그인 -> 로그아웃 / 회원가입 -> 마이페이지
if(sessionId != null){
	const loginNav = document.querySelector(".loginNav");
	const joinNav = document.querySelector(".joinNav");
	const logoutNav = document.querySelector(".logoutNav");
	const myPageNav = document.querySelector(".myPageNav");
	
	loginNav.style.display = "none";
	joinNav.style.display = "none";
	logoutNav.style.display = "block";
	myPageNav.style.display = "block";
}


//JoinMember.jsp
//회원가입 정보 검사
function infoConfirm() {
	if(document.loginForm.id.value.length == 0){
//		alert("아이디는 필수 입니다");
		swal({
		    title: "WYC",
		    text: "아이디는 필수 입니다",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		loginForm.id.focus();
		return;
	}
	
	if(document.loginForm.id.value.length < 4){
//		alert("아이디는 4글자 이상이어야 합니다");
		swal({
		    title: "WYC",
		    text: "아이디는 4글자 이상이어야 합니다",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		loginForm.id.focus();
		return;
	}
	
	if(document.loginForm.pw.value.length == 0){
//		alert("비밀번호는 필수사항입니다.");
		swal({
		    title: "WYC",
		    text: "비밀번호는 필수사항입니다.",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		loginForm.pw.focus();
		return;
	}
	
	if(document.loginForm.pw.value != document.loginForm.pwCheck.value){
//		alert("비밀번호가 일치하지 않습니다.");
		swal({
		    title: "WYC",
		    text: "비밀번호가 일치하지 않습니다.",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		loginForm.pw.focus();
		return;
	}
	
	if(document.loginForm.name.value.length == 0){
//		alert("이름은 필수사항입니다.");
		swal({
		    title: "WYC",
		    text: "이름은 필수사항입니다.",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		loginForm.name.focus();
		return;
	}
	
	if(document.loginForm.id.value.length == 0){
//		alert("아이디는 필수사항입니다.");
		swal({
		    title: "WYC",
		    text: "아이디는 필수사항입니다.",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		loginForm.id.focus();
		return;
	}
	
	if(document.loginForm.eMail.value.length == 0){
//		alert("메일은 필수사항 입니다");
		swal({
		    title: "WYC",
		    text: "메일은 필수사항 입니다.",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		loginForm.eMail.focus();
		return;
	}
	
	if(document.loginForm.ssn.value.length != 6){
//		alert("주민등록번호 앞 6자리를 입력 해주세요");
		swal({
		    title: "WYC",
		    text: "주민등록번호 앞 6자리를 입력 해주세요.",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		loginForm.ssn.focus();
		return;
	}
	
	if(document.loginForm.address.value.length == 0){
//		alert("주소는 필수사항 입니다");
		swal({
		    title: "WYC",
		    text: "주소는 필수사항 입니다.",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		loginForm.address.focus();
		return;
	}
	
	document.loginForm.submit();
}




//modify.jsp
//수정 검사
function updateInfoConfirm() {
	if(document.modifyForm.pw.value.length == 0){
//		alert("패스워드를 입력하세요.")
		swal({
		    title: "WYC",
		    text: "패스워드를 입력하세요.",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		document.modifyForm.pw.focus();
		return;
	}
	
	if(document.modifyForm.pw.value != document.modifyForm.pw_check.value){
//		alert("비밀번호가 일치하지 않습니다.")
		swal({
		    title: "WYC",
		    text: "비밀번호가 일치하지 않습니다.",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		modifyForm.pw.focus();
		return;
	}
	
	if(document.modifyForm.eMail.value.length == 0){
//		alert("메일은 필수 입력사항입니다")
		swal({
		    title: "WYC",
		    text: "메일은 필수 입력사항입니다.",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		modifyForm.eMail.focus();
		return;
	}
	
	document.modifyForm.submit();
}

//login.jsp
//입력 검사
function loginEmpty() {
	
	if(document.loginForm.id.value.length == 0){
//		alert("아이디를 입력 하시오");
		swal({
		    title: "WYC",
		    text: "아이디를 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		loginForm.id.focus();
		return;
	}
	if(document.loginForm.pw.value.length == 0){
//		alert("비밀번호를 입력 하시오");
		swal({
		    title: "WYC",
		    text: "비밀번호를 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		loginForm.id.focus();
		return;
		loginForm.pw.focus();
		return;
	}
	
	document.loginForm.submit();
}


//modify
function updateInfoReset() {
	swal({
	    title: "WYC",
	    text: "회원 정보 수정을 취소 하시겠습니까 ?",
	    icon: "info", //"info,success,warning,error" 중 택1
	    buttons: ["NO", "YES"]
	}).then((YES) => {
	    if (YES) {
	    	window.location.href = "mypage.do?id="+sessionId;        
	    }else{
	    	return;
	    }
	});
}

//find_id
function findIdBoard() {
	if(document.findIdForm.name.value.length == 0){
		swal({
		    title: "WYC",
		    text: "이름을 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		findIdForm.pw.focus();
		return;
	}
	
	if(document.findIdForm.ssn.value.length == 0){
		swal({
		    title: "WYC",
		    text: "주민등록번호 앞 6자리를 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		findIdForm.ssn.focus();
		return;
	}
	
	document.findIdForm.submit();
}

//find_pw
function findPwBoard() {
	if(document.findPwForm.id.value.length == 0){
		swal({
		    title: "WYC",
		    text: "아이디를 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		findPwForm.id.focus();
		return;
	}
	
	if(document.findPwForm.name.value.length == 0){
		swal({
		    title: "WYC",
		    text: "이름을 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		findPwForm.name.focus();
		return;
	}
	
	if(document.findPwForm.ssn.value.length == 0){
		swal({
		    title: "WYC",
		    text: "주민등록번호 앞 6자리를 입력 해주세요",
		    icon: "warning" //"info,success,warning,error" 중 택1
		})
		findPwForm.ssn.focus();
		return;
	}
	
	document.findPwForm.submit();
}


//joinMember
function joinCancel() {
	swal({
	    title: "WYC",
	    text: "회원  가입을 취소 하시겠습니까 ?",
	    icon: "info", //"info,success,warning,error" 중 택1
	    buttons: ["NO", "YES"]
	}).then((YES) => {
	    if (YES) {
	    	window.location.href = "index.do";        
	    }else{
	    	return;
	    }
	});
	
}