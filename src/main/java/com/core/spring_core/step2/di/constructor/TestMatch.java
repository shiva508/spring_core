package com.core.spring_core.step2.di.constructor;

public class TestMatch implements Match {

	private Caption testCaption;

	public TestMatch(Caption testCaption) {
		this.testCaption = testCaption;
	}

	public void playMatch() {
		System.out.println("Playing Test Match");
		System.out.println("Test Match Caption:"+testCaption.teamCaptionName());
	}
}
