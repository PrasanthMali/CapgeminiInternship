package com.cg.shape.model;

public abstract class Shape {
	public abstract double area();
	public abstract double perimeter();
	
	@Override
	public String toString() {
		return "Area : " + area() + "\t" + "Perimeter : " + perimeter();
	}
}
