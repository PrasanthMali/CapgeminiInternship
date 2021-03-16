package com.cg.sbwd.model;

public class SimpleInterest {
	private double principal;
	private double time;
	private double rate;
	private double simpleInterest;


	
	public SimpleInterest() {
		/* no implementation required */
	}



	public SimpleInterest(double principal, double time, double rate, double simpleInterest) {
		super();
		this.principal = principal;
		this.time = time;
		this.rate = rate;
		this.simpleInterest = simpleInterest;
	}



	public double getPrincipal() {
		return principal;
	}



	public void setPrincipal(double principal) {
		this.principal = principal;
	}



	public double getTime() {
		return time;
	}



	public void setTime(double time) {
		this.time = time;
	}



	public double getRate() {
		return rate;
	}



	public void setRate(double rate) {
		this.rate = rate;
	}



	public double getSimpleInterest() {
		return simpleInterest;
	}



	public void setSimpleInterest(double simpleInterest) {
		this.simpleInterest = simpleInterest;
	}

	
}