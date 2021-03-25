package com.cognizant.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cibil")
public class CibilController { 	
 @GetMapping("/score")	
 //public String getCibiScore(@RequestParam("pan") String pan) {
 public String getCibiScore(@RequestParam(value = "pan", required = false, defaultValue = "XXXXXX") String pan) {
	 //logic to get the CIBIL Score;
	 String msg ="PAN NUMBER IS NOT SUBMITTED";
	 if(!(pan.equals("XXXXXX")))
	   msg= "CIBIL SCORE FOR PAN: "+pan+" IS 798";
	 
	 return msg;
 }
}
