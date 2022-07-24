package com.core.spring_core.injection.constructorbased;

import com.core.spring_core.injection.Movies;

public class ConstructorMovies {
	private final Movies movies;

	public ConstructorMovies(Movies movies) {
		this.movies = movies;
	}

	public void movies(String movieType) {
		movies.movies(movieType);
	}

}
