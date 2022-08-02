package com.resilient.generics.non;

public class NonGenericClass<T> {

	public NonGenericClass(T ob) {
		super();
		Ob = ob;
	}

	T Ob;

	public T getOb() {
		return Ob;
	}

	void showType() {
		System.out.println("Type of Object is " + Ob.getClass().getName());
	}
}
