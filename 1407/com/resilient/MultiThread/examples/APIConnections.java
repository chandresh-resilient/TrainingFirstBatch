package com.resilient.MultiThread.examples;

public class APIConnections implements Runnable {
	
	private String apiURL;

	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println(Thread.currentThread().getName() + " apiURL   " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}

	}

	public APIConnections(String apiURL) {
		super();
		this.apiURL = apiURL;
	}
}
