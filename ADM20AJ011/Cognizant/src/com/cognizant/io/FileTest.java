package com.cognizant.io;

import java.io.File;
import java.util.Date;

public class FileTest {
 public static void main(String[] args) {
	 File file = new File("C:\\Cognizant\\ADM20AJ011\\Welcome.java");	 
	 File dir = new File("C:/Cognizant/ADM20AJ011");
	 
	 System.out.println("Is Welcome.java exists = " + file.exists());
	 System.out.println("Is ADM20AJ011 directory exists = " + dir.exists());
	 
	 if(file.exists()) {
		 System.out.println("Is it a File = " + file.isFile());
		 System.out.println("Is it a Directory = " + file.isDirectory());
		 System.out.println("Is it a Directory = " + dir.isDirectory());
		 
		 System.out.println("Name = " + file.getName());
		 System.out.println("Path = " + file.getPath());
		 System.out.println("Parent = " + file.getParent());
		 
		 System.out.println("Is Absolute Path = " + file.isAbsolute());
		 System.out.println("Absolute Path = " + file.getAbsolutePath());
		 
		 System.out.println("Size of File = " + file.length()+" bytes");
		 
		 Date modifiedDate = new Date(file.lastModified());
		 System.out.println("Welcome.java is modified on " + modifiedDate);
		 
		 System.out.println("Can Read = " + file.canRead());
		 System.out.println("Can Write = " + file.canWrite());
		 System.out.println("Hidden File = " + file.isHidden());
	 }
	 
	 dir = new File("C:/Cognizant/ADM20AJ011","Java/Batch12");
	 if(!dir.exists()) {
		 System.out.println("Created Directory = " + dir.mkdirs());
	 }
 }
}
