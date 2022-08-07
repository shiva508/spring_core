package com.core.spring_core.step2.di.propertyfile;

public class T20Match implements Match {
	private Caption t20Caption;

	private Coach t20Coach;

	public void setT20Caption(Caption t20Caption) {
		this.t20Caption = t20Caption;
	}

	public void setT20Coach(Coach t20Coach) {
		this.t20Coach = t20Coach;
	}

	public void playMatch() {
		System.out.println("Playing T20 Match");
		System.out.println("T20 Caption:" + t20Caption.teamCaptionName());
		System.out.println("Formate:"+t20Coach.getFormateType());
		System.out.println("Coach:"+t20Coach.getCoachName());
		System.out.println("Salary:"+t20Coach.getSalary());
		System.out.println("Duriation:"+t20Coach.getDuriation());

	}
}
