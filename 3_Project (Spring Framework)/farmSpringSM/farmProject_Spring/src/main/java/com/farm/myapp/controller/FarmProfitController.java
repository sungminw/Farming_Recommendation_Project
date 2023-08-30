package com.farm.myapp.controller;

import java.util.List;

//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.farm.myapp.profit.service.IFarmProfitService;
//import com.farm.myapp.sales.model.FarmSalesCropVO;

@Controller
public class FarmProfitController {
	@Autowired
	IFarmProfitService farmProfitService;
	
	@GetMapping(value="/serviceProfit.do")
	public String serviceProfit() {
		return "serviceProfit";
	}
	
	@GetMapping(value="/result.do")
	public @ResponseBody List<Integer> getResult(@RequestParam("salesResult")int salesResult, @RequestParam("costResult")int costResult, @RequestParam("costPolicy")int costPolicy, @RequestParam("totalProfit")int totalProfit, Model model) {

		System.out.println("salesResult : " + salesResult);
		System.out.println("costResult : " + costResult);
		System.out.println("costPolicy : " + costPolicy);
		System.out.println("totalProfit : " + totalProfit);
		
		List<Integer> totalResult = farmProfitService.getResult(salesResult, costResult, costPolicy, totalProfit);

		return null;
	}
}