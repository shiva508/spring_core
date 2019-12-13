package com.core.spring_core.annotationbased.Required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("RequiredAnnotation.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentId());
	}

}
