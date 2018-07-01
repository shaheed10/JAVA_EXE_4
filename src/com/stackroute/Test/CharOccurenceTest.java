package com.stackroute.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stackroute.java.CharOccurence;

public class CharOccurenceTest {

	@Test
	public void testCount() {
		String str = "Hello World";
		assertEquals(3,CharOccurence.characterCounting(str,'l'));
	
	}

}
