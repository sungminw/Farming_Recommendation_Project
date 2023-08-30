package com.farm.myapp.sales.model;

public class FarmSalesCropInfo {
	private  String crop_kor;
	private String crop_eng;
	private String area_kor;	
	private String area_eng;
	private int revenue;
	
	public String getCrop_kor() {
		return crop_kor;
	}
	public void setCrop_kor(String crop_kor) {
		this.crop_kor = crop_kor;
	}
	public String getCrop_eng() {
		return crop_eng;
	}
	public void setCrop_eng(String crop_eng) {
		this.crop_eng = crop_eng;
	}
	public String getArea_kor() {
		return area_kor;
	}
	public void setArea_kor(String area_kor) {
		this.area_kor = area_kor;
	}
	public String getArea_eng() {
		return area_eng;
	}
	public void setArea_eng(String area_eng) {
		this.area_eng = area_eng;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	
}
