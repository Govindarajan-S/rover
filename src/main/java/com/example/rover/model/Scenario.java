package com.example.rover.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Scenario {
	
	private String name;
	
	private List<ScenarioCondition> conditions;
	
	private RoverAction rover;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ScenarioCondition> getConditions() {
		return conditions;
	}

	public void setConditions(List<ScenarioCondition> conditions) {
		this.conditions = conditions;
	}

	public RoverAction getRover() {
		return rover;
	}

	public void setRover(RoverAction rover) {
		this.rover = rover;
	}

}
