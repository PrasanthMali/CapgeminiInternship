package com.cg.shape.model;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		return length*breadth;
	}

	@Override
	public double perimeter() {
		return 2*(length+breadth);
	}

}