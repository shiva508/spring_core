package com.core.spring_core.annotationbased.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserDetails {
	@Autowired
	@Qualifier("userQ2")
	private UserQ userQ;
	public void userDetails() {
		System.out.println(userQ.getUserId()+"-"+userQ.getUserName());
	}
}
