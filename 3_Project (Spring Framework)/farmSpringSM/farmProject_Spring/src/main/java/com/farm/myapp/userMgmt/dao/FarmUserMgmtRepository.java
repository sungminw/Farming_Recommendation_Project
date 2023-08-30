//package com.farm.myapp.userMgmt.dao;
//
//import java.sql.Timestamp;
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.EmptyResultDataAccessException;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
////import org.springframework.ui.Model;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.farm.myapp.userMgmt.model.FarmMemberVO;
//
//
//@Repository
//public class FarmUserMgmtRepository implements IFarmUserMgmtRepository{
//
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	@Autowired
//	HttpSession session;
//	
//	//회원가입 서비스 실행(아이디 중복 확인 및 저장)
////	@Override
////	public void joinService(FarmMemberVO member) {
////		System.out.println("joinService 연결 성공 :" + member);
////		member.setrDate(new Timestamp(System.currentTimeMillis()));
////
////		if(confirmId(member.getId()) == MEMBER_EXISTENT) {
////			System.out.println("아이디가 이미 존재합니다.");
////		}else {
////			int ri = insertMember(member);
////			if(ri == MEMBER_LOGIN_SUCCESS) {
//////				session.setAttribute("id", member.getId());
////				System.out.println(member.getName() + "님 회원 가입을 축하합니다");
////			}else {
////				System.out.println("회원 가입에 실패 하였습니다");
////			}
////		}
////	}
//
//	//회원가입 시 아이디 중복 확인
//	@Override
//	public int confirmId(String id) {
//		String query = "select count(*) from WYCMembers where id = ?";
//		int count = jdbcTemplate.queryForObject(query, new Object[]{id}, Integer.class);
//		return count;
//
////		if(count == MEMBER_EXISTENT) {
////			return MEMBER_EXISTENT;
////		}else {
////			return MEMBER_NONEXISTENT;
////		}
//		
//	}
//
//	//회원가입 성공 시 DB에 저장
//	@Override
//	public void insertMember(FarmMemberVO member) {
//		String query = "insert into WYCMembers values (?,?,?,?,?,?,?)";
//		try{
//		jdbcTemplate.update(query,
//				member.getId(),
//				member.getPw(),
//				member.getName(),
//				member.geteMail(),
//				member.getrDate(),
//				member.getSsn(),
//				member.getAddress());
////			return MEMBER_JOIN_SUCCESS;
//		} catch (Exception e) {
//        	e.printStackTrace();
////        	return MEMBER_JOIN_FAIL;
//    	}
//	}
//
//	//회원 로그인 정보 확인(아이디 정보 확인 및 로그인 세션 저장)
////	@Override
////	public String loginService(String id, String pw) {
////		int checkNum = userCheck(id, pw);
////		
////		if(checkNum == MEMBER_LOGIN_IS_NOT) {
////			return "아이디가 존재 하지 않습니다";
////		}else if(checkNum == MEMBER_LOGIN_PW_NO_GOOD) {
////			return "비밀번호가 틀립니다";
////		}else if(checkNum == MEMBER_LOGIN_SUCCESS) {
////			FarmMemberVO member = getMember(id);
////			
////			if(member == null) {
////				return "존재하지 않는 회원입니다.";
////			}else {
//////				HttpSession session = request.getSession();
////				String name = member.getName();
////				
////				session.setAttribute("id", id);
////				session.setAttribute("ValidMem", "yes");
////				return name + "님 로그인 성공입니다.";
////			}
////			
////		}
////		return null;
////		
////	}
//
//	//저장된 회원 정보 중 아이디와 패스워드 일치 여부 확인
//	@Override
//	public String userCheck(String id) {
////		int resultInt = 0;
//	    String DBPw;
//	    
//	    String query = "SELECT pw FROM WYCMembers WHERE id=?";
//	    
////	    try {
//	        DBPw = jdbcTemplate.queryForObject(query, new Object[]{id}, String.class);
//	        return DBPw;
////	        if (DBPw.equals(pw)) {
////	            resultInt = MEMBER_JOIN_SUCCESS;
////	        } else {
////	            resultInt = MEMBER_LOGIN_PW_NO_GOOD;
////	        }
////	    } catch (EmptyResultDataAccessException e) {
////	        resultInt = MEMBER_LOGIN_IS_NOT;
////	    }
////	    
////	    return resultInt;
//	}
//
//	//아이디와 일치하는 회원 정보 확인
//	@Override
//	public FarmMemberVO getMember(String id) {
//		System.out.println("getMember : " + id);
//		String query = "select * from WYCMembers where id = ?";
//		List<FarmMemberVO> members = jdbcTemplate.query(query, new Object[]{id}, new BeanPropertyRowMapper<FarmMemberVO>(FarmMemberVO.class));
//		return members.get(0);
//	}
//
//	//회원의 이름와 주민등록번호 앞 6자리와 일치하는 아이디 찾기
//	@Override
//	public FarmMemberVO findIdService(String name, String ssn) {
//		System.out.println("findIdService : " + name);
//		String query = "SELECT id, name FROM WYCMembers WHERE name=? AND ssn=?";
//		List<FarmMemberVO> findId = jdbcTemplate.query(query, new Object[] {name, ssn}, new BeanPropertyRowMapper<FarmMemberVO>(FarmMemberVO.class));
//		return findId.get(0);
//	}
//
//	//회원의 아이디와 이름, 주민등록번호와 일치하는 비밀번호 찾기
//	@Override
//	public FarmMemberVO findPwService(String id, String name, String ssn) {
//		System.out.println("findPwService : " + name);
//		String query = "SELECT name,pw FROM WYCMembers WHERE id=? AND name=? AND ssn=?";
//		List<FarmMemberVO> findId = jdbcTemplate.query(query, new Object[] {id, name, ssn}, new BeanPropertyRowMapper<FarmMemberVO>(FarmMemberVO.class));
//		return findId.get(0);
//	}
//
//	//아이디와 일치하는 회원 정보 확인(마이페이지 접속시)
//	@Override
//	public FarmMemberVO getMemberInfo(String id) {
//		System.out.println("getMemberInfo : " + id);
//			String query = "SELECT * FROM WYCMembers WHERE id=?";
//			List<FarmMemberVO> memberInfo= jdbcTemplate.query(query, new Object[] {id}, new BeanPropertyRowMapper<FarmMemberVO>(FarmMemberVO.class));
//			return memberInfo.get(0);
//	}
//
//	//비밀번호 확인 후 수정 화면으로 이동
//	@Override
//	public FarmMemberVO modifyPage(String id, String pw) {
//		System.out.println("modifyService : " + id + " : "+pw);
////		int checkNum = userCheck(id, pw);
//		
////		if(checkNum == MEMBER_LOGIN_PW_NO_GOOD) {
////			System.out.println("비밀번호가 틀립니다");
////			return null;
////		}
////		if(checkNum == MEMBER_LOGIN_SUCCESS) {
//			String query = "SELECT * FROM WYCMembers WHERE id=?";
//			List<FarmMemberVO> memberInfo= jdbcTemplate.query(query, new Object[] {id}, new BeanPropertyRowMapper<FarmMemberVO>(FarmMemberVO.class));
//			return memberInfo.get(0);
////		}
////		return null;
//	}
//	
//	//회원 정보 수정 서비스
//	@Override
//	public void modifyService(String id, String pw, String address, String eMail) {
//		String query = "UPDATE WYCMembers set pw=?, address=?, eMail=? WHERE id=?";
//		jdbcTemplate.update(query, pw, address, eMail, id);
//	}
//
//
//
//}
//
//
////@Override
////public FarmMemberVO getMemberInfo(String id) {
////	System.out.println("getMemberInfo : " + id);
////	int checkNum = userCheck(id, pw);
////	
////	if(checkNum == MEMBER_LOGIN_PW_NO_GOOD) {
////		System.out.println("비밀번호가 틀립니다");
////		return null;
////	}
////	if(checkNum == MEMBER_LOGIN_SUCCESS) {
////		String query = "SELECT * FROM WYCMembers WHERE id=?";
////		List<FarmMemberVO> memberInfo= jdbcTemplate.query(query, new Object[] {id}, new BeanPropertyRowMapper<FarmMemberVO>(FarmMemberVO.class));
////		return memberInfo.get(0);
////	}
////	return null;
////}
//	