package com.cognizant.util;

public class Main {

	public static void main(String[] args) {
		String pwd = "password123";
		String pwdEncoded = EncoderDecoderUtils.encodeString(pwd);
		System.out.println("Encoded Password = "+ pwdEncoded);
		
		String pwdDecoded = EncoderDecoderUtils.decodeString(pwdEncoded);
		System.out.println("Decoded Password = " + pwdDecoded);
	}

}
