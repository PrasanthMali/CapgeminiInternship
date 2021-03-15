package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App07 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		// named query provided with the positional parameters
		TypedQuery<Employee> tqry = em.createNamedQuery("specific_employees", Employee.class);
		tqry.setParameter(1, 45000.0);
		tqry.setParameter(2, 50000.0);

		List<Employee> employees = tqry.getResultList();
		
		if (employees.isEmpty()) {
			System.out.println("No employees found");
		} else {
			employees.forEach(System.out::println);
		}	
		JPAUtil.shutdown();
	}
}