package testNGListeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestNGISuiteListenerTest implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("On start");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("On Finish");
	}

}
