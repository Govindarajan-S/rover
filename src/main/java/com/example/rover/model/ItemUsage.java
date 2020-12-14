package com.example.rover.model;

import org.springframework.stereotype.Component;

@Component
public class ItemUsage {
	
	private String type;
	
	private Integer qty;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

}
