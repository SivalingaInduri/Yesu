package com.junit.code;

public class MyMath {

	public int caluculateSum(int[] numbers) {
		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}
		return sum;

	}

}
