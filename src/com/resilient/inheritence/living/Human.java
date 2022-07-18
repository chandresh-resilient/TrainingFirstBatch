package com.resilient.inheritence.living;

import com.resilient.inheritence.example.IAnimalFunctions;

public class Human extends Animal implements IAnimalFunctions {

	public Human(double volume, double mass) {
		super(volume, mass);
	}

	@Override
	public void breath() {
		System.out.println("Human Type of breating.....");
	}

	@Override
	public void eat() {
		System.out.println("eat everything becoz human ...............");
		
	}
}
