package com.cg.jh01.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.model.Address;
import com.cg.jh01.entity.Employee2;
import com.cg.jh01.util.JPAUtil;

public class App09 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Employee2 emp1 = new Employee2(101L, "aaaa", 15000.0, null, new Address("1-1-1","530041","street-A"));
		Employee2 emp2 = new Employee2(102L, "bbbb", 16000.0, null, new Address("2-2-2", "600005","street-B"));
		Employee2 emp3 = new Employee2(103L, "cccc", 17000.0, null, new Address("3-3-3", "521036","street-c"));
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		
		txn.commit();
		
		em.close();

	}

}