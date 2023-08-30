package com.farm.myapp.cost.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.farm.myapp.policy.model.FarmCostPolicyInfoVO;
import com.farm.myapp.policy.model.FarmCostPolicyVO;

public interface IFarmCostRepository {
	List<FarmCostPolicyVO> getPolicyList(@Param("selectCrop") String selectCrop, @Param("selectArea") String selectArea, 
			@Param("selectAge") String selectAge, @Param("selectPeriod") String selectPeriod);
	int getOperCost(@Param("selectCrop") String selectCrop, @Param("selectArea")  String selectArea);
	List<FarmCostPolicyInfoVO>  getPolicyInfo(@Param("selectArea") String selectArea, @Param("selectPolicyName") String selectPolicyName);
}
