package com.resilient.types.conversion;

//Demonstrate casts.
public class TypeCpnversion {
	public static void main(String args[]) {
		byte b;
		int i = 257;
		double d = 323.142;
		System.out.println("\nConversion of int to byte.");
		b = (byte) i;
		System.out.println("i and b " + i + " " + b);
		System.out.println("\nConversion of double to int.");
		i = (int) d;
		System.out.println("d and i " + d + " " + i);
		System.out.println("\nConversion of double to byte.");
		b = (byte) d;
		System.out.println("d and b " + d + " " + b);
	}

	public static void promote() {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		double result = (f * b) + (i / c) - (d * s);
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);
	}
}