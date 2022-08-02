package com.resilient.Exception;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
//		int i = 0;
//		Dog dog=null;  
//		try {
//			// oPen a DB connection
//			dog.breath(); 
//			
//		
//		} 
//		finally {
//			
//			System.out.println("doing final stuff");
//		}
//		System.out.println("after try block....................");

//		int i=0;
//		System.out.println("ExceptionDemo.main()   "+100/i);
//		File file= new File("pqrs.java");
//		FileInputStream io= new FileInputStream(file);
		DBConnection db = new DBConnection();
		db.setJdbcUrl("bla bla bla");
		db.setUname("dsdfs");
		db.setPassword("sdasdads");
		DBConnection db2 = new DBConnection();
		db.setJdbcUrl("bla bla bla");
		db.setUname("dsdfs");
		db.setPassword("sdasdads");
		DBConnection db3 = new DBConnection();
		db.setJdbcUrl("bla bla bla");
		db.setUname("dsdfs");
		db.setPassword("sdasdads");
		try {
		try {
			createConnection(db);
		} catch (WhateverException e) {
			e.printStackTrace();

			throw new Exception("COnnection cration failed....", e);
		}
		}
		catch (Exception e) {
			throw new Exception("COnnection cration failed....", e);
		}

	}

	private static void createConnection(DBConnection db) throws Exception {
		throw new WhateverException(db, "Chal nikal..####################...");

	}
}
