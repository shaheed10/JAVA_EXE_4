package com.stackroute.java;

import java.util.Arrays;

public class StringTranspose {
	public static String transpose1(String str) {
		
		{
			int i=0;
			String[] arr = str.split(" ");
			String[] reversed = new String[arr.length];
			for(String ss : arr)
			{
				StringBuffer buff = new StringBuffer(ss);
				reversed[i]=buff.reverse().toString();
				i++;
			}
			String rev = Arrays.toString(reversed);
			System.out.println(rev);
			return rev;
		}
}}


