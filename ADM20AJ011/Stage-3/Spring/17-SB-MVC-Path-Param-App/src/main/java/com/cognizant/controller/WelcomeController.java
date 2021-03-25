package com.cognizant.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
 @GetMapping("/{name}/{age}")	
 public @ResponseBody String getMessage(@PathVariable("name") String name, @PathVariable("age") String age) {
	 String msg = String.format("%s is %s years old", name,age);
	 return "<h2>"+msg+"</h2>";
 }
 

 @GetMapping("/greet/{name}/{age}")	
 public @ResponseBody String getGreetingsData(@PathVariable Map<String, String> pathVarsMap) {
	 String nameData = pathVarsMap.get("name");
	 String ageData = pathVarsMap.get("age");
	 return "<h2>Welcome, "+nameData +" aged "+ageData+" years</h2>";
 }
 
}
