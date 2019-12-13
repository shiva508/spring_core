package com.core.spring_core.annotationbased.Required;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Student {
	private Integer studentId;
	private String studentName;

	public Integer getStudentId() {
		return studentId;
	}

	@Required
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	@Required
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
