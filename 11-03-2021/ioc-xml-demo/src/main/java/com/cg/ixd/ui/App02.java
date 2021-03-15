package com.cg.ixd.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.ixd.service.Dummy;
//import com.cg.ixd.service.GreetServiceArgumentedImpl;
//import com.cg.ixd.service.GreetServiceImpl;
//import com.cg.ixd.service.IGreetService;

public class App02 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		
		Dummy copy1 = context.getBean("dummy", Dummy.class);
		System.out.println(copy1.getCounter());
		
		Dummy copy2 = context.getBean("dummy", Dummy.class);
		System.out.println(copy2.getCounter());
		
		Dummy copy3 = context.getBean("dummy", Dummy.class);
		System.out.println(copy3.getCounter());
		
		
		((AbstractApplicationContext)context).close();	
	}
}