//package com.farm.myapp.sales.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import com.farm.myapp.sales.model.FarmSalesCropAreaVO;
//import com.farm.myapp.sales.model.FarmSalesCropHpriceYieldVO;
//import com.farm.myapp.sales.model.FarmSalesCropProfileVO;
//import com.farm.myapp.sales.model.FarmSalesCropVO;
//import com.farm.myapp.sales.model.FarmSalesAreaCropVO;
//
//@Repository
//public class FarmsalesRepository implements IFarmsalesRepository{
//	
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//
//	//재배 가능 농작물 리스트 조회
//	@Override
//	public List<FarmSalesCropVO> getCropList() {
//		System.out.println("FarmsalesRepository getCropList 연결 성공");
//		String query = "SELECT * FROM cropList ORDER BY crop_name";
//		return jdbcTemplate.query(query, new RowMapper<FarmSalesCropVO>() {
//
//			@Override
//			public FarmSalesCropVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				FarmSalesCropVO farmSalesCropVO = new FarmSalesCropVO();
//				
//				farmSalesCropVO.setCropNum(rs.getInt("crop_num"));
//				farmSalesCropVO.setCropName(rs.getString("crop_name"));
//				farmSalesCropVO.setCropEng(rs.getString("crop_eng"));
//				
//				return farmSalesCropVO;
//			}
//			
//		});
//	}
//
//	//선택한 농작물 재배 가능 지역 조회
//	@Override
//	public List<FarmSalesCropAreaVO> getCropAreaList(String crop) {
//		System.out.println("FarmsalesRepository getCropAreaList 연결 성공 + selectedCrop : " + crop);
//		String query = "SELECT * FROM area_Crops WHERE crop_eng=? ORDER BY area_name";
//		return jdbcTemplate.query(query, new Object[]{crop}, new RowMapper<FarmSalesCropAreaVO>(){
//
//			@Override
//			public FarmSalesCropAreaVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				FarmSalesCropAreaVO farmSalesCropAreaVO = new FarmSalesCropAreaVO();
//				
//				farmSalesCropAreaVO.setAreaEng(rs.getString("area_eng"));
//				farmSalesCropAreaVO.setAreaName(rs.getString("area_name"));
//				farmSalesCropAreaVO.setCropName(rs.getString("crop_name"));
//				farmSalesCropAreaVO.setCropEng(rs.getString("crop_eng"));
//				
//				return farmSalesCropAreaVO;
//			}
//			
//		});
//		
//	}
//
//	//농작물 요약 정보 조회
//	@Override
//	public List<FarmSalesCropProfileVO> getCropProfile(String crop) {
//		System.out.println("FarmsalesRepository getCropProfile 연결 성공 + selectedCrop : " + crop);
//		String query = "SELECT * FROM crop_profile WHERE cropEng=?";
//		return jdbcTemplate.query(query, new Object[]{crop}, new RowMapper<FarmSalesCropProfileVO>(){
//
//			@Override
//			public FarmSalesCropProfileVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				FarmSalesCropProfileVO farmSalesCropProfile = new FarmSalesCropProfileVO();
//				
//				farmSalesCropProfile.setCropEng(rs.getString("cropEng"));
//				farmSalesCropProfile.setCropName(rs.getString("cropName"));
//				farmSalesCropProfile.setCropVariety(rs.getString("cropVariety"));
//				farmSalesCropProfile.setCropGrow(rs.getString("cropGrow"));
//				farmSalesCropProfile.setCropGather(rs.getString("cropGather"));
//				farmSalesCropProfile.setCropSpecial(rs.getString("cropSpecial"));
//				
//				return farmSalesCropProfile;
//			}
//			
//		});
//	}
//
//	//최근 5년간 농작물 경매 단가 및 생산량 조회
//	@Override
//	public List<FarmSalesCropHpriceYieldVO> getCropHpriceYield(String crop) {
//		System.out.println("FarmsalesRepository getCropHpriceYield 연결 성공 + selectedCrop : " + crop);
//		String query = "SELECT year, hPrice, yield FROM "+crop+"_matrix WHERE year IN (2017, 2018, 2019, 2020, 2021)";
//		return jdbcTemplate.query(query, new RowMapper<FarmSalesCropHpriceYieldVO>(){
//
//			@Override
//			public FarmSalesCropHpriceYieldVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				FarmSalesCropHpriceYieldVO farmSalesCropHpriceYieldVO = new FarmSalesCropHpriceYieldVO();
//				
//				farmSalesCropHpriceYieldVO.setYear(rs.getInt("year"));
//				farmSalesCropHpriceYieldVO.sethPrice(rs.getInt("hPrice"));
//				farmSalesCropHpriceYieldVO.setYield(rs.getInt("yield"));
//				
//				return farmSalesCropHpriceYieldVO;
//			}
//			
//		});
//	}
//
//	//최근 20년간 농작물 매출액 조회
//	@Override
//	public List<Integer> getSalesList(String selectCrop) {
//		System.out.println("FarmsalesRepository getSalesList 연결 성공 + selectedCrop : " +selectCrop);
//		String query = "SELECT revenue FROM "+selectCrop+"_matrix ORDER BY year";
//		return jdbcTemplate.query(query, new RowMapper<Integer>(){
//
//			@Override
//			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
//				int revenue = rs.getInt("revenue");
//				
//				return revenue;
//			}
//		});	
//	}
//
//	//내년 예상 매출액 조회
//	@Override
//	public int getSalespredict(String selectCrop, String selectArea) {
//		System.out.println("FarmsalesRepository getSalespredict 연결 성공 + selectedCrop : " +selectCrop+ ", selectArea : " + selectArea);
//		String query = "SELECT revenue FROM salesCostInfo WHERE crop_eng=? AND area_eng=?";
//		return jdbcTemplate.queryForObject(query, new Object[]{selectCrop, selectArea}, Integer.class);
//	}
//	
//	//지역 선택 시 재배 가능한 농작물 리스트 조회
//	@Override
//	public List<FarmSalesAreaCropVO> getAreaCropList(String area) {
//		System.out.println("getAreaCropList 연결 성공 area : " + area);
//		String query = "SELECT * FROM area_crops WHERE area_eng=?";
//		return jdbcTemplate.query(query, new Object[]{area}, new RowMapper<FarmSalesAreaCropVO>() {
//
//			@Override
//			public FarmSalesAreaCropVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				FarmSalesAreaCropVO farmSalesAreaCropVO = new FarmSalesAreaCropVO();
//				
//				farmSalesAreaCropVO.setAreaEng(rs.getString("area_eng"));
//				farmSalesAreaCropVO.setAreaName(rs.getString("area_name"));
//				farmSalesAreaCropVO.setCropName(rs.getString("crop_name"));
//				farmSalesAreaCropVO.setCropEng(rs.getString("crop_eng"));
//				
//				return farmSalesAreaCropVO;
//			}
//			
//		});
//	}
//
//}
