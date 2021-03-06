package com.cg.jp.ui;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.cg.jp.entity.Product;
import com.cg.jp.util.JPAUtil;

public class UpdateRate {
	public static void main(String[]args) {
		EntityManager em = JPAUtil.getEntityManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pId to update the unit_rate : ");
		Long pId=sc.nextLong();
		Product product = em.find(Product.class, pId);
		if (product == null) {
			System.out.println("Product with id #" + "not found.");
		}
		else {
			EntityTransaction txn = em.getTransaction();
			System.out.println("Enter the unit_rate : ");
			Double unitRate=sc.nextDouble();
			product.setUnitRate(unitRate);
			txn.begin();
			//product.setUnitRate(unitRate);
			//em.setProperty("unitRate", unitRate);
			em.merge(product);
			txn.commit();
		}
		sc.close();
		em.close();
	}
}