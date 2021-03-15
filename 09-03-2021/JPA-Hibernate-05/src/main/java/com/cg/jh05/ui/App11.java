package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

//import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App11 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT e.departmentId,COUNT(e) FROM Employee e GROUP BY e.departmentId ";
		TypedQuery<Object[]> tqry = em.createQuery(jpql,Object[].class);
		
		List<Object[]> empList = tqry.getResultList();
		
		for(Object[] record :empList) {
			System.out.printf("%-5s%-15s\n",record[0],record[1]);
		}
		String jpql2 = "SELECT e.departmentId,COUNT(e) FROM Employee e GROUP BY e.departmentId HAVING COUNT(e) > 3";
		TypedQuery<Object[]> tqry2 = em.createQuery(jpql2,Object[].class);
		
		List<Object[]> empList2 = tqry2.getResultList();
		
		for(Object[] record :empList2) {
			System.out.printf("%-5s%-15s\n",record[0],record[1]);
		}
		JPAUtil.shutdown();
	}
}