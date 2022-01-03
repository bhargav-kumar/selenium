package javaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		TreeMap<String, String> tm = new TreeMap<String, String>();

		tm.put("7", "Earth");
		tm.put("2", "Mercury");
		tm.put("3", "Neptune");
		tm.put("4", "Pluto");
		tm.put("5", "Jupiter");
		tm.put("6", "Saturn");
		tm.put("1", "Moon");

		System.out.println(tm);
		System.out.println(tm.size());
		System.out.println();

		for (Map.Entry<String, String> m : tm.entrySet()) {
			System.out.println(m.getKey() + "--" + m.getValue());
		}

	}

}
