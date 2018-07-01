package com.stackroute.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stackroute.java.CharacterReplace;

public class CharacterReplaceTest {

	@Test
	public void testReplace() {
		String str2 = "daily dry";
				assertEquals("faity fry",CharacterReplace.replace(str2));
	}

}
