package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DriverUtils {

	public static WebDriver driver = null;

	public static String getScreenShot(String name) {

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path  = System.getProperty(("user.dir")+"/screenshots/"+name+".jpg");
		File dest = new File(path);

		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return path;
	}

}
