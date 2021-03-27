package com.cognizant.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cognizant.exceptions.ApiError;
import com.cognizant.exceptions.UserNotFoundException;

@RestController
@RestControllerAdvice
public class RestExceptionHandler {
 @ExceptionHandler(value = UserNotFoundException.class)	
 public ResponseEntity<ApiError> handleUserNotFoundException(){
	 ApiError error = new ApiError(410, "User Not Found", new Date());
	 return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
 }
}
