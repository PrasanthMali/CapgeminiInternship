package com.cg.cd.ui;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetApp {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("apple");
		hs.add("mango");
		hs.add("kiwi");
		hs.add("banana");
		hs.add("grape");
		hs.add("apple");
		hs.add(null);
		hs.add(null);
		
		
		
		// enhanced for loop
		// iterator
		// we cannot use for loop, since we do not have any index in set
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.remove("kiwi");
		System.out.println(hs);
		
		System.out.println("---------------------------------------");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("apple");
		lhs.add("mango");
		lhs.add("kiwi");
		lhs.add("banana");
		lhs.add("grape");
		lhs.add("apple");
		lhs.add(null);
		System.out.println(lhs);
		System.out.println("----------------------------------------");
		
		TreeSet<String> ths = new TreeSet<>();
		ths.add("apple");
		ths.add("mango");
		ths.add("kiwi");
		ths.add("banana");
		ths.add("grape");
		ths.add("apple");
		System.out.println(ths);
		System.out.println("----------------------------------------");
	
		
		
		

	}

}