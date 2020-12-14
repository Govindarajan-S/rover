package com.example.rover.model;

import org.springframework.stereotype.Component;

@Component
public class ScenarioCondition {
	
	private ScenarioType type;
	
	private String property;
	
	private Operator operator;
	
	private Object value;

	public ScenarioType getType() {
		return type;
	}

	public void setType(ScenarioType type) {
		this.type = type;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
