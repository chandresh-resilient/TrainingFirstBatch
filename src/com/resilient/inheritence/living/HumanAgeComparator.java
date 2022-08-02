package com.resilient.inheritence.living;

import java.util.Comparator;

public class HumanAgeComparator implements Comparator<Human> {

	@Override
	public int compare(Human arg0, Human arg1) {
		// TODO Auto-generated method stub
		return arg0.age - arg1.age;

	}
}
