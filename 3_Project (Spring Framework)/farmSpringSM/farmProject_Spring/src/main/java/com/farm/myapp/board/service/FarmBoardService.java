package com.farm.myapp.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.myapp.board.dao.IFarmBoardRepository;
import com.farm.myapp.board.model.FarmBoardVO;

@Service
public class FarmBoardService implements IFarmBoardService{
	
	@Autowired
	IFarmBoardRepository farmBoardRepository;

	@Override
	public void write(FarmBoardVO dto) {
		farmBoardRepository.write(dto);
	}

	@Override
	public List<FarmBoardVO> list() {
		return farmBoardRepository.list();
	}

	@Override
	public void upHit(String strID) {
		farmBoardRepository.upHit(strID);
	}
	
	@Override
	public FarmBoardVO contentView(int bId) {
		return farmBoardRepository.contentView(bId);
	}

	@Override
	public void modify(FarmBoardVO dto) {
		farmBoardRepository.modify(dto);
	}

	@Override
	public void delete(FarmBoardVO dto) {
		farmBoardRepository.delete(dto);
	}

	@Override
	public FarmBoardVO replyView(int strID) {
		return farmBoardRepository.replyView(strID);
	}

	@Override
	public void reply(FarmBoardVO dto) {
		farmBoardRepository.reply(dto);
	}

	@Override
	public void replyShape(String strGroup, String strStep) {
		farmBoardRepository.replyShape(strGroup, strStep);
		
	}



}
