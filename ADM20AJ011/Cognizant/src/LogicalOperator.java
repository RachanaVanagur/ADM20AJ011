
public class LogicalOperator {

	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		int c = 30;
		
		boolean result = ((a>b) && (a>c++));
		System.out.println(result);
		System.out.println(c);
	}
}
