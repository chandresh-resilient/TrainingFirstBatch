package com.res1.overloading;

public class OverloadTest {
	public static void main(String args[]) {
		OverLoading ob = new OverLoading();
		double result;
// call all versions of test()
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		result = ob.test(123.25);
		System.out.println("Result of ob.test(123.25): " + result);
	}