package testNGListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int retryCount = 0;
	int retryLimit = 3;

	@Override
	public boolean retry(ITestResult result) {

		if (retryCount < retryLimit) {
			retryCount++;
			return true;
		} else {
			return false;
		}
	}

}
