
public class BitwiseOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		//boolean result = ((a>b) && (a>c++));
		boolean result = ((a>b) & (a>c++));
		System.out.println(result);
		System.out.println(c);
		
		System.out.println(Integer.toBinaryString(10)); //1010
		System.out.println(Integer.toBinaryString(15)); //1111
		
		System.out.println(10 & 15); //10
		System.out.println(10 | 15); //15
		System.out.println(10 ^ 15); //5
	}

}
