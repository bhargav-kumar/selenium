package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Monday");
		hs.add("Tuesday");
		hs.add("Wednesday");
		hs.add("Thursday");
		hs.add("Friday");
		hs.add("Saturday");
		hs.add("Sunday");
		
		
		System.out.println(hs.size());
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println();
		}
		
		
	}

}
