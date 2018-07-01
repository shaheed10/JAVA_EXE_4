package com.stackroute.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stackroute.java.FindingIndex;

public class FindingIndexTest {

	@Test
	void testSubFinding() {
		String str = "She sells seashells by the seashore";
		assertEquals("4-6 10-12 27-29",FindingIndex.findIndex(str, "se"));
	}
}
