package com.resilient.generics.stats;

public class StatsExample {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 189 };
		Stats<Integer> newStats = new Stats(arr);
		Stats<Integer> newStats123 = new Stats(arr);
		System.out.println(newStats.avarage());
		Double[] arrd = { 1.0, 2.0, 3.0, 4.78, 5.0, 189.0 };
		Stats<Double> newStatsD = new Stats(arrd);
		System.out.println(newStatsD.avarage());

		System.out.println(newStats.isAvrageSame(newStats123));
		System.out.println(newStats.isAvrageSame(newStatsD));
	}
}
