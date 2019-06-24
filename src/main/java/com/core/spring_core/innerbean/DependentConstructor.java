package com.core.spring_core.innerbean;

public class DependentConstructor {
	private Dependancy dependancy;

	public DependentConstructor(Dependancy dependancy) {
		super();
		this.dependancy = dependancy;
	}
	
	public void dependentProcessor() {
		System.out.println("DependentConstructor");
		dependancy.dependencyProcess();
	}
}
