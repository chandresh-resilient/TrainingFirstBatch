package com.resilient.inheritence.living;

import com.resilient.inheritence.example.IDoctorFunctions;
import com.resilient.inheritence.example.MriScan;

public class Human extends Animal implements IDoctorFunctions {

	public int netWorth;
	public int punlicityIndex;
	public int educationIndex;
	public int helthIndex;
	public String name;

	public int getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(int netWorth) {
		this.netWorth = netWorth;
	}

	public int getPunlicityIndex() {
		return punlicityIndex;
	}

	public void setPunlicityIndex(int punlicityIndex) {
		this.punlicityIndex = punlicityIndex;
	}

	public int getEducationIndex() {
		return educationIndex;
	}

	public void setEducationIndex(int educationIndex) {
		this.educationIndex = educationIndex;
	}

	public int getHelthIndex() {
		return helthIndex;
	}

	public void setHelthIndex(int helthIndex) {
		this.helthIndex = helthIndex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int age;
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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human h1 = (Human) obj;
			return h1.name.equals(this.name);
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return (int) this.getVolume();
	}
}
