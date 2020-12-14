package com.example.rover.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class Scenarios {
	
	private List<Scenario> scenarios;
	
	private List<State> states;
	
	@JsonProperty("deploy-point")
	private DelpoyPoint deployPoint;
	
	@JsonProperty("initial-battery")
	private Integer initialBattery;
	
	private List<InventoryItem> inventory;

	public List<Scenario> getScenarios() {
		return scenarios;
	}

	public void setScenarios(List<Scenario> scenarios) {
		this.scenarios = scenarios;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public DelpoyPoint getDeployPoint() {
		return deployPoint;
	}

	public void setDeployPoint(DelpoyPoint deployPoint) {
		this.deployPoint = deployPoint;
	}

	public Integer getInitialBattery() {
		return initialBattery;
	}

	public void setInitialBattery(Integer initialBattery) {
		this.initialBattery = initialBattery;
	}

	public List<InventoryItem> getInventory() {
		return inventory;
	}

	public void setInventory(List<InventoryItem> inventory) {
		this.inventory = inventory;
	}
	
}
