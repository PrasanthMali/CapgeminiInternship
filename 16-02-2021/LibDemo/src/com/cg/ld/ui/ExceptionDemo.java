package com.cg.ld.ui;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			int c;
			c = a + b;
			System.out.println("Sum : " + c);
			
			try {
				c = a / b;
				System.out.println("Quotient : " + c);
			} catch(ArithmeticException excep) {
				b = 1;
				c = a / b;
				System.out.println("Quotient : " + c);
				System.out.println("Denominator is taken as 1.");
			}
			
			c = a * b;
			System.out.println("Product : " + c);
			
		} catch(ArrayIndexOutOfBoundsException excep) {
			System.out.println("please give two inputs");
		} catch(NumberFormatException excep) {
			System.out.println("inputs must be integers only");
		} finally {
			System.out.println("all exceptions are processed");
		}

	}

}