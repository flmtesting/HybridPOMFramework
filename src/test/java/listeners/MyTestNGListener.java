package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import pages.Page;


public class MyTestNGListener extends Page implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
		String testcaseName=result.getMethod().getMethodName();
		
		test.log(Status.PASS, testcaseName+" is passed ");
		
		String filePath=Page.screenshot(testcaseName);
		
		test.addScreenCaptureFromPath(filePath);
	
	}

	public void onTestFailure(ITestResult result) {
		
		String testcaseName=result.getMethod().getMethodName();
		
		test.log(Status.FAIL, testcaseName+" is Failed ");
		
		String filePath=Page.screenshot(testcaseName);
		
		test.addScreenCaptureFromPath(filePath);
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

	
}
