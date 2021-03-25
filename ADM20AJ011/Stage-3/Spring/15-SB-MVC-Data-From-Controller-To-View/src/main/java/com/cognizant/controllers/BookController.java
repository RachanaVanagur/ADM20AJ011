package com.cognizant.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.domain.Book;

@Controller
@RequestMapping("/library")
public class BookController {
	
 @GetMapping("/book")	
 public String getBookDetails(Model model)
 {
   Book book = new Book(); 
   book.setBookId(100124);
   book.setBookName("Spring Boot with Microservices");
   book.setBookPrice(450f);
   
   model.addAttribute("book", book);
   
   return "pageOne";
 }
 
 @GetMapping("/books")
 public String getBooksDetails(Model model) {
  
	 Book book1 = new Book(100123,"Spring",450f);
	 Book book2 = new Book(100124,"Hibernate",375.5f);
	 Book book3 = new Book(100125,"Microservices",550.5f);
	 
	 List<Book> booksList = Arrays.asList(book1, book2, book3);
	 
	 model.addAttribute("books", booksList);
	 
     return "pageTwo";	 
 }
}
