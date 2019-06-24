package com.core.spring_core.constructor;

public class UserCon {
	private Integer userId;
	private String userName;
	public UserCon(Integer userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserCon [userId=" + userId + ", userName=" + userName + "]";
	}
	
}
