package com.cap.anurag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.anurag.entity.City;
import com.cap.anurag.entity.Languages;
import com.cap.anurag.entity.Movies;
import com.cap.anurag.entity.Seats;
import com.cap.anurag.entity.Shows;
import com.cap.anurag.entity.Theatre;
import com.cap.anurag.service.MovieServiceInterface;

@RestController
@CrossOrigin("http://localhost:4200")
public class MovieController {
		
	@Autowired
	private MovieServiceInterface movieservice;
	
	//displaying cities
	@GetMapping("/cities")
	public List<City> cityNames(){
		List<City> list = movieservice.getCityNames();
		return list;
	}
	//displaying theatres
	@GetMapping("/theatres/{city-name}")
	public List<Theatre> theatreNames(@PathVariable("city-name") String name){
		List<Theatre> list = movieservice.theatreNames(name);
		return list;
	}
	//displaying movies
	@GetMapping("/movies/{theatre-name}")
	public List<Movies> movieNames(@PathVariable("theatre-name") String name){
		List<Movies> list = movieservice.movieNames(name);
		return list;
	}
	//displaying shows
	@GetMapping("/shows")
	public List<Shows> getShows(){
		List<Shows> list = movieservice.getShows();
		return list;
	}
	//displaying languages
	@GetMapping("/languages")
	public List<Languages> getLanguage(){
		List<Languages> list = movieservice.getLanguage();
		return list;
	}
	//displaying seats
	@GetMapping("/seats")
	public List<Seats> getSeats(){
		List<Seats> list = movieservice.getSeats();
		return list;
	}}