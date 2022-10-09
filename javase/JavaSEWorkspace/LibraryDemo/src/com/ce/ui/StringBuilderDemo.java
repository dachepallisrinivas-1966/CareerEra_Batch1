package com.ce.ui;

import java.nio.file.spi.FileSystemProvider;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("11");
		System.out.println(sb);
		sb.insert(4, " ");
		System.out.println(sb);
		sb.replace(0, 4, "Oracle");
		System.out.println(sb);
		sb.delete(6, 9);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		

	}

}

	