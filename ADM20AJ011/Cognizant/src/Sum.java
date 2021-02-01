import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int fno = sc.nextInt();
		
		System.out.print("enter second no: ");
		int sno = sc.nextInt();
		
		//find the sum
		int sum = fno + sno;
		
		//display result
		System.out.println("Sum = " + sum);
		System.out.println(fno + " + " + sno + " = " + sum);
		
		/*
		System.out.print("Enter your Name: ");
		String name = sc.next();
		System.out.println(name);
		*/
	}

}
