package com.example.rover.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rover.model.Direction;
import com.example.rover.model.Message;
import com.example.rover.model.RoverStatus;
import com.example.rover.model.Scenarios;
import com.example.rover.service.RoverService;

@RestController
@RequestMapping("/api/rover")
public class RoverController {
	
	private RoverService roverService;

	public RoverController(RoverService roverService) {
		this.roverService = roverService;
	}

	@PostMapping("/configure")
	public Scenarios configureRover(@RequestBody Scenarios scenarios) {
		return roverService.configureRover(scenarios);
	}

	@PostMapping("/move")
	public ResponseEntity<Message> moveRover(@RequestBody Direction direction) {
		Message message = roverService.moveRover(direction);
		if (message.getMessage() == null) {			
			return ResponseEntity.status(HttpStatus.OK).build();
		} else {
			return ResponseEntity.status(HttpStatus.PRECONDITION_REQUIRED).body(message);
		}
	}
	
	@GetMapping("/status")
	public RoverStatus getRoverStatus() {
		return roverService.getRoverStatus();
	}
}
