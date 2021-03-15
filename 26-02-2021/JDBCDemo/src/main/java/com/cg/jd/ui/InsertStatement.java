package com.cg.jd.ui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

public class InsertStatement {

	public static void main(String[] args) throws SQLException {
		Statement  statement;
		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","amma"); Scanner sc = new Scanner(System.in);) {
			con.setAutoCommit(false);
			String choice;
            //creating the employees table.
			String sql="CREATE TABLE employees(id int,name varchar(20),dept varchar(20),salary float,bonus float)";
			Statement st = con.createStatement();
			st.execute(sql);
			System.out.println("Table is created with the name employees.");
			System.out.println("Enter the id number : "); 
			int id = sc.nextInt();
			System.out.println("Enter the name : ");
			String name = sc.next();
			System.out.println("Enter the dept name : "); 
			String dept = sc.next();
			System.out.println("Enter the salary : ");
			float salary = sc.nextInt();
			System.out.println("Enter the bonus : ");
			float bonus = sc.nextInt();
			  
			  //inserting data into the table employees
			  
			String sql1 ="INSERT INTO employees(id,name,dept,salary,bonus)VALUES(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setInt(1,id); 
			ps.setString(2,name);
			ps.setString(3,dept);
			ps.setFloat(4,salary);
			ps.setFloat(5,bonus); 
			System.out.println("Enter the choice [Y / N] :" );
			choice = sc.next();
			if (choice.equals("y")) { 
				ps.executeUpdate();
			    System.out.println("Row is inserted in the employees table."); 
			    con.commit();
			}
			else { 
				con.rollback();
			    System.out.println("Operation is Cancelled");
			} 
			statement = con.createStatement(); 
			ps.close();
		} catch (SQLException excep) {
			System.out.println(excep.getMessage());
		}
	}
}
			 