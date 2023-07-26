package com.farmWYC.frontController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmWYC.command.FarmAreaCropListCommand;
import com.farmWYC.command.FarmCommand;
import com.farmWYC.command.FarmCropAreaCommand;
import com.farmWYC.command.FarmCropHpriceYieldCommand;
import com.farmWYC.command.FarmCropListCommand;
import com.farmWYC.command.FarmCropProfile;
import com.farmWYC.command.FarmHistoryInsert;
import com.farmWYC.command.FarmOperCostCommand;
import com.farmWYC.command.FarmPolicyListCommand;
import com.farmWYC.command.FarmSalesText;
import com.farmWYC.dto.FarmCropAreaDto;

/**
 * Servlet implementation class WYCFrontController
 */
@WebServlet("*.do")
public class WYCFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WYCFrontController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo()");
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		String viewPage = null;
		FarmCommand command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length()+4);
		
		System.out.println("URI : " + uri);
		System.out.println("ContextPath : " + conPath);
		System.out.println("Command : " + com);
		
		if(com.equals("/revenue1.do")) {
			command = new FarmCropListCommand();
			command.execute(request, response);
			viewPage = "revenue1.jsp";
		}else if(com.equals("/cropArea.do")) {
			String selectedCrop = request.getParameter("crop");
			request.setAttribute("crop", selectedCrop);
			System.out.println("crop_eng : "+selectedCrop);
			command = new FarmCropAreaCommand();
			command.execute(request, response);
			response.setContentType("text/plain; charset=utf-8");
			response.getWriter().println(request.getAttribute("cropAreaList"));
//			viewPage = "revenue1.jsp";
			return;
		}else if(com.equals("/salesText.do")) {
			String selectedCrop = request.getParameter("selectCrop");
			String selectedArea = request.getParameter("selectArea");
			request.setAttribute("selectCrop", selectedCrop);
			request.setAttribute("selectArea", selectedArea);
			System.out.println("crop_eng : "+selectedCrop);
			System.out.println("area_eng : "+selectedArea.trim());
			
			command = new FarmSalesText();
			command.execute(request, response);
			response.setContentType("text/plain; charset=utf-8");
			response.getWriter().println(request.getAttribute("revenues"));
			return;
		}else if(com.equals("/historySave.do")) {
			String wycId = request.getParameter("wycId");
			String selectCrop = request.getParameter("flexRadioDefault");
			String selectCropKor = request.getParameter("selectCropKor");
			String selectArea = request.getParameter("select_area_radio_name");
			String salesResult = request.getParameter("salesResult");
			String revenue2 = request.getParameter("revenue2");
			
			System.out.println("wycId : " + wycId);
			System.out.println("selectCrop : " + selectCrop);
			System.out.println("selectCropKor : " + selectCropKor);
			System.out.println("selectArea : " + selectArea.trim());
			System.out.println("salesResult : " + salesResult);
			System.out.println("revenue2 : " + revenue2);
			
			request.setAttribute("wycId", wycId);
			request.setAttribute("selectCrop", selectCrop);
			request.setAttribute("selectCropKor", selectCropKor);
			request.setAttribute("selectArea", selectArea.trim());
			request.setAttribute("salesResult", salesResult);
			
			command = new FarmHistoryInsert();
			command.execute(request, response);
			
			if(revenue2 != null) {
				viewPage = "revenue2.do";
			}else {
				viewPage = "revenue1.do";
			}
		}else if(com.equals("/revenue2.do")) {
			viewPage = "revenue2.jsp";
		}else if(com.equals("/getAreaCropList.do")) {
			String areaCrop = request.getParameter("areaCrop");
			System.out.println(areaCrop);
			request.setAttribute("areaCrop", areaCrop);
			
			command = new FarmAreaCropListCommand();
			command.execute(request, response);
			
			response.setContentType("text/plain; charset=utf-8");
			response.getWriter().println(request.getAttribute("areaCropList"));
			return;
		}else if(com.equals("/getCropProfile.do")) {
			String selectCrop = request.getParameter("selectCrop");
			System.out.println("getCropProfile.do : " + selectCrop);
			request.setAttribute("selectCrop", selectCrop);
			
			command = new FarmCropProfile();
			command.execute(request, response);
			
			response.setContentType("text/plain; charset=utf-8");
			response.getWriter().println(request.getAttribute("cropProfileList"));
			return;
		}else if(com.equals("/getCropHpriceYield.do")) {
			String selectCrop = request.getParameter("selectCrop");
			System.out.println("getCropHpriceYield.do : " + selectCrop);
			request.setAttribute("selectCrop", selectCrop);
			
			command = new FarmCropHpriceYieldCommand();
			command.execute(request, response);
			
			response.setContentType("text/plain; charset=utf-8");
			response.getWriter().println(request.getAttribute("cropHpriceYieldArrayList"));
			return;
		}else if(com.equals("/policySelect.do")) {
			System.out.println("policySelect.do 연결 성공");
			String selectCrop = request.getParameter("selectCrop");
			String selectArea = request.getParameter("selectArea");
			int selectAge = Integer.parseInt(request.getParameter("selectAge"));
			int selectPeriod = Integer.parseInt(request.getParameter("selectPeriod"));
			
			System.out.println("selectCrop : " + selectCrop);
			System.out.println("selectArea : " + selectArea);
			System.out.println("selectAge : " + selectAge);
			System.out.println("selectPeriod : " + selectPeriod);
			
			request.setAttribute("selectCrop", selectCrop);
			request.setAttribute("selectArea", selectArea);
			request.setAttribute("selectAge", selectAge);
			request.setAttribute("selectPeriod", selectPeriod);
			
			command = new FarmPolicyListCommand();
			command.execute(request, response);
			
			response.setContentType("text/plain; charset=utf-8");
			response.getWriter().println(request.getAttribute("policyList"));
			return;
		}else if(com.equals("/operCost.do")) {
			System.out.println("operCost.do 연결 성공");
			String selectCrop = request.getParameter("selectCrop");
			String selectArea = request.getParameter("selectArea");
			
			System.out.println("selectCrop : " + selectCrop);
			System.out.println("selectArea : " + selectArea);
			
			request.setAttribute("selectCrop", selectCrop);
			request.setAttribute("selectArea", selectArea);
			
			command = new FarmOperCostCommand();
			command.execute(request, response);
			
			response.setContentType("text/plain; charset=utf-8");
			response.getWriter().println(request.getAttribute("operCost"));
			return;
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
	
	

}
