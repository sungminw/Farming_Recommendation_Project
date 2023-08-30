package com.farm.myapp.policy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.farm.myapp.policy.model.FarmCostPolicyInfoVO;
import com.farm.myapp.policy.model.FarmCostPolicyVO;

public interface IFarmPolicyRepository {
	List<FarmCostPolicyVO> getServicePolicy();
	List<FarmCostPolicyVO> searchPolicyList(@Param("sigungu") String sigungu, @Param("search") String search);
	List<FarmCostPolicyInfoVO> getPolicyDetail(@Param("policySigungu") String policySigungu, @Param("policyTitle") String  policyTitle);
}
