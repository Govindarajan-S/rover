package com.example.rover.model;

import org.springframework.stereotype.Component;

@Component
public class InventoryItem {
	
	private String type;
	
	private Integer quantity;
	
	private Integer priority;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

}
