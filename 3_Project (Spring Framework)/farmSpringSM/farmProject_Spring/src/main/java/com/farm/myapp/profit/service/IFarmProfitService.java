package com.farm.myapp.profit.service;

import java.util.List;

public interface IFarmProfitService {
	List<Integer> getResult(int salesResult, int costResult, int costPolicy, int totalProfit);
}
