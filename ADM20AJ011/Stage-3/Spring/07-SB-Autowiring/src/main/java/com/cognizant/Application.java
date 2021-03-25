package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.beans.Car;
import com.cognizant.beans.PetrolEngine;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Car car = context.getBean(Car.class);
		car.drive();
		System.out.println("---------------------------");
		//PetrolEngine petrolEngine = context.getBean(PetrolEngine.class);
		PetrolEngine petrolEngine = (PetrolEngine) context.getBean("pe");
		System.out.println(petrolEngine.start());
	}

}
