package com.cg.cd.ui;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorApp {

	public static void main(String[] args) {
		Vector<String> names = new Vector<>();
		System.out.println(names.capacity());
		names.add("a");names.add("b"); names.add("c"); names.add("d"); names.add("e"); 
		names.add("f"); names.add("g"); names.add("h"); names.add("i"); names.add("j"); 
		names.add("k"); 
		System.out.println(names.size());
		System.out.println(names.capacity());
		
		for(int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + "\t");
		}
		System.out.println();
		
		System.out.println("------------------------------------------------------------------------");
		Iterator<String> it =names.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		
		for(String name : names) {
			System.out.print(name + "\t");
		}
		System.out.println();
		
		Enumeration<String> namesList = names.elements();
		while (namesList.hasMoreElements()) {
			System.out.print(namesList.nextElement() + "\t");
		}
		System.out.println();
		
		
		
		
	}

}