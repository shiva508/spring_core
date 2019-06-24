package com.core.spring_core.autowiring;

public class Bank {
private Integer bankId;
private String bankName;

public Bank(Integer bankId, String bankName) {
	super();
	this.bankId = bankId;
	this.bankName = bankName;
}
public Integer getBankId() {
	return bankId;
}
public void setBankId(Integer bankId) {
	this.bankId = bankId;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
@Override
public String toString() {
	return "Bank [bankId=" + bankId + ", bankName=" + bankName + "]";
}
}
