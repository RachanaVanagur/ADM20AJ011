
public class IntegerDataTypes {

	public static void main(String[] args) {
		byte b = 12;
		System.out.println(b);
		int age = 35;
		System.out.println("My Age is " + age);
		
		long pop = 8458457412L;
		System.out.println("World Population = " + pop);
		
		int n = (int) 12L;		
		System.out.println(n);
		
		System.out.println("Min Value of a Byte type = "+ Byte.MIN_VALUE);
		System.out.println("Max Value of a Byte type = "+ Byte.MAX_VALUE);
		System.out.println("Size of Byte Type = "+ Byte.SIZE+" bits");
		System.out.println("No of Bytes allotted for Byte Type = "+ Byte.BYTES+" byte");
	}
}
