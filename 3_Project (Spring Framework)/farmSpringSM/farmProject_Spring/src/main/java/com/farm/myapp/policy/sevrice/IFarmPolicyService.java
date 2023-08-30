package com.farm.myapp.policy.sevrice;

import java.util.List;

import com.farm.myapp.policy.model.FarmCostPolicyInfoVO;
import com.farm.myapp.policy.model.FarmCostPolicyVO;

public interface IFarmPolicyService {
	List<FarmCostPolicyVO> getServicePolicy();
	List<FarmCostPolicyVO> searchPolicyList(String sigungu, String search);
	List<FarmCostPolicyInfoVO> getPolicyDetail(String policySigungu, String  policyTitle);
}
