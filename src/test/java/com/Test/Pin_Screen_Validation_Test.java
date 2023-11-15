package com.Test;

import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Page.Appium_Base_Class;
import com.Page.Common_xpath;
import com.Page.Login_Page;
import com.Page.Pin_Screen_Page;
import com.Utility.ExtentManager;
import com.Utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;

public class Pin_Screen_Validation_Test {

	public AppiumDriver<?> driver;
	
	ExtentReports rep = ExtentManager.getInstance();
	ExtentTest test = rep.startTest("PinScreen_Validation_Start");

	Utility ut = new Utility();
	Appium_Base_Class base = new Appium_Base_Class(driver, test);
	public Login_Page lp;
	public Pin_Screen_Page psp;
	public Common_xpath cm;

	@BeforeMethod
	public void login() throws Throwable {
		lp = new Login_Page(driver, test);

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", Utility.getProperty("platformName1"));
		cap.setCapability("platformVersion", Utility.getProperty("platformVersion1"));
		cap.setCapability("udid", Utility.getProperty("udid1"));
		cap.setCapability("deviceName", Utility.getProperty("deviceName1"));
		cap.setCapability("packageName", Utility.getProperty("packageName1"));
		cap.setCapability("appActivity", Utility.getProperty("appActivity1"));
		driver = new AppiumDriver(new URL(Utility.getProperty("Appium_URL")), cap);
		// Open the Application
		driver.activateApp(Utility.getProperty("packageName1"));
		Thread.sleep(5000);
	}

	@AfterMethod
	public void TestFail(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			String scnsht = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

			String s = "data:image/png;base64," + scnsht;

			test.log(LogStatus.FAIL, test.addScreenCapture(s));

		}
	}

	@AfterClass
	public void flushTest() throws Exception {
		Thread.sleep(2000);
		rep.endTest(test);
		rep.flush();
	}

//	@Test(priority = 1)
//	public void login_Pin() throws Throwable {
//		lp = new Login_Page(driver, test);
//		Thread.sleep(3000);
//		lp.Signin_Valid_Cred();
//	}

	@Test(priority = 500)
	public void Log_out() throws Throwable {
		lp = new Login_Page(driver, test);
		lp.SignOut();

	}

	@Test(priority = 2)
	public void Pin_Screen_Validations() throws Throwable {
		psp = new Pin_Screen_Page(driver, test);
		psp.Pin_Screen_Validations();

	}

}
