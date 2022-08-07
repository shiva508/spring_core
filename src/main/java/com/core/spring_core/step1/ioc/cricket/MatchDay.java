package com.core.spring_core.step1.ioc.cricket;

import org.apache.log4j.spi.LoggerFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Loggers;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MatchDay {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("IOCcricketMatch.xml");
		Match oneDayMatch=context.getBean("oneDayMatch", Match.class);
		oneDayMatch.playMatch();
		Match testMatch=context.getBean("testMatch", Match.class);
		testMatch.playMatch();
		Match t20Match=context.getBean("t20Mattch",Match.class);
		t20Match.playMatch();
		context.registerShutdownHook();
	}
}
