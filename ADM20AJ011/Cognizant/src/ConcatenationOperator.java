
public class ConcatenationOperator {

	public static void main(String[] args) {
		System.out.println("1 + 2 = " + 1 + 2); //1 + 2 = 12
		System.out.println("1 + 2 = " + (1 + 2)); //1 + 2 = 3
		System.out.println(1 + 2 + " = 3"); //3 = 3
		
		int x = 5;
		int y = 10;
		int z = ++x * y--;
		System.out.println(z);
	}

}
