package com.nineleaps.multipex.multiplex.service;

import java.util.List;
import java.util.Optional;


import com.nineleaps.multipex.multiplex.entity.MovieDetails;
import com.nineleaps.multipex.multiplex.exception.ResourceNotFoundException;

public interface IMovieDetailsService {
	public List<MovieDetails> getAllMovies();
	public MovieDetails saveMovie(MovieDetails movie);
	public MovieDetails updateMovie( MovieDetails movie);
	public Optional<MovieDetails> getMovieById(Long movieId);
	public void deleteMovieById(Long movieId);

}
