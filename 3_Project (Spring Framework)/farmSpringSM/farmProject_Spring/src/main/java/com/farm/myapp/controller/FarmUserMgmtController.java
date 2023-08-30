package com.farm.myapp.controller;

import java.sql.Timestamp;
import java.util.List;

import javax.print.DocFlavor.STRING;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.farm.myapp.sales.model.FarmSalesCropVO;
import com.farm.myapp.userMgmt.model.FarmMemberVO;
import com.farm.myapp.userMgmt.service.IFarmUserMgmtService;

@Controller
//@RequestMapping("/userMgmt")
public class FarmUserMgmtController {
	
	public static final int MEMBER_NONEXISTENT = 0;
	public static final int MEMBER_EXISTENT = 1;
	public static final int MEMBER_JOIN_FAIL = 0;
	public static final int MEMBER_JOIN_SUCCESS = 1;
	public static final int MEMBER_LOGIN_PW_NO_GOOD = 0;
	public static final int MEMBER_LOGIN_SUCCESS = 1;
	public static final int MEMBER_LOGIN_IS_NOT = -1;
	
	@Autowired
	IFarmUserMgmtService farmUserMgmtService;

	@Autowired
	HttpSession session;
	
	//회원가입 화면으로 이동
	@GetMapping("/joinMember.do")
	public String joinMember() {
		return "userMgmt/joinMember";
	}
	
	//회원가입 서비스 실행(아이디 중복 확인 및 저장)
	@PostMapping("/joinService.do")
	public ModelAndView joinService(FarmMemberVO member, Model model) {
		System.out.println("joinService 연결 성공 :" + member);
		member.setrDate(new Timestamp(System.currentTimeMillis()));
		
		int checkId = farmUserMgmtService.confirmId(member.getId());
		
		ModelAndView modelAndView = new ModelAndView();
		
		if(checkId == MEMBER_EXISTENT) {
			modelAndView.addObject("message", "아이디가 이미 존재합니다.");
			modelAndView.setViewName("userMgmt/login");
		}else {
			try {
				farmUserMgmtService.insertMember(member);
				modelAndView.addObject("message", member.getName() + " 님 회원 가입을 축하합니다.\n아이디는 \"" + member.getId() + "\"입니다." );
				modelAndView.setViewName("userMgmt/login");
//	            return MEMBER_JOIN_SUCCESS;
	        } catch (Exception e) {
	            e.printStackTrace();
				modelAndView.addObject("message", "회원 가입에 실패 하였습니다.");
				modelAndView.setViewName("userMgmt/joinMember");
//	            return MEMBER_JOIN_FAIL;
	        }
			
//			
//			if(ri == MEMBER_LOGIN_SUCCESS) {
////				session.setAttribute("id", member.getId());
//				System.out.println(member.getName() + "님 회원 가입을 축하합니다");
//			}else {
//				System.out.println("회원 가입에 실패 하였습니다");
//			}
		}
//		System.out.println("member : " + member);
//		farmUserMgmtService.joinService(member);
////		model.addAttribute("ressult", ressult);
		return modelAndView;
	}
	
	//로그인 화면으로 이동
	@GetMapping("/login.do")
	public String login() {
		return "userMgmt/login";
	}
	
	
	//회원 로그인 정보 확인(아이디 정보 확인 및 로그인 세션 저장)
	@PostMapping("/loginService.do")
	public ModelAndView loginService(@Param("id")String id, @Param("pw")String pw, Model model) {
		String checkPw = farmUserMgmtService.userCheck(id);
		String message = null;
		int resultInt = 0;
		ModelAndView modelAndView = new ModelAndView();
		
		//입력된 비밀번호와 회원정보에 있는 비밀번호 비교
		if(checkPw != null) {
			if(checkPw.equals(pw)) {
				resultInt = MEMBER_JOIN_SUCCESS;
			}else {
				resultInt = MEMBER_LOGIN_PW_NO_GOOD;
			}
		}else {
			resultInt = MEMBER_LOGIN_IS_NOT;
		}
		
		//화면에 메세지 뿌리기
		if(resultInt == MEMBER_LOGIN_IS_NOT) {
			message = "아이디가 존재 하지 않습니다";
		}else if(resultInt == MEMBER_LOGIN_PW_NO_GOOD) {
			message = "비밀번호가 틀립니다";
		}else if(resultInt == MEMBER_LOGIN_SUCCESS) {
			FarmMemberVO member = farmUserMgmtService.getMember(id);
			
			if(member == null) {
				message = "존재하지 않는 회원입니다.";
			}else {
//				HttpSession session = request.getSession();
				String name = member.getName();
				
				session.setAttribute("id", id);
				session.setAttribute("ValidMem", "yes");
				message = name + "님 로그인 성공입니다.";
			}
			
		}
		
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("userMgmt/login");
		return modelAndView;

//		System.out.println("loginId : " + id);
//		System.out.println("loginPW : " + pw);
//		String message = farmUserMgmtService.loginService(id, pw);
//		model.addAttribute("message", message);
		
	}
	
