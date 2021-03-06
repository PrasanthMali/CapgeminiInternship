package com.cg.hord.ui;

import com.cg.hord.model.CircularHoarding;
import com.cg.hord.model.Estimator;
import com.cg.hord.model.RectangularHoarding;


public class EstimatorApp {

	public static void main(String[] args) {
		Estimator e1 = new Estimator(105, 55); 
		RectangularHoarding r = new RectangularHoarding(58, 21.56);
		CircularHoarding c = new CircularHoarding(9);
		
		System.out.println(e1.getBorderCost(r) + e1.getPaintCost(r));
		System.out.println(e1.getBorderCost(c) + e1.getPaintCost(c));
	}

}