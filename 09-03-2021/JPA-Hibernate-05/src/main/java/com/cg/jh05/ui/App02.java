package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App02 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Query query = em.createQuery("SELECT e FROM Employee e");
		
		@SuppressWarnings("unchecked")
		List<Employee> empList = (List<Employee>) query.getResultList();
		
		empList.forEach(System.out::println);
				
		JPAUtil.shutdown();
	}
}