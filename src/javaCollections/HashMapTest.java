package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Earth");
		hm.put(2, "Mercury");
		hm.put(3, "Neptune");
		hm.put(4, "Pluto");
		hm.put(5, "Jupiter");
		hm.put(6, "Saturn");
		hm.put(7, "Moon");

		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println();
		
		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() +"--" +m.getValue());
		}

	}

}
