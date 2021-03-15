package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;

import com.cg.jh05.util.JPAUtil;

public class App13 {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		@SuppressWarnings("unchecked")
		List<Object[]>empList=em.createNativeQuery("SELECT first_name,last_name FROM employees5").getResultList();
		for(Object[] record:empList) {
			System.out.printf("%-15s%-15s\n", record[0],record[1]);
		}
				
		JPAUtil.shutdown();

	}

}