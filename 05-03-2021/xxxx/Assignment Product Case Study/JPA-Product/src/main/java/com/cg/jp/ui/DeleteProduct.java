package com.cg.jp.ui;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.cg.jp.entity.Product;
import com.cg.jp.util.JPAUtil;

public class DeleteProduct {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter product id: ");
		Long pId=sc.nextLong();
		Product product=em.find(Product.class, pId );
		if(product==null) {
			System.out.println("Product with id #" + pId + "not found!");
		}else {
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			em.remove(product);
			txn.commit();
		}
		sc.close();
		em.close();
	}
}