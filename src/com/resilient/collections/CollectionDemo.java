package com.resilient.collections;

import java.util.HashSet;
import java.util.Set;

import com.resilient.inheritence.living.Human;

public class CollectionDemo {

	public static void main(String[] args) {
		Set<Integer> test = new HashSet<Integer>();
		test.add(0);
		test.add(1);
		test.add(2);
		test.add(0);
		for (Integer integer : test) {
			System.out.println(integer);
		}

		Human human1 = new Human(31, 451);
		human1.setName("Rishabh");
		// sendToDr(doctorRef);

//
		Human human2 = new Human(287938, 452);
		human2.setName("Chandresh");

//		dr.diagnoseBreathing(doctorRef);
//		
		Human human3 = new Human(6785, 4);
		human3.setName("Prateek");

		Human human4 = new Human(31, 451);
		human4.setName("Rishabh1");

		Set<Human> humans = new HashSet<Human>();
		humans.add(human1);
		humans.add(human2);
		humans.add(human3);
		humans.add(human4);
		for (Human human : humans) {
			System.out.println(human.getName());
		}

	}

}
