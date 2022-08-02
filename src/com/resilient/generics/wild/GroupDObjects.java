package com.resilient.generics.wild;

public class GroupDObjects<T extends TwoD> {
	T[] twoDstuff;

	public GroupDObjects(T[] twoDstuff) {
		super();
		this.twoDstuff = twoDstuff;
	}

}
