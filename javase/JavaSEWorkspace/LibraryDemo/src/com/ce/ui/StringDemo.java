package com.ce.ui;

public class StringDemo {

	public static void main(String[] args) {
		String str = "JaVa";
					//0123
		System.out.println(str);	
		
		str.toUpperCase();
		System.out.println(str);		// JAVA
		
		str.toLowerCase();
		System.out.println(str);		// java
		
		
//		str = str.toUpperCase();
//		System.out.println(str);
		
		System.out.println(str.indexOf("a"));		// 1
		System.out.println(str.lastIndexOf("a"));	// 3
		System.out.println(str.startsWith("Ja"));
		System.out.println(str.endsWith("Va"));
		System.out.println(str.contains("JaV"));
		System.out.println(str.charAt(0));
		System.out.println(str.substring(1)); 		// aVa	
		System.out.println(str.substring(1, 3)); 	// aVa	
		
		
		System.out.println(str.replace('a', 'b'));
		System.out.println("---------------------------------------------------------");

		String str2 = "hello";			// "hello" is called string literal
		String str3 = "hello";
		System.out.println(str2 == str3);		// referfences are compared
		System.out.println(str2.equals(str3));	
		
		String str4 = new String("hai");
		String str5 = new String("hai");
		System.out.println(str4 == str5);   		// references (hash codes)
		System.out.println(str4.equals(str5));		// content
		
		String str6 = new String("hello");
		System.out.println(str2 == str6);
		System.out.println(str2.equals(str6));
		
		String str7 = "cat";
		String str8 = "bat";
		System.out.println(str7.compareTo(str8));
		

		
		
		
	}

}
