package javaBasics;

public interface JavaInterfaceTest {
	public void car();
	
	public void wheels();
	
	public void engine();
	
	public void insurance();
	
	public default void driving() {
		System.out.println("Driving must be learn");
	}
	
	public static void drivingTest() {
		System.out.println("Driving Test must be done");
	}
	
}
