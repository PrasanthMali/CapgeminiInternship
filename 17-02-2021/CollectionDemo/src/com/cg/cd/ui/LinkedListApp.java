package com.cg.cd.ui;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		for(int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("---------------------------------------------");
		Iterator<Integer> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------------------------------");
		
		
		ll.set(0, 11);
		ll.remove(1);
		for(Integer data : ll) {
			System.out.println(data);
		}
		
		System.out.println(ll);
		
		ll.addFirst(5);
		ll.addLast(6);
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		
		ll.clear();
		System.out.println(ll);
	}

}