
public class OverloadingMethods {

	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10.5f, 23);
	}

	private static void add(float f, int j) {		
		float sum = f+j;
		System.out.println("Sum = " + sum);
		
	}

	private static void add(int i, int j, int k) {
		int sum = i+j+k;
		System.out.println("Sum = " + sum);
		
	}

	private static void add(int i, int j) {
		int sum = i+j;
		System.out.println(("Sum = " + sum));
	}

}
