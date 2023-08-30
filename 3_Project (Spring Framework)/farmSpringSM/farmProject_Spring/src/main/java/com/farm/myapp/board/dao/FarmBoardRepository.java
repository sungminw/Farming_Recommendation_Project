//package com.farm.myapp.board.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import com.farm.myapp.board.model.FarmBoardVO;
//
//@Repository
//public class FarmBoardRepository implements IFarmBoardRepository{
//
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	public class BoardMapper implements RowMapper<FarmBoardVO>{
//
//		@Override
//		public FarmBoardVO mapRow(ResultSet rs, int count) throws SQLException {
//			FarmBoardVO dto = new FarmBoardVO();
//			dto.setbId(rs.getInt("bId"));
//			dto.setbName(rs.getString("bName"));
//			dto.setbTitle(rs.getString("bTitle"));
//			dto.setbContent(rs.getString("bContent"));
//			dto.setbDate(rs.getTimestamp("bDate"));
//			dto.setbHit(rs.getInt("bHit"));
//			dto.setbGroup(rs.getInt("bGroup"));
//			dto.setbStep(rs.getInt("bStep"));
//			dto.setbIndent(rs.getInt("bIndent"));
//			return dto;
//		}
//	}
//	
//	@Override
//	public void write(FarmBoardVO dto) {
//		String sql = "insert into TURN_TO_FARM_BOARD(bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) values (TURN_TO_FARM_BOARD_seq.nextval, ?, ?, ?, 0, TURN_TO_FARM_BOARD_seq.currval, 0, 0)";
//		jdbcTemplate.update(sql,
//				dto.getbName(),
//				dto.getbTitle(),
//				dto.getbContent()
//		);
//	}
//	
//	@Override
//	public List<FarmBoardVO> list(){
//		String sql = "select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent from TURN_TO_FARM_BOARD order by bGroup desc, bStep asc";
//		
//		return jdbcTemplate.query(sql, new RowMapper<FarmBoardVO>() {
//			@Override
//			public FarmBoardVO mapRow(ResultSet rs, int count) throws SQLException {
//				FarmBoardVO dto = new FarmBoardVO();
//				dto.setbId(rs.getInt("bId"));
//				dto.setbName(rs.getString("bName"));
//				dto.setbTitle(rs.getString("bTitle"));
//				dto.setbContent(rs.getString("bContent"));
//				dto.setbDate(rs.getTimestamp("bDate"));
//				dto.setbHit(rs.getInt("bHit"));
//				dto.setbGroup(rs.getInt("bGroup"));
//				dto.setbStep(rs.getInt("bStep"));
//				dto.setbIndent(rs.getInt("bIndent"));
//				return dto;
//			}
//		});
//	}
//	
//	@Override
//	public FarmBoardVO contentView(String strID){
//		upHit(strID);
//		
//		String sql = "select * from TURN_TO_FARM_BOARD where bId=?";
//		int Id = Integer.parseInt(strID);
//		
//		List<FarmBoardVO> list = jdbcTemplate.query(sql, new Object[] {Id}, new RowMapper<FarmBoardVO>() {
//			@Override
//			public FarmBoardVO mapRow(ResultSet rs, int count) throws SQLException {
//				FarmBoardVO dto = new FarmBoardVO();
//				dto.setbId(rs.getInt("bId"));
//				dto.setbName(rs.getString("bName"));
//				dto.setbTitle(rs.getString("bTitle"));
//				dto.setbContent(rs.getString("bContent"));
//				dto.setbDate(rs.getTimestamp("bDate"));
//				dto.setbHit(rs.getInt("bHit"));
//				dto.setbGroup(rs.getInt("bGroup"));
//				dto.setbStep(rs.getInt("bStep"));
//				dto.setbIndent(rs.getInt("bIndent"));
//				return dto;
//			}
//		});
//		
//		if(!list.isEmpty()) {
//		       return list.get(0);
//		}
//		    
//		return null;
//	}
//	
//	@Override
//	public void modify(FarmBoardVO dto) {
//		String sql = "update TURN_TO_FARM_BOARD set bTitle=?, bContent=? where bId=?";
//		jdbcTemplate.update(sql,
//				dto.getbTitle(),
//				dto.getbContent(),
//				dto.getbId()
//		);
//	}
//	
//	@Override
//	public void delete(FarmBoardVO dto) {
//		String sql = "delete from TURN_TO_FARM_BOARD where bId=?";
//		jdbcTemplate.update(sql,
//				dto.getbId()
//		);
//	}
//	
//	@Override
//	public FarmBoardVO replyView(String strID){
//		
//		String sql = "select * from TURN_TO_FARM_BOARD where bId=?";
//		int Id = Integer.parseInt(strID);
//		
//		List<FarmBoardVO> list = jdbcTemplate.query(sql, new Object[] {Id}, new RowMapper<FarmBoardVO>() {
//			@Override
//			public FarmBoardVO mapRow(ResultSet rs, int count) throws SQLException {
//				FarmBoardVO dto = new FarmBoardVO();
//				dto.setbId(rs.getInt("bId"));
//				dto.setbName(rs.getString("bName"));
//				dto.setbTitle(rs.getString("bTitle"));
//				dto.setbContent(rs.getString("bContent"));
//				dto.setbDate(rs.getTimestamp("bDate"));
//				dto.setbHit(rs.getInt("bHit"));
//				dto.setbGroup(rs.getInt("bGroup"));
//				dto.setbStep(rs.getInt("bStep"));
//				dto.setbIndent(rs.getInt("bIndent"));
//				return dto;
//			}
//		});
//		
//		if(!list.isEmpty()) {
//		       return list.get(0);
//		}
//		    
//		return null;
//	}
//	
//	@Override
//	public void reply(FarmBoardVO dto) {
//		replyShape(Integer.toString(dto.getbGroup()), Integer.toString(dto.getbStep()));
//		
//		String sql = "insert into TURN_TO_FARM_BOARD (bId, bName, bTitle, bContent, bGroup, bStep, bIndent) values (TURN_TO_FARM_BOARD_seq.nextval, ?, ?, ?, ?, ?, ?)";
//		jdbcTemplate.update(sql,
//				dto.getbName(),
//				dto.getbTitle(),
//				dto.getbContent(),
//				dto.getbGroup(),
//				dto.getbStep()+1,
//				dto.getbIndent()+1
//		);
//	}
//	
//	private void upHit(String bId) {
//		String sql = "update TURN_TO_FARM_BOARD set bHit = bHit + 1 where bId = ?";
//		jdbcTemplate.update(sql, bId);
//	}
//	
//	private void replyShape(String strGroup, String strStep) {
//		String sql = "update TURN_TO_FARM_BOARD set bStep = bStep + 1 where bGroup = ? and bStep > ?";
//		int group = Integer.parseInt(strGroup);
//		int step = Integer.parseInt(strStep);
//		jdbcTemplate.update(sql, group, step);
//	}
//	
//	
//}
