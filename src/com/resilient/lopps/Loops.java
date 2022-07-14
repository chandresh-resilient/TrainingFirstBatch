package com.resilient.lopps;

public class Loops {
	static int classVariable = 10;

	public static void main(String[] args) throws InterruptedException {
//		int i = 0;
//		int sum = 0;
//		while (i < 100) {
//			sum = sum + i;
//
//			System.out.println("i....." + i++);
//
//		}
//
//		System.out.println(sum);
		forExample();
	}

	private static void forExample() {
		for (int i = 0; i < 10; System.out.println(i++))
			;
		int nums[] = { 1, 2, 3, 0, 5, 6, 7, 8, 9, 10 };
		
		for (int i : nums) {
			System.out.println("from foreach...." + ++i);
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println("from array...." + nums[i]);
		}
	}

}
