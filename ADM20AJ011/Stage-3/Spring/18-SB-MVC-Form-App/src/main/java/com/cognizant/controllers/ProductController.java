package com.cognizant.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
 @GetMapping(value = {"/","/loadform"})	
 public String loadForm() {
	 return "index";
 }
 
 @PostMapping("/saveProduct")
 public String handleSubmitButton(HttpServletRequest request, Model model) {
	 //logic to save product details in data store
	 String pid = request.getParameter("pid");
	 String pname = request.getParameter("pname");
	 String pprice = request.getParameter("pprice");
	 
	 Map<String,String> attributes = new HashMap<String,String>();
	 
	 attributes.put("id", pid);
	 attributes.put("name", pname);
	 attributes.put("price", pprice);
	 attributes.put("msg","Product Successfully Added to Catalog!");
	 
	 model.addAllAttributes(attributes);
	 
	 return "success";
 }
}
