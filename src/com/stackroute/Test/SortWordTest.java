package com.stackroute.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stackroute.java.SortWord;

public class SortWordTest {

	@Test
	public void testWordSort() {
		String str1 = "hello world print";

		assertEquals("hello",SortWord.wordSort(str1)[0]);
		assertEquals("print",SortWord.wordSort(str1)[1]);
		assertEquals("world",SortWord.wordSort(str1)[2]);
		
	}

}
