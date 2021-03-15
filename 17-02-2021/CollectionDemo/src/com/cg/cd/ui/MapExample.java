package com.cg.cd.ui;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("srinivas",101);
		hm.put("navya",102);
		hm.put("sravya",105);
		hm.put("ravi",103);
		hm.put("radha",104);
		hm.put("ramesh",101);
		
		for(String key : hm.keySet()) {
			System.out.println(key + " : " + hm.get(key));
		}
		
		for(Integer value : hm.values()) {
			System.out.println(value);
		}
		
		System.out.println("------------------------------------");
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(101, "srinivas");
		lhm.put(102, "navya");
		lhm.put(105, "sravya");
		lhm.put(103, "ravi");
		lhm.put(104, "radha");
		lhm.put(101, "ramesh");
		
		for(Integer key : lhm.keySet()) {
			System.out.println(key + " : " + lhm.get(key));
		}
		
		System.out.println("----------------------------------------");
		
		TreeMap<Integer, String> thm = new TreeMap<>();
		thm.put(101, "srinivas");
		thm.put(102, "navya");
		thm.put(105, "sravya");
		thm.put(103, "ravi");
		thm.put(104, "radha");
		thm.put(101, "ramesh");
		
		for(Integer key : thm.keySet()) {
			System.out.println(key + " : " + thm.get(key));
		}
		System.out.println("----------------------------------------");
		
	}

}