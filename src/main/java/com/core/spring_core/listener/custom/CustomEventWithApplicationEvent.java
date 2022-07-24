package com.core.spring_core.listener.custom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class CustomEventWithApplicationEvent {

	@Bean
	public CustomEventListnerBean customEventListnerBean() {
		return new CustomEventListnerBean();
	}

	@Bean
	public CustomEventPublisherBean customEventPublisherBean() {
		return new CustomEventPublisherBean();
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				CustomEventWithApplicationEvent.class);
		context.getBean(CustomEventPublisherBean.class).sendMsg("Shiva");
	}

}
