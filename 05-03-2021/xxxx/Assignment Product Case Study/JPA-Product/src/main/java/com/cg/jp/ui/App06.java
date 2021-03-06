package com.cg.jp.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jp.entity.Product;
import com.cg.jp.util.JPAUtil;

public class App06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManager();
		String jpql = "SELECT p FROM Product p WHERE rate> :ur";
		TypedQuery<Product> tqry = em.createQuery(jpql, Product.class);
		tqry.setParameter("ur",35);
		List<Product> products = tqry.getResultList();
		
		if (products.isEmpty()) {
			System.out.println("No products found");
		}
		else {
			products.forEach (System.out::println);
		}
		em.close();
	}

}
