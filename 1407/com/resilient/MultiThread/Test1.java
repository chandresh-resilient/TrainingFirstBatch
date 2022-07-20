package com.resilient.MultiThread;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		while (i<10) {
			System.out.println("sdasdasdasd");
			Thread.sleep(500);
			i++;
		}
		
		i=0;
		while (i<10) {
			System.out.println("secind loop");
			Thread.sleep(500);
			i++;
		}
	}
}
