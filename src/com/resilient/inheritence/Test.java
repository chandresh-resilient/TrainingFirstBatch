package com.resilient.inheritence;

import com.resilient.inheritence.living.Horse;
import com.resilient.inheritence.living.IEducated;
import com.resilient.inheritence.living.IRich;
import com.resilient.inheritence.living.NotATree;
import com.resilient.inheritence.living.RichAndEducated;

public class Test {
	public static void main(String[] args) {
		NotATree notATree = new NotATree(4, 2.75);
		notATree.live();

		RichAndEducated richPpl = new RichAndEducated();
		richPpl.showOffMoney();
		Test test = new Test();
		test.cometoParty(richPpl);
		test.ThinkWisly(richPpl);
		
		Horse horse= new Horse(30, 45);
		
	}

	public void cometoParty(IRich person) {
		System.out.println("Test.spendWithOutThinking()....................");
		;

	}

	public void ThinkWisly(IEducated person) {
		System.out.println("Test.ThinkWisly()");

	}

}
