package com.farm.myapp.profit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class FarmProfitRepository implements IFarmProfitRepository{

	@Override
	public List<Integer> getResult(int salesResult, int costResult, int costPolicy, int totalProfit) {
		return null;
	}

}
