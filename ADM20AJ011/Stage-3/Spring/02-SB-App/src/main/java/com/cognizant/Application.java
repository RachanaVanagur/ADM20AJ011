package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.util.PasswordEncryptor;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		PasswordEncryptor passwordEncy = context.getBean(PasswordEncryptor.class);
		
		String encryptedPassword = passwordEncy.encryptPassword("sunil");
		System.out.println("Enrypted Password = " + encryptedPassword);
	}

}
