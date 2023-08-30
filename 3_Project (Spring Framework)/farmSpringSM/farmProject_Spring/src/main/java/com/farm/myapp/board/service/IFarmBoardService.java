package com.farm.myapp.board.service;

import java.util.List;

import com.farm.myapp.board.model.FarmBoardVO;

public interface IFarmBoardService {
	
	void write(FarmBoardVO dto);
	List<FarmBoardVO> list();
	void upHit(String strID);
	FarmBoardVO contentView(int bId);
	void modify(FarmBoardVO dto);
	void delete(FarmBoardVO dto);
	FarmBoardVO replyView(int strID);
	void reply(FarmBoardVO dto);
	void replyShape(String strGroup, String strStep);
}
