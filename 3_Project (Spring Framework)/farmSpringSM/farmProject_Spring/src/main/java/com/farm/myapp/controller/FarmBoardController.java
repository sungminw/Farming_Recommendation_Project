package com.farm.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.farm.myapp.board.model.FarmBoardVO;
import com.farm.myapp.board.service.IFarmBoardService;

import sun.invoke.empty.Empty;

@Controller
public class FarmBoardController {
	
	@Autowired
	IFarmBoardService boardService;
	
//	@RequestMapping(value="/") // 게시글 작성화면으로 이동
//	public String festival(Model model) {
//		return "board/boardList";
//	}
	
//	@RequestMapping(value="/success.do") // 게시글 리스트 출력
//	public String success(Model model) {
//		List<BoardDto> list = boardService.list();
//		model.addAttribute("list", list);
//		return "/board/boardList";
//	}애넨 사용 안하는거임
	
	@GetMapping(value= {"/list.do", "/success.do"}) // 게시글 리스트 출력
	public String list(Model model) {
		List<FarmBoardVO> list = boardService.list();
		model.addAttribute("list", list);
		return "board/boardList";
	}
	
//	@GetMapping(value= "/getList.do") // 게시글 리스트 출력
//	public @ResponseBody List<FarmBoardVO> getList(Model model) {
//		List<FarmBoardVO> list = boardService.list();
////		model.addAttribute("list", list);
//		return list;
//	}
	
	@GetMapping(value="/write_view.do") // 게시글 작성화면으로 이동
	public String write_view(Model model) {
		return "board/boardWrite";
	}
	
	@PostMapping(value="/write.do") // 게시글 입력 후 입력버튼 누르면 리스트로 이동
	public String write(FarmBoardVO dto, Model model) {
		boardService.write(dto);
		return "redirect:/list.do";
	}
	

	
	@GetMapping(value="/content_view.do") // 게시글 세부 정보화면으로 이동
	public String content_view(@RequestParam(value="bId", required=false, defaultValue="0") String strID, Model model) {
		boardService.upHit(strID); // 이런식으로 하면 될듯함
		int bId = Integer.parseInt(strID);
		FarmBoardVO list = boardService.contentView(bId);
		model.addAttribute("content_view", list);
//		if(!list.isEmpty()) {
//	       return list.get(0);
//	}
		return "board/boardContent";
	}
	
	@GetMapping(value="/modifyBoard.do") // 게시글 세부 정보화면에서 수정버튼을 누르면 수정페이지로 이동
	public String modifyBoard(@RequestParam(value="bId", required=false, defaultValue="0") int strID, Model model) {
		FarmBoardVO list = boardService.contentView(strID);
		model.addAttribute("content_view", list);
		return "board/boardModify";
	}
	
	@PostMapping(value="/modify.do") // 수정내용 작성하고 수정버튼 누르면 수정되어 리스트로 이동
	public String modify(FarmBoardVO dto, Model model) {
		boardService.modify(dto);
		return "redirect:/list.do";
	}
	
	@GetMapping(value="/delete.do") // 삭제버튼 누르면 삭제되고 리스트로 이동
	public String delete(FarmBoardVO dto, Model model) {
		boardService.delete(dto);
		return "redirect:/list.do";
	}
	
	@GetMapping(value="/reply_view.do") // 게시글 세부 정보화면에서 댓글버튼 누르면 댓글작성 페이지로 이동
	public String reply_view(@RequestParam(value="bId", required=false, defaultValue="0") int strID, Model model) {
//		System.out.println("reply_view : " + strID);
		FarmBoardVO list = boardService.replyView(strID);
		model.addAttribute("reply_view", list);
		System.out.println("list : " + list);
//		System.out.println("list : " + list.get(0));
//		if(!list.isEmpty()) {
//	       return list.get(0);
//	}
		return "board/boardReply";
	}
	
	@PostMapping(value="/reply.do") // 댓글버튼 댓글 입력되고 리스트로 이동
	public String reply(FarmBoardVO dto, Model model) {
		System.out.println(dto.getbGroup() + 100);
		String strGroup = Integer.toString(dto.getbGroup());
		String strStep = Integer.toString(dto.getbStep());
		System.out.println("strGroup : " + strGroup +" : " + strStep);
		boardService.reply(dto);
		boardService.replyShape(strGroup, strStep);
		
		return "redirect:/list.do";
	}
	
	//지역 축제 정보 제공 페이지로 이동
	@GetMapping(value="/festival.do")
	public String festival() {
		return "festival";
	}

}
