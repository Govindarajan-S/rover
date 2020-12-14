package com.example.rover.model;

import org.springframework.stereotype.Component;

@Component
public class RoverAction {
	
	private String is;
	
	private RoverPerforms performs;

	public String getIs() {
		return is;
	}

	public void setIs(String is) {
		this.is = is;
	}

	public RoverPerforms getPerforms() {
		return performs;
	}

	public void setPerforms(RoverPerforms performs) {
		this.performs = performs;
	}

}
