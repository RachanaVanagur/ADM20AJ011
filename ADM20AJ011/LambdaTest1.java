@FunctionalInterface
interface Greetings{
 public void sayHello();   
}
/*
class GreetingsImpl implements Greetings{
	public void sayHello(){
		System.out.println("Hello, Good Morning");
	}
}
*/
class LambdaTest1 
{
	public static void main(String[] args) 
	{
		Greetings greet = () -> {System.out.println("Hello, Good Morning");};		

		greet.sayHello();
	}
}
