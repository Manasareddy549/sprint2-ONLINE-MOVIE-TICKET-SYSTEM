package com.cap.anurag.service;

import java.util.List;

import com.cap.anurag.entity.City;
import com.cap.anurag.entity.Languages;
import com.cap.anurag.entity.Movies;
import com.cap.anurag.entity.Seats;
import com.cap.anurag.entity.Shows;
import com.cap.anurag.entity.Theatre;

public interface MovieServiceInterface {

	List<City> getCityNames();
	List<Theatre> theatreNames(String name);
	List<Movies> movieNames(String name);
	List<Shows> getShows();
	List<Languages> getLanguage();
	List<Seats> getSeats();
	
}
