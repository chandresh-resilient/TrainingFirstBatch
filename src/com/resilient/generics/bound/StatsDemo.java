package com.resilient.generics.bound;

public class StatsDemo {

	public static void main(String[] args) {
		Integer[] intarr = { 5, 6, 7, 8 };
		Stats<Integer> ints = new Stats<Integer>(intarr);
		System.out.println(ints.average());
	}
}
