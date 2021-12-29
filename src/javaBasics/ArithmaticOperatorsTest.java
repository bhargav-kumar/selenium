package javaBasics;

public class ArithmaticOperatorsTest {

	public static void main(String[] args) {

		int a = 10, b = 15, c = 5, d =10;

		// ++ Increment operator
//		1. Post increment 
//		2. Pre increment

		System.out.println(a++);
		System.out.println(a);

		System.out.println(++a);

		// -- Decrement operator
//		1. Post Decrement 
//		2. Pre Decrement

		System.out.println(b--);
		System.out.println(b);

		System.out.println(--b);

		for (int i =0; i < c; i++) {
			System.out.println("decrement : "+i);
		}
		
		for (int i = c; i > 0; i--) {
			System.out.println("decrement : "+i);
		}

	}

}
