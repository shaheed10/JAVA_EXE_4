package com.stackroute.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingIndex {
	public static String findIndex(String str , String find) {
        Pattern pattern = Pattern.compile(find);
        Matcher matcher = pattern.matcher(str);
        String index = "";
        while(matcher.find()) {
            index += matcher.start()+"-"+matcher.end()+" ";
        }
        return index.trim();
	
}}
