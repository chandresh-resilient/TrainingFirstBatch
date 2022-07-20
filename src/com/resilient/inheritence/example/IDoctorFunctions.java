package com.resilient.inheritence.example;


public interface IDoctorFunctions {

	void breath();
	void eat();
	MriScan doMRISCAN();
	public default void openUrmouth() throws MouthNotFoundException {
		throw new MouthNotFoundException("This entity doesnt have this functionality....");
	}
	
}
