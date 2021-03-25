package com.cognizant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.domain.Book;

@Controller
public class BookController {
 @GetMapping("/price")
 //public @ResponseBody String getBookPrice(@RequestParam("bname") String bookName) {
 public @ResponseBody String getBookPrice(@RequestParam(value = "bname", required = false, defaultValue = "Hibernate") String bookName) {
	 String responseMsg = "<h2>The price of <ins>"+bookName+"</ins> is:  <ins>Rs. 855.75</ins></h2>";
	 return responseMsg;
 }
 
 @GetMapping("/check")
 @ResponseBody
 public String checkBookAvailability(@RequestParam("bname") String bookName, @RequestParam("author") String author) {
	 String msg = "<h2>Book with Title: <ins>"+bookName+"</ins> by <ins>"+author+"</ins> is available!";
	 return msg;
 }
}
