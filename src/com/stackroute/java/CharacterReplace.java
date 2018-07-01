package com.stackroute.java;

public class CharacterReplace {
	public static String replace(String str)
	{
		String replaced = new String();
		replaced = str.replaceAll("d","f").replaceAll("l","t");
		return replaced;
	}

}
