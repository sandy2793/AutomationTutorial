package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernersDemo implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start Listener");
		//browser lauch
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success Listener");
		//message
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure Listener");
		//screenshot capture
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped Listener");
		//skip reason in report
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On Test Failed but within Success Percentage Listener");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On Failed with timeout Listener");
	}

	public void onStart(ITestContext context) {
		System.out.println("On Start Listener");
		//initialization
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Finish Listener");
		//browser close
	}

}
