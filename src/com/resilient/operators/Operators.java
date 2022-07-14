package com.resilient.operators;

public class Operators {

	public static void main(String[] args) {
		int i = 91;
		int j = 3;
		int p = i + j;
		double q = i * 1.00 / j * 1000;
		int r = i % j;
		boolean b = i > j;
		boolean b1 = i > j;
		boolean b2 = i < j;
		boolean b3 = i >= j;
		boolean b4 = i <= j;

		boolean b5 = i > j && j > p;
		boolean b6 = i > j || (j > p && j == p);

		String abc = null;
		if (abc != null && abc.contains("123")) {

		}
		System.out.println(q);
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i);

	}

}
