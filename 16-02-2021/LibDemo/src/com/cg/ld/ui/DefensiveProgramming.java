package com.cg.ld.ui;

public class DefensiveProgramming {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Please give two inputs");
			System.exit(0);
			
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
	
		int c;
		c = a + b;
		System.out.println("Sum : " + c);

		if (b != 0) {
			c = a / b;
			System.out.println("Quotient : " + c);
		} else {
			System.out.println("Infinity");
		}

		c = a * b;
		System.out.println("Product : " + c);

	}

}