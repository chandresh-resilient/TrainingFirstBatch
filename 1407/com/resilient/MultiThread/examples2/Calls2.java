package com.resilient.MultiThread.examples2;

public class Calls2 extends Thread {

	@Override
	public void run() {
		try {

			System.out.print(getString1());
			System.out.print(getString2());
			System.out.println(getString3());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private String getString1() throws InterruptedException {

		return "prefix..... ";

	}

	private String getString2() throws InterruptedException {
		return Calls.msg;

	}

	private String getString3() throws InterruptedException {
		return "     suffix";

	}
}
