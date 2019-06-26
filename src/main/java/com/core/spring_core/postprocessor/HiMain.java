package com.core.spring_core.postprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HiMain {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("postBeanProcessor.xml");
		Hi hi=(Hi) context.getBean("hi");
		System.out.println(hi.getMessage());
		context.registerShutdownHook();
		
	}

}
