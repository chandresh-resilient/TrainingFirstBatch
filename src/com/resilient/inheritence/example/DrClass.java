package com.resilient.inheritence.example;

import com.resilient.inheritence.living.IRich;
import com.resilient.inheritence.living.RichAndEducated;
import com.resilient.inheritence.living.RichAndStupid;

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

	public static void main(String[] args) {
		IRich rich = new RichAndStupid();
		IRich rich2 = new RichAndEducated();
		extracted(rich, rich2);
	}

	private static void extracted(IRich rich, IRich rich2) {
		rich.showOffMoney();
		rich2.showOffMoney();
	}
}
