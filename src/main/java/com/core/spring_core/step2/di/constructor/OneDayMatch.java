package com.core.spring_core.step2.di.constructor;

public class OneDayMatch implements Match {
	private Caption caption;
	
	
	public OneDayMatch(Caption caption) {
		this.caption = caption;
	}

	public void playMatch() {
		System.out.println("Playing oneday Match");
		System.out.println("One Day Match Caption:"+caption.teamCaptionName());

	}
}
