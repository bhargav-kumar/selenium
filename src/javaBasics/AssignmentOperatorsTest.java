package javaBasics;

public class AssignmentOperatorsTest {

	public static void main(String[] args) {

		int a = 10;
		int b = a;

		System.out.println(b);

		// == operator
		if (a == 5) {
			System.out.println("Ä is assigned to b");
		}

		// +=
		if (a == b) {
//			a = a + 1;
			a += 2;
			System.out.println(a);
		}

		// -=
		if (a == 12) {
//			a = a - 2;
			a -= 2;
			System.out.println(a);
		}

	}

}
