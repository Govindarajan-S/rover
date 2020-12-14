package com.example.rover.service;

import org.springframework.stereotype.Service;

import com.example.rover.model.Direction;
import com.example.rover.model.EtEnvironment;
import com.example.rover.model.Location;
import com.example.rover.model.Message;
import com.example.rover.model.Rover;
import com.example.rover.model.RoverStatus;
import com.example.rover.model.Scenarios;

@Service
public class RoverServiceImpl implements RoverService {
	
	private EnvironmentService environmentService;
	
	private Scenarios scenarios;
	
	private Integer moves = 0;

	public RoverServiceImpl(EnvironmentService environmentService) {
		this.environmentService = environmentService;
	}

	@Override
	public Scenarios configureRover(Scenarios scenarios) {
		this.scenarios = scenarios;
		return this.scenarios;
	}

	@Override
	public Message moveRover(Direction direction) {
		Message message = new Message();
		if (environmentService.isStorm()) {
			boolean shieldFound = scenarios.getInventory()
					.stream().anyMatch(inventoryItem -> inventoryItem.getType().equals("storm-shield"));
			if (shieldFound) {
				message.setMessage("Cannot move during a storm");
				return message;
			} else {
				return message;
			}
		}
		if (scenarios.getInitialBattery() > 0) {			
			if (direction.getDirection().equals("up")) {
				if (scenarios.getDeployPoint().getRow() == 0) {
					message.setMessage("Can move only within mapped area");
					return message;
				} else {
					Integer row = scenarios.getDeployPoint().getRow();
					row--;
					scenarios.getDeployPoint().setRow(row);
				}
			} else if (direction.getDirection().equals("down")) {
				if (scenarios.getDeployPoint().getRow() == 4) {
					message.setMessage("Can move only within mapped area");
					return message;
				} else {
					Integer row = scenarios.getDeployPoint().getRow();
					row++;
					scenarios.getDeployPoint().setRow(row);
				}
			} else if (direction.getDirection().equals("left")) {
				if (scenarios.getDeployPoint().getColumn() == 0) {
					message.setMessage("Can move only within mapped area");
					return message;
				} else {
					Integer column = scenarios.getDeployPoint().getColumn();
					column--;
					scenarios.getDeployPoint().setColumn(column);
				}
			} else if (direction.getDirection().equals("right")) {
				if (scenarios.getDeployPoint().getColumn() == 4) {
					message.setMessage("Can move only within mapped area");
					return message;
				} else {
					Integer column = scenarios.getDeployPoint().getColumn();
					column++;
					scenarios.getDeployPoint().setColumn(column);
				}
			}
			Integer battery = scenarios.getInitialBattery();
			battery--;
			scenarios.setInitialBattery(battery);
			moves++;
			if (moves == 10) {
				scenarios.setInitialBattery(moves);
				moves = 0;
			}
		}
		return message;
	}

	@Override
	public RoverStatus getRoverStatus() {
		RoverStatus roverStatus = new RoverStatus();
		EtEnvironment environment = environmentService.getEnvironment();
		Rover rover = new Rover();
		rover.setBattery(scenarios.getInitialBattery());
		rover.setInventoryItem(scenarios.getInventory());
		Location location = new Location();
		location.setRow(scenarios.getDeployPoint().getRow());
		location.setColumn(scenarios.getDeployPoint().getColumn());
		rover.setLocation(location);
		roverStatus.setRover(rover);
		roverStatus.setEnvironment(environment);
		return roverStatus;
	}

	@Override
	public void rechargeBattery() {
		scenarios.setInitialBattery(11);
	}

	@Override
	public void removeShield() {
		scenarios.getInventory()
			.removeIf(inventory -> inventory.getType().equals("storm-shield"));
	}

}
