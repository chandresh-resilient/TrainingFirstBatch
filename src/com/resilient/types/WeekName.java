package com.resilient.types;

public enum WeekName {
	Sunday(1), Monday(2), Tuesday(3), Wednesday(4), Thursday(5), Friday(6), Saturday(7);

	private int weekOfDay;

	WeekName(int i) {
		this.weekOfDay = i;
	}

	public int getWeekOfDay() {
		return weekOfDay;
	}
}
