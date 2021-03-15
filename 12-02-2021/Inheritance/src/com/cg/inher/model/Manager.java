package com.cg.inher.model;

public class Manager extends Employee {
	private double allowance;
	
	public Manager() {
		super();
	}

	public Manager(String name, int age, double salary, double allowance) {
		super(name, age, salary);
		this.allowance = allowance;
	}
	
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public double getAllowance() {
		return allowance;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + "Allowance : " + allowance;
	}

}