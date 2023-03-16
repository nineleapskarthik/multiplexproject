package com.nineleaps.multipex.multiplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nineleaps.multipex.multiplex.entity.MovieDetails;

public interface MovieDetailsRepository extends JpaRepository<MovieDetails, Long> {

}
