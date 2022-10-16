package com.ce.ui;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// Set<String> set = new HashSet<>();
		// Set<String> set = new LinkedHashSet<>();
		Set<String> set = new TreeSet<>();
		set.add("java");
		set.add("c++");
		set.add("python");
		set.add("java");
		// set.add(null);
		System.out.println(set);
		System.out.println("--------------------------------");
		for(String courseName : set) {
			System.out.println(courseName);
		}
		System.out.println("--------------------------------");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------------------");
		
 
	}

}
