/*
 * Internationalization (I18N) for currency
 */
package com.cognizant.util;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyTest {
	static void printCurrency(Locale locale) {
		double price = 12500.50;
		NumberFormat numFormat = NumberFormat.getCurrencyInstance(locale);
		
		String priceOnLocale = numFormat.format(price);
		System.out.println(locale.getDisplayCountry()+" = "+ priceOnLocale);
	}
	
	public static void main(String[] args) {
		printCurrency(Locale.US);
		printCurrency(Locale.FRANCE);
		printCurrency(Locale.CHINA);
		printCurrency(Locale.JAPAN);
		
		Locale india = new Locale("hi","IN");
		printCurrency(india);
	}
}
