package com.resilient.inheritence.example;

public class DrClass {

	public void diagnoseBreathing(IDoctorFunctions animal) throws MouthNotFoundException {
		
		animal.openUrmouth();
		MriScan scan = animal.doMRISCAN();
		if (scan !=null && scan.abc > 700) {
			animal.eat();
			System.out.println("DrClass.diagnoseBreathing() animal ok");
		} else {
			System.out.println("DrClass.diagnoseBreathing() animal dead.....");
		}

	}
}
