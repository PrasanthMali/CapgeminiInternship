package com.cg.jh02.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh02.entity.Employee;
import com.cg.jh02.util.JPAUtil;

public class App02 {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		String jpql="SELECT e FROM Employee e ";
		TypedQuery<Employee> tqry=em.createQuery(jpql,Employee.class);
		List<Employee> employees=tqry.getResultList();
		if(employees.isEmpty())
			System.out.println("no products found");
		else 
			employees.forEach(System.out::println);
		em.close();
		}

	}