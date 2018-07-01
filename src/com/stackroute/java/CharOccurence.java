package com.stackroute.java;

public class CharOccurence {
	public static int characterCounting(String str, char c){
		int count = (int) str.chars().filter(ch->ch==c).count();
		return count;
	}
	

}
