package com.farm.myapp.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

//import org.apache.ibatis.annotations.Param;

import com.farm.myapp.board.model.FarmBoardVO;

public interface IFarmBoardRepository {

	void write(FarmBoardVO dto);
	List<FarmBoardVO> list();
	void upHit(@Param("strID")String strID);
	FarmBoardVO contentView(@Param("bId") int bId);
	void modify(FarmBoardVO dto);
	void delete(FarmBoardVO dto);
	FarmBoardVO replyView(@Param("strID") int strID);
	void reply(FarmBoardVO dto);
	void replyShape(@Param("strGroup") String strGroup, @Param("strStep") String strStep);
}
