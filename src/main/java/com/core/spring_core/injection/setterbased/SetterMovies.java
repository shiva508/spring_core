package com.core.spring_core.injection.setterbased;

import org.springframework.beans.factory.annotation.Autowired;

import com.core.spring_core.injection.Movies;

public class SetterMovies {
	private Movies movies;

	@Autowired
	public void setMovies(Movies movies) {
		this.movies = movies;
	}
	

	public void movies(String movieType) {
		movies.movies(movieType);
	}
	
	
}
