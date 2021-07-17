package com.core.spring_core.listener.filtering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.core.spring_core.listener.custom.CustomerRegistrationEvent;

@Component
public class CustomerRegistrationPublisherFilterBean {
	@Autowired
	private ApplicationEventPublisher publisher;
	
	public void publishEventFiltering(final String name) {
	    publisher.publishEvent(new CustomerRegistrationEvent(name));
	}

}
