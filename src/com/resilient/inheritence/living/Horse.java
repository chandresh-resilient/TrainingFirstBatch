package com.resilient.inheritence.living;

import com.resilient.inheritence.example.IDoctorFunctions;
import com.resilient.inheritence.example.MriScan;

public class Horse extends Animal implements IDoctorFunctions {

	public Horse(double volume, double mass) {
		super(volume, mass);
	}

	@Override
	public void breath() {
		System.out.println("Horse Type of breating.....");
	}

	@Override
	public void eat() {
		System.out.println("Horse.eat(............)");

	}

	@Override
	public void openUrmouth() {
		System.out.println("Horse.openUrmouth()");
	}

	@Override
	public MriScan doMRISCAN() {
		return new MriScan(40, 90);
	}
}
