package com.cg.ixd.service;

public class Dummy {
	private int counter = 0;
	
	public int getCounter() {
		return ++counter;
	}
	
	public void doInit() {
		System.out.println("Object Initiated");
	}
	
	public void doBeforeDie() {
		System.out.println("Object dying .....");
	}
}
