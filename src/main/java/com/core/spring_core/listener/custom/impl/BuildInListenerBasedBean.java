package com.core.spring_core.listener.custom.impl;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class BuildInListenerBasedBean implements ApplicationListener<ContextRefreshedEvent>{

	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.print("context refreshed event fired: ");
        System.out.println(event);
	}

}
