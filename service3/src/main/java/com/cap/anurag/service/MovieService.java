package com.cap.anurag.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.anurag.dao.CustomerDao;
import com.cap.anurag.dao.PaymentDao;
import com.cap.anurag.dao.SeatsDao;
import com.cap.anurag.entity.Customer;
import com.cap.anurag.entity.Payments;
import com.cap.anurag.entity.Seats;
@Service
@Transactional
public class MovieService implements MovieServiceInterface  {

	@Autowired
	private SeatsDao seats;
	@Autowired
	private CustomerDao account;
	@Autowired 
	private PaymentDao payment;
		
	//Fetching Account number 
	@Override
	public Customer getAccountData(int acc_no) {
		return account.getAccountData(acc_no);
	}
	//Updating seats
	@Override
	public String updateSeats(Seats seat_obj) {
		boolean bool = seats.existsById(seat_obj.getSno());
		if(bool == true) {
			seats.save(seat_obj);
			return "seats were updated successfully!!";
		}
		else {
			return "sorry, seats were not updated";
		}
	}
	//Payment details
	  @Override public String payments(Payments pay) { 
		  payment.save(pay); 
		  int id = pay.getBooking_id();
		  return "your booking id is : "+id;
	  }
	}