package com.farm.myapp.sales.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.farm.myapp.sales.model.FarmSalesAreaCropVO;
import com.farm.myapp.sales.model.FarmSalesCropAreaVO;
import com.farm.myapp.sales.model.FarmSalesCropHpriceYieldVO;
import com.farm.myapp.sales.model.FarmSalesCropProfileVO;
import com.farm.myapp.sales.model.FarmSalesCropVO;
import com.farm.myapp.sales.model.FarmSalesPredictVO;

public interface IFarmsalesRepository {
	List<FarmSalesCropVO> getCropList();
	List<FarmSalesCropAreaVO> getCropAreaList(@Param("crop") String crop);
	List<FarmSalesCropProfileVO> getCropProfile(@Param("crop") String crop);
	List<FarmSalesCropHpriceYieldVO> getCropHpriceYield(@Param("crop") String crop);
	List<Integer> getSalesList(@Param("selectCrop") String selectCrop);
	FarmSalesPredictVO getSalseBefore(@Param("selectCrop") String selectCrop, @Param("selectArea") String selectArea);		//2021년도 정보
	FarmSalesPredictVO getSalespredict(@Param("selectCrop") String selectCrop, @Param("selectArea") String selectArea);
	List<FarmSalesAreaCropVO> getAreaCropList(@Param("area") String area);
}
