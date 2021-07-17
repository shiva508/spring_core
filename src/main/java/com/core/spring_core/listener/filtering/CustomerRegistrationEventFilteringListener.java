package com.core.spring_core.listener.filtering;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.core.spring_core.listener.custom.CustomerRegistrationEvent;

@Component
public class CustomerRegistrationEventFilteringListener {
	
	@EventListener
	public void handleRegistration(CustomerRegistrationEvent event){
	    System.out.println("Dsaraararrara " + event.getName());
	}
}
