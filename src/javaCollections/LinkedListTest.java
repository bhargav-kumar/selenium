package javaCollections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Earth");
		ll.add("Mercury");
		ll.add("Venus");
		ll.add("Neptune");
		ll.add("Saturn");
		ll.add("Mars");
		
		System.out.println(ll);
		
		ListIterator<String> it = ll.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
