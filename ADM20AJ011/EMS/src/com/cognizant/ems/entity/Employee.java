//DTO - Data Transfer Object
package com.cognizant.ems.entity;

public class Employee {
	private Integer empno;
	private String ename;
	private Float sal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empno, String ename, Float sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Float getSal() {
		return sal;
	}

	public void setSal(Float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [" + empno + " | " + ename + " | " + sal + "]";
	}

}
