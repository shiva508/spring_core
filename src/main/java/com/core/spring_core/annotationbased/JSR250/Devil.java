package com.core.spring_core.annotationbased.JSR250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Devil {
public String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@PostConstruct
public void beforeBeanCreated() {
	System.out.println("Before Bean Created");
}
@PreDestroy
public void beforeBeanDestroyed() {
	System.out.println("Before Bean Destroyed");
}
}
