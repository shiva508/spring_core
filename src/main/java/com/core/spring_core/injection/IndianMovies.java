package com.core.spring_core.injection;

public class IndianMovies implements Movies {

	public void movies(String movieType) {
		System.out.println("Movie type is " + movieType);
	}
}
