package com.farmWYC.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmWYC.dao.FarmDao;
import com.farmWYC.dto.FarmAreaCropDto;

public class FarmAreaCropListCommand implements FarmCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("FarmAreaCropListCommand 서비스 연결 성공");
		FarmDao dao = new FarmDao();
		
		String areaName = (String) request.getAttribute("areaCrop");
		System.out.println("areaName" + areaName);
		
		ArrayList<FarmAreaCropDto> areaCrops = dao.getAreaCrop(areaName);
		ArrayList<String> areaCropList = new ArrayList<String>();
		
		String area_name = areaCrops.get(0).getArea_name();
		areaCropList.add(area_name);
		

		for(int i=0; i<areaCrops.size(); i++) {
			String crop_eng = areaCrops.get(i).getCrop_eng();
			String crop_name = areaCrops.get(i).getCrop_name();
			
			areaCropList.add(crop_eng);
			areaCropList.add(crop_name);
		}
		
		System.out.println(areaCropList);
		request.setAttribute("areaCropList", areaCropList);
	}

}
