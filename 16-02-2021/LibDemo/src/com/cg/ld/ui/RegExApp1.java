package com.cg.ld.ui;

/* Regular Expressions */

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExApp1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter mobile number: ");
		String mobile = scan.nextLine();
		if (Pattern.matches("^\\d{10}$", mobile))
			System.out.println("Valid mobile number!");
		else
			System.out.println("invalid mobile number!");
		scan.close();
		
		String str = new String();
		String str2 = String.join("-", "java", "is", "great");
		System.out.println(str2);
	}

}