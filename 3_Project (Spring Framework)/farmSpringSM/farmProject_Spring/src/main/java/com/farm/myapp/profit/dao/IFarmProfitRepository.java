package com.farm.myapp.profit.dao;

import java.util.List;

public interface IFarmProfitRepository {
	List<Integer> getResult(int salesResult, int costResult, int costPolicy, int totalProfit);
}
