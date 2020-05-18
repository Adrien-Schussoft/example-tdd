package com.adrien.example_tdd;

public class NumberService {

	public int biggestNumber(int[] list) {
		int index = 0;
		int max = Integer.MIN_VALUE;
		for(index = 0; index < list.length ; index++) {
			if (list[index] > max) {
				max = list[index];
			}
		}
		return max;
	}
	
}
