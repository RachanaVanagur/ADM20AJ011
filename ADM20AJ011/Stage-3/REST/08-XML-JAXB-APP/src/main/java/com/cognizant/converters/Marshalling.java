package com.cognizant.converters;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.cognizant.binding.Customer;

public class Marshalling {

	public static void main(String[] args) throws JAXBException {
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Sunil Joseph");
		customer.setCustomerEmail("sunil.j@gmail.com");
		System.out.println(customer);
		
		//convert Java Object (Domain Model) to XML
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(customer, new File("target/customer.xml"));
		
		//to write marshalled XML to console
		StringWriter xmlWriter = new StringWriter();
		marshaller.marshal(customer, xmlWriter);
		System.out.println(xmlWriter.toString());
	}

}
