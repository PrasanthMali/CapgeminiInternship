package com.cg.hord.model;

public class CircularHoarding implements Hoarding {

	private double radius;
	
	public CircularHoarding() {
		/* default constructor */
	}
	
	
	public CircularHoarding(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return PIE*radius*radius;
	}

	@Override
	public double getPerimeter() {
		return 2*PIE*radius;
	}
	

}