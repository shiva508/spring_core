package com.core.spring_core.setter;

public class User {
private Integer userId;
private String userName;
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + "]";
}
}
