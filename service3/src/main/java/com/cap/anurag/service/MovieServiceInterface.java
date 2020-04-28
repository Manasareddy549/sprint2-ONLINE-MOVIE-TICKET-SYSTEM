package com.cap.anurag.service;

import com.cap.anurag.entity.Customer;
import com.cap.anurag.entity.Payments;
import com.cap.anurag.entity.Seats;
public interface MovieServiceInterface {
	Customer getAccountData(int acc_no);
	String updateSeats(Seats seat_obj);
	String payments(Payments pay);
	
	
}
