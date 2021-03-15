package com.cg.jh01.ui;

import javax.persistence.EntityManager;

import com.cg.jh01.entity.Employee2;
import com.cg.jh01.util.JPAUtil;

public class App10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManager();
		
		Employee2 employee = em.find(Employee2.class, 101L);
		
		if (employee !=null) {
			System.out.println(employee);
		}
		else {
			System.out.println("Employee not found");
		}
		em.close();
	}
}
