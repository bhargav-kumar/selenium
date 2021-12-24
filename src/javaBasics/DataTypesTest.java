package javaBasics;

public class DataTypesTest {

	public static void main(String[] args) {
		byte b = -128;
		System.out.println("byte : " + b);

		short s = 32767;
		System.out.println("Short : " + s);

		int i = 32900;
		System.out.println("int : " + i);

		long l = 4578956888828L;
		System.out.println("long : " + l);

		float f = 10.6012451256458f; // Scientific number
		System.out.println("Float : " + f);

		double d = 10.6012451256458123d;
		System.out.println("Double : " + d);

		boolean bool = true;
		System.out.println(bool);

		char c = 'G';
		System.out.println("Char : " + c);

		// Statically typed programming language - Java
		// Non Statically typed programming language - Python, Javascript
		// Non Primitive
//		String
		String str = "Hello";
		System.out.println("String : " + str);
//		Array
		String[] stringArray = { "Hello", "World", "1" };
		
		System.out.println("stringArray[0] : "+stringArray[0]);
		System.out.println("stringArray[1] : "+stringArray[1]);
		System.out.println("stringArray[2] : "+stringArray[2]);
		
		
		System.out.println("stringArray : " + stringArray);
		for (int k = 0; k < stringArray.length; k++) {
			System.out.println(stringArray[k]);
		}

		int[] intArray = { 1, 2, 5, 8 };
		for (int j = 0; j < intArray.length; j++) {
			System.out.println("intArray : "+intArray[j]);
		}
	}

}
