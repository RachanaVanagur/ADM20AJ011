package com.cognizant.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.cognizant.binding.Customer;

public class UnMarshalling {

	public static void main(String[] args) throws Exception{
		File xmlFile = new File("target/customer.xml"); 
		if(xmlFile.exists()) {			
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
			
			Customer cust = (Customer) unMarshaller.unmarshal(xmlFile);
			System.out.println(cust);
		}
	}

}
