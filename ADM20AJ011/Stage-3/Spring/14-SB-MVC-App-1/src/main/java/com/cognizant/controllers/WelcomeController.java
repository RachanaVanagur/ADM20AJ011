package com.cognizant.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cognizant")
public class WelcomeController {
  @Value("${greetmessage}")	
  private String mymessage;
	
  @RequestMapping("/welcome")	
  public ModelAndView displayWelcomeMessage() {
	  ModelAndView mav = new ModelAndView();
	  mav.addObject("message", "Welcome to Cognizant....");
	  mav.setViewName("index");
	  return mav;
  }
  
  @GetMapping("/greet")
  public String displayGreetingMessage(Model model) {
	  //model.addAttribute("message", "Hi, Good Morning");
	  model.addAttribute("message", mymessage);
	  return "index";
  }
  
  @RequestMapping(value = {"/date","/today"}, method = RequestMethod.GET)
  public String displayTodaysDate(Model model) {
	  model.addAttribute("message","Today is : "+new Date());
	  return "index";
  }
}
