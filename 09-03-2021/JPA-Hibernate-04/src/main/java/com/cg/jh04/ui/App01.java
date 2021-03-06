package com.cg.jh04.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh04.entity.ContractEmployee;
import com.cg.jh04.entity.Employee;
import com.cg.jh04.entity.Manager;
import com.cg.jh04.util.JPAUtil;

public class App01 {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Employee emp = new Employee("Prasanth", 55000.0);
		Manager mgr = new Manager("Sai", 65000.0, 1500.0);
		ContractEmployee cemp = new ContractEmployee("Dileep", 25000.0, 45);
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(emp);;
		em.persist(mgr);;
		em.persist(cemp);;
		txn.commit();
		
		JPAUtil.shutdown();
	}

}
