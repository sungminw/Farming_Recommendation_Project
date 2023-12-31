package com.farmWYC.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmWYC.dao.FarmDao;
import com.farmWYC.dto.FarmCropDto;

public class FarmCropListCommand implements FarmCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		FarmDao dao = new FarmDao();
		ArrayList<FarmCropDto> dtos = dao.cropList();
		request.setAttribute("cropList", dtos);
	}

}
