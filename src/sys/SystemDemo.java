package sys;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SystemDemo {
	public static void main(String[] args) {
		System.out.println("lakdlaks;dlka;sldk; lka;dka;lsdkd;laksd");
		Map<String, String> getenv = System.getenv();
		for (Iterator<Entry<String, String>> iterator = getenv.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, String> next = iterator.next();
			System.err.println(next.getKey() + "           " + next.getValue());

		}
	}
}
