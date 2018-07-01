package com.stackroute.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stackroute.java.HarryCheck;

public class HarryCheckTest {

	@Test
	void testHenryCheck() {
		String str = "This is Harry.";
		assertEquals(true,HarryCheck.harryCheck(str));
		assertEquals(false,HarryCheck.harryCheck("sjcnsdkcj"));
	}

}
