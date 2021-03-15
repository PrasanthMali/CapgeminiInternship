package com.cg.shape.ui;

import com.cg.shape.model.Circle;
import com.cg.shape.model.Rectangle;
import com.cg.shape.model.Shape;

public class ShapeApp {

	public static void main(String[] args) {

		Shape shape;
		shape = new Rectangle(10, 5);		// storing sub class object in super class reference variable
		System.out.println(shape);
		
		shape = new Circle(5);		// storing sub class object in super class reference variable
		System.out.println(shape);
		
		Shape [] shapes = {
				new Rectangle(1, 1),
				new Rectangle(2, 2),
				new Circle(3),
				new Circle(4),
				new Rectangle(5, 6)
		};
		
		for(Shape sh : shapes) {
			System.out.println(sh);
		}
	}
}