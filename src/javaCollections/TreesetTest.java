package javaCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetTest {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("Monday");
		ts.add("Tuesday");
		ts.add("Wednesday");
		ts.add("Thursday");
		ts.add("Friday");
		ts.add("Saturday");
		ts.add("Sunday");

		System.out.println(ts.size());

		Iterator<String> itr = ts.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println();
		}

	}

}
