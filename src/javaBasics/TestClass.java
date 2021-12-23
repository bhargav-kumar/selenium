package javaBasics;

public class TestClass extends EncapsulationTest{

	public TestClass(String bank, String vehicle) {
		super(bank, vehicle);
	}

//	EncapsulationTest et = new EncapsulationTest("ICICI", "Helicopter");
	
	public static void main(String[] args) {
		
		TestClass tc = new TestClass("ICICI", "Helicopter");
		
		tc.setBank("HDFC");
		tc.getBank();
		
	}

}
