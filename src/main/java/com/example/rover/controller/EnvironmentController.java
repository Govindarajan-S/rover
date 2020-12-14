package com.example.rover.controller;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rover.model.EtEnvironment;
import com.example.rover.service.EnvironmentService;

@RestController
@RequestMapping("/api/environment")
public class EnvironmentController {
	
	private final EnvironmentService environmentService;
	
	public EnvironmentController(EnvironmentService environmentService) {
		this.environmentService = environmentService;
	}

	@PostMapping("/configure")
	public EtEnvironment configureEnvironment(@RequestBody EtEnvironment environment) {
		return environmentService.configureEnvironment(environment);
	}

	@PatchMapping
	public void modifyEnvironment(@RequestBody EtEnvironment environment) {
		environmentService.modifyEnvironment(environment);
	}
}
