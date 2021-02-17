class Parent{
	public void sayHello(){
		System.out.println("Hello from Parent");
	}
	@Deprecated
	public void logicMethod(){
		System.out.println("This is a deprecated method..");
	}
}

class Child extends Parent{
	@Override
	public void sayHello(){
		System.out.println("Hello from Child");
	}
}


class DeprecatedAnnotation 
{
	@SuppressWarnings({"deprecation"})
	public static void main(String[] args) 
	{
		Parent p = new Child();
		p.sayHello();

		p.logicMethod();
	}
}
