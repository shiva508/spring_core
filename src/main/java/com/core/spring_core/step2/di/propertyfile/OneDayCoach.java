package com.core.spring_core.step2.di.propertyfile;

public class OneDayCoach implements Coach {
	private String formateType;
	private String coachName;
	private Integer salary;
	private Integer duriation;

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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getDuriation() {
		return duriation;
	}

	public void setDuriation(Integer duriation) {
		this.duriation = duriation;
	}

}
