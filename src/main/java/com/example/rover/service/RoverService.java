package com.example.rover.service;

import com.example.rover.model.Direction;
import com.example.rover.model.Message;
import com.example.rover.model.RoverStatus;
import com.example.rover.model.Scenarios;

public interface RoverService {
	
	Scenarios configureRover(Scenarios scenarios);
	
	Message moveRover(Direction direction);
	
	RoverStatus getRoverStatus();
	
	void rechargeBattery();
	
	void removeShield();

}
