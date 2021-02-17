package com.cognizant.util;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Current Date = " + cal.getTime());
		
		System.out.println("Date = "+ cal.get(Calendar.DATE));
		System.out.println("Month = "+ cal.get(Calendar.MONTH)); //Month is ranging from 0 to 11 (0-Jan & 11-Dec)
		System.out.println("Year = "+ cal.get(Calendar.YEAR));
		
		/*
		cal.add(Calendar.DATE, -15);
		System.out.println("15 days before the Date was : "+ cal.getTime());
		*/
		
		cal.add(Calendar.MONTH, 5);
		System.out.println("5 months after date will be : "+ cal.getTime());
	}
}
