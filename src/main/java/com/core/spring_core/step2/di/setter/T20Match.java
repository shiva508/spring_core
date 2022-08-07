package com.core.spring_core.step2.di.setter;

public class T20Match implements Match {
	private Caption t20Caption;

	public void setT20Caption(Caption t20Caption) {
		this.t20Caption = t20Caption;
	}


	public void playMatch() {
		System.out.println("Playing T20 Match");
		System.out.println("T20 Caption:"+t20Caption.teamCaptionName());
	}
}
