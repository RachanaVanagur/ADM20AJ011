package com.cognizant.collections;

public class Employee<T> {
	private T empno;
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(T empno, String name) {
		super();
		this.empno = empno;
		this.name = name;
	}
	
	public T getEmpno() {
		return empno;
	}

	public void setEmpno(T empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [Emp No = " + empno + " | NAME = " + name + "]";
	}

}
