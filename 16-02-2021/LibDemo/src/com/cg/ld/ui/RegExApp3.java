package com.cg.ld.ui;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExApp3 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-z]+");		// 1 or more alphabets
		Matcher m = p.matcher("123bbc4343pqr3433");
		while (m.find()) {
			System.out.println("start() : " + m.start());
			System.out.println("end() : " + m.end());
			System.out.println("group() : " + m.group());
		}
		System.out.println("---------------------------------");
		
		// Pattern replacement
		p = Pattern.compile("-+");		// hyphen symbol occurs 1 or more times
		m = p.matcher("----12345-----");
		String output = m.replaceAll("*");
		System.out.println(output);
		
		System.out.println("---------------------------------");
	}

}