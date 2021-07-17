package com.core.spring_core.listener.custom;

public class CustomerRegistrationEvent {
	private String name;

	public CustomerRegistrationEvent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
