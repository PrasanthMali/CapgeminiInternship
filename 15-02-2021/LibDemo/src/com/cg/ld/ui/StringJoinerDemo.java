package com.cg.ld.ui;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// StringJoiner(delimiter)
		StringJoiner joiner = new StringJoiner(",");
		joiner.add("Precious").add("moments").add("begin").add("at");
		System.out.println(joiner);

		// StringJoiner(delimiter, prefix, suffix)
		StringJoiner joiner2 = new StringJoiner(" ", "[", "]");
		joiner2.add("impulse").add("software");
		System.out.println(joiner2);

		StringJoiner joiner3 = joiner.merge(joiner2);
		System.out.println(joiner3);
	}

}