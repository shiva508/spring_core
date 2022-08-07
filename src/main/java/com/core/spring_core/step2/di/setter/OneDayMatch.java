package com.core.spring_core.step2.di.setter;

public class OneDayMatch implements Match {
	private Caption oneDayCaption;

	public void setOneDayCaption(Caption oneDayCaption) {
		this.oneDayCaption = oneDayCaption;
	}

	public void playMatch() {
		System.out.println("Playing oneday Match");
		System.out.println("One Day Match Caption:"+oneDayCaption.teamCaptionName());

	}
}
