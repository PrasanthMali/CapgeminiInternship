package com.cg.hord.model;

public class RectangularHoarding implements Hoarding {
	private double length;
	private double breadth;
	
	public RectangularHoarding() {
		/* default constructor */
	}
	
	public RectangularHoarding(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getBreadth() {
		return breadth;
	}


	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	
	@Override
	public double getArea() {
		return length*breadth;
	}

	@Override
	public double getPerimeter() {
		return 2*(length+breadth);
	}

}