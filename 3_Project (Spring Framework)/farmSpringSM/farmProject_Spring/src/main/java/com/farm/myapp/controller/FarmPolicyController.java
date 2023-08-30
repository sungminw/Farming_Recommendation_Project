package com.farm.myapp.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.farm.myapp.policy.model.FarmCostPolicyInfoVO;
import com.farm.myapp.policy.model.FarmCostPolicyVO;
import com.farm.myapp.policy.sevrice.IFarmPolicyService;

import jdk.nashorn.internal.ir.annotations.Reference;

@Controller
public class FarmPolicyController {
	
	@Autowired
	IFarmPolicyService farmPolicyService;
	
	//정부 지원 정책 확인 페이지로 이동
	@GetMapping(value="/servicePolicyCheck.do")
	public String servicePolicyCheck() {
		return "servicePolicyCheck";
	}
	
	//모든 정책 리스트 제공	
	@GetMapping(value="/servicePolicy.do")
	public @ResponseBody List<FarmCostPolicyVO> getServicePolicy(Model model) {
		List<FarmCostPolicyVO> policyList = farmPolicyService.getServicePolicy();
		return policyList;
	}
	
	//사용자가 원하는 지역 및 사업명을 포함한 정책 리스트 제공
	@GetMapping(value="/searchPolicyList.do")
	public @ResponseBody List<FarmCostPolicyVO> searchPolicyList(@RequestParam("sigungu")String sigungu, @RequestParam("search")String search, Model model) {
		System.out.println("searchPolicyList : " + sigungu +" : " +search);
		List<FarmCostPolicyVO> serchPolicyList = farmPolicyService.searchPolicyList(sigungu, search);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("policyList", policyList);
//		modelAndView.addObject("policyLength", policyList.size());
//		modelAndView.setViewName("servicePolicyCheck");
//		System.out.println("policyList : " + policyList);
		return serchPolicyList;
	}
	
//	//정책 상세정보 제공
	@GetMapping(value="/policyDetail.do")
	public @ResponseBody List<FarmCostPolicyInfoVO> getPolicyDetail(@RequestParam("policySigungu")String policySigungu, @RequestParam("policyTitle")String policyTitle, Model model) {
		System.out.println("getPolicyDetail : " + policySigungu +" : " +policyTitle);
		List<FarmCostPolicyInfoVO> PolicyDetail = farmPolicyService.getPolicyDetail(policySigungu, policyTitle);
		return PolicyDetail;
	}
	
	
}


