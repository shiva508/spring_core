package com.core.spring_core.step3.scope.prototype;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MatchDay {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SCOPE-PROTOTYPE-cricketMatch.xml");
		Match oneDayMatchOne=context.getBean("oneDayMatch", Match.class);
		oneDayMatchOne.playMatch();
		Match oneDayMatchTwo=context.getBean("oneDayMatch", Match.class);
		System.out.println(oneDayMatchOne);
		System.out.println(oneDayMatchTwo);
		context.registerShutdownHook();
	}
}
