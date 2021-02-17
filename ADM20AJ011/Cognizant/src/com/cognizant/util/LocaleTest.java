package com.cognizant.util;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		locale = new Locale("hi","IN");//hi - Hindi, IN - INDIA
		System.out.println(locale);
		
		System.out.println("Language: " + locale.getLanguage()); //hi
		System.out.println("Language: "+ locale.getDisplayLanguage()); //Hindi
		
		System.out.println("Country: " + locale.getCountry());
		System.out.println("Country: " + locale.getDisplayCountry());
		
		locale = new Locale("en","US");
		System.out.println(locale);
		
		locale = Locale.FRANCE;
		System.out.println(locale);
		System.out.println("Language: "+ locale.getDisplayLanguage());
		System.out.println("Country: " + locale.getDisplayCountry());
	}
}
