package javaBasics;

public class ShiftOperatorsTest {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;
		int c = 4;

		// << Left shift operator

		System.out.println(a << 2); // 2 * 2^2

		System.out.println(b << 3); // 3 * 2^3

		System.out.println(c << 2); // 4 * 2^2

		System.out.println(c << 2); // 4 * 2^2

		// >> Right shift operator

		System.out.println(10 >> 2); // 10/2*2^1 = 10/4
		System.out.println(10 >> 3); // 10/3*2^1 = 10/4

		System.out.println(5 >>> 2);

	}

}
