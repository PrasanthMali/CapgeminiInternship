package com.cg.jh02.ui;

import java.util.Set;

import javax.persistence.EntityManager;

import com.cg.jh02.entity.Course;
import com.cg.jh02.entity.Student;
import com.cg.jh02.util.JPAUtil;

public class App05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManager();
		Course c1 = em.find(Course.class, 2L);
		if (c1 !=null) {
			System.out.println(c1.getCourseId()+ "\t" + c1.getCourseName());
			Set<Student> students = c1.getStudents();
			students.forEach(System.out::println);
		}
		else {
			System.out.println("No such Course");
		}
		JPAUtil.shutdown();
	}

}
