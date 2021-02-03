final class Parent{
	final void display(){}
}

class Child extends Parent //error: cannot inherit from final Parent
{
	/*
	void display(){} // error: display() in Child cannot override display() in Parent
	*/
}

class FinalTest 
{
	final String name; //blank final variable
	FinalTest(){
		name = "Cognizant";
	}
	/*
	final FinalTest() //error: modifier final not allowed here
 	{}
	*/
	final int n = 12; //instance variable
	public static void main(String[] args) 
	{
		final int n = 25; //local variable
		System.out.println(n);
		//n = 26; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		//obj.n = 26; //error: cannot assign a value to final variable n
		System.out.println(obj.n);
	}
}
