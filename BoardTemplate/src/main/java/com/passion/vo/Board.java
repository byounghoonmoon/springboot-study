package com.passion.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Board {
	private Long seq;
	private String title;
	private String writer;
	private String content;
	private Date createDate;
	private Long cnt;
}
