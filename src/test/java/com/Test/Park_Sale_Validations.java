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
import com.Page.Park_Sale_Page;
import com.Page.Pin_Screen_Page;
import com.Page.RetailPOS_Order_Page;
import com.Utility.ExtentManager;
import com.Utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;

public class Park_Sale_Validations {
	
	public AppiumDriver<?> driver;

	ExtentReports rep = ExtentManager.getInstance();
	ExtentTest test = rep.startTest("PinScreen_Validation_Start");

	Utility ut = new Utility();
	Appium_Base_Class base;
	public Login_Page lp;
	public Pin_Screen_Page psp;
	public Common_xpath cm;
	public Park_Sale_Page ps;
	public RetailPOS_Order_Page rop;

	@BeforeMethod
	public void login() throws Throwable {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", Utility.getProperty("platformName"));
		cap.setCapability("platformVersion", Utility.getProperty("platformVersion"));
		cap.setCapability("udid", Utility.getProperty("udid"));
		cap.setCapability("deviceName", Utility.getProperty("deviceName")); 
		cap.setCapability("packageName", Utility.getProperty("Cloud_packageName1"));
		cap.setCapability("appActivity", Utility.getProperty("Cloud_appActivity1"));
		driver = new AppiumDriver(new URL(Utility.getProperty("Appium_URL")), cap);
		// Open the Application
		driver.activateApp(Utility.getProperty("Cloud_packageName1"));
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
//	public void Signin() throws Throwable {
//		lp = new Login_Page(driver, test);
//		Thread.sleep(3000);
//		lp.Signin_Valid_Cred();
//	}
//
//	@Test(priority = 500)
//	public void Log_out() throws Throwable {
//		lp = new Login_Page(driver, test);
//		lp.SignOut();
//
//	}
//	
//	@Test(priority = 2)
//	public void RetailPOS_ParkSale_NO_menuItems_Pop_up_Msg_validation() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		rop = new RetailPOS_Order_Page(driver, test);
//		base = new Appium_Base_Class(driver, test);
//		ps = new Park_Sale_Page(driver, test);
//		
//		lp.PinEntery_Login();
//		ps.No_Menu_Park_Sale_validation();
//		rop.Log_Off_to_Pinscreen();
//		
//	}
//	
//	@Test(priority = 3)
//	public void RetailPOS_ParkSale_screen_Validation() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		rop = new RetailPOS_Order_Page(driver, test);
//		base = new Appium_Base_Class(driver, test);
//		ps = new Park_Sale_Page(driver, test);
//		
//		lp.PinEntery_Login();
//		ps.ParkSale_screen_Validation();
//		rop.Void_MenuItems();
//		rop.Log_Off_to_Pinscreen();
//		
//	}
//	
//	@Test(priority = 4)
//	public void RetailPOS_ParkSale_WithoutEntering_Reason_ClickOnpark() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		rop = new RetailPOS_Order_Page(driver, test);
//		base = new Appium_Base_Class(driver, test);
//		ps = new Park_Sale_Page(driver, test);
//		
//		lp.PinEntery_Login();
//		ps.ParkSale_Pop_up_No_reason();
//		rop.Void_MenuItems();
//		rop.Log_Off_to_Pinscreen();
//		
//	}
//	
//	@Test(priority = 5)
//	public void RetailPOS_ParkSale_Reason_Entering_Restriction() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		rop = new RetailPOS_Order_Page(driver, test);
//		base = new Appium_Base_Class(driver, test);
//		ps = new Park_Sale_Page(driver, test);
//		
//		lp.PinEntery_Login();
//		ps.RetailPOS_ParkSale_Reason_Entering_Restriction();
//		rop.Log_Off_to_Pinscreen();
//		
//	}
	
	@Test(priority = 6)
	public void RetailPOS_ParkSale_Retrive_Sale() throws Throwable {
		lp = new Login_Page(driver, test);
		cm = new Common_xpath(driver, test);
		psp = new Pin_Screen_Page(driver, test);
		rop = new RetailPOS_Order_Page(driver, test);
		base = new Appium_Base_Class(driver, test);
		ps = new Park_Sale_Page(driver, test);
		
		lp.PinEntery_Login();
		ps.RetailPOS_ParkSale_Retrive_Sale();
		rop.Log_Off_to_Pinscreen();
		
	}
	
	
	

}
