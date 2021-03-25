package com.cognizant.rest;

import java.util.Calendar;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general")
public class GeneralController {
 @RequestMapping(path="/welcome", method = RequestMethod.GET)	
 public String sendWelcomeMessage() {
	 String msgText = "Welcome to RESTful Services....";
	 try {
		 Thread.sleep(5000);
	 }catch(Exception ex) {
		 System.out.println(ex.toString());
	 }
	 return msgText;
 }
 
 @GetMapping("/today")
 public String sendTodaysDate() {
	 Calendar cal = Calendar.getInstance();
	 Date today = cal.getTime();
	 String responseMsg = "Today is : "+ today;
	 return responseMsg;
 }
 
 @GetMapping("/date")
 public ResponseEntity<String> getDate(){
	 Date d = new Date();
	 String responseTxt = "Date is : "+d;
	 
	 //ResponseEntity<String> responseEntity = new ResponseEntity<String>(responseTxt,HttpStatus.OK);
	 //ResponseEntity<String> responseEntity = new ResponseEntity<String>(responseTxt,HttpStatus.CREATED);
	 //ResponseEntity<String> responseEntity = new ResponseEntity<String>(responseTxt,HttpStatus.BAD_REQUEST);
	 
	 //-----to include response headers with ResponseEntity-----
	 HttpHeaders responseHeaders = new HttpHeaders();
	 responseHeaders.add("my-custom-header-1","by @Cognizant");
	 
	 ResponseEntity<String> responseEntity = new ResponseEntity<String>(responseTxt, responseHeaders, HttpStatus.OK);
	 return responseEntity;
 }
}
