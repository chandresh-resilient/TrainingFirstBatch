package com.resilient.MultiThread;

public class TestSeq {

	public static void main(String[] args) throws InterruptedException {
		TestSeq test1 = new TestSeq();
		TestSeq test2 = new TestSeq();

		test2.run();
		test1.run();
	}

	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println(" Test 2   " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}

	}
}
