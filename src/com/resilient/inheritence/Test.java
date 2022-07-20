package com.resilient.inheritence;

import com.resilient.inheritence.example.DrClass;
import com.resilient.inheritence.example.IDoctorFunctions;
import com.resilient.inheritence.example.MouthNotFoundException;
import com.resilient.inheritence.living.Animal;
import com.resilient.inheritence.living.Dog;
import com.resilient.inheritence.living.IEducated;
import com.resilient.inheritence.living.IRich;

public class Test {
	public static void main(String[] args)  {
//		Animal notATree = new Animal(4, 2.75);
//		notATree.live();
//
//		RichAndEducated richPpl = new RichAndEducated();
//		richPpl.showOffMoney();
//		Test test = new Test();
//		test.cometoParty(richPpl);
//		test.ThinkWisly(richPpl);
//		
//
		DrClass dr = new DrClass();

//		Object abc= new Dog(78, 67);
		Animal doctorRef = new Dog(30, 45);
		//sendToDr(doctorRef);

//
//		doctorRef = new Dog(30, 45);
//		dr.diagnoseBreathing(doctorRef);
//		
//		Cat cat = new Cat(30, 45);
//		sendToDr(cat);

	}

	private static void sendToDr(Animal animal) throws MouthNotFoundException {
		if (animal instanceof IDoctorFunctions) {
			DrClass dr = new DrClass();
				dr.diagnoseBreathing((IDoctorFunctions) animal);
			
		} else {
			System.out.println("Test.sendToDr() did not work,.................");
		}

	}

	public void cometoParty(IRich person) {
		System.out.println("Test.spendWithOutThinking()....................");
		;

	}

	public void ThinkWisly(IEducated person) {
		System.out.println("Test.ThinkWisly()");

	}

}
