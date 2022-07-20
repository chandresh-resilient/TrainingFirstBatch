package com.resilient.generics.wildcard;

public class Stats<T extends Number> {
	T[] nums;

	public Stats(T[] o) {
		nums = o;
	}

	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i].doubleValue();
		return sum / nums.length;
	}

	// what if we want to equate int arr avrage to float array
	boolean isEqualAvrage(Stats<T> stats) {
		return true;
	}
}
