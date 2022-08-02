package com.resilient.types;

import com.resilient.classdemo.BoxClass;

public class TypesIntro {

	public static void main(String[] args) {
		BoxClass box=new BoxClass();
		WeekName weekday = WeekName.Monday;
		if (weekday.equals(weekday.Sunday)) {

		}
	     WeekName[] values = weekday.values();
	     for (WeekName weekName : values) {
			System.out.println(weekName);
		}
		WeekName week = WeekName.valueOf("vvvvvvv");
		System.out.println(week);

	}
}
