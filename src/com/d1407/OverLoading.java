package com.d1407;

public class OverLoading {

	public int add(int a, int b) {
		return a + b;
	}
	public float add(float a, float b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public String add(String a, int b, int c) {
		return (b + c) + a;
	}
	public String add(String a, String b, int c) {
		return (b + c) + a;
	}

}
