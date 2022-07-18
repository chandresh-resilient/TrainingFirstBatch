package com.resilient.inheritence.living;

import com.resilient.inheritence.example.IDoctorFunctions;
import com.resilient.inheritence.example.MriScan;

public class Human extends Animal implements IDoctorFunctions {

	public Human(double volume, double mass) {
		super(volume, mass);
		System.out.println("Human.Human()");
	}

	int getbalance() {
		return 1000000;
	}
	
	@Override
	public void breath() {
		System.out.println("Human Type of breating.....");
	}

	@Override
	public void eat() {
		System.out.println("eat everything becoz human ...............");

	}

	@Override
	public MriScan doMRISCAN() {
		return new MriScan(400000, 880);
	}

	public void dojob() {
		System.err.println("sa,dmasdm.am,ds.,ma");

	}

}
