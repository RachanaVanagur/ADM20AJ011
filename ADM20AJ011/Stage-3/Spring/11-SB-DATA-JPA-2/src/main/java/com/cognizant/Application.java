package com.cognizant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.customer.entity.Customer;
import com.cognizant.customer.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		/*
		Customer cust1 = new Customer(Integer.valueOf(101),"Sunil Joseph", "sunil@hotmail.com");
		Customer cust2 = new Customer();
		cust2.setCustomerId(102);
		cust2.setCustomerName("Sanjay Singh");
		cust2.setCustomerEmail("sanjay.s@gmail.com");
		
		Customer cust3 = new Customer(103,"Naveen", "naveen@hotmail.com");
		Customer cust4 = new Customer(104,"Praveen", "praveen.k@gmail.com");
		Customer cust5 = new Customer(105,"Jeffery", "jefferey@rediff.com");
		
		//List<Customer> customers = Arrays.asList(cust1, cust2, cust3, cust4, cust5);
		List<Customer> customers = new ArrayList<>();
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);
		customers.add(cust5);
		*/
		
		
		CustomerRepository customerRepo = context.getBean(CustomerRepository.class);
		
		//customerRepo.saveAll(customers);
		
		Optional<Customer> optCustomer = customerRepo.findById(101); //pre-defined method
		if(optCustomer.isPresent()) {
			System.out.println(optCustomer);
		}
		
		
		Customer customer = customerRepo.findByCustomerName("Naveen");
		System.out.println(customer);
		
		customer = customerRepo.findByCustomerNameAndCustomerEmail("Praveen", "praveen.k@gmail.com");
		System.out.println(customer);	
		
		
		List<String> customerNames = customerRepo.getAllNames();
		for(String name : customerNames) {
			System.out.println(name);
		}
		
		List<String> customerEmails = customerRepo.findAllEmails();
		for(String email : customerEmails) {
			System.out.println(email);
		}
		
		System.out.println("-------------------------");
		customer = customerRepo.findCustomer("Naveen");
		if(customer != null)
			System.out.println(customer);
		context.close();
	}

}
