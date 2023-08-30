package com.farm.myapp.sales.model;

public class FarmSalesCropHpriceYieldVO {
	private int year;
	private int hPrice;
	private int yield;
	
	public FarmSalesCropHpriceYieldVO() {
	}
	
	public FarmSalesCropHpriceYieldVO(int year, int hPrice, int yield) {
		this.year = year;
		this.hPrice = hPrice;
		this.yield = yield;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int gethPrice() {
		return hPrice;
	}
	public void sethPrice(int hPrice) {
		this.hPrice = hPrice;
	}
	public int getYield() {
		return yield;
	}
	public void setYield(int yield) {
		this.yield = yield;
	}
	
	
}
