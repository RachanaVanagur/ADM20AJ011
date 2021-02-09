package com.cognizant.ems;

import java.util.Scanner;

import com.cognizant.ems.dao.EmployeeDAO;
import com.cognizant.ems.dao.EmployeeDAOFactory;
import com.cognizant.ems.entity.Employee;

public class EMSMain {
	static Scanner sc = new Scanner(System.in);
	//driver method
	public static void main(String[] args) throws Exception{
		EmployeeDAO empdao = EmployeeDAOFactory.getEmployeeDAO();		
		Employee emp = null;
		while(true) {
			displayMenu();
			System.out.println("-----------------------------");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			case 1:
				emp = readEmployeeData();
				empdao.saveEmp(emp);
				break;
			case 2:				
				break;
			case 3:				
				break;
			case 4:				
				break;
			case 5:				
				break;				
			case 6:
				System.out.println("** BYE BYE**");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("INVALID OPTION.. TRY AGAIN");
				break;				
			}
		}
	}

	private static Employee readEmployeeData() {
		System.out.print("enter empno: ");
		int empno = sc.nextInt();
		System.out.print("enter employee name: ");
		String name = sc.next();
		System.out.print("enter salary: ");
		float sal = sc.nextFloat(); 
		return new Employee(empno,name,sal);
	}

	private static void displayMenu() {
		System.out.println("1.Add Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Delete Employee");
		System.out.println("4.Search Employee");
		System.out.println("5.List Employees");
		System.out.println("6.Exit");		
	}

}
