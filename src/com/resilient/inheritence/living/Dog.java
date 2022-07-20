package com.resilient.inheritence.living;

import com.resilient.inheritence.example.IDoctorFunctions;
import com.resilient.inheritence.example.MriScan;

public class Dog extends Animal implements IDoctorFunctions {

	public Dog(double volume, double mass) {
		super(volume, mass);
	}

	@Override
	public void breath() {
		System.out.println("Dog Type of breating.....");
		super.breath();
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat()");

	}
	


	@Override
	public MriScan doMRISCAN() {
		return new MriScan(40700, 90);
	}
}
