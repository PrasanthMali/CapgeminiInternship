package com.cg.jh01.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Student;
import com.cg.jh01.model.StudentIdentity;
import com.cg.jh01.util.JPAUtil;

public class App11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManager();
		Student s1 = new Student (new StudentIdentity("b.tech", "mech"),"prasanth");
		Student s2 = new Student (new StudentIdentity("b.tech", "cse"),"sindhu");
		Student s3 = new Student (new StudentIdentity("b.tech", "ece"),"divya");
		Student s4 = new Student (new StudentIdentity("b.tech", "civil"),"sravani");
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		txn.commit();
		em.close();
	}

}
