
public class AssignmentOperator {

	public static void main(String[] args) {
		int n = 5;
		n *= n += 10;
		System.out.println(n);
		
		System.out.println("----------------------------");
		
		int a, b, c, d; 
		a=b=c=d=20;
		a += b -= c *= d /= 2;
		
		System.out.println(a); //-160
		System.out.println(b); //-180
		System.out.println(c); //200
		System.out.println(d); //10
	}
}
