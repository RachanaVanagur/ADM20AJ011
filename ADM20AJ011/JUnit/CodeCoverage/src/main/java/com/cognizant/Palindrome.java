package com.cognizant;

public class Palindrome {

	public boolean isPalindrome(String inputStr) {
		if(inputStr==null)
			throw new NullPointerException("Input String should not null");
		
		String revStr = reverseStr(inputStr);
		if(revStr.equals(inputStr))
			return true;
		else
			return false;
	}
	private String reverseStr(String input) {
		String rev = "";
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		return rev;
	}
}
