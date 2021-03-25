package com.cognizant;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.cognizant.customer.entity.Customer;
import com.cognizant.customer.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		CustomerRepository custRepo = context.getBean(CustomerRepository.class);

		/*
		  //List<Customer> customers = custRepo.findAll(); 
		  //List<Customer> customers = custRepo.findAll(Sort.by("customerName")); List<Customer> customers =
		  custRepo.findAll(Sort.by("customerName").descending());
		  
		  customers.forEach(entity -> { 
		  	System.out.println(entity); 
		  	try {
		  		Thread.sleep(1500); } catch (InterruptedException e) {e.printStackTrace();}
		  });
		 */
		
		/*
		// int pageNo = 0;
		int pageSize = 3;
		long totalRecords = custRepo.count();
		int pages_count = (int) (totalRecords / pageSize);
		for (int pageNo = 0; pageNo <= pages_count; pageNo++) {
			Page<Customer> page = custRepo.findAll(PageRequest.of(pageNo, pageSize));
			List<Customer> customers = page.getContent();
			customers.forEach(entity -> {
				System.out.println(entity);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			System.out.println("-------------------------");
		}
		*/
		
		//------------------Query By Example ------------------
		Customer customerEntity = new Customer();
		customerEntity.setCustomerName("Smith");
		
		Example<Customer> exmpl = Example.of(customerEntity);
		List<Customer> customers = custRepo.findAll(exmpl);
		if(customers.size() > 0) {
			Customer cust = customers.get(0);
			System.out.println(cust);
		}
		
	}
}
