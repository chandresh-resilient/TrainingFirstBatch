package com.resilient.MultiThread.examples;

public class Example {
	public static void main(String[] args) throws InterruptedException {
		

		APIConnections api = new APIConnections("http://google.com");
		DBConnection db = new DBConnection("jdbcurl");
		Thread t1 = new Thread(api);
		Thread t2 = new Thread(db);
		t1.start();
		t2.start();
		
		// join()
		Thread.sleep(1000);
		t1.wait();
		System.out.println("waiting fr threds to complete");
		
		[Hi this is chandresh]
		[Intermediate Btech..api.]
		[Allahabad Pune ..api..api.]
				
		Hi Alla Inter Pune this api

	}
}
