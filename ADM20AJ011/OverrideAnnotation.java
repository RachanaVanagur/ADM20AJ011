class Parent{
	public void sayHello(){
		System.out.println("Hello from Parent");
	}
}

class Child extends Parent{
	@Override
	public void sayHello(){
		System.out.println("Hello from Chid");
	}
}


class OverrideAnnotation 
{
	public static void main(String[] args) 
	{
		Parent p = new Child();
		p.sayHello();
	}
}
