package com.farm.myapp.userMgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.farm.myapp.userMgmt.dao.IFarmUserMgmtRepository;
import com.farm.myapp.userMgmt.model.FarmMemberVO;

@Service
public class FarmUserMgmtService implements IFarmUserMgmtService {
	
	@Autowired
	IFarmUserMgmtRepository farmUserMgmtRepository;

//	@Override
//	public void joinService(FarmMemberVO member) {
//		farmUserMgmtRepository.joinService(member);
//	}
	
	@Override
	public int confirmId(String id) {
		return farmUserMgmtRepository.confirmId(id);
	}

	@Override
	public void insertMember(FarmMemberVO member) {
		farmUserMgmtRepository.insertMember(member);
	}

//	@Override
//	public String loginService(String id, String pw) {
//		return farmUserMgmtRepository.loginService(id, pw);
//	}
	
	@Override
	public String userCheck(String id) {
		return farmUserMgmtRepository.userCheck(id);
	}

	@Override
	public FarmMemberVO getMember(String id) {
		return farmUserMgmtRepository.getMember(id);
	}

	@Override
	public FarmMemberVO findIdService(String name, String ssn) {
		return farmUserMgmtRepository.findIdService(name, ssn);
	}

	@Override
	public FarmMemberVO findPwService(String id, String name, String ssn) {
		return farmUserMgmtRepository.findPwService(id, name, ssn);
	}

	@Override
	public FarmMemberVO getMemberInfo(String id) {
		return farmUserMgmtRepository.getMemberInfo(id);
	}

	@Override
	public void modifyService(String id, String pw, String address, String eMail) {
		farmUserMgmtRepository.modifyService(id, pw, address, eMail);
	}

	@Override
	public FarmMemberVO modifyPage(String id, String pw) {
		return farmUserMgmtRepository.modifyPage(id, pw);
	}





}
