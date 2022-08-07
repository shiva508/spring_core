package com.core.spring_core.step4.lifecycle.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MatchApplicationContextAware implements ApplicationContextAware {

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("MatchApplicationContextAware: "+applicationContext.getDisplayName().toString());
	}

}
