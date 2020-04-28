package com.cap.anurag.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.anurag.entity.Customer;
import com.cap.anurag.entity.Payments;
import com.cap.anurag.entity.Seats;
import com.cap.anurag.service.MovieServiceInterface;

@RestController
@CrossOrigin("http://localhost:4200")
public class MovieController {
	@Autowired
	private MovieServiceInterface movieservice;
	//fetching account number
	@GetMapping("/account_data/{account_no}")
	public ResponseEntity<Customer> getAccountData(@PathVariable("account_no") int accno) {
		Customer customer = movieservice.getAccountData(accno);
		ResponseEntity<Customer> response = new ResponseEntity<Customer>(customer,HttpStatus.OK);
		return response;
	}
	//updating seats
	@PutMapping("/update_seats")
	public String updateSeats(@RequestBody Seats seat) {
		String string = movieservice.updateSeats(seat);
		return string;
	}
	//payment details
	@PostMapping("/payments") 
	public String payments(@RequestBody Payments pay) {
		String string = movieservice.payments(pay); 
		return string; 
	}
}