package com.resilient.generics;

public class GenDemo {
	public static void main(String args[]) {
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getob();
		System.out.println("value: " + v);
		System.out.println();

		// iOb = new Gen<Double>(88.0); why this is a error

		Gen<String> strOb = new Gen<String>("Generics Test");
		strOb.showType();
		String str = strOb.getob();
		System.out.println("value: " + str);
	}
}