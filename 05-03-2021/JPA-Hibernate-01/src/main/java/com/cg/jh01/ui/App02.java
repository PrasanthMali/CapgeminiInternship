package com.cg.jh01.ui;

//import java.time.LocalDate;

import javax.persistence.EntityManager;
//import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Employee;
import com.cg.jh01.util.JPAUtil;

public class App02 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Employee employee = em.find(Employee.class, 106L);
		if (employee!=null)
			System.out.println(employee);
		else
			System.out.println("Employee not found.");
		em.close();
	}
}
