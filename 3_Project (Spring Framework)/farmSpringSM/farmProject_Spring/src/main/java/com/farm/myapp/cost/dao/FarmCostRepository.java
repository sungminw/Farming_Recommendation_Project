//package com.farm.myapp.cost.dao;
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
//import com.farm.myapp.policy.model.FarmCostPolicyInfoVO;
//import com.farm.myapp.policy.model.FarmCostPolicyVO;
//
//@Repository
//public class FarmCostRepository implements IFarmCostRepository{
//	
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//
//	//사용자 조건 별 적용 가능한 정부 지원 정책 리스트 검색
//	@Override
//	public List<FarmCostPolicyVO> getPolicyList(String selectCrop, String selectArea, String selectAge, String selectPeriod) {
//		String query = "SELECT area_kor , policy_name, cost FROM policyList WHERE age_up<=? AND ?<=age_down AND period>=? AND area_eng=?";
//		return jdbcTemplate.query(query, new Object[]{selectAge, selectAge, selectPeriod, selectArea}, new RowMapper<FarmCostPolicyVO>(){
//
//			@Override
//			public FarmCostPolicyVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				FarmCostPolicyVO farmCostPolicyVO = new FarmCostPolicyVO();
//				
//				farmCostPolicyVO.setAreaKor(rs.getString("area_kor"));
//				farmCostPolicyVO.setPolicyName(rs.getString("policy_name"));
//				farmCostPolicyVO.setCost(rs.getInt("cost"));
//
//				return farmCostPolicyVO;
//			}
//			
//		});
//	}
//	
//	//농작물과 지역별 연간 소요비용 조회
//	@Override
//	public int getOperCost(String selectCrop, String selectArea) {
//		String query = "SELECT total_cost FROM costEx WHERE crop_eng=? AND area_eng=?";
//		return jdbcTemplate.queryForObject(query, new Object[]{selectCrop, selectArea}, Integer.class);
//	}
//
//	//정책 상세 정보 조회
//	@Override
//	public List<FarmCostPolicyInfoVO>  getPolicyInfo(String selectArea, String selectPolicyName) {
//		System.out.println("getPolicyInfo  연결 성공");
//		String query = "SELECT policy_name, policyTarget, policyCondition, policydocumentation, policySupport, policyPhone " +
//		"FROM policyInfos WHERE area_eng=? AND policy_name=?";
//		return jdbcTemplate.query(query, new Object[]{selectArea, selectPolicyName}, new RowMapper<FarmCostPolicyInfoVO>(){
//
//			@Override
//			public FarmCostPolicyInfoVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				FarmCostPolicyInfoVO farmCostPolicyInfoVO = new FarmCostPolicyInfoVO();
//				
//				farmCostPolicyInfoVO.setPolicyName(rs.getString("policy_name"));
//				farmCostPolicyInfoVO.setPolicyTarget(rs.getString("policyTarget"));
//				farmCostPolicyInfoVO.setPolicyCondition(rs.getString("policyCondition"));
//				farmCostPolicyInfoVO.setPolicyDocumentation(rs.getString("policydocumentation"));
//				farmCostPolicyInfoVO.setPolicySupport(rs.getString("policySupport"));
//				farmCostPolicyInfoVO.setPolicyPhone(rs.getString("policyPhone"));
//
//				return farmCostPolicyInfoVO;
//			}
//			
//		});
//	}
//	
//	
//	
//	
//}
//
