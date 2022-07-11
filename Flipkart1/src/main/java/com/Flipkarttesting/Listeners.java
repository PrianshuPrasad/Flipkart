package com.Flipkarttesting;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		System.out.println("The name of the testcase passed is :"+result.getName());
		if (result.isSuccess()) {
			Reporter.log("script passed", true);
		}

	}

	@Override
	public void onTestFailure(ITestResult result) {
		

		WebDriver driver = null;
		System.out.println("The name of the testcase failed is :"+result.getName());
		ITestListener.super.onTestFailure(result);
		String testmethodname = result.getMethod().getMethodName();

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException e1) {
			
			e1.printStackTrace();
		}

		try {
			System.out.println("Taking SS" + testmethodname);
			basedriver.TakeScreenshot(testmethodname, driver);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		ITestListener.super.onFinish(context);
	}

}
