package com.example.rover.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class EtEnvironment {
	
	private Integer temperature;
	
	private Integer humidity;
	
	@JsonProperty("solar-flare")
	private Boolean solarFlare;
	
	private Boolean storm;
	
	@JsonProperty("area-map")
	private List<ArrayList<TerrainType>> areaMap = new ArrayList<>();

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public Boolean getSolarFlare() {
		return solarFlare;
	}

	public void setSolarFlare(Boolean solarFlare) {
		this.solarFlare = solarFlare;
	}

	public Boolean getStorm() {
		return storm;
	}

	public void setStorm(Boolean storm) {
		this.storm = storm;
	}

	public List<ArrayList<TerrainType>> getAreaMap() {
		return areaMap;
	}

	public void setAreaMap(List<ArrayList<TerrainType>> areaMap) {
		this.areaMap = areaMap;
	}

}
