package com.cognizant.io;

import java.io.File;

public class ListDirectory {
	public static void main(String[] args) throws InterruptedException {
		File dir = new File("C:/Cognizant/ADM20AJ011");
		if(dir.exists() && dir.isDirectory()) {
			String[] contents = dir.list();
			for(int i=0;i<contents.length;i++) {
				System.out.println((i+1)+". "+contents[i]);
				Thread.sleep(250); //250ms
			}
		}
	}
}