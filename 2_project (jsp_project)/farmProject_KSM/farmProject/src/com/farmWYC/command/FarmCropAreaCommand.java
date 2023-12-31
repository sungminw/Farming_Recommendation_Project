package com.farmWYC.command;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmWYC.dao.FarmDao;
import com.farmWYC.dto.FarmCropAreaDto;

public class FarmCropAreaCommand implements FarmCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("FarmCropAreaCommand 연결 성공");
		
		String crop = (String) request.getAttribute("crop");
		System.out.println("FarmCropArea Service : "+crop);
		
		FarmDao dao = new FarmDao();
		ArrayList<FarmCropAreaDto> dtos = dao.cropAreaList(crop);
		ArrayList<String> cropAreas = new ArrayList<String>();
		
		for(int i=0; i<dtos.size(); i++) {
			String area_eng = dtos.get(i).getArea_eng();
			String area_name = dtos.get(i).getArea_name();
			
			cropAreas.add(area_eng);
			cropAreas.add(area_name);
		}
//		System.out.println("dtos.get(0) " + dtos.get(0));
//		System.out.println("getCrop_area " + dtos.get(0).getCrop_area());
//		System.out.println("getCrop_eng " + dtos.get(0).getCrop_eng());
//		System.out.println("getCrop_name " + dtos.get(0).getCrop_name());
		request.setAttribute("cropAreaList", cropAreas);
		
		
//		response.setContentType("text/plain; charset=utf-8");
//		 try {
////			PrintWriter response1.getWriter();
//			response.getWriter().println(dtos);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		response.getWriter().println(cropAreaList);
	}	

}
