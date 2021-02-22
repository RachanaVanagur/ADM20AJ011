package com.cognizant.login.controller;

import com.cognizant.login.service.LoginService;

public class LoginController {
 public static String checkUser(String userName, String password) throws Exception{
	LoginService lService = new LoginService();
	String response = lService.checkUserCredentials(userName, password);	
	return response; 
 }
}
