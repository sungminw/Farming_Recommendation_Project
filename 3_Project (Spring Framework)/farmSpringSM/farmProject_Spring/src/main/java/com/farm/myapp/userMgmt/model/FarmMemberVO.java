package com.farm.myapp.userMgmt.model;

import java.sql.Timestamp;

public class FarmMemberVO {
	private String id;
	private String pw;
	private String name;
	private String eMail;
	private Timestamp rDate;
	private String ssn;
	private String address;
	
	public FarmMemberVO() {
	}
	
	public FarmMemberVO(String id, String pw, String name, String eMail, String ssn, String address) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.eMail = eMail;
		this.ssn = ssn;
		this.address = address;
	}
	
	public FarmMemberVO(String id, String pw, String name, String eMail, Timestamp rDate, String ssn, String address) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.eMail = eMail;
		this.rDate = rDate;
		this.ssn = ssn;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public Timestamp getrDate() {
		return rDate;
	}
	public void setrDate(Timestamp rDate) {
		this.rDate = rDate;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
