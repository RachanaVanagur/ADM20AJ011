package com.cognizant.converters;

import java.io.File;
import java.io.IOException;

import com.cognizant.binding.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Serializer {

	public static void main(String[] args) throws IOException {
		
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Sunil Joseph");
		customer.setCustomerEmail("sunil.j@gmail.com");
		System.out.println(customer);
		
		//create an instance of ObjectMapper for Serialization & Deserialization of JSON		
		ObjectMapper objMapper = new ObjectMapper();
		
		//convert customer instance to JSON String
		String customerJson = objMapper.writeValueAsString(customer);
		System.out.println(customerJson);
		
		ObjectWriter objWriter = objMapper.writerWithDefaultPrettyPrinter();
		customerJson = objWriter.writeValueAsString(customer);
		System.out.println(customerJson);
		
		//to write customer JSON data into a file
		//objMapper.writeValue(new File("target/customer.json"), customer);
		
		//objWriter.writeValue(new File("target/customer.json"), customer);
		          //OR
		objMapper
			.writerWithDefaultPrettyPrinter()
			.writeValue(new File("target/customer.json"), customer);
	}

}
