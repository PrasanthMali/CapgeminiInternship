package com.cg.hord.model;

public class Estimator {
	private double unitPaintRate;
	private double unitBorderRate;
	
	public Estimator() {
		/* default constructor */
	}

	public Estimator(double unitPaintRate, double unitBorderRate) {
		this.unitPaintRate = unitPaintRate;
		this.unitBorderRate = unitBorderRate;
	}
	
	public double getUnitPaintRate() {
		return unitPaintRate;
	}

	public void setUnitPaintRate(double unitPaintRate) {
		this.unitPaintRate = unitPaintRate;
	}

	public double getUnitBorderRate() {
		return unitBorderRate;
	}

	public void setUnitBorderRate(double unitBorderRate) {
		this.unitBorderRate = unitBorderRate;
	}
	
	/* observe the parameter of type Hoarding which is an interface */
	public double getPaintCost(Hoarding hoarding) {
		return hoarding.getArea()*unitPaintRate;
	}
	
	/* observe the parameter of type Hoarding which is an interface */
	public double getBorderCost(Hoarding hoarding) {
		return hoarding.getPerimeter()*unitBorderRate;
	}
	
	
	

}