	//아이디 찾기 화면으로 이동
	@GetMapping("/find_id.do")
	public String find_id() {
		return "userMgmt/find_id";
	}
	
	//아이디 찾기 서비스 실행
	@GetMapping("/findIdService.do")
	public ModelAndView findIdService(@Param("name")String name, @Param("ssn")String ssn, Model model) {

		FarmMemberVO findId = farmUserMgmtService.findIdService(name, ssn);
		ModelAndView modelAndView = new ModelAndView();
		if(findId == null) {
			modelAndView.addObject("message", "일치하는 회원 정보가 없습니다.");
			modelAndView.setViewName("userMgmt/find_id");
		}else {		
			modelAndView.addObject("id", findId.getId());
			modelAndView.addObject("name", findId.getName());
			System.out.println("findId.getId() : " + findId.getId());
			System.out.println("findId.getName() : " + findId.getName());
			modelAndView.setViewName("userMgmt/find_id_true");
		}

		return modelAndView;
	}
	
	//비밀번호 찾기 화면으로 이동
	@RequestMapping("/find_pw.do")
	public String find_pw() {
		return "userMgmt/find_pw";
	}
	
	//비밀번호 찾기 서비스 실행
	@GetMapping("/findPwService.do")
	public ModelAndView findPwService(@Param("id")String id, @Param("name")String name, @Param("ssn")String ssn, Model model) {
		FarmMemberVO findId = farmUserMgmtService.findPwService(id, name, ssn);
		ModelAndView modelAndView = new ModelAndView();
		if(findId == null) {
			modelAndView.addObject("message", "일치하는 회원 정보가 없습니다.");
			modelAndView.setViewName("userMgmt/find_pw");
		}else {
			modelAndView.addObject("name", findId.getName());
			modelAndView.addObject("pw", findId.getPw());
			System.out.println("findId.getName() : " + findId.getName());
			modelAndView.setViewName("userMgmt/find_pw_true");
		}

		return modelAndView;
	}
	
	//로그 아웃(세션 제거) 후 index페이지로 이동
	@GetMapping("/logout.do")
	public String logout() {
		return "userMgmt/logout";
	}

	//마이페이지 접속
	@GetMapping("/mypage.do")
	public ModelAndView getMemberInfo(@Param("id") String id, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		FarmMemberVO memberInfo = farmUserMgmtService.getMemberInfo(id);
		modelAndView.addObject("memberInfo", memberInfo);
		modelAndView.setViewName("userMgmt/mypage");
		return modelAndView;
	}
	
	//회원 정보 수정 전 비밀번호 확인 페이지로 이동
	@GetMapping("/pwCheck.do")
	public ModelAndView pwCheck() {
		System.out.println("pwCheck 연결 성공 : ");
		ModelAndView modelAndView = new ModelAndView();
//		FarmMemberVO memberInfo = farmUserMgmtService.pwCheck(id);
//		modelAndView.addObject("memberInfo", memberInfo);
		modelAndView.setViewName("userMgmt/pwCheck");
		return modelAndView;
	}
	
	//비밀번호 확인 후 수정 화면으로 이동
	@GetMapping("/modify.do")
	public ModelAndView modifyPage(@Param("id") String id, @Param("pw")String pw, Model model) {
		System.out.println("modify 연결 성공 : " + id +" : "+ pw);
		String checkPw = farmUserMgmtService.userCheck(id);
		FarmMemberVO memberInfo = null;
		int resultInt = 0;
		String message = null;
		
		//입력된 비밀번호와 회원정보에 있는 비밀번호 비교
		if(checkPw.equals(pw)) {
			resultInt = MEMBER_JOIN_SUCCESS;
			memberInfo = farmUserMgmtService.modifyPage(id, pw);
		}else {
			resultInt = MEMBER_LOGIN_PW_NO_GOOD;
			message = "비밀번호가 틀립니다";
		}
		
		ModelAndView modelAndView = new ModelAndView();
		if(memberInfo == null) {
			modelAndView.addObject("message", message);
			modelAndView.setViewName("userMgmt/pwCheck");
		}else {
			
			modelAndView.addObject("memberInfo", memberInfo);
			modelAndView.setViewName("userMgmt/modify");
		}
		return modelAndView;
	}
	
	//회원 정보 수정 서비스
	@PostMapping("/modifyService.do")
	public String modifyService(@Param("id")String id, @Param("pw")String pw, @Param("address")String address, @Param("eMail")String eMail, Model model) {
		System.out.println("modifyService 연결 성공 : "+id+" : " + pw +" : " +address+ " : "+ eMail);
		farmUserMgmtService.modifyService(id, pw, address, eMail);
		return "redirect:/mypage.do?id="+id;
	}
	

	
	
	
}
