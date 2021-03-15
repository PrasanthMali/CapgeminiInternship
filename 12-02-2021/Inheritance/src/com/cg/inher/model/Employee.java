package com.cg.inher.model;

public class Employee extends Person {
	private double salary;
	
	public Employee() {
		super();
	}
	public Employee(String name,int age,double salary) {
		super(name,age);
		this.salary=salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return getSalary();
	}
	
	@Override
	public String toString() {
		return super.toString()+","+"salary:"+salary;
		

	}

}