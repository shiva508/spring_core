package com.core.spring_core.lifecycle;

public class LyfeCycle {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("Processing Started");
	}

	public void initDde() {
		System.out.println("Processing Started");
	}

	public void destroy() {
		System.out.println("Bean Destroyed");
	}

	@Override
	public String toString() {
		return "LyfeCycle [message=" + message + "]";
	}

}
