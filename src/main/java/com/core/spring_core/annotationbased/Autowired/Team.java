package com.core.spring_core.annotationbased.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Team {
	@Autowired
	private Project project;
	
	public void teamDetails() {
		System.out.println("Team name is:JAVA");
		 project.projectName();
	}

}
