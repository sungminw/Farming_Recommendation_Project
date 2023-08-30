package com.farm.myapp.userMgmt.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.servlet.ModelAndView;

import com.farm.myapp.userMgmt.model.FarmMemberVO;

public interface IFarmUserMgmtRepository {
	public static final int MEMBER_NONEXISTENT = 0;
	public static final int MEMBER_EXISTENT = 1;
	public static final int MEMBER_JOIN_FAIL = 0;
	public static final int MEMBER_JOIN_SUCCESS = 1;
	public static final int MEMBER_LOGIN_PW_NO_GOOD = 0;
	public static final int MEMBER_LOGIN_SUCCESS = 1;
	public static final int MEMBER_LOGIN_IS_NOT = -1;
	
	int confirmId(@Param("id") String id);																	//회원가입 정보 중복 확인
	void insertMember(FarmMemberVO member);														//회원가입 정보 DB INSERT
	
	String userCheck(@Param("id") String id);																//아이디 확인
	FarmMemberVO getMember(@Param("id") String id);											//일치하는 회원정보 SELECT
	
	FarmMemberVO findIdService(@Param("name") String name, @Param("ssn") String ssn);												//ID찾기
	FarmMemberVO findPwService(@Param("id") String id, @Param("name") String  name, @Param("ssn") String ssn);	//PW찾기
	FarmMemberVO getMemberInfo(@Param("id") String id);																									//회원 정보 불러오기	
	FarmMemberVO modifyPage(@Param("id") String id, @Param("pw") String pw);																//수정 페이지 불러오기
	
	void modifyService(@Param("id") String id, @Param("pw") String pw, @Param("address") String address, @Param("eMail") String eMail);	//회원 정보 수정
	
}
