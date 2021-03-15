package com.cg.jh02.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh02.entity.Employee;
import com.cg.jh02.util.JPAUtil;

public class App06 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();

		Employee employee = em.find(Employee.class, 1L);
		if (employee != null) {
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			em.remove(employee);
			txn.commit();
		} else {
			System.out.println("Employee not found");
		}
		
		JPAUtil.shutdown();
	}

}