package javaBasics;

public class JavaClassedAndMethods extends JavaAbstractClassTest implements JavaInterfaceTest {

	public JavaClassedAndMethods() {

	}

	@Override
	public void car() {
		System.out.println("7 Seater car");
	}

	@Override
	public void wheels() {
		System.out.println("4 wheels");
	}

	@Override
	public void engine() {
		System.out.println("Petrol engine");
	}

	@Override
	public void insurance() {
		System.out.println("Vehicle insurance ICICI lombard");
	}

	public int sumMethod(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		return sum;
	}

	public int substractionMethod(int a, int b) {
		int subctraction = a - b;
		System.out.println(subctraction);
		return subctraction;
	}

	@Override
	public void carTest() {
		System.out.println("CarTest from abstract class");
	}

	public static void main(String[] args) {
		JavaClassedAndMethods jc = new JavaClassedAndMethods();
		jc.sumMethod(10, 20);
		jc.substractionMethod(30, 10);
		jc.car();
		jc.wheels();
		jc.engine();
		jc.insurance();
		jc.driving();
		JavaInterfaceTest.drivingTest();
		jc.carTest();
		jc.engineTest();
	}
}
