package com.stackroute.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stackroute.java.StringTranspose;

public class StringTransposeTest {
	@Test
	void testTransposing() {
		String str = "a quick brown fox jumps over the lazy dog";
		assertEquals("[a, kciuq, nworb, xof, spmuj, revo, eht, yzal, god]",StringTranspose.transpose1(str));
	}

}
