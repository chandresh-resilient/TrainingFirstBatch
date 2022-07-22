package com.resilient.intro;

public class RearVieeEnabledCar extends Car{

	public RearVieeEnabledCar(int age, int horsepower, String make) {
		super(age, horsepower, make);
		// TODO Auto-generated constructor stub
	}
	void turnOnRearView(){
		
	}
	@Override
	void inginition() {
		System.out.println("new ignition");
	}
}
