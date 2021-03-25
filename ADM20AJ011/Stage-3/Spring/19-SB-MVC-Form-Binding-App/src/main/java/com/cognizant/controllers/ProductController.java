package com.cognizant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cognizant.bindings.Product;

@Controller
public class ProductController {
 @GetMapping(value = {"/","/loadform"})	
 public String loadForm(Model model) {
	 Product productObj = new Product();
	 model.addAttribute("product", productObj);
	 return "index";
 }
 
 @PostMapping("/saveProduct")
 public String handleSubmitButton(Product product, Model model) {
	 //logic to save product details in data store	 
	 System.out.println(product);
	 
	 model.addAttribute("successMsg","Product Saved to Catalog!");
	 //return "index";
	 return "redirect:/productSavingSuccess";	 
 }
 
 @GetMapping("/productSavingSuccess")
 public String afterProductSaving(Model model) {
	 Product productObj = new Product();
	 model.addAttribute("product", productObj);
	 model.addAttribute("successMsg","Product Saved to Catalog!");
	 return "index";
 }
}
