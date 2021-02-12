enum Student
{
 Sunil(36), Sherif(35), Praveen(39), Naveen(29);

 private int age; 

 int getAge() 
 {
    return age; 
 }

 Student(int age)
 {
  System.out.println("** - "+age);
  this.age= age;
 }
}


class EnumTest2 
{
	public static void main(String[] args) 
	{
		Student stud;
		stud = Student.Sunil;
		System.out.println("Age of Sunil = " + stud.getAge());
		System.out.println("Age of Sherif = " + Student.Sherif.getAge());
	}
}
