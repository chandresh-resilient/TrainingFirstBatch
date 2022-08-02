package com.resilient.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.resilient.inheritence.living.Human;

public class Mapdemo {

	public static void main(String[] args) {
		Map<String, Human> maps = new HashMap();

		Human human2 = new Human(287938, 452);
		human2.setName("Chandresh");

//		dr.diagnoseBreathing(doctorRef);
//		
		Human human3 = new Human(6785, 4);
		human3.setName("Prateek");

		Human human4 = new Human(31, 451);
		human4.setName("Rishabh1");

		maps.put("First", human2);
		maps.put("Second", human3);
		maps.put("Third", human4);

		for (Entry<String, Human> data : maps.entrySet()) {
			System.out.println(data.getKey() + "     " + data.getValue());
		}
	}
}
