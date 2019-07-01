package com.core.spring_core.di.javabased.componentscan.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class College {
	@Autowired
	private Professer professer;
	@Autowired
	@Qualifier("emailMessageSender")
	private MessageSender messageSender;

	public void collegeProfessorStudent() {
		System.out.println("COllege:CONFIG," + professer.professorStudentName()+messageSender.sendMessage(" Hi!!!!"));
	}
}
