
public class FloatingPointTypes {

	public static void main(String[] args) {
		//float sal = 7500.5; //Type mismatch: cannot convert from double to float
		//float sal = 7500.5f;
		//float sal = 7500.5F;
		float sal = (float) 7500.5;
		System.out.println("My Salary = Rs." + sal);
		
		double data = 78548.5;
		System.out.println(data);
	}

}
