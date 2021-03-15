package com.cg.oopd.model;

public class ComplexNumber {
	private double realPart;
	private double imaginaryPart;
	public ComplexNumber() {
		realPart = -1;
		imaginaryPart = -1;
		System.out.println("default constructor is called ");
	}
	public ComplexNumber(double realPart) {
		this.realPart = realPart;
		this.imaginaryPart = 0;
		System.out.println("one-parameter constructor is called ");
	}
	public ComplexNumber(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
		System.out.println("two-parameter constructor is called ");
	}
	public ComplexNumber(ComplexNumber other) {
		this.realPart = other.realPart;
		this.imaginaryPart = other.imaginaryPart;
	}
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	public double getRealPart() {		
		return realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	public ComplexNumber add(ComplexNumber other) {
		ComplexNumber result = new ComplexNumber();
		result.realPart = this.realPart + other.realPart;
		result.imaginaryPart = this.imaginaryPart + other.imaginaryPart;
		return result;
	}
	public ComplexNumber diff(ComplexNumber other) {
		ComplexNumber result = new ComplexNumber();
		result.realPart = this.realPart - other.realPart;
		result.imaginaryPart = this.imaginaryPart - other.imaginaryPart;
		return result;
	}
	public static ComplexNumber add(ComplexNumber first, ComplexNumber second) {
		ComplexNumber result = new ComplexNumber();
		result.realPart = first.realPart + second.realPart;
		result.imaginaryPart = first.imaginaryPart + second.imaginaryPart;
		return result;
	}
	public static ComplexNumber diff(ComplexNumber first, ComplexNumber second) {
		ComplexNumber result = new ComplexNumber();
		result.realPart = first.realPart - second.realPart;
		result.imaginaryPart = first.imaginaryPart - second.imaginaryPart;
		return result;
	}
}