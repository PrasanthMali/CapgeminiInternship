package com.cg.jd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementInsertDemo {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "amma");Scanner scan = new Scanner(System.in);) {
			Statement st = con.createStatement();
			// String sql = "INSERT INTO departments (deptno, dname, location) VALUES (40, 'marketing', 'trivendram')";
			System.out.println("Enter the deptno : ");
			int deptno = scan.nextInt();
			System.out.println("Enter the dname : ");
			String dname = scan.next();
			System.out.println("Enter the location : ");
			String location = scan.next();
			String sql = "INSERT INTO departments (deptno, dname, location) VALUES("
					+ deptno + ",'"
					+ dname + "', '"
					+ location + "')";
			st.executeUpdate(sql);
			System.out.println("Row is inserted");
		} catch(SQLException excep) {
			System.out.println(excep.getMessage());
		}
	}
}