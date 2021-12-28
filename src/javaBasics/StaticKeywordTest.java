package javaBasics;

public class StaticKeywordTest {

	static int age = 50;

	public static void testMethod(int age) {
		int a = 10;
		int b = 30;
		int multiplication = a * b;
		System.out.println(multiplication);
		System.out.println(age);
	}
	
	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		StaticKeywordTest kt = new StaticKeywordTest();
		System.out.println(StaticKeywordTest.age);
		StaticKeywordTest.testMethod(100);
	}

}
