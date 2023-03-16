package com.nineleaps.multipex.multiplex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nineleaps.multipex.multiplex.entity.MovieDetails;
import com.nineleaps.multipex.multiplex.exception.ResourceNotFoundException;
import com.nineleaps.multipex.multiplex.service.IMovieDetailsService;
import com.nineleaps.multipex.multiplex.service.MovieDetailServiceImpl;

@RestController
@RequestMapping("/movie")
public class MovieDeatilsController {
	@Autowired
	private IMovieDetailsService movieService;
	@GetMapping("/listorder")
	public List<MovieDetails> getAllOrders(){
		return movieService.getAllMovies();
	}
	@PostMapping("/saveorder")
	public MovieDetails saveOrder(@RequestBody MovieDetails order) {
		return movieService.saveMovie(order);
	}
	@PutMapping("/updateorder/{oid}")
	public MovieDetails updateOrder(@RequestBody MovieDetails newOrder,@PathVariable("oid") Long orderId) {
	  MovieDetails orderDetail = movieService.getMovieById(orderId).orElseThrow();
	 
	 
		return movieService.updateMovie(orderDetail);
    }
	@GetMapping("/findorder/{oid}")
	public MovieDetails getOrderById(@PathVariable("oid") Long orderId){
		return movieService.getMovieById(orderId).get();
	}
	@DeleteMapping("/deleteorder/{oid}")
	public void deleteOrderById(@PathVariable("oid") Long movieId){
		movieService.deleteMovieById(movieId);
	}
	
}
