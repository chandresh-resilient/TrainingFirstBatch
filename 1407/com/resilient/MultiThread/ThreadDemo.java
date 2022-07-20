package com.resilient.MultiThread;

public class ThreadDemo extends Thread {

	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println(this.getName() + " ThreadDemo   " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}

	}
}
