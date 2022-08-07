package com.core.spring_core.step2.di.constructor;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MatchDay {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DI-LITERAL-cricketMatch.xml");
		Match oneDayMatch=context.getBean("oneDayMatch", Match.class);
		oneDayMatch.playMatch();
		Match testMatch=context.getBean("testMatch", Match.class);
		testMatch.playMatch();
		Match t20Match=context.getBean("t20Match",Match.class);
		t20Match.playMatch();
		context.registerShutdownHook();
	}
}
