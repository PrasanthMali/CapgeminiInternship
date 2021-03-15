package com.cg.cd.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationApp {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("java");
		names.add("c++");
		names.add("python");
		names.add("scala");
		
//		for(String name : names) {
//			if (name.equals("c++")) {
//				names.remove(name);
//			} else {
//				System.out.println(name);
//			}
//		}
		
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String currentName = it.next();
			if (currentName.equals("c++")) {
				names.remove(currentName);
			}
			System.out.println(currentName);
		}
		
		
	}

}