package com.resilient.generics.non;

public class NonGenDemo {
	public static void main(String args[]) {
		NonGen iOb;

		iOb = new NonGen(88);
		iOb.showType();
		int v = (Integer) iOb.getob();
		System.out.println("value: " + v);
		System.out.println();
		NonGen strOb = new NonGen("Non-Generics Test");
		strOb.showType();

		String str = (String) strOb.getob();
		System.out.println("value: " + str);
		iOb = strOb;
		v = (Integer) iOb.getob();
		// In essence, through generics, run-time errors are converted into compile-time
		// errors.
	}
}