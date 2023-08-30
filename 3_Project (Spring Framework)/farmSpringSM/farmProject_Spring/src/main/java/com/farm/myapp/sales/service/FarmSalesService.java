package com.farm.myapp.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.myapp.sales.dao.IFarmsalesRepository;
import com.farm.myapp.sales.model.FarmSalesAreaCropVO;
import com.farm.myapp.sales.model.FarmSalesCropAreaVO;
import com.farm.myapp.sales.model.FarmSalesCropHpriceYieldVO;
import com.farm.myapp.sales.model.FarmSalesCropProfileVO;
import com.farm.myapp.sales.model.FarmSalesCropVO;
import com.farm.myapp.sales.model.FarmSalesPredictVO;

@Service
public class FarmSalesService implements IFarmSalesService{
	
	@Autowired
	IFarmsalesRepository farmsalesRepository;
	
	//내년 예상 매출 분석
	@Override
	public int getSalespredict(String selectCrop, String selectArea) {
		//crop_matrix에서 작년 변수 값을 가져오는 쿼리
		FarmSalesPredictVO salesBrfore =  farmsalesRepository.getSalseBefore(selectCrop, selectArea);
		
		//cropPredict에서 농작물별 회귀 모델 가져오는 코드
		FarmSalesPredictVO predictVO =  farmsalesRepository.getSalespredict(selectCrop, selectArea);

		//계산 후 매출 값 return
		double predict = predictVO.getInterept() + (predictVO.getPcost()*salesBrfore.getPcost()) + (predictVO.getDcost()*salesBrfore.getDcost()) + 
				(predictVO.getHprice()*salesBrfore.getHprice()) + (predictVO.getTemp()*salesBrfore.getTemp()) + (predictVO.getRain()*salesBrfore.getRain()) +
				(predictVO.getSun()*salesBrfore.getSun()) + (predictVO.getInsolation()*salesBrfore.getInsolation()) +  (predictVO.getGdp()*salesBrfore.getGdp()) +  
				(predictVO.getArea()*salesBrfore.getArea()) + (predictVO.getYield()*salesBrfore.getYield());
		
		return (int)predict;
	}
	
	@Override
	public List<FarmSalesCropVO> getCropList() {
		return farmsalesRepository.getCropList();
	}

	@Override
	public List<FarmSalesCropAreaVO> getCropAreaList(String crop) {
		return farmsalesRepository.getCropAreaList(crop);
	}

	@Override
	public List<FarmSalesCropProfileVO> getCropProfile(String crop) {
		return farmsalesRepository.getCropProfile(crop);
	}

	@Override
	public List<FarmSalesCropHpriceYieldVO> getCropHpriceYield(String crop) {
		return farmsalesRepository.getCropHpriceYield(crop);
	}

	@Override
	public List<Integer> getSalesList(String selectCrop) {
		return farmsalesRepository.getSalesList(selectCrop);
	}

//	@Override
//	public int getSalespredict(String selectCrop, String selectArea) {
//		return farmsalesRepository.getSalespredict(selectCrop, selectArea);
//	}
//	

	
	@Override
	public List<FarmSalesAreaCropVO> getAreaCropList(String area) {
		return farmsalesRepository.getAreaCropList(area);
	}

	
}
