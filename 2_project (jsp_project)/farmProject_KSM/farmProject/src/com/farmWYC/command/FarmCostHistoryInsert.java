package com.farmWYC.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmWYC.dao.FarmCostDao;
import com.farmWYC.dao.FarmDao;

public class FarmCostHistoryInsert implements FarmCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("FarmCostHistoryInsert 연결 성공");
		FarmCostDao dao = new FarmCostDao();
		
		String wycId = (String) request.getAttribute("wycId");
		String selectCrop = (String) request.getAttribute("selectCrop");
		String selectCropKor = (String) request.getAttribute("selectCropKor");
		String selectArea = (String) request.getAttribute("selectArea");
		String chageIntCostPolicy = ((String) request.getAttribute("costPolicy")).replaceAll(",", "");
		int costpolicy = Integer.parseInt(chageIntCostPolicy);
		String chageIntCostResult = ((String) request.getAttribute("costResult")).replaceAll(",", "");
		int costResult = Integer.parseInt(chageIntCostResult);
		
		System.out.println("wycId : " + wycId);
		System.out.println("selectCrop : " + selectCrop);
		System.out.println("selectCropKor : " + selectCropKor);
		System.out.println("selectArea : " + selectArea.trim());
		System.out.println("costpolicy : " + costpolicy);
		System.out.println("costResult : " + costResult);
		
		dao.CostHistorySave(wycId, selectCrop, selectArea, selectCropKor, costpolicy, costResult);
		
	}

}
