package com.cg.jp.ui;
import javax.persistence.EntityManager;
import com.cg.jp.entity.Product;
import com.cg.jp.util.JPAUtil;

public class FindAProduct {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Product product=em.find(Product.class, 1000L);
		if(product!=null) {
			System.out.println(product);
		}else {
			System.out.println("Product is not found!");
		}
		em.close();
	}
}