package com.cognizant.customer.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.customer.entity.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Serializable> {

	Customer findByCustomerName(String string);

	Customer findByCustomerNameAndCustomerEmail(String string, String string2);
	
	@Query("select customerName from com.cognizant.customer.entity.Customer")
	List<String> getAllNames();
	
	@Query(value = "select customer_email from customers", nativeQuery = true)
	List<String> findAllEmails();
	
	@Query("from com.cognizant.customer.entity.Customer where customerName = :custName")
	Customer findCustomer(String custName);
}
