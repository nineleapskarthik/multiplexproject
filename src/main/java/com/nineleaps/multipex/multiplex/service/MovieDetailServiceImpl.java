package com.nineleaps.multipex.multiplex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.onlinefooddeliveryapp.repository.OrderDetailRepository;
import com.nineleaps.movieticket.movieproject.movie.Movie;
import com.nineleaps.movieticket.movieproject.repository.MovieRepository;
import com.nineleaps.multipex.multiplex.entity.MovieDetails;
import com.nineleaps.multipex.multiplex.repository.MovieDetailsRepository;

@Service
public class MovieDetailServiceImpl implements IMovieDetailsService {
	@Autowired
	private MovieDetailsRepository MovieRepository;

	@Override
	public List<MovieDetails> getAllMovies() {
		// TODO Auto-generated method stub
		
			return MovieRepository.findAll();
		
	}

	@Override
	public MovieDetails saveMovie(MovieDetails movie) {
		// TODO Auto-generated method stub
		return MovieRepository.save(movie);
	}

	@Override
	public MovieDetails updateMovie(MovieDetails movie) {
		// TODO Auto-generated method stub
		return MovieRepository.save(movie);
	}

	@Override
	public Optional<MovieDetails> getMovieById(Long movieId) {
		// TODO Auto-generated method stub
		return MovieRepository.findById(movieId);
	}

	@Override
	public void deleteMovieById(Long movieId) {
		// TODO Auto-generated method stub
		MovieRepository.deleteById(movieId);;
		
	}
	

}
