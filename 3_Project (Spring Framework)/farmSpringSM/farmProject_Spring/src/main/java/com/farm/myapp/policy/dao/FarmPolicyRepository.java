//package com.farm.myapp.policy.dao;
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
//public class FarmPolicyRepository implements IFarmPolicyRepository{
//
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	//정부 지원 정책 확인 페이지로 이동 및 모든 정책 리스트 제공
//	@Override
//	public List<FarmCostPolicyVO> getServicePolicy() {
//		System.out.println("getServicePolicy 연결 성공");
//		String query = "SELECT city, area_kor, policy_name FROM policyList";
//		return jdbcTemplate.query(query, new RowMapper<FarmCostPolicyVO>() {
//
//			@Override
//			public FarmCostPolicyVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				FarmCostPolicyVO farmCostPolicy = new FarmCostPolicyVO();
//				farmCostPolicy.setCity(rs.getString("city"));
//				farmCostPolicy.setAreaKor(rs.getString("area_kor"));
//				farmCostPolicy.setPolicyName(rs.getString("policy_name"));
//				return farmCostPolicy;
//			}
//			
//		});
//	}
//
//	//사용자가 원하는 지역 및 사업명을 포함한 정책 리스트 제공
//	@Override
//	public List<FarmCostPolicyVO> searchPolicyList(String sigungu, String search) {
//		System.out.println("searchPolicyList 연결 성공 : " + sigungu +" : " + search);
//		String query = null;
//		if(sigungu != null && search.equals("")) {
//			query = "SELECT city, area_kor, policy_name FROM policyList WHERE area_eng='"+sigungu+"'";		
//		}
//		if(sigungu.equals("default") && !search.equals("")){
//			query = "SELECT city, area_kor, policy_name FROM policyList WHERE policy_name LIKE '%"+search+"%'";	
//		}
//		if(!sigungu.equals("default") && !search.equals("")) {
//			query = "SELECT city, area_kor, policy_name FROM policyList WHERE area_eng='"+sigungu+"' AND policy_name LIKE '%"+search+"%'";
//		}
//		System.out.println("query : " + query);
//		return jdbcTemplate.query(query, new RowMapper<FarmCostPolicyVO>() {
//
//			@Override
//			public FarmCostPolicyVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				FarmCostPolicyVO farmCostPolicy = new FarmCostPolicyVO();
//				farmCostPolicy.setCity(rs.getString("city"));
//				farmCostPolicy.setAreaKor(rs.getString("area_kor"));
//				farmCostPolicy.setPolicyName(rs.getString("policy_name"));
//				return farmCostPolicy;
//			}
//			
//		});
//	}
//
//	//정책 상세정보 제공
//	@Override
//	public List<FarmCostPolicyInfoVO> getPolicyDetail(String policySigungu, String policyTitle) {
//		System.out.println("getPolicyInfo  연결 성공");
//		String query = "SELECT policy_name, policyTarget, policyCondition, policydocumentation, policySupport, policyPhone " +
//		"FROM policyInfos WHERE area_kor=? AND policy_name=?";
//		return jdbcTemplate.query(query, new Object[]{policySigungu, policyTitle}, new RowMapper<FarmCostPolicyInfoVO>(){
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
//}
