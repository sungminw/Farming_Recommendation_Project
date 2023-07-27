package com.farmWYC.dto;

public class FarmHistorySaveDto {
	private int pNum;
	private String wycId;
	private String selectCrop;
	private String selectCropKor;
	private int salesResult;
	
	public FarmHistorySaveDto() {
	}
	
	public FarmHistorySaveDto(String wycId, String selectCrop, String selectCropKor, int salesResult) {
		this.wycId = wycId;
		this.selectCrop = selectCrop;
		this.selectCropKor = selectCropKor;
		this.salesResult = salesResult;
	}

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public String getWycId() {
		return wycId;
	}

	public void setWycId(String wycId) {
		this.wycId = wycId;
	}

	public String getSelectCrop() {
		return selectCrop;
	}

	public void setSelectCrop(String selectCrop) {
		this.selectCrop = selectCrop;
	}

	public String getSelectCropKor() {
		return selectCropKor;
	}

	public void setSelectCropKor(String selectCropKor) {
		this.selectCropKor = selectCropKor;
	}

	public int getSalesResult() {
		return salesResult;
	}

	public void setSalesResult(int salesResult) {
		this.salesResult = salesResult;
	}
	
	
}
