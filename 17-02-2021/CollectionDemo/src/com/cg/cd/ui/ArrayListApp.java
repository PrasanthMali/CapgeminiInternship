package com.cg.cd.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListApp {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(); // generic collection (or) type-safe

		System.out.println(al.size());

		al.add(10); // auto-boxing
		al.add(20);
		al.add(30);

		for (Integer data : al) {
			System.out.println(data);
		}

		al.remove(1);
		al.set(0, 11);

		System.out.println(al);

		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(11);
		al2.add(12);
		al2.add(13);

		ArrayList<Integer> al3 = new ArrayList<>();
		al3.add(13);
		al3.add(11);
		al3.add(12);

		System.out.println(al2 == al3);
		System.out.println(al2.equals(al3));

		ArrayList<Double> ald = new ArrayList<>(); // type inference
		ald.add(1.5);
		ald.add(2.6);
		ald.add(3.7);
		ald.add(5.0);

		for (Double data : ald) {
			System.out.println(data);
		}

		ArrayList<String> als = new ArrayList<>();
		als.add("Java");
		als.add("C++");
		als.add("Python");

		for (String data : als) {
			System.out.println(data);
		}

		if (!al.isEmpty()) {
			System.out.println(al.size());
		}
		System.out.println(ald);
		System.out.println(als);

		System.out.println("------------------------------------");

		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		ArrayList<String> names = new ArrayList<>();
		names.add("srinivas");
		names.add("radha");
		names.add("kiran");
		names.add("vamsy");

		Collections.sort(names);
		System.out.println(names);

		int found = Collections.binarySearch(names, "kiran");
		if (found >= 0)
			System.out.println("found");
		else
			System.out.println("not found");

		ArrayList<String> voters = new ArrayList<>();
		voters.add("sunil");
		voters.add("narayana");

		Collections.fill(voters, "anonymous");
		System.out.println(voters);

		ArrayList<Integer> inputList = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter number : ");
			int n = scan.nextInt();
			inputList.add(n);
		}scan.close();

		System.out.println(inputList);
	}

}