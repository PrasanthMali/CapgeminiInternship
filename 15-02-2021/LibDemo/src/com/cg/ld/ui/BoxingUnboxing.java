package com.cg.ld.ui;

public class BoxingUnboxing {

	public static void main(String[] args) {
		int x = 10;
		Integer iObj = x;			// auto-boxing
		System.out.println(iObj);
		
		Integer iOb = new Integer(11);
		int y = iOb;				// auto-unboxing
		System.out.println(y);
		
		String s1 = "95";
		int a = Integer.parseInt(s1);
		System.out.println(a);
		
		String s2 = "6.78";
		double b = Double.parseDouble(s2);
		System.out.println(b);

	}

}