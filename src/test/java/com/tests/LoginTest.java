package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.pages.LoginPage;

public class LoginTest extends BasePage{

	LoginPage lp = null;

	@BeforeTest
	public void setup() throws Exception {
		initialisation();
		ReportInit();
		lp = new LoginPage(driver);
	}

	@AfterTest
	public void tearDown() {
		//			driver.close();
		report.flush();
	}

	@Test
	public void passtest() throws Exception {
		lp.registerToSite();
		Thread.sleep(3000);
		lp.enterDetails();
//		lp.getDob("//select[@type=\\\"text\\\"][@class=\\\"form-control ng-dirty ng-valid-parse ng-valid ng-valid-required ng-touched\\", "placeholder", "Year" , "1998");
	
	}
	
	
	//	@Test
	//	public void failtest() {
	//		Assert.assertTrue(false);
	//	}
	//	@Test
	//	public void skiptest() {
	//		throw new SkipException("skipping a testcase");
	//	}
	//	




}