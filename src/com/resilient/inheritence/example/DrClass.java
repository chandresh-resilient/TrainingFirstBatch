package com.resilient.inheritence.example;

public class DrClass {

	public void diagnoseBreathing(IDoctorFunctions animal) {
		
		MRIScan scan= animal.doMRISCAN();
		if(scan.abc>700) {
			animal.eat();
			System.out.println("DrClass.diagnoseBreathing() animal ok");
		}
		else {
			System.out.println("DrClass.diagnoseBreathing() animal dead.....");
		}
		
	}
}
