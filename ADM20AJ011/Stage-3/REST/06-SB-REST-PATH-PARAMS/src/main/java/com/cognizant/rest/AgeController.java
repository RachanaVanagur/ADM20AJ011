package com.cognizant.rest;

import java.util.Calendar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal")
public class AgeController {
	@GetMapping("/age/{name}/{yob}")
	public ResponseEntity<String> getAge(@PathVariable("name") String name, @PathVariable("yob") Integer yob) {
		if (isYearOfBirthValid(yob)) {
			int age = calculateAge(yob);
			return new ResponseEntity<String>(name+" , your Age is: " + age, HttpStatus.OK);
		}
		return new ResponseEntity<String>(name+", year of Birth should not be in Future!, Given Year of Birth as : " + yob,
				HttpStatus.BAD_REQUEST);
	}

	private int calculateAge(Integer yob) {
		Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);
		return currentYear-yob;
	}

	private boolean isYearOfBirthValid(Integer yob) {
		Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);
		if (yob < currentYear)
			return true;
		else
			return false;
	}

}
