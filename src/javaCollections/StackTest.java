package javaCollections;

import java.util.ListIterator;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		java.util.Stack<String> s = new Stack<String>();

		s.add("Earth");
		s.add("Mercury");
		s.add("Venus");
		s.add("Neptune");
		s.add("Saturn");
		s.add("Mars");
		System.out.println(s);

		ListIterator<String> li = s.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

	}

}
