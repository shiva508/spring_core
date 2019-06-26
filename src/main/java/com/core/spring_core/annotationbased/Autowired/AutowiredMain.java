package com.core.spring_core.annotationbased.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredMain {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("AutowireAnnotation.xml");
	Team team=(Team) context.getBean("team");
	team.teamDetails();
	}

}
