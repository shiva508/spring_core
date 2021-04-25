package com.core.spring_core.listener.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

public class CustomEventPublisherBean {
	@Autowired
	ApplicationEventPublisher publisher;

	public void sendMsg(String customMessage) {
		publisher.publishEvent(new CustomEvent(this, customMessage));
	}
}
