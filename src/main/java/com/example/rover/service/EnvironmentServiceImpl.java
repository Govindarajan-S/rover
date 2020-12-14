package com.example.rover.service;

import org.springframework.stereotype.Service;

import com.example.rover.model.EtEnvironment;
import com.example.rover.model.Scenarios;

@Service
public class EnvironmentServiceImpl implements EnvironmentService {
	
	private EtEnvironment environment;
	
	private final RoverService roverService;
	
	private Boolean configured = false;
	
	public EnvironmentServiceImpl(RoverService roverService) {
		this.roverService = roverService;
	}

	@Override
	public EtEnvironment configureEnvironment(EtEnvironment environment) {
		if (!configured) {
			this.environment = environment;
			configured = true;
		}
		return this.environment;
	}

	@Override
	public EtEnvironment getEnvironment() {
		return environment;
	}

	@Override
	public void modifyEnvironment(EtEnvironment environment) {
		if (environment.getTemperature() != null) {
			this.environment.setTemperature(environment.getTemperature());
		}
		if (environment.getHumidity() != null) {
			this.environment.setHumidity(environment.getHumidity());
		}
		if (environment.getSolarFlare() != null) {
			this.environment.setSolarFlare(environment.getSolarFlare());
			if (environment.getSolarFlare()) {
				roverService.rechargeBattery();
			}
		}
		if (environment.getStorm() != null) {
			this.environment.setStorm(environment.getStorm());
			if (this.environment.getStorm()) {
				roverService.removeShield();
			}
		}
		if (!environment.getAreaMap().isEmpty()) {
			this.environment.setAreaMap(environment.getAreaMap());
		}
	}

	@Override
	public boolean isStorm() {
		return environment.getStorm();
	}
	
}
