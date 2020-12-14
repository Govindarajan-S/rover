package com.example.rover.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Rover {
	
	private Location location;
	
	private Integer battery;
	
	private List<InventoryItem> inventory;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Integer getBattery() {
		return battery;
	}

	public void setBattery(Integer battery) {
		this.battery = battery;
	}

	public List<InventoryItem> getInventoryItem() {
		return inventory;
	}

	public void setInventoryItem(List<InventoryItem> inventoryItem) {
		this.inventory = inventoryItem;
	}

}
