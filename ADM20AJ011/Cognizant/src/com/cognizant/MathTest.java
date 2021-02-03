//Static Imports Example

package com.cognizant;

import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest {

	public static void main(String[] args) {
		out.println(E);
		out.println(PI);
		
		out.println(sin(0));
		out.println(cos(0));
		
		out.println(sqrt(25));
		out.println(min(10, 20));
		out.println(max(10, 20));
		
		out.println(floor(10.5)); //10.0
		out.println(ceil(10.5)); //11.0
		
		out.println(round(10.558));
		
		double rand = random();
		out.println(rand);
		int otp = (int)(rand*10000);
		out.println("OTP = "+ otp);
	}
}
