package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App10 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT e FROM Employee e ORDER BY e.salary DESC";
		TypedQuery<Employee> query = em.createQuery(jpql, Employee.class);
		
		List<Employee> empList = query.getResultList();
		empList.forEach(System.out::println);
				
		JPAUtil.shutdown();
	}
}