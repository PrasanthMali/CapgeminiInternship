package com.cg.jh01.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Employee;
import com.cg.jh01.entity.Laptop;
import com.cg.jh01.util.JPAUtil;

public class App13 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Laptop lap1 = new Laptop("HP");
		Employee emp = new Employee("sai","tarun",lap1);
		
		Laptop lap2 = new Laptop("DELL");
		Employee emp2 = new Employee("Prasanth","Malisetty",lap2);
		
		EntityTransaction txn = em.getTransaction();
		//txn.design();
		em.persist(emp);
		em.persist(lap1);
		em.persist(emp2);
		em.persist(lap2);
		txn.commit();
		
		em.close();
	}
}