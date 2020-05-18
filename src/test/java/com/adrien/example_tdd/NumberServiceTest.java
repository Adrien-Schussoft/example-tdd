package com.adrien.example_tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberServiceTest {

	@Test
	public void testBiggestNumber() {
		int[] list = new int[] {7,8,9};
		NumberService numberService = new NumberService();
		int biggest = numberService.biggestNumber(list);
		assertEquals(9,biggest);
		
		int[] list2 = new int[] {1,2,3};
		int biggest2 = numberService.biggestNumber(list2);
		assertEquals(3,biggest2);
		
	}

}
