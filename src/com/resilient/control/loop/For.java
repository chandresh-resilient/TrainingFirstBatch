package com.resilient.control.loop;

public class For {
	public static void main(String args[]) {
		int n;
		for (n = 10; n > 0; n--)
			System.out.println("tick " + n);
	}

	public static void loopControlVariable() {
		// here, n is declared inside of the for loop
		for (int n = 10; n > 0; n--)
			System.out.println("tick " + n);
	}

	public static void forEach() {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		// use for-each style for to display and sum the values
		for (int x : nums) {
			System.out.println("Value is: " + x);
			sum += x;
		}
		System.out.println("Summation: " + sum);
	}

	public static void forEachNoChange() {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int x : nums) {
			System.out.print(x + " ");
			x = x * 10; // no effect on nums
		}
		System.out.println();
		for (int x : nums)
			System.out.print(x + " ");
		System.out.println();
	}
}
