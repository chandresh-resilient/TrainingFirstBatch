package com.resilient.inheritence.living;

import com.resilient.inheritence.example.IAnimalFunctions;

public class Dog extends Animal implements IAnimalFunctions {

	public Dog(double volume, double mass) {
		super(volume, mass);
	}

	@Override
	public void breath() {
		System.out.println("Dog Type of breating.....");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat()");

	}
}
