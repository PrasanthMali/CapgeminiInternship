package com.cg.ixd.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.cg.ixd.service.GreetServiceArgumentedImpl;
import com.cg.ixd.service.GreetServiceImpl;
import com.cg.ixd.service.IGreetService;

public class App01 {

	public static void main(String[] args) {
		
		//never use directly sub class to create object
		GreetServiceImpl gs1=new GreetServiceImpl();
		System.out.println(gs1.getGreeting("Prasanth"));
		
		//program to interface method
		IGreetService gs2=new GreetServiceImpl();
		System.out.println(gs2.getGreeting("Sai_Prudhvi"));
		
		//Spring container-IoC
		//ClassPath means src/main
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		IGreetService gs3=(GreetServiceImpl)context.getBean("gsBean");
		System.out.println(gs3.getGreeting("Malisetty"));
		
		System.out.println("------------------------------");
		
		IGreetService gs4=(IGreetService)context.getBean("gsaBean2");
		System.out.println(gs4.hashCode());
		System.out.println(gs4.getGreeting("Prasanth1"));
		
		IGreetService gs5=(IGreetService)context.getBean("gsaBean3");
		System.out.println(gs5.hashCode());
		System.out.println(gs5.getGreeting("Prasanth2"));
		
		System.out.println("------------------------------");
		
		IGreetService gs6=(IGreetService)context.getBean("gsaBean2");
		System.out.println(gs6.hashCode());
		System.out.println(gs6.getGreeting("Prasanth143"));
		
		IGreetService gs7=(IGreetService)context.getBean("gsaBean3");
		System.out.println(gs7.hashCode());
		System.out.println(gs7.getGreeting("Prasanth143143"));
		
		System.out.println("------------------------------");
		
		IGreetService gsadv=(IGreetService)context.getBean("gsadvBean");
		System.out.println(gsadv.hashCode());
		System.out.println(gsadv.getGreeting("Malisetty_Prasanth"));
		
		((AbstractApplicationContext)context).close();
	}
}