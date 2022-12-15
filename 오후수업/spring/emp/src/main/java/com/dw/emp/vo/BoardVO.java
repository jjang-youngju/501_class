package com.dw.emp.vo;

import lombok.Data;

@Data
public class BoardVO {
	private int board_no;
	private int boardNo;
	private String title;
	private String contents;
	private String writer;
	private String create_at;
	private int board_count;
	
	
}
