package com.core.spring_core.lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

	public static void main(String[] args) {
		AbstractApplicationContext  context=new ClassPathXmlApplicationContext("initDestroy.xml");
		LyfeCycle lifecycle=(LyfeCycle) context.getBean("lifeCycle");
		lifecycle.setMessage("HI---");
		System.out.println(lifecycle.getMessage());
		context.registerShutdownHook();
	}

}
