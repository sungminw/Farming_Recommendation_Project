package com.farm.myapp.policy.model;

public class FarmCostPolicyInfoVO {
	private int pNum;
	private String city;
	private String areaKor;
	private String areaEng;
	private String policyName;
	private String policyTarget;
//	private String policyContent;
	private String policyCondition;
	private String policyDocumentation;
	private String policySupport;
	private String policyPhone;
	
	public FarmCostPolicyInfoVO() {
	}
	
	public FarmCostPolicyInfoVO(String policyName, String policyTarget, String policyCondition, String policyDocumentation, String policySupport, String policyPhone) {
		this.policyName = policyName;
		this.policyTarget = policyTarget;
//		this.policyContent = policyContent;
		this.policyCondition = policyCondition;
		this.policyDocumentation = policyDocumentation;
		this.policySupport = policySupport;
		this.policyPhone = policyPhone;
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
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyTarget() {
		return policyTarget;
	}
	public void setPolicyTarget(String policyTarget) {
		this.policyTarget = policyTarget;
	}
//	public String getPolicyContent() {
//		return policyContent;
//	}
//	public void setPolicyContent(String policyContent) {
//		this.policyContent = policyContent;
//	}
	public String getPolicyCondition() {
		return policyCondition;
	}
	public void setPolicyCondition(String policyCondition) {
		this.policyCondition = policyCondition;
	}
	public String getPolicyDocumentation() {
		return policyDocumentation;
	}
	public void setPolicyDocumentation(String policyDocumentation) {
		this.policyDocumentation = policyDocumentation;
	}
	public String getPolicySupport() {
		return policySupport;
	}
	public void setPolicySupport(String policySupport) {
		this.policySupport = policySupport;
	}
	public String getPolicyPhone() {
		return policyPhone;
	}
	public void setPolicyPhone(String policyPhone) {
		this.policyPhone = policyPhone;
	}
	
	
	
}
