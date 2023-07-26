package com.farmWYC.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmWYC.dao.FarmDao;
import com.farmWYC.dto.FarmCropInfoDto;
import com.farmWYC.dto.FarmCropProfitDto;

public class FarmSalesText implements FarmCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("FarmSalesText 연결 성공 ");
		
		String selectCrop = (String)request.getAttribute("selectCrop");
		String selectArea = (String)request.getAttribute("selectArea");
		System.out.println("FarmSalesText(crop)" + selectCrop);
		System.out.println("FarmSalesText(area)" + selectArea);
		
		FarmDao dao = new FarmDao();
		ArrayList<FarmCropInfoDto> cropInfos = dao.getCropInfo(selectCrop);
		System.out.println(cropInfos);
		int pcost = cropInfos.get(0).getPcost();
		int dcost = cropInfos.get(0).getDcost();
		int temp = cropInfos.get(0).getTemp();
		int rain = cropInfos.get(0).getRain();
		int sun = cropInfos.get(0).getSun();
		int insolation = cropInfos.get(0).getInsolation();
		int hprice = cropInfos.get(0).getHprice();
		int gdp = cropInfos.get(0).getGdp();
		int area = cropInfos.get(0).getArea();
		int yield = cropInfos.get(0).getYield();
		
		System.out.println(pcost);
		System.out.println(dcost);
		System.out.println(temp);
		System.out.println(rain);
		System.out.println(sun);
		System.out.println(insolation);
		System.out.println(hprice);
		System.out.println(gdp);
		System.out.println(area);
		System.out.println(yield);

		ArrayList<FarmCropProfitDto> cropProfits = dao.getCropProfit(selectCrop);
		int intereptP = cropProfits.get(0).getInterept();
		int pcostP = cropProfits.get(0).getPcost();
		int dcostP = cropProfits.get(0).getDcost();
		int tempP = cropProfits.get(0).getTemp();
		int rainP = cropProfits.get(0).getRain();
		int sunP = cropProfits.get(0).getSun();
		int insolationP = cropProfits.get(0).getInsolation();
		int hpriceP = cropProfits.get(0).getHprice();
		int gdpP = cropProfits.get(0).getGdp();
		int areaP = cropProfits.get(0).getArea();
		int yieldP = cropProfits.get(0).getYield();
		
		System.out.println(intereptP);
		System.out.println(pcostP);
		System.out.println(dcostP);
		System.out.println(tempP);
		System.out.println(rainP);
		System.out.println(sunP);
		System.out.println(insolationP);
		System.out.println(hpriceP);
		System.out.println(gdpP);
		System.out.println(areaP);
		System.out.println(yieldP);
		
		
		int cropPredictionValue = intereptP + (pcost*pcostP) + (dcost*dcostP) + (temp*tempP) + (rain*rainP) + (sun+sunP) +
				(insolation*insolationP) + (hprice*hpriceP) + (gdp+gdpP) + (area*areaP) + (yield*yieldP);
		
		ArrayList<Integer> revenues = dao.getRevenues(selectCrop);
		revenues.add(cropPredictionValue);
		
		System.out.println("revenues : " + revenues);
		request.setAttribute("revenues", revenues);
		
		
		
	}

}
