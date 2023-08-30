package com.farm.myapp.sales.model;


public class FarmSalesPredictVO {
	private double interept;
	private double year;
	private double pcost;
	private double dcost;
	private double temp;
	private double rain;
	private double sun;
	private double insolation;
	private double hprice;
	private double gdp;
	private double area;
	private double yield;
	private double revenue;
	
	public FarmSalesPredictVO() {
	}
	
	public FarmSalesPredictVO(double year, double pcost, double dcost, double temp, double rain, double sun, double insolation, double hprice, double gdp, double area, double yield, double revenue) {
		this.year = year;
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
		this.revenue = revenue;
	}
	
	public FarmSalesPredictVO(double interept, double year, double pcost, double dcost, double temp, double rain, double sun, double insolation, double hprice, double gdp, double area, double yield,  double revenue) {
		this.interept = interept;
		this.year = year;
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
		this.revenue = revenue;
	}
	
	
	public double getInterept() {
		return interept;
	}

	public void setInterept(double interept) {
		this.interept = interept;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	public double getPcost() {
		return pcost;
	}

	public void setPcost(double pcost) {
		this.pcost = pcost;
	}

	public double getDcost() {
		return dcost;
	}

	public void setDcost(double dcost) {
		this.dcost = dcost;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getRain() {
		return rain;
	}

	public void setRain(double rain) {
		this.rain = rain;
	}

	public double getSun() {
		return sun;
	}

	public void setSun(double sun) {
		this.sun = sun;
	}

	public double getInsolation() {
		return insolation;
	}

	public void setInsolation(double insolation) {
		this.insolation = insolation;
	}

	public double getHprice() {
		return hprice;
	}

	public void setHprice(double hprice) {
		this.hprice = hprice;
	}

	public double getGdp() {
		return gdp;
	}

	public void setGdp(double gdp) {
		this.gdp = gdp;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getYield() {
		return yield;
	}

	public void setYield(double yield) {
		this.yield = yield;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

}
