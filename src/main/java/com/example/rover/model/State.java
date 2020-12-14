package com.example.rover.model;

import org.springframework.stereotype.Component;

@Component
public class State {

	private String name;
	
	private String[] allowedActions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAllowedActions() {
		return allowedActions;
	}

	public void setAllowedActions(String[] allowedActions) {
		this.allowedActions = allowedActions;
	}
	
}
