package com.resilient.inheritence.living;

import com.resilient.inheritence.example.IDoctorFunctions;
import com.resilient.inheritence.example.MriScan;

public class Cat extends Animal {

	public Cat(double volume, double mass) {
		super(volume, mass);
		System.out.println("Cat.Cat()");
	}

	@Override
	public void breath() {
		System.out.println("Cat Type of breating.....");
	}

}
