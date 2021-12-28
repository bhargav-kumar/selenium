package javaBasics;

public class TypeCastingTest {

	public static void main(String[] args) {

		//Up casting 
		int i = 10;
		
		System.out.println(i);
		double d = i;
		System.out.println(d);
		
		int k = 99;
		long l = k;
		System.out.println("long : "+l);
		
		//Down Casting
		double dob = 99.80;
		int m = (int) dob;
		System.out.println("double to int : "+m);
	}

}
