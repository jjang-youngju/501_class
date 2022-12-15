package com.dw.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.mapper.BoardMapper;
import com.dw.emp.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	BoardMapper mapper;
	
	public int insertBoard(BoardVO vo) {
		return mapper.insertBoard(vo);
	}
	
	public BoardVO selectBoardFindByBoardNo(int boardNo) {
		return mapper.selectBoardFindByBoardNo(boardNo);
	}
	
	public int updateBoard(BoardVO vo) {
		return mapper.updateBoard(vo);
	}
	
	public int deleteBoard(int boardNo) {
		return mapper.deleteBoard(boardNo);
	}
}
