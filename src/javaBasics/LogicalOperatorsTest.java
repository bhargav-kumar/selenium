package javaBasics;

public class LogicalOperatorsTest {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 5;
		
//		System.out.println(a>b & c< a++);
//		System.out.println(a);
//		
//		System.out.println(a>b && c< a++);
//		System.out.println(a);
		
		
		// or | and ||
		
		System.out.println(a>b | c<b++);
		System.out.println(b);
		
		System.out.println(a>b || c<b++);
		System.out.println(b);
		
	}

}
