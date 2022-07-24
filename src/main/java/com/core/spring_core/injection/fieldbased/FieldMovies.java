package com.core.spring_core.injection.fieldbased;

import org.springframework.beans.factory.annotation.Autowired;

import com.core.spring_core.injection.Movies;

public class FieldMovies {
	@Autowired
	private Movies movies;

	public void movies(String movieType) {
		movies.movies(movieType);
	}
}
