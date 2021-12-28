package javaBasics;

public class StringStringBufferStringBuilderTest {

	
	
	public static void main(String[] args) {
		
		char[] ch = {'A','B','C','D'};
		String s = new String(ch);
		System.out.println(s);
		
		
		String str = "Hello";
		String str2 = "HELLO";
		String str1 = new String("World");
		System.out.println(str);
		System.out.println(str1);
		
		
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.charAt(2));
		System.out.println(str.isEmpty());
		
		
		String str3 = "Hello";
		str3 = str3.concat("World");
		System.out.println(str3);
		
		StringBuffer sb = new StringBuffer("Hi");
		sb.append("Hello");
		System.out.println(sb);
		System.out.println("Revrese : "+sb.reverse());
		
		StringBuilder sBuilder = new StringBuilder("Hello");
		sBuilder.append("Earth");
		System.out.println(sBuilder);
		System.out.println(sBuilder.reverse());
	}

}
