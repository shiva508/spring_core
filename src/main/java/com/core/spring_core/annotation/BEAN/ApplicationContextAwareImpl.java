package com.core.spring_core.annotation.BEAN;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareImpl implements ApplicationContextAware {

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		Phone phone = context.getBean(Phone.class);
		phone.sendMessage();

	}

}
