package javaCollections;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) {

		java.util.LinkedHashSet<String> lhs = new java.util.LinkedHashSet<String>();

		lhs.add("Monday");
		lhs.add("Tuesday");
		lhs.add("Wednesday");
		lhs.add("Thursday");
		lhs.add("Friday");
		lhs.add("Saturday");
		lhs.add("Sunday");

		System.out.println(lhs.size());

		Iterator<String> itr = lhs.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println();
		}

	}

}
