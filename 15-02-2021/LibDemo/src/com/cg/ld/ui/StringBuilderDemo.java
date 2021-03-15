package com.cg.ld.ui;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("language");
		System.out.println(sb);
		sb.insert(4, " ");
		System.out.println(sb);
		sb.replace(0, 4, "c#");
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}