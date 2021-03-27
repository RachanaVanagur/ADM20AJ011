package com.cognizant.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.bindings.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
 @PostMapping(
		 	path = "/new",
		 	consumes = {"application/xml","application/json"}
		 )	
 public ResponseEntity<String> saveNewCustomer(@RequestBody Customer customer){
	 System.out.println(customer);
	 //logic to save the Customer object data in DB
	 String responseText = "Customer Record with Customer ID: "+customer.getCustomerId()+" - Saved Successfully!" ;
	 return new ResponseEntity<String>(responseText, HttpStatus.OK);
 }
}
