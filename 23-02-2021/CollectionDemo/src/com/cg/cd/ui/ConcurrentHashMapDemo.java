package com.cg.cd.ui;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {

		ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>();
		hashMap.put("A", "Pune");
		hashMap.put("B", "Mumbai");
		hashMap.put("C", "Patiyala");
		hashMap.put("D", "Panjim");
	
		String result= hashMap.search (10, (key,value) -> value.startsWith("P")? "P" :null);
		System.out.println(result);
	}

}