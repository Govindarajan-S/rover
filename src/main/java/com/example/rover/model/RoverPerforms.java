package com.example.rover.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class RoverPerforms {
	
	@JsonProperty("collect-sample")
	private CollectSample collectSample;
	
	@JsonProperty("item-usage")
	private ItemUsage itemUsage;

	public CollectSample getCollectSample() {
		return collectSample;
	}

	public void setCollectSample(CollectSample collectSample) {
		this.collectSample = collectSample;
	}

	public ItemUsage getItemUsage() {
		return itemUsage;
	}

	public void setItemUsage(ItemUsage itemUsage) {
		this.itemUsage = itemUsage;
	}

}
