package com.ce.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); 	
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(35);
		
		for(int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		System.out.println("-------------------------------------------");
		
		list.remove(0);
		list.set(0, 25);
		
		for(Integer data : list) {
			System.out.println(data);
		}
		System.out.println("-------------------------------------------");
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------------------------------------");
		System.out.println("array list in reverse order ...");
		ListIterator<Integer> lit = list.listIterator(list.size());
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
