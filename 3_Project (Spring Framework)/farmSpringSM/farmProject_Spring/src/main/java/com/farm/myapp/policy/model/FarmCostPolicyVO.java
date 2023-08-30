package com.farm.myapp.policy.model;

public class FarmCostPolicyVO {
	private int pNum;
	private String city;
	private String areaKor;
	private String areaEng;
	private int ageUp;
	private int ageDown;
	private int period;
	private int cost;
	private String policyName;
	
	public FarmCostPolicyVO() {
	}
	
	public FarmCostPolicyVO(String city, String areaKor, String policyName) {
		this.city = city;
		this.areaKor = areaKor;
		this.policyName = policyName;
	}
	
	public FarmCostPolicyVO(String areaKor, String policyName, int cost) {
		this.areaKor = areaKor;
		this.policyName = policyName;
		this.cost = cost;
	}
	
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAreaKor() {
		return areaKor;
	}
	public void setAreaKor(String areaKor) {
		this.areaKor = areaKor;
	}
	public String getAreaEng() {
		return areaEng;
	}
	public void setAreaEng(String areaEng) {
		this.areaEng = areaEng;
	}
	public int getAgeUp() {
		return ageUp;
	}
	public void setAgeUp(int ageUp) {
		this.ageUp = ageUp;
	}
	public int getAgeDown() {
		return ageDown;
	}
	public void setAgeDown(int ageDown) {
		this.ageDown = ageDown;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	
	
	
}
