package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Utility {
	
	
	public void PassedCaptureScreenshotAsBASE64(WebDriver driver,ExtentTest test)
	{
		String scnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		String s="data:image/png;base64,"+scnsht;
		
		test.log(LogStatus.PASS, test.addScreenCapture(s));
	}
	 
	
	public void FailedCaptureScreenshotAsBASE64(WebDriver driver,ExtentTest test)
	{
		String scnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		String s="data:image/png;base64,"+scnsht;
		
		test.log(LogStatus.FAIL, test.addScreenCapture(s));
	}
	 
	
	public static String captureScreenshot(WebDriver driver,String screenshotName)
	{

		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;

			File source=ts.getScreenshotAs(OutputType.FILE);


			FileUtils.copyFile(source, new File("res/"+screenshotName+".png"));
			return "res/"+screenshotName+".png";
			
		} 
		catch(Exception e)
		{

			System.out.println("Exception while taking screenshot "+e.getMessage());
			return e.getMessage();
		} 
	}
//	test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Test Failed");
	public static String capture(WebDriver driver) throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File Dest = new File("src/../ErrImages/" + System.currentTimeMillis()
	+ ".png");
	String errflpath = Dest.getAbsolutePath();
	FileUtils.copyFile(scrFile, Dest);
	return errflpath;
	}
	
	public static String getProperty(String ProertyName) throws Exception {
		Properties prop = new Properties();
		InputStream is = null;

		try {
			is = new FileInputStream("./common_data.properties");
			prop.load(is);

			return prop.getProperty(ProertyName);

		} 
		catch(Throwable th)
		{
			System.out.println("Exception in loadConstantsProperties: "+th.getMessage());
			th.printStackTrace();
			return th.getMessage();
		} 

	}
	
	public static String getReportProperty(String ProertyName) throws Exception {
		Properties prop = new Properties();
		InputStream is = null;

		try {
			is = new FileInputStream("./report_Data.properties");
			prop.load(is);

			return prop.getProperty(ProertyName);

		} 
		catch(Throwable th)
		{
			System.out.println("Exception in loadConstantsProperties: "+th.getMessage());
			th.printStackTrace();
			return th.getMessage();
		} 

	}

}
