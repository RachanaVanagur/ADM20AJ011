package com.cognizant.login;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.cognizant.login.controller.LoginController;

public class LoginInputScreen {
	private static final Logger logger = Logger.getLogger(LoginInputScreen.class);
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter user name: ");
		String uid = sc.next();
		
		System.out.print("enter password: ");
		String pwd = sc.next();
		
		//logger.info("Logging with userName -"+uid);
		
		String responseMsg = LoginController.checkUser(uid, pwd);
		
		logger.info(uid+"- logging in || "+responseMsg);
		System.out.println(responseMsg);
		sc.close();
	}
}
