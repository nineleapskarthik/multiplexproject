package com.nineleaps.multipex.multiplex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "movie")
public class MovieDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private Long movieId;
	@Column(name = "movie_name",nullable = false)
	private String movieName;
	@Column(name ="movie_category")
	private String category; 
	
	public MovieDetails() {
		// TODO Auto-generated constructor stub
	}

	public MovieDetails(Long movieId, String movieName, String category) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.category = category;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

}
