class Student{
	long admNo;
	String name;
	String course;
	static long admno=12000; 
	
	Student(String name, String course){
		this.admNo = getAdmno();
		this.name = name;
		this.course = course;
	}
	
	private static long getAdmno() {		
		return ++admno;
	}

	void getDetails() {
		System.out.println(this.admNo+" | "+this.name+" | "+this.course);
	}
}

public class StudentMgmt {

	public static void main(String[] args) {
		Student st1 = new Student("Sunil","ECS"); 
		Student st2 = new Student("Anil","ME");
		Student st3 = new Student("Naveen","CIVIL");
		
		st1.getDetails();
		st2.getDetails();
		st3.getDetails();
	}
}
