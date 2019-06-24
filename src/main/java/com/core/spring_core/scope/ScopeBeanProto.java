package com.core.spring_core.scope;

public class ScopeBeanProto {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ScopeBean [message=" + message + "]";
	}

}
