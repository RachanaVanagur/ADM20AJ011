package com.cognizant.beans;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("dr")
@DependsOn("dw")
public class DataReader {
 public DataReader() {
	 System.out.println("**** DataReader :: Constructor ****");
 }
}
