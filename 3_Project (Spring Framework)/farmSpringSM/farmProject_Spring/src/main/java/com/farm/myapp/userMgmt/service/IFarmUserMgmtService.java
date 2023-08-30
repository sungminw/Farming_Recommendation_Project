package com.farm.myapp.userMgmt.service;

import org.springframework.web.servlet.ModelAndView;

//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;

import com.farm.myapp.userMgmt.model.FarmMemberVO;

public interface IFarmUserMgmtService {
//	void joinService(FarmMemberVO member);								//회원 가입 서비스
	int confirmId(String id);											//회원가입 정보 중복 확인
	void insertMember(FarmMemberVO member);								//회원가입 정보 DB INSERT
	
//	String loginService(String id, String pw);							//로그인 서비스
	String userCheck(String id);										//아이디 확인
	FarmMemberVO getMember(String id);									//일치하는 회원정보 SELECT
//	
	FarmMemberVO findIdService(String name, String ssn);				//ID찾기 서비스
	FarmMemberVO findPwService(String id, String  name, String  ssn);	//PW찾기 서비스
	FarmMemberVO getMemberInfo(String id);								//회원 정보 조회
	
//	FarmMemberVO getMemberInfo(String id, String pw);	
	void modifyService(String id, String pw, String address, String eMail);		//회원 정보 수정
	FarmMemberVO modifyPage(String id, String pw);								//수정 정보 적용 후 마이페이지
}
