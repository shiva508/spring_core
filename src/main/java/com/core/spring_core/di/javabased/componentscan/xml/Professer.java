package com.core.spring_core.di.javabased.componentscan.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Professer {
	@Autowired
	private Student student;

	public String professorStudentName() {
		return "Sir KS>READDY Student:"+student.studentName();
	}
}
