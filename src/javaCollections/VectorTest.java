package javaCollections;

import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("Earth");
		v.add("Mercury");
		v.add("Venus");
		v.add("Neptune");
		v.add("Saturn");
		v.add("Mars");
		System.out.println(v);
		
		ListIterator<String> li = v.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}

}
