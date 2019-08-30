package com.core.spring_core.propertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportsMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("PropertyXML.xml");
		Game game=context.getBean("game",Game.class);
		System.out.println(game.getCoach());
		System.out.println(game.getSport());
	
	}

}
