package com.cognizant.login.service;

import com.cognizant.login.dao.UserLoginDao;
import com.cognizant.login.dao.UserLoginDaoImpl;
import com.cognizant.login.entity.User;

public class LoginService {
 public String checkUserCredentials(String uid, String pwd) throws Exception {
	 User loginUser = new User(uid,pwd);
	 UserLoginDao dao = new UserLoginDaoImpl();
	 
 	 String msg = "Invalid User Credentials";		
	
	 if(dao.checkUserWithPassword(loginUser))		 
			msg = "Hai "+loginUser.getUserName()+ ", Welcome to our Application!";
	 
	 return msg;
 }
}
