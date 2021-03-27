package com.cognizant.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.bindings.User;
import com.cognizant.exceptions.UserNotFoundException;

@RestController
@RequestMapping("/users")
public class UserRestController {
 @PutMapping(
		 	  path = "/update",
		 	  consumes = MediaType.APPLICATION_JSON_VALUE
		 	)		
 public ResponseEntity<String> updateUser(@RequestBody User userToUpdate){
	 System.out.println(userToUpdate);
	 //logic to update User
	 return new ResponseEntity<String>("User Updated Successfully!" , HttpStatus.OK);
 }
 
 @DeleteMapping("/delete/{uid}") 
 public ResponseEntity<String> deleteUser(@PathVariable("uid") String uid){
	 System.out.println("User ID received for Deletion is "+ uid);
	 //logic to delete the User and if user with the specified ID is not available in DB then application should generate UserNotFoundException
	 if(!(uid.equals("1"))) {
		 throw new UserNotFoundException("No user with userid : "+uid);
	 }
	 return new ResponseEntity<String>("User with User ID: "+ uid+" Deleted!", HttpStatus.OK);
 }
 
 @GetMapping("/index")
 public ResponseEntity<String> homePage(){
	 return new ResponseEntity<String>("Welcome to User Management System", HttpStatus.OK);
 }
}
