package com.cognizant;

import java.util.StringTokenizer;

public class Logics {
	
 public static int findLargest(int[] nums) {
	 //int max = 0;
	 int max = nums[0];
	 for(int num : nums) {
		 if(num > max)
			 max = num;
	 }
	 return max;
 }
 
 public static int findCube(int n) {
	 return n*n*n;	 
 }
 
 public static String reverseWords(String str) {	 
	 String revStr = "";
	 StringTokenizer st = new StringTokenizer(str);
	 //System.out.println("No of Tokens = "+ st.countTokens());
	 while(st.hasMoreElements()) {
		 //System.out.println(st.nextToken());
		 String token = st.nextToken();
		 StringBuffer sb = new StringBuffer(token);
		 revStr = revStr+sb.reverse()+" ";
	 }
	 System.out.println(revStr);
	 return revStr;
 }
}
