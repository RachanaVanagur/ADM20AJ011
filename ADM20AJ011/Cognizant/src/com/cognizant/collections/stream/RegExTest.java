package com.cognizant.collections.stream;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".p");//any character with 'p'
		String data = "xp";
		Matcher matcher = pattern.matcher(data);
		boolean result = matcher.matches();
		System.out.println("Does the data matches with Expression = " + result);
	}
}
