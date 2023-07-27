package com.farmWYC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.farmWYC.dto.FarmCropDto;
import com.farmWYC.dto.FarmPolicyListDto;

public class FarmCostDao {
	DataSource dataSource;
	
	public FarmCostDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			System.out.println("DataSource 가져옴");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<FarmPolicyListDto> getPolicyList(String selectArea, int selectAge, int selectPeriod){
		System.out.println("getPolictList() 실행");
		
		ArrayList<FarmPolicyListDto> dtos = new ArrayList<FarmPolicyListDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT policy_name, cost FROM policyEx WHERE age_up<? AND ?<age_down AND period < ? AND area_eng=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, selectAge);
			preparedStatement.setInt(2, selectAge);
			preparedStatement.setInt(3, selectPeriod);
			preparedStatement.setString(4, selectArea);
			
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String policy_name = resultSet.getString("policy_name");
				int cost = resultSet.getInt("cost");
				
				FarmPolicyListDto dto = new FarmPolicyListDto(policy_name, cost);
				dtos.add(dto);
			}
		} catch (Exception e) {
			System.out.println("getPolictList() 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dtos;
	}
	
	
	public int getOperCost(String selectCrop, String selectArea) {
		System.out.println("getOperCost() 실행");
		System.out.println("selectCrop 실행" + selectCrop);
		System.out.println("selectArea 실행" + selectArea);
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		int operCost = 0;
		
		try {
			connection = dataSource.getConnection();
			
			
			String query = "SELECT * FROM costEx WHERE crop_eng=? AND area_eng=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, selectCrop);
			preparedStatement.setString(2, selectArea);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				operCost = resultSet.getInt("total_cost");
				System.out.println("getOperCost : "+ operCost);
			}
			
		} catch (Exception e) {
			System.out.println("getPolictList() 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return operCost;
	}
	
	
	
	public void CostHistorySave(String wycId, String selectCrop, String selectArea, String selectCropKor,int costpolicy, int costResult) {
		System.out.println("CostHistorySave() 실행");
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "INSERT INTO costHistory VALUES (costHistory_seq.nextval,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, wycId);
			preparedStatement.setString(2, selectCrop);
			preparedStatement.setString(3, selectArea);
			preparedStatement.setString(4, selectCropKor);
			preparedStatement.setInt(5, costpolicy);
			preparedStatement.setInt(6, costResult);
			int rn = preparedStatement.executeUpdate();
				
		} catch (Exception e) {
			System.out.println("CostHistorySave() 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	public ArrayList<String> getPolicyInfo(String selectPolicyName) {
		System.out.println("getPolicyInfo() 실행");
		System.out.println("selectPolicyName : " + selectPolicyName);
		
		ArrayList<String> policyInfo = new ArrayList<String>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT * FROM damyangPolicyEX WHERE policyName=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, selectPolicyName.trim());
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				String policyTarget = resultSet.getString("policyTarget");
				String policyContent = resultSet.getString("policyContent");
				String policyCondition = resultSet.getString("policyCondition");
				String policyDocumentation = resultSet.getString("policyDocumentation");
				String policySupport = resultSet.getString("policySupport");
				String policyPhone = resultSet.getString("policyPhone");
				
				policyInfo.add(policyTarget);
				policyInfo.add(policyContent);
				policyInfo.add(policyCondition);
				policyInfo.add(policyDocumentation);
				policyInfo.add(policySupport);
				policyInfo.add(policyPhone);
			}
				
		} catch (Exception e) {
			System.out.println("getPolicyInfo() 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return policyInfo;
	}
}
