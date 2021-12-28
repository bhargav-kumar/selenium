package javaBasics;

public class ConstructorTest {

	
	public static int age;
	
	//No-argument constructor
	public ConstructorTest() {
		System.out.println("ConstructorTest");
	}
	
	//argument constructor
	public ConstructorTest(String str) {
		System.out.println("ConstructorTest with arguments");
	}

	public ConstructorTest(String name, String designation, int age) {
		System.out.println("ConstructorTest with multiple arguments");
	}
	
	static {
		System.out.println("Static block");
	}
	
	
	public void testMethod() {
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) {
			
		ConstructorTest ct = new ConstructorTest();
		ct.testMethod();
//		ConstructorTest.age;
		
		ConstructorTest ct1 = new ConstructorTest("Peter", "Test Engineer", 50);
		ct1.testMethod();
		
		StaticKeywordTest.testMethod(100);
		System.out.println(StaticKeywordTest.age);
		
		
	}

}
