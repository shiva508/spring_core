package com.core.spring_core.annotation.BEAN;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {

	public void onApplicationEvent(ContextStoppedEvent arg0) {
		
	}
}
