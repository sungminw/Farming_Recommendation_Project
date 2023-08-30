package com.farm.myapp.policy.sevrice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.myapp.policy.dao.IFarmPolicyRepository;
import com.farm.myapp.policy.model.FarmCostPolicyInfoVO;
import com.farm.myapp.policy.model.FarmCostPolicyVO;

@Service
public class FarmPolicyService implements IFarmPolicyService{
	
	@Autowired
	IFarmPolicyRepository farmPolicyRepository;

	@Override
	public List<FarmCostPolicyVO> getServicePolicy() {
		return farmPolicyRepository.getServicePolicy();
	}

	@Override
	public List<FarmCostPolicyVO> searchPolicyList(String sigungu, String search) {
		return farmPolicyRepository.searchPolicyList(sigungu, search);
	}

	@Override
	public List<FarmCostPolicyInfoVO> getPolicyDetail(String policySigungu, String policyTitle) {
		return farmPolicyRepository.getPolicyDetail(policySigungu, policyTitle);
	}

}
