package com.cg.jh02.ui;

import javax.persistence.EntityManager;


import com.cg.jh02.entity.Employee;
import com.cg.jh02.entity.Laptop;
import com.cg.jh02.util.JPAUtil;

public class App03 {
	public static void main(String []args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Employee emp = em.find(Employee.class, 2L);
		System.out.println(emp);
		
		Laptop lap=em.find(Laptop.class, 1L);
		System.out.println(lap.getEmployee());
		
		JPAUtil.shutdown();
		
	}
}