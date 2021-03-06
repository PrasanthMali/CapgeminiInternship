package com.cg.jh01.ui;

//import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Employee;
import com.cg.jh01.util.JPAUtil;

public class App03 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id :");
		Long empID = scan.nextLong();
		
		Employee employee = em.find(Employee.class, empID);
		if (employee==null)
			System.out.println("Employee with ID #" + empID + "not found");
		else {
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			em.remove(employee);
			txn.commit();
		}
		scan.close();
		em.close();
	}
}
