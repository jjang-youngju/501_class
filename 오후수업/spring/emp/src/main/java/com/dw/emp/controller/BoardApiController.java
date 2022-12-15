package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.mapper.BoardMapper;
import com.dw.emp.service.BoardService;
import com.dw.emp.vo.BoardVO;
import com.dw.emp.vo.EmpVO;

@RestController
public class BoardApiController {
	
	@Autowired
	BoardService service;
	
	@Autowired
	BoardMapper boardmapper;
	
	@GetMapping("/api/v1/board")
	public List<BoardVO> callBoard(){
		return boardmapper.selectBoard();
	}
	
	//게시물생성
	@PostMapping("/api/v1/board")
	public int callBoardSave(@RequestBody BoardVO vo) {
		return service.insertBoard(vo);
	}
	
	//게시물 상세조회
	@GetMapping("/api/v1/board/{boardNo}")
	public BoardVO callBoard(@PathVariable int boardNo) {
		return service.selectBoardFindByBoardNo(boardNo);
	}
	
	@PatchMapping("/api/v1/board") // Update == Patch
	public int callBoardUpdate(@RequestBody BoardVO board) {
		return service.updateBoard(board);
	}
	
	@DeleteMapping("/api/v1/board/{boardNo}") // Delete = Delete
	public int callBoardDelete(@PathVariable int boardNo) {
		return service.deleteBoard(boardNo);
	}
	
}
