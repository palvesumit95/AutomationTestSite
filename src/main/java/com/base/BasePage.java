package com.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utilities.PropertiesUtils;

public class BasePage {

	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger(Class.class);
	
	public static ExtentTest test = null;
	public static ExtentReports report = null;
	public static ExtentSparkReporter spark = null;
	

	public static void initialisation() throws Exception {
		
		log.info("Initialisaing Browser");
		
		String browserName = PropertiesUtils.getProperty("browser");

		if(browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver= new ChromeDriver();

		}

		if(browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(PropertiesUtils.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		
	}
	
	public void ReportInit() {
		
	report = new ExtentReports();
	spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtentReport.html");
	report.attachReporter(spark);
	
	}
	

	
	
}
