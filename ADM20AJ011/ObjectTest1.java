class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Sachin";
		sal = 5000f;
	}

	void displayDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}
	public static void main(String[] args) {
		System.out.println("EMPLOYEE CLASS");
	}
} //Employee

class ObjectTest1
{
	public static void main(String[] args) 
	{
		//create an instance of Employee type
		Employee emp = new Employee();
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//changing the state of an object using its reference
		emp.empno = 101;
		emp.name = "Naveen";
		emp.sal = 2500f;
		//System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);
		emp.displayDetails();
		
		//changing the state of an object using method
		emp.setDetails();
		emp.displayDetails();
	}
}
