package com.cg.jh05.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh05.entity.Department;
import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManager();
		
		Employee e1 = new Employee(101L, "Prasanth", "Malisetty", 55000.0, 10);
		Employee e2 = new Employee(102L, "Sai", "Meruva", 25000.0, 20);
		Employee e3 = new Employee(103L, "Siva", "Parchuri", 50000.0, 10);
		Employee e4 = new Employee(104L, "Ramulu", "Vellampalli", 75000.0, 20);
		Employee e5 = new Employee(105L, "Sujatha", "Addepalli", 85000.0, 10);
		Employee e6 = new Employee(106L, "SubbaRao", "Konidela", 95000.0, 20);
		Employee e7 = new Employee(107L, "Annapurnamma", "Naidu", 45000.0, 10);
		
		Department d1 = new Department(10L, "Developement");
		Department d2 = new Department(20L, "Testing");
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		em.persist(e5);
		em.persist(e6);
		em.persist(e7);
		em.persist(d1);
		em.persist(d2);
		txn.commit();
		JPAUtil.shutdown();
	}
}
