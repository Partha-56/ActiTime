package com.actitime.utility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Screenshot implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		if(result.getStatus()==2)
			Reporter.log("Test case got fail",true);
		String methodName=result.getName();
		Date date = Calendar.getInstance().getTime();
		String format = date.toString().replace(":", "_");
		
		TakesScreenshot sc = (TakesScreenshot)BaseTest.driver;
		File srcFile = sc.getScreenshotAs(OutputType.FILE);
	}
	
	public static void screenShotElement(WebElement element, String elementName) throws IOException {
		 TakesScreenshot ts = (TakesScreenshot)element;
		 File srcFile=ts.getScreenshotAs(OutputType.FILE);
//		 FileHandler.copy(srcFile, new File("./elementScreeshot/"+elementName+".png"));
	}
	
}
