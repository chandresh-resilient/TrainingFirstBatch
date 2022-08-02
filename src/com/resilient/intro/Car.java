package com.resilient.intro;

public class Car {
	private int age;
	private int horsepower;
	private String make;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	void inginition() {
		System.out.println("engin start");
	}

	void steer() {
		System.out.println("car moving");
	}


	public Car(int age, int horsepower, String make) {
		super();
		this.age = age;
		this.horsepower = horsepower;
		this.make = make;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car paramCar = (Car) obj;
			return paramCar.getAge() == this.age && paramCar.getHorsepower() == this.horsepower
					&& paramCar.getMake().equals(this.getMake());

		} else
			return false;
	}

	@Override
	public String toString() {
		return "This is a car with age " + this.age + " make " + this.make;
	}

}
