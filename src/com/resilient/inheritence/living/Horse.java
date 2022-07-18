package com.resilient.inheritence.living;

import com.resilient.inheritence.example.IAnimalFunctions;
import com.resilient.inheritence.example.MRIScan;

public class Horse extends Animal implements IAnimalFunctions {

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
	public MRIScan doMRISCAN() {
		return new MRIScan(40, 90);
	}
}
