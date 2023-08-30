package com.farm.myapp.sales.service;

import java.util.List;

import com.farm.myapp.sales.model.FarmSalesAreaCropVO;
import com.farm.myapp.sales.model.FarmSalesCropAreaVO;
import com.farm.myapp.sales.model.FarmSalesCropHpriceYieldVO;
import com.farm.myapp.sales.model.FarmSalesCropProfileVO;
import com.farm.myapp.sales.model.FarmSalesCropVO;

public interface IFarmSalesService {
	List<FarmSalesCropVO> getCropList();
	List<FarmSalesCropAreaVO> getCropAreaList(String crop);
	List<FarmSalesCropProfileVO> getCropProfile(String crop);
	List<FarmSalesCropHpriceYieldVO> getCropHpriceYield(String crop);
	List<Integer> getSalesList(String selectCrop);
	int getSalespredict(String selectCrop, String selectArea);
	List<FarmSalesAreaCropVO> getAreaCropList(String area);
}
