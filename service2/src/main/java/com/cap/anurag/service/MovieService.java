package com.cap.anurag.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.anurag.dao.CityDao;
import com.cap.anurag.dao.LanguagesDao;
import com.cap.anurag.dao.MoviesDao;
import com.cap.anurag.dao.SeatsDao;
import com.cap.anurag.dao.ShowsDao;
import com.cap.anurag.dao.TheatreDao;
import com.cap.anurag.entity.City;
import com.cap.anurag.entity.Languages;
import com.cap.anurag.entity.Movies;
import com.cap.anurag.entity.Seats;
import com.cap.anurag.entity.Shows;
import com.cap.anurag.entity.Theatre;

@Service
@Transactional
public class MovieService implements MovieServiceInterface  {

	@Autowired
	private CityDao city;
	@Autowired
	private TheatreDao theatre;
	@Autowired
	private MoviesDao movie;
	@Autowired
	private ShowsDao shows;
	@Autowired
	private LanguagesDao language;
	@Autowired
	private SeatsDao seats;

	//Displaying City Names
	public List<City> getCityNames() {
		return city.getCityNames();
	}
	
	//Displaying theatre names
	
	@Override
	public List<Theatre> theatreNames(String name) {
	List<Theatre> list = theatre.theatreNames(name);
	return list;
	}
	//Displaying movie names
	@Override
	public List<Movies> movieNames(String name) {
		List<Movies> list = movie.movieNames(name);
		return list;
	}
	//Displaying shows list
	public List<Shows> getShows() {
		return shows.getShows();
	
	}
	//Displaying languages
	@Override
	public List<Languages> getLanguage() {
		List<Languages> list = language.findAll();
		return list;
	}
	//Displaying seats
	@Override
	public List<Seats> getSeats() {
		List<Seats> list = seats.findAll();
		return list;
	}
	}