package com.cognizant.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.binding.PassengerInfo;
import com.cognizant.binding.TicketInfo;

@RestController
@RequestMapping("/irctc")
public class TicketBookingController {
 @PostMapping(
		    value = "/bookticket",
		    consumes = {"application/xml", "application/json"},
		    produces = {"application/xml", "application/json"}
		 )	
 public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passenger){
	 System.out.println(passenger);
	 //logic to generate ticket
	 
	 TicketInfo ticket = new TicketInfo();
	 
	 ticket.setPnr("JPWERQ");
	 ticket.setName(passenger.getName());
	 ticket.setFrom("Hyderabad");
	 ticket.setTo("Kochin");
	 ticket.setDob(new Date().toString());
	 ticket.setDoj(passenger.getDoj());
	 ticket.setTrainNo(passenger.getTrainNo());
	 ticket.setFare(2500.75f);
	 ticket.setStatus("CONFIRMED");
	 
	 return new ResponseEntity<TicketInfo>(ticket, HttpStatus.CREATED);
 }
}
