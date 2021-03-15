package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

//import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App12 {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT d.departmentName,e.firstName,e.salary FROM Employee e ,Department d WHERE e.departmentId=e.departmentId";
		
		TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
		
		List<Object[]> empList = query.getResultList();
		
		for(Object[]records:empList) {
			System.out.printf("%-15s%-15s%8s\n",records[0],records[1],records[2]);
		}
				
		JPAUtil.shutdown();
	}
}