package com.cg.inher.model;
public class ContractEmployee extends Employee {
	private int duration;
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(String name, int age, double salary, int duration) {
		super(name, age, salary);
		this.duration=duration;
	}
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return super.toString()+","+"Duration:"+duration;		
	}
}