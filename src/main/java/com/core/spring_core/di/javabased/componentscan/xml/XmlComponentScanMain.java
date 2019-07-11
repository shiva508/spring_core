package com.core.spring_core.di.javabased.componentscan.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//@Configuration
//@ComponentScan(basePackages = {"com.core.spring_core.di.javabased.componentscan.xml"})
public class XmlComponentScanMain {

	public static void main(String[] args) {
		
		/*
		 * AnnotationConfigApplicationContext context = new
		 * AnnotationConfigApplicationContext(XmlComponentScanMain.class);
		 * context.getBean(College.class).collegeProfessorStudent();
		 */
		 
		
		  ApplicationContext context = new
		  ClassPathXmlApplicationContext("ComponentScanEx.xml"); College
		 college=(College) context.getBean(College.class);
		  college.collegeProfessorStudent();
		 
	}

}
