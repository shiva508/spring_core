package com.core.spring_core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCysleAnnotationBased {

	@PostConstruct
	public void initializeDataBase() {

	}

	@PreDestroy
	public void closeDatabase() {

	}
}
