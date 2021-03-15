package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
//import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.jh05.util.JPAUtil;

public class App04 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		String jpql = "SELECT e.employeeId, e.firstName, e.lastName FROM Employee e";
		TypedQuery<Object[]> tqry = em.createQuery(jpql, Object[].class);
		List<Object[]> empList = tqry.getResultList();
		for(Object[] record : empList) {
			System.out.printf("%-5s%-15s%-15s\n",record[0],record[1],record[2]);
		}	
		JPAUtil.shutdown();
	}
}