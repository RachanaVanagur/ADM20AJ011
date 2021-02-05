package com.cognizant.except;

import java.io.IOException;

public class ThrowsTest {

	public static void main(String[] args) throws IOException {
		DataProcessing dProcess = new DataProcessing();
		try {
			dProcess.loadDataFromJson();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		dProcess.loadDataFromJson();
	}
}
