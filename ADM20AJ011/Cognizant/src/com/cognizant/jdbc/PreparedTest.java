package com.cognizant.jdbc;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDbConnection();

		PreparedStatement pst = con.prepareStatement("insert into emp(empno,ename,sal) values(?,?,?)");

		Scanner sc = new Scanner(System.in);
		String req = "Y";
		while (req.equalsIgnoreCase("Y")) {
			try {
				System.out.print("enter employee no: ");
				int eno = sc.nextInt();
				sc.nextLine();

				System.out.print("enter emp name: ");
				String name = sc.nextLine();

				System.out.print("enter salary: ");
				float sal = sc.nextFloat();

				pst.setInt(1, eno);
				pst.setString(2, name);
				pst.setFloat(3, sal);

				int n = pst.executeUpdate();
				System.out.println("Employee Saved!");
			} catch (Exception ex) {
				System.out.println(ex.toString());
			}
			System.out.print("do you want to save more employees[Y/N]: ");
			req = sc.next();
		}

		pst.close();
		con.close();
	}

}
