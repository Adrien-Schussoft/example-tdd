package com.adrien.example_tdd;

import junit.framework.TestCase;

public class MaClassTest extends TestCase {


	public void testCalculer() {
		assertEquals(3,MaClasse.calculer(2,1));
		assertEquals(3,MaClasse.calculer(1, 2));
	}

}
