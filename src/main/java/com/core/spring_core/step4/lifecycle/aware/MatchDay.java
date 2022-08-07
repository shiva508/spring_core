package com.core.spring_core.step4.lifecycle.aware;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MatchDay {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("LIFECYCLE-AWARE-cricketMatch.xml");
		Match oneDayMatchOne=context.getBean("oneDayMatch", Match.class);
		oneDayMatchOne.playMatch();
		context.registerShutdownHook();
	}
}
