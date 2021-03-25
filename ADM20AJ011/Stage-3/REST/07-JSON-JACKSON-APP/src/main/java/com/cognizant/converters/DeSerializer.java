package com.cognizant.converters;

import java.io.File;

import com.cognizant.binding.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeSerializer {

	public static void main(String[] args) throws Exception{
		//process of parsing a JSON object to Java Object is known JSON DeSerialization
		File jsonDataFile = new File("target/customer.json");
		if(jsonDataFile.exists()) {
			ObjectMapper objMapper = new ObjectMapper();
			Customer cust = objMapper.readValue(jsonDataFile, Customer.class);
			System.out.println(cust);
		}else {
			System.out.println("JSON File is not available!");
		}
	}
}
