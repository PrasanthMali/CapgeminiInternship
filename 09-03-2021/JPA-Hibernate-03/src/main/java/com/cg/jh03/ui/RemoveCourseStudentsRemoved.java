package com.cg.jh03.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh03.util.JPAUtil;
import com.cg.jh03.entity.Course;

public class RemoveCourseStudentsRemoved {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the CourseId : ");
		long courseId = scan.nextLong();
		Course course = em.find(Course.class, courseId);
		//Course course = em.find(Course.class, 2L);
		if(course !=null) {
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			em.remove(course);
			txn.commit();
		}else {
			System.out.println("No such course available");
		}
		scan.close();
		JPAUtil.shutdown();
	}
}