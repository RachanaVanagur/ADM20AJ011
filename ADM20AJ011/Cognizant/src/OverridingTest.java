class A1{
	int a=10,b=20;
	public void display() {
		System.out.println("Inside class A1");		
	}
}

class B1 extends A1{
	int a=11, b = 22;
	@Override //annotation
	public void display() {
		System.out.println("Inside class B1");
		super.display();
		System.out.println(super.a+" | "+super.b+" | "+this.a+" | "+b);
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.display();		
	}
}
