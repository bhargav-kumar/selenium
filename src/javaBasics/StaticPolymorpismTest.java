package javaBasics;

public class StaticPolymorpismTest extends DynamicPolymorphismTest {

	public void bike() {
		System.out.println("bike");
	}

	public void bike(String chain) {
		System.out.println("bike "+ chain);
	}
	
	public void bike(String chain, int wheels) {
		System.out.println("bike"+ chain+ wheels);
	}
	
	public void bank(String bankName) {
		System.out.println("bank in child class");
	}

	public static void main(String[] args) {

		StaticPolymorpismTest sp = new StaticPolymorpismTest();
		sp.bike();
		sp.bike("should have a chain");
		sp.bike("should have a chain ", 2);
		sp.bank("SBI");
	}

}
