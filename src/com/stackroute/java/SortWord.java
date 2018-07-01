package com.stackroute.java;

import java.util.Arrays;

public class SortWord {
	public static String [] wordSort(String str) {
		String[] paragraph = str.split(" ");
		Arrays.sort(paragraph);
		System.out.println(Arrays.toString(paragraph));
		return paragraph;
		
	}

}
