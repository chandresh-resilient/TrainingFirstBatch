package com.resilient.generics.wild;

import com.resilient.intro.Car;

public class TestTypeImplementation<C extends FourD, R extends Car, A extends FourD> implements TestTypeParam<C> {

	@Override
	public double addZ(C threed) {
		// TODO Auto-generated method stub
		return 0;
	}

}
