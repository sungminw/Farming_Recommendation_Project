package com.farm.myapp.profit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.myapp.profit.dao.IFarmProfitRepository;

@Service
public class FarmProfitService implements IFarmProfitService{
	
	@Autowired
	IFarmProfitRepository farmProfitRepository;

	@Override
	public List<Integer> getResult(int salesResult, int costResult, int costPolicy, int totalProfit) {
		return farmProfitRepository.getResult(salesResult, costResult, costPolicy, totalProfit);
	}

}
