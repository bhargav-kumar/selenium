package javaBasics;

public class ParentClass {

	String str = "Hello";
	int i = 10;

	public int sum() {
		int i = 100;
		int j = 200;
		int sum = i + j;
		System.out.println("Sum : "+sum);
		return sum;
	}

	public int substraction() {
		int i = 100;
		int j = 50;
		int sub = i - j;
		System.out.println("Sum : "+sub);
		return sub;
	}

	public static void main(String[] args) {
		ParentClass test = new ParentClass();
		test.sum();

	}

}
