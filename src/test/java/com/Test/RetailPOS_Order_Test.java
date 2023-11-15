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
import com.Page.RetailPOS_Order_Page;
import com.Page.Standard_Item_POS_Page;
import com.Utility.ExtentManager;
import com.Utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;

public class RetailPOS_Order_Test {
	
	public AppiumDriver<?> driver;

	ExtentReports rep = ExtentManager.getInstance();
	ExtentTest test = rep.startTest("PinScreen_Validation_Start");

	Utility ut = new Utility();
	Appium_Base_Class base;
	public Login_Page lp;
	public Pin_Screen_Page psp;
	public Common_xpath cm;
	public RetailPOS_Order_Page rop;
	public String Check_NO;
	public Standard_Item_POS_Page sip;

	
	
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
	
//	@Test(priority = 2)
//	public void Login_RetailPOS() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		
//		psp.Pin_Screen_Validations();
//		lp.enterpin();
//		
//	}
//	
//	@Test(priority = 3)
//	public void RetailPOS_Order_SCreen_Validations() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		rop = new RetailPOS_Order_Page(driver, test);
//		base = new Appium_Base_Class(driver, test);
//		
//		lp.PinEntery_Login();
//		rop.Reatail_OrderScreen_Columns_Validation();
//		rop.Log_Off_to_Pinscreen();
//		
//	}
//	
//	@Test(priority = 4)
//	public void RetailPOS_Order_SCreen_Menu_Selection() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		rop = new RetailPOS_Order_Page(driver, test);
//		base = new Appium_Base_Class(driver, test);
//		
//		lp.PinEntery_Login();
//		rop.multipleMenu_Selection_Random();
//		rop.Removing_Menu_Items();
//		rop.Single_Random_Menu_Selection();
//		rop.multipleMenu_Selection_Random();
//		rop.Single_Random_Menu_SelectionFor_VariantItem();
//		rop.Void_MenuItems();
//		rop.Log_Off_to_Pinscreen();
//		
//		
//	}
//	
//	@Test(priority = 5)
//	public void Check_values_Validations() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		rop = new RetailPOS_Order_Page(driver, test);
//		base = new Appium_Base_Class(driver, test);
//		
//		lp.PinEntery_Login();
//		rop.multipleMenu_Selection_Random();
//		rop.Single_Random_Menu_SelectionFor_VariantItem();
//		rop.Check_Values_Validations();
//		rop.balance_Amount1();
//		rop.Exclusive_Tax_Calculation();
//		Check_NO = rop.get_Check_NO();
//		rop.Void_MenuItems();
//		rop.Log_Off_to_Pinscreen();
//		
//	}
//	
//	
//	@Test(priority = 6)
//	public void OrderScreen_Serach_NumberPad() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		rop = new RetailPOS_Order_Page(driver, test);
//		base = new Appium_Base_Class(driver, test);
//		
//		lp.PinEntery_Login();
////		rop.OrderScreen_Serach();
//		rop.OrderScreen_NumberPad();
//		rop.Void_MenuItems();
//		rop.Log_Off_to_Pinscreen();
//		
//	}
//	
//	@Test(priority = 7)
//	public void OrderScreen_Kit_Accessbile_MenuSelection() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		rop = new RetailPOS_Order_Page(driver, test);
//		base = new Appium_Base_Class(driver, test);
//		
//		lp.PinEntery_Login();
//		rop.multipleMenu_Selection_Random_Kit_Accessible();
//		rop.Void_MenuItems();
//		rop.Log_Off_to_Pinscreen();
//		
//	}
//	
//	@Test(priority = 8)
//	public void OrderScreen_StandardItem_Sale() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		rop = new RetailPOS_Order_Page(driver, test);
//		base = new Appium_Base_Class(driver, test);
//        sip = new Standard_Item_POS_Page(driver, test);
//		
//		lp.PinEntery_Login();
//		rop.Single_Random_Menu_Selection();
//		rop.multipleMenu_Selection_Random();
//		rop.Check_Values_Validations();
//		rop.balance_Amount1();
//		rop.Exclusive_Tax_Calculation();
//		sip.Cash_Payment_Selection_And_Completed();
//		rop.Log_Off_to_Pinscreen();
//		
//	}
//	
//	@Test(priority = 9)
//	public void OrderScreen_VariantItem_Sale() throws Throwable {
//		lp = new Login_Page(driver, test);
//		cm = new Common_xpath(driver, test);
//		psp = new Pin_Screen_Page(driver, test);
//		rop = new RetailPOS_Order_Page(driver, test);
//		base = new Appium_Base_Class(driver, test);
//        sip = new Standard_Item_POS_Page(driver, test);
//		
//		lp.PinEntery_Login();
//		rop.Single_Random_Menu_SelectionFor_VariantItem();
//		rop.Single_Random_Menu_SelectionFor_VariantItem();
//		rop.Check_Values_Validations();
//		rop.balance_Amount1();
//		rop.Exclusive_Tax_Calculation();
//		sip.Cash_Payment_Selection_And_Completed();
//		rop.Log_Off_to_Pinscreen();
//		
//	}
	
	@Test(priority = 10)
	public void OrderScreen_Kit_AccessbileItem_Sale() throws Throwable {
		lp = new Login_Page(driver, test);
		cm = new Common_xpath(driver, test);
		psp = new Pin_Screen_Page(driver, test);
		rop = new RetailPOS_Order_Page(driver, test);
		base = new Appium_Base_Class(driver, test);
        sip = new Standard_Item_POS_Page(driver, test);
		
		lp.PinEntery_Login();
		rop.multipleMenu_Selection_Random_Kit_Accessible();
		rop.multipleMenu_Selection_Random_Kit_Accessible();
		rop.Check_Values_Validations();
		rop.balance_Amount1();
		rop.Exclusive_Tax_Calculation();
		sip.Cash_Payment_Selection_And_Completed();
		rop.Log_Off_to_Pinscreen();
		
	}
	

}
