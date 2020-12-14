package com.example.rover.service;

import com.example.rover.model.EtEnvironment;

public interface EnvironmentService {
	
	EtEnvironment configureEnvironment(EtEnvironment environment);
	
	EtEnvironment getEnvironment();
	
	void modifyEnvironment(EtEnvironment environment); 
	
	boolean isStorm();

}
