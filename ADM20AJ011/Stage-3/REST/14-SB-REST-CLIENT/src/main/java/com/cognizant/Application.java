package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		RestTemplate rt = new RestTemplate();
		
		String restAPI = "http://localhost:8080/users/index";
		
		ResponseEntity<String> responseEntity =  rt.getForEntity(restAPI, String.class);
		
		System.out.println("Response Code = " + responseEntity.getStatusCodeValue());

		if(responseEntity.getStatusCodeValue() == 200) {
			String responseData = responseEntity.getBody();
			System.out.println(responseData);
		}
	}

}
