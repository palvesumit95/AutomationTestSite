package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BasePage;
import com.utilities.DriverUtils;

public class MyListeners extends BasePage implements ITestListener{

	public void onTestStart(ITestResult result) {

		test = report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {

		test.log(Status.PASS, "Test Is Passed With Name As = " + " " + result.getName());
	}

	public void onTestFailure(ITestResult result) {

		test.log(Status.FAIL, "Test Is Failed With Name AS = " + " " + result.getName());
//		String path = DriverUtils.getScreenShot(result.getName());
//		test.addScreenCaptureFromPath(path);
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Is Skipped With Name As" + " " + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


	}

	public void onStart(ITestContext context) {


	}

	public void onFinish(ITestContext context) {


	}




}
