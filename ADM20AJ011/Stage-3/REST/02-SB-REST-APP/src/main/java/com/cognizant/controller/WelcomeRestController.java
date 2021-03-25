package com.cognizant.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cognizant")
public class WelcomeRestController {
 @GetMapping("/welcome")	
 public String welcomeMsgGet() {
	 return "Welcome message from GET Resource";
 }
 
 //@PostMapping("/welcome")
 @RequestMapping(path = "/welcome", method = RequestMethod.POST)
 public String welcomeMsgPost() {
	 return "Welcome message from POST Resource";
 } 
 
 @PutMapping("/welcome")	
 public String welcomeMsgPut() {
	 return "Welcome message from PUT Resource";
 } 
 
 @DeleteMapping("/welcome")	
 public String welcomeMsgDelete() {
	 return "Welcome message from DELETE Resource";
 } 
}
