package com.cognizant.except;

public class CmdArgsTest {

	public static void main(String[] args) {
		System.out.println("No of command-line Arguments = "+ args.length);
		if(args.length > 0) {
			for(String arg : args) {
				System.out.println(arg);
			}
		}
		else {
			System.out.println("No command-line arguments provided");
		}
	}
}
