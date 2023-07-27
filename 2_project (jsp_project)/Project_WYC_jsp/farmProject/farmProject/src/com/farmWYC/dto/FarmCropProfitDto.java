package com.farmWYC.dto;

public class FarmCropProfitDto {
	private int year;
	private int revenue;
	private int interept;
	private int pcost;
	private int dcost;
	private int temp;
	private int rain;
	private int sun;
	private int insolation;
	private int hprice;
	private int gdp;
	private int area;
	private int yield;
	
	public FarmCropProfitDto() {
	}
	
	public FarmCropProfitDto(int interept, int pcost, int dcost, int temp, int rain, int sun, int insolation, int hprice, int gdp, int area, int yield) {
		this.interept = interept;
		this.pcost = pcost;
		this.dcost = dcost;
		this.temp = temp;
		this.rain = rain;
		this.sun = sun;
		this.insolation = insolation;
		this.hprice = hprice;
		this.gdp = gdp;
		this.area = area;
		this.yield = yield;
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	public int getInterept() {
		return interept;
	}

	public void setInterept(int interept) {
		this.interept = interept;
	}

	public int getPcost() {
		return pcost;
	}

	public void setPcost(int pcost) {
		this.pcost = pcost;
	}

	public int getDcost() {
		return dcost;
	}

	public void setDcost(int dcost) {
		this.dcost = dcost;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getRain() {
		return rain;
	}

	public void setRain(int rain) {
		this.rain = rain;
	}

	public int getSun() {
		return sun;
	}

	public void setSun(int sun) {
		this.sun = sun;
	}

	public int getInsolation() {
		return insolation;
	}

	public void setInsolation(int insolation) {
		this.insolation = insolation;
	}

	public int getHprice() {
		return hprice;
	}

	public void setHprice(int hprice) {
		this.hprice = hprice;
	}

	public int getGdp() {
		return gdp;
	}

	public void setGdp(int gdp) {
		this.gdp = gdp;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getYield() {
		return yield;
	}

	public void setYield(int yield) {
		this.yield = yield;
	}

	
	
	
	
}
