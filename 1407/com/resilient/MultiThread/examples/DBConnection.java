package com.resilient.MultiThread.examples;

public class DBConnection implements Runnable {
	
	private  String dbUrl;

	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println(Thread.currentThread().getName() + " dbUrl   " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}

	}

	public DBConnection(String dbUrl) {
		super();
		this.dbUrl = dbUrl;
	}
}
