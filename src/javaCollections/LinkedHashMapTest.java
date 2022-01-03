package javaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		lhm.put(1, "Earth");
		lhm.put(2, "Mercury");
		lhm.put(3, "Neptune");
		lhm.put(4, "Pluto");
		lhm.put(5, "Jupiter");
		lhm.put(6, "Saturn");
		lhm.put(7, "Moon");

		System.out.println(lhm);
		System.out.println(lhm.size());
		System.out.println();
		
		for (Map.Entry<Integer, String> m : lhm.entrySet()) {
			System.out.println(m.getKey() +"--" +m.getValue());
		}

	}

}
