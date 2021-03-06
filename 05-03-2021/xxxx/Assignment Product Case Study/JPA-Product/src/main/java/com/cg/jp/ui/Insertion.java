package com.cg.jp.ui;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.cg.jp.entity.Category;
import com.cg.jp.entity.Product;
import com.cg.jp.util.JPAUtil;

public class Insertion {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Product m1 = new Product(1000L,"Powder",75.0,Category.COSMETIC);
		Product m2 = new Product(2000L,"Maida",160.0,Category.GROCERY);
		Product m3 = new Product(3000L,"Milk_Shake",80.0,Category.DESERT);
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		//em.persist(m1);
		//em.persist(m2);
		//em.persist(m3);
		em.merge(m1);
		em.merge(m2);
		em.merge(m3);
		txn.commit();
		em.close();
	}
}