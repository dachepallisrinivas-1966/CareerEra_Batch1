package com.ce.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("ramesh");
		names.add("david");
		names.add("fazil");
		names.add("john");
		
		
		Collections.sort(names);
		Collections.reverse(names);
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
 