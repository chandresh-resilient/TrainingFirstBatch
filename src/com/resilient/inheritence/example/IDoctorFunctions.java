package com.resilient.inheritence.example;

public interface IDoctorFunctions {

	void breath();
	void eat();
	MriScan doMRISCAN();
	public default void openUrmouth() {
		System.out.println("Cant open my mouth......");
	}
	
}
