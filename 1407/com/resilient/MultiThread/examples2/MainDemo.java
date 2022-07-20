package com.resilient.MultiThread.examples2;

public class MainDemo {
	public static void main(String[] args) {
		Calls call1 = new Calls();
		Calls call2 = new Calls();
		Calls2 call3 = new Calls2();
		call3.start();
		call1.start();
		call2.start();

	}

}
