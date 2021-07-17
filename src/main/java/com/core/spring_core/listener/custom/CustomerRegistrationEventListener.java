package com.core.spring_core.listener.custom;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerRegistrationEventListener {
	@EventListener
	public
	void handleRegistration(CustomerRegistrationEvent event){
        System.out.println("Registration event got triggered for customer::  " + event.getName());
    }
}
