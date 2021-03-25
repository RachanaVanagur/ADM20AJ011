package com.cognizant.beans;

import org.springframework.stereotype.Component;

@Component("dw")
public class DataWriter {
 public DataWriter() {
	 System.out.println("**** DataWriter :: Constructor ****");
 }
}
