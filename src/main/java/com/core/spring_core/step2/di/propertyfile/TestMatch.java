package com.core.spring_core.step2.di.propertyfile;

public class TestMatch implements Match {

	private Caption testCaption;

	private Coach testCoach;

	public void setTestCoach(Coach testCoach) {
		this.testCoach = testCoach;
	}

	public void setTestCaption(Caption testCaption) {
		this.testCaption = testCaption;
	}

	public void playMatch() {
		System.out.println("Playing Test Match");
		System.out.println("Test Match Caption:" + testCaption.teamCaptionName());
		System.out.println("Formate:" + testCoach.getFormateType());
		System.out.println("Coach:" + testCoach.getCoachName());
		System.out.println("Salary:"+testCoach.getSalary());
		System.out.println("Duriation:"+testCoach.getDuriation());

	}
}
