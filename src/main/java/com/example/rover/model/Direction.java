package com.example.rover.model;

import org.springframework.stereotype.Component;

@Component
public class Direction {
	
	private String direction;

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}
