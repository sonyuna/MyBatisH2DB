package com.study.springboot.jdbc;

import lombok.Getter;
import lombok.Setter;

//DTO
@Getter
@Setter
public class Board {
	private int num;
	private String writer;
	private String title;
	private String content;
}
