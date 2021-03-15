package com.cg.ld.ui;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String str = "java is an object-oriented programming language";
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		String str1 = "10,20,30,40";
		st = new StringTokenizer(str1, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		st = new StringTokenizer(str1, ",", true);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}