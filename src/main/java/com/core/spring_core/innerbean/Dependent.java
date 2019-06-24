package com.core.spring_core.innerbean;

public class Dependent {
private Dependancy dependancy;

public Dependancy getDependancy() {
	return dependancy;
}

public void setDependancy(Dependancy dependancy) {
	this.dependancy = dependancy;
}

public void dependentProcessor() {
	System.out.println("Dependent");
	dependancy.dependencyProcess();
}
}
