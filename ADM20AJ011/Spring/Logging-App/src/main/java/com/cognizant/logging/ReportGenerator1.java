package com.cognizant.logging;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ReportGenerator1 {
 //Initializing the Logger object for current class
 private static final Logger logger = Logger.getLogger(ReportGenerator1.class);
 
 public static void main(String[] args) {	
	 //PropertyConfigurator.configure("log4j.properties");
	 logger.setLevel(Level.DEBUG);
	 
	 logger.debug("This is a debug message");
	 logger.info("This is an info message");
	 logger.warn("This is a warning message");
	 logger.error("This is an error message");	 
	 logger.fatal("This is a fatal message");
 }
}
