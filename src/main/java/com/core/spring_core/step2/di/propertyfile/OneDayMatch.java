package com.core.spring_core.step2.di.propertyfile;

public class OneDayMatch implements Match {
	private Caption oneDayCaption;

	private Coach oneDayCoach;

	public void setOneDayCaption(Caption oneDayCaption) {
		this.oneDayCaption = oneDayCaption;
	}

	public void setOneDayCoach(Coach oneDayCoach) {
		this.oneDayCoach = oneDayCoach;
	}

	public void playMatch() {
		System.out.println("Playing oneday Match");
		System.out.println("One Day Match Caption:" + oneDayCaption.teamCaptionName());
		System.out.println("Formate:"+oneDayCoach.getFormateType());
		System.out.println("Coach:"+oneDayCoach.getCoachName());
		System.out.println("Salary:"+oneDayCoach.getSalary());
		System.out.println("Duriation:"+oneDayCoach.getDuriation());

	}
}
