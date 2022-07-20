package com.resilient.generics.non;

import java.util.ArrayList;
import java.util.List;

public class NonGenericDemo {

	public static void main(String[] args) {

		NonGenericClass<Integer> nonGenericClass = new NonGenericClass(20);

		nonGenericClass.showType();

		System.out.println(nonGenericClass.getOb());
		new ThirdClass().Process(nonGenericClass);
		// 2nd part of program

		NonGenericClass<String> nonGenericString = new NonGenericClass("this is so much fun");

		nonGenericString.showType();

		System.out.println(nonGenericString.getOb());
		new ThirdClass().Process(nonGenericString);

		List<Number> adds = new ArrayList();
		add(adds);

	}

	private static void add(List<Number> numberlist) {
		// TODO Auto-generated method stub

	}
}
