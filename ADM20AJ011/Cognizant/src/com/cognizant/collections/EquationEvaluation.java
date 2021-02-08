package com.cognizant.collections;

import java.util.Stack;

public class EquationEvaluation {

	public static void main(String[] args) {
		String equation = "((a+b)*(c+d)/(e-f))";
		
		Stack<Character> st = new Stack<>();
		int flag=1;
		
		for(int i=0;i<equation.length();i++) {
			char ch = equation.charAt(i);
			if(ch == '(')
				st.push('(');
			else if(ch == ')') {
				if(!st.empty())
					st.pop();
				else {
					flag=0;
					break;
				}
			}
		}
		
		if(flag==1 && st.empty())
			System.out.println(equation+" is VALID");
		else
			System.out.println(equation+" is NOT VALID");
	}

}
