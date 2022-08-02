package com.resilient.inheritence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.resilient.inheritence.example.DrClass;
import com.resilient.inheritence.example.IDoctorFunctions;
import com.resilient.inheritence.example.MouthNotFoundException;
import com.resilient.inheritence.living.Animal;
import com.resilient.inheritence.living.Human;
import com.resilient.inheritence.living.HumanAgeComparator;
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
		Human human1 = new Human(31, 451);
		human1.setName("Rishabh");
		//sendToDr(doctorRef);

//
		Human human2 = new Human(287938, 452);
		human2.setName("Chandresh");

//		dr.diagnoseBreathing(doctorRef);
//		
		Human human3 = new Human(6785, 4);
		human3.setName("Prateek");

//		sendToDr(cat);
		List<Human> humans = new ArrayList<>();
		List<List<Human>> humans2D = new ArrayList<>();
		humans.add(human1);
		humans.add(human2);
		Collection<Human> unmodifiableCollection = Collections.unmodifiableCollection(humans);
		Human next = unmodifiableCollection.iterator().next();
		next.educationIndex = 450000;
		humans.add(human3);
		//based on netincome
		humans.sort(new Comparator<Human>() {
			@Override
			public int compare(Human arg0, Human arg1) {
				return arg0.netWorth - arg1.netWorth;
			}
		});
		Object[] array = humans.toArray();
		Human object = (Human) array[0];

		Human[] array2 = humans.toArray(new Human[humans.size()]);

		Human h2 = array2[0];


		Iterator<Human> iterator = humans.iterator();
		while (iterator.hasNext()) {
			Human next2 = iterator.next();
			System.out.println(next2.getName());
		}

		// age based comparison
		humans.sort(new HumanAgeComparator());

		//
		humans.sort((Human h1, Human h2) -> h1.punlicityIndex - h2.punlicityIndex);


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
