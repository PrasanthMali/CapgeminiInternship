package com.cg.jh02.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh02.entity.Account;
import com.cg.jh02.entity.Employee;
import com.cg.jh02.model.Address;
import com.cg.jh02.util.JPAUtil;



public class App01 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Address add1= new Address("1-1-1","street-A","Banglore");
		Address add2= new Address("1-2-1","street-B","Vizag");
		Address add3= new Address("1-1-3","street-C","Chennai");
		Account acc1= new Account("SBI","Kadapa", 12000L);
		Account acc2= new Account("BOB","Banglore", 20000L);
		Account acc3= new Account("AXIS","Kadapa", 15000L);
		Employee e1= new Employee("krishna","Raju",add1,acc1);
		Employee e2= new Employee("Sai","Ram",add2,acc2);
		Employee e3= new Employee("Ravi","Kumar",add3,acc3);
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		txn.commit();
		em.close();
	}

}