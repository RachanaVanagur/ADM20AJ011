package com.cognizant.util;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordEncryptor {

	public PasswordEncryptor() {
		super();
		System.out.println("***** PasswordEncryptor :: Constructor *****");
	}
	public String encryptPassword(String pwd) {		
		Encoder encoder = Base64.getEncoder();
		byte[] encodedBytes = encoder.encode(pwd.getBytes());
		String encodedData = new String(encodedBytes);
		return encodedData;
	}
}
