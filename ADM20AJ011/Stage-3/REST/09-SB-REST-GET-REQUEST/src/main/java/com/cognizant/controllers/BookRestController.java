package com.cognizant.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.bindings.Book;

@RestController
@RequestMapping("/library")
public class BookRestController {
 public ResponseEntity<Book> getBookDetails(){
	 Book book = new Book();
	 book.setBookId(10123);
	 book.setBookName("Spring Boot with Microservices");
	 book.setBookAuthor("Sunil Joseph");
	 book.setBookPrice(475.50f);
	 
	 return new ResponseEntity<>(book, HttpStatus.OK);
 }
}
