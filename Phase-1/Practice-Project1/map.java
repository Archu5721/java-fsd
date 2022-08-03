import java.util.*;
import java.util.Map.Entry;

public class map {
	public static void main(String[] args) {
		// Hashmap
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Kalai");
		map1.put(2, "Muthu");
		map1.put(3, "Seran");
		System.out.println("ELements :");
		for (Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Hashable
		Hashtable<Integer, String> map2 = new Hashtable<Integer, String>();

		map2.put(4, "Vasu");
		map2.put(5, "Thomas");
		map2.put(6, "Leela");
		map2.put(7, "Thiru");

		System.out.println("\nElements: ");
		for (Map.Entry n : map2.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}
		// TreeMap
		TreeMap<String, String> map3 = new TreeMap<String, String>();
		map3.put("8", "Sara");
		map3.put("9", "Cole");
		map3.put("10", "Collin");

		System.out.println("\nThe elements of TreeMap are ");
		for (Map.Entry l : map3.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}

	}

}
