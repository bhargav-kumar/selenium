package javaBasics;

public class ChildClass extends ParentClass {
 
	public String str = "Earth";
	private String str1 = "Earth";
	String str2 = "Earth";
	protected String str3 = "Earth";
	
	public static void main(String[] args) {

		ChildClass childClass = new ChildClass();

		ParentClass childClass1 = new ChildClass();
//		ChildClass childClass2 = new ParentClass();
		childClass.sum();
		childClass.substraction();
	}

}
