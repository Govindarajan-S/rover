package com.example.rover.model;

import org.springframework.stereotype.Component;

@Component
public class DelpoyPoint {
	
	private Integer row;
	
	private Integer column;

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

}
