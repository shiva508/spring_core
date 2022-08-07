package com.core.spring_core.step2.di.literal;

public class TestCoach implements Coach {
	private String formateType;
	private String coachName;

	public void setFormateType(String formateType) {
		this.formateType = formateType;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getCoachName() {
		return coachName;
	}

	public String getFormateType() {
		return formateType;
	}
}
