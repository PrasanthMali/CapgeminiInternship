package com.cg.inher.ui;

import com.cg.inher.model.ContractEmployee;
import com.cg.inher.model.Employee;
import com.cg.inher.model.Manager;
import com.cg.inher.model.Person;
public class InheritanceApp {

	public static void main(String[] args) {
		Person person = new Person("srinivas", 54);
		System.out.println(person);
		
		Employee employee = new Employee("vamsi", 35, 56000);
		System.out.println(employee);
		
		Manager manager = new Manager("divya", 46, 78000, 15000);
		System.out.println(manager);
		
		ContractEmployee contractEmployee = new ContractEmployee("suman", 21, 15000, 60);
		System.out.println(contractEmployee);
	}

}
