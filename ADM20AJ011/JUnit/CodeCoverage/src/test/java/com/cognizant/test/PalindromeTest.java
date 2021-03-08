package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cognizant.Palindrome;

public class PalindromeTest {

	@Test
	public void testIsPalindrome() {
		String inputStr = "malayalam";
		Palindrome palObj = new Palindrome();
		boolean expected = true;
		boolean actual = palObj.isPalindrome(inputStr);
		assertEquals(expected, actual);
	}
	@Test
	public void testIsPalindrome_01() {
		String inputStr = "cognizant";
		Palindrome palObj = new Palindrome();
		boolean expected = false;
		boolean actual = palObj.isPalindrome(inputStr);
		assertEquals(expected, actual);
	}
	
	@Test(expected=NullPointerException.class)
	public void testIsPalindromeForNull() {
		String inputStr = null;
		Palindrome palObj = new Palindrome();
		boolean expected = true;
		boolean actual = palObj.isPalindrome(inputStr);
		assertEquals(expected, actual);
	}	
}
