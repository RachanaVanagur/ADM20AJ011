package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.entity.ProductEntity;
import com.cognizant.entity.Resource;
import com.cognizant.repository.ProductRepository;
import com.cognizant.repository.ResourceRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ResourceRepository resourceRepo = context.getBean(ResourceRepository.class);
		/*
		Resource resourceEntity = new Resource();
		
		resourceEntity.setResourceName("Sanjay");
		resourceEntity.setResourceExp("8 Years");
		resourceEntity.setResourceSkill("Java");
		System.out.println(resourceEntity);
		
		Resource savedResource = resourceRepo.save(resourceEntity);
		System.out.println(savedResource);
		*/
		
		ProductEntity prodEntity= new ProductEntity();
		prodEntity.setProductName("Computer");
		prodEntity.setProductPrice(25000.5f);
		
		ProductRepository prodRepo = context.getBean(ProductRepository.class);
		
		ProductEntity savedProduct = prodRepo.save(prodEntity);
		System.out.println(savedProduct);
		
		context.close();
	}

}
