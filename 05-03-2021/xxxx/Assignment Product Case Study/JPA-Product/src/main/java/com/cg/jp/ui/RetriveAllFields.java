package com.cg.jp.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jp.entity.Product;
import com.cg.jp.util.JPAUtil;

public class RetriveAllFields {
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		String jpql = "SELECT p FROM Product p";
		TypedQuery<Product> tqry = em.createQuery(jpql, Product.class);
		List<Product> products = tqry.getResultList();
		
		if (products.isEmpty()) {
			System.out.println("No product found");
		}
		else {
			products.forEach (System.out::println);
		}
		em.close();
	}

}
