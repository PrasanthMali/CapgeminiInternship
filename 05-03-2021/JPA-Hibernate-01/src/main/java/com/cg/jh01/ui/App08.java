package com.cg.jh01.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Product;
import com.cg.jh01.util.JPAUtil;

public class App08 {
	public static void main(String []args) {
		EntityManager em = JPAUtil.getEntityManager();
		Product p1=new Product(null, "MOUSE");
		Product p2=new Product(null, "WEB-CAM");
		Product p3=new Product(null, "KEYBOARD");
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		txn.commit();
	}
}