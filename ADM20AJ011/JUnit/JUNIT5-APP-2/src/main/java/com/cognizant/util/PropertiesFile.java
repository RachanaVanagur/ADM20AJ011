package com.cognizant.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFile {
 public static Properties getProperties() throws Exception{
	 Properties p = null;
	 
	 ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	 String fileName = "app.properties";
	 
	 File file = new File(classLoader.getResource(fileName).getFile());
	 //System.out.println(file.getPath()+" - "+file.getName());
	 
	 if(file.exists()) {
		 p=new Properties();
		 p.load(new FileInputStream(file));
	 }
	 return p;
 }
}
