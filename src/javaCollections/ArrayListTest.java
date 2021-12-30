package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<String> al1 = new ArrayList<String>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		al1.add("Java");
		al1.add("Ruby");
		al1.add("Go lang");
		al1.add(null);
		al1.add("python");
		al1.add("python");
		al1.add("python");
		al1.add("python");
		al1.add("python");
		System.out.println("al1 : " + al1);
		al1.remove(1);

		System.out.println(al);
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println("AL : " + it.next());
		}

		Iterator<String> itr = al1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ListIterator<String> lIt = al1.listIterator();

		while (lIt.hasNext()) {
			System.out.println("List Iterator : " + lIt.next());
		}

	}

}
