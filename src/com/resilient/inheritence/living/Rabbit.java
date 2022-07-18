package com.resilient.inheritence.living;

import com.resilient.inheritence.example.IDoctorFunctions;
import com.resilient.inheritence.example.MRIScan;

public class Rabbit extends Animal implements IDoctorFunctions {

	public Rabbit(double volume, double mass) {
		super(volume, mass);
		System.out.println("Rabbit.Rabbit()");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public MRIScan doMRISCAN() {
		// TODO Auto-generated method stub
		return null;
	}

}
