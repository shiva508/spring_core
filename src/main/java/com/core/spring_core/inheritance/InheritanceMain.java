package com.core.spring_core.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceMain {
public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("inheritance.xml");
	 Parent parent=(Parent) context.getBean("parent");
	 parent.getMessage1();
	 parent.getMessage2();
	 System.out.println("=======================");
	 Child child=(Child) context.getBean("child");
	 child.getMessage1();
	 child.getMessage2();
	 child.getMessage3();
	 }
}
