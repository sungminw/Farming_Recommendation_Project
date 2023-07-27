package com.farmWYC.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmWYC.dao.FarmCostDao;
//import com.farmWYC.dao.FarmDao;
import com.farmWYC.dto.FarmPolicyListDto;

public class FarmPolicyListCommand implements FarmCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String selectCrop = (String) request.getAttribute("selectCrop");
		String selectArea = (String) request.getAttribute("selectArea");
		int selectAge = (Integer) request.getAttribute("selectAge");
		int selectPeriod = (Integer) request.getAttribute("selectPeriod");
		
		FarmCostDao dao = new FarmCostDao();
		ArrayList<FarmPolicyListDto> dtos =  dao.getPolicyList(selectArea, selectAge, selectPeriod);
		
		ArrayList<String> policyList = new ArrayList<String>();
		
		for(int i=0; i<dtos.size(); i++) {
			String policyName = dtos.get(i).getPolicy_name();
			String cost = Integer.toString(dtos.get(i).getCost());
			
			policyList.add(policyName);
			policyList.add(cost);
		}
		System.out.println("policyList : "+ policyList);
		
		request.setAttribute("policyList", policyList);
	}

}
