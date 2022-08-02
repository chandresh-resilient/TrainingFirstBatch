package com.resilient.functional;

public class Demo {

	public static void main(String[] args) {
//		IProcessNum cube = (i) -> i * i * i;
		IProcessNum cube1 = (i) -> {
			System.out.println(i);
			System.out.println("we are trying to claculate cube of i");
			return i * i * i;
		};
//		IProcessNum sq = new SquareImp();
//		IValue v = () -> 90;
//		IValue vClass = new Value();
//		System.out.println(sq.process(10));
		System.out.println(cube1.process(5));
//		System.out.println(v.getValue());
//		System.out.println(vClass.getValue());
	}

}
