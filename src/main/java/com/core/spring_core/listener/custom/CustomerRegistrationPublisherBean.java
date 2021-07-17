package com.core.spring_core.listener.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomerRegistrationPublisherBean {
	@Autowired
	private ApplicationEventPublisher publisher;
	public void publishEvent(final String name) {
	    publisher.publishEvent(new CustomerRegistrationEvent(name));
	}
}
