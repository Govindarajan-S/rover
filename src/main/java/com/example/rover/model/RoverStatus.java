package com.example.rover.model;

import org.springframework.stereotype.Component;

@Component
public class RoverStatus {
	
	private Rover rover;
	
	private EtEnvironment environment;

	public Rover getRover() {
		return rover;
	}

	public void setRover(Rover rover) {
		this.rover = rover;
	}

	public EtEnvironment getEnvironment() {
		return environment;
	}

	public void setEnvironment(EtEnvironment environment) {
		this.environment = environment;
	}

}
