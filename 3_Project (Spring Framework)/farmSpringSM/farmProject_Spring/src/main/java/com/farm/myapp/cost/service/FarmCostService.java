package com.farm.myapp.cost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.myapp.cost.dao.IFarmCostRepository;
import com.farm.myapp.policy.model.FarmCostPolicyInfoVO;
import com.farm.myapp.policy.model.FarmCostPolicyVO;

@Service
public class FarmCostService implements IFarmCostService{
	
	@Autowired
	IFarmCostRepository farmCostRepository;

	@Override
	public List<FarmCostPolicyVO> getPolicyList(String selectCrop, String selectArea, String selectAge, String selectPeriod) {
		return farmCostRepository.getPolicyList(selectCrop, selectArea, selectAge, selectPeriod);
	}

	@Override
	public int getOperCost(String selectCrop, String selectArea) {
		return farmCostRepository.getOperCost(selectCrop, selectArea);
	}

	@Override
	public List<FarmCostPolicyInfoVO>  getPolicyInfo(String selectArea, String selectPolicyName) {
		return farmCostRepository.getPolicyInfo(selectArea, selectPolicyName);
	}

}
