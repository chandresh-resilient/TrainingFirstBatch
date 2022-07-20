package com.resilient.MultiThread;

public class RunnableDemo implements Runnable {



	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println(Thread.currentThread().getName() + " Runnable demo   " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}

	}
}
