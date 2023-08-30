package com.farm.myapp.cost.service;

import java.util.List;

import com.farm.myapp.policy.model.FarmCostPolicyInfoVO;
import com.farm.myapp.policy.model.FarmCostPolicyVO;

public interface IFarmCostService {
	List<FarmCostPolicyVO> getPolicyList(String selectCrop, String  selectArea, String selectAge, String selectPeriod);
	int getOperCost(String selectCrop, String selectArea);
	List<FarmCostPolicyInfoVO>  getPolicyInfo(String selectArea, String selectPolicyName);
}
