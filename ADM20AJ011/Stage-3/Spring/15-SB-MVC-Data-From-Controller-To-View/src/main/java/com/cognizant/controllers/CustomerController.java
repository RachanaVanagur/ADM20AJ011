package com.cognizant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.domain.Customer;
@Controller
public class CustomerController {
   @GetMapping("/customer")
   //@ResponseBody
   public @ResponseBody Customer getCustomer() {
	   Customer cust = new Customer(101L,"Sujith","sujith.k@gmail.com");
	   return cust;
   }
}
