package com.Page;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import com.Utility.Utility;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Pin_Screen_Page {
	
	
	public AppiumDriver<?> driver;
	public ExtentTest test;
	Appium_Base_Class base;
	public Login_Page lp;
	public String Node_NO;
	public Common_xpath cm;
    Utility ut = new Utility();
	
	public Pin_Screen_Page(AppiumDriver<?> driver,ExtentTest test)
	{
		this.driver= driver;
		this.test= test;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
	}
	
	@AndroidFindBy(xpath = "//*[@text='Sign Out']")
	AndroidElement Pin_Screen_SignOut_Btn;
	
	@AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[2]/android.widget.TextView[1]")
	AndroidElement Pin_SCreen_Store_Name;
	
	@AndroidFindBy(xpath = "//*[@text='Sync Checks']")
	AndroidElement Pin_SCreen_Sync_Checks;

	@AndroidFindBy(xpath = "//*[@text='Sync']")
	AndroidElement Pin_SCreen_Sync;
	
	@AndroidFindBy(xpath = "//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.TextView")
	AndroidElement Node_Text;
	
	public String getNode_Text() {
		this.Node_NO = Node_Text.getText().substring(0, 3);
		return Node_Text.getText().substring(0, 3);
	}

	@AndroidFindBy(xpath = "//*[@text='To login enter your ID number']")
	AndroidElement Pin_Screen_pinentry_text;
	
	public AndroidElement Pin_Screen_pinentry_text() {
		return Pin_Screen_pinentry_text;
	}

	public AndroidElement Pin_SCreen_SignOut_Btn() {
		return Pin_Screen_SignOut_Btn;
	}

	public AndroidElement Pin_SCreen_Store_Name() {
		return Pin_SCreen_Store_Name;
	}

	public AndroidElement Pin_SCreen_Sync_Checks() {
		return Pin_SCreen_Sync_Checks;
	}

	public AndroidElement Pin_SCreen_Sync() {
		return Pin_SCreen_Sync;
	}

	public AndroidElement Pin_SCreen_Clock_IN() {
		return Pin_SCreen_Clock_IN;
	}

	public AndroidElement Pin_SCreen_Clock_Out() {
		return Pin_SCreen_Clock_Out;
	}

	public AndroidElement Pin_SCreen_BackOffice() {
		return Pin_SCreen_BackOffice;
	}

	public AndroidElement Pin_SCreen_Operations() {
		return Pin_SCreen_Operations;
	}

	public AndroidElement Pin_SCreen_Devices() {
		return Pin_SCreen_Devices;
	}

	public AndroidElement Pin_SCreen_Business_Date() {
		return Pin_SCreen_Business_Date;
	}

	public AndroidElement Pin_SCreen_Version() {
		return Pin_SCreen_Version;
	}

	public AndroidElement Pin_SCreen_Sync_SuccessMsg() {
		return Pin_SCreen_Sync_SuccessMsg;
	}

	@AndroidFindBy(xpath = "//*[@text='Clock In']")
	AndroidElement Pin_SCreen_Clock_IN;
	
	@AndroidFindBy(xpath = "//*[@text='Clock Out']")
	AndroidElement Pin_SCreen_Clock_Out;
	
	@AndroidFindBy(xpath = "//*[@text='Back Office']")
	AndroidElement Pin_SCreen_BackOffice;
	
	@AndroidFindBy(xpath = "//*[@text='Operation']")
	AndroidElement Pin_SCreen_Operations;
	
	@AndroidFindBy(xpath = "//*[@text='Devices']")
	AndroidElement Pin_SCreen_Devices;
	
	@AndroidFindBy(xpath = "//*[@text='Connected Devices']")
	AndroidElement Pin_SCreen_Connected_Devices;
	
	@AndroidFindBy(xpath = "//*[@text='Business Date']/../android.widget.TextView[4]")
	AndroidElement Pin_SCreen_Business_Date;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.view.View[5]/android.widget.TextView[1]")
	AndroidElement Pin_SCreen_Current_Date;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.view.View[5]/android.widget.TextView[2]")
	AndroidElement Pin_SCreen_Version;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.TextView")
	AndroidElement Pin_SCreen_Sync_SuccessMsg;
	
	
	public String current_Date() {
		
		String current_Date = Pin_SCreen_Current_Date.getText().substring(11);
		
		return current_Date;
	}

	public AndroidElement Logout_Confirmation_Mgs() {
		return Logout_Confirmation_Mgs;
	}

	public AndroidElement Logout_Yes_Btn() {
		return Logout_Yes_Btn;
	}

	public AndroidElement Logout_No_Btn() {
		return Logout_No_Btn;
	}

	@AndroidFindBy(xpath = "//*[@text='Do you want to Logout?']")
	AndroidElement Logout_Confirmation_Mgs;
	
	@AndroidFindBy(xpath = "//*[@text='Yes']")
	AndroidElement Logout_Yes_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='No']")
	AndroidElement Logout_No_Btn;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")
	AndroidElement Navigation_Confirm_No_Btn;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	AndroidElement Navigation_Confirm_Yes_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Log Off']")
	public
	AndroidElement LogOff_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='POS']")
	AndroidElement Operation_POS_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Close']")
	AndroidElement deviecs_Close_Btn;
	
	
	public void sync_Checks() throws Throwable {
		lp = new Login_Page(driver, test);
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		base.isEleEnabled(Pin_SCreen_Sync_Checks(), "Sync Checks");
		base.click_Ele(Pin_SCreen_Sync_Checks());
		Thread.sleep(2000);
	}
	
	public void Sync() throws Throwable {
		lp = new Login_Page(driver, test);
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		base.isEleEnabled(Pin_SCreen_Sync(), "Sync");
		base.click_Ele(Pin_SCreen_Sync());
		Thread.sleep(2000);
	}
	
	public void clock_In() throws Throwable {
		lp = new Login_Page(driver, test);
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		base.isEleEnabled(Pin_SCreen_Clock_IN(), "Clock In");
		base.click_Ele(Pin_SCreen_Clock_IN());
		lp.EnterPin_Popup(Pin_SCreen_Clock_IN(),"ClockIn");
		lp.EnterPin_Again(Pin_SCreen_Clock_IN());
		lp.message_Confirmation("Clocked In Successfully");

	}
	
	public void clock_Out() throws Throwable {
		lp = new Login_Page(driver, test);
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		base.isEleEnabled(Pin_SCreen_Clock_Out(), "Clock Out");
		base.click_Ele(Pin_SCreen_Clock_Out());
		lp.EnterPin_Popup(Pin_SCreen_Clock_Out(),"Clock Out");
		lp.EnterPin_Again(Pin_SCreen_Clock_Out());
		lp.message_Confirmation("Clocked Out Successfully");

	}
	
	public void backOffice() {
		lp = new Login_Page(driver, test);
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
//		base.click_Ele(Pin_SCreen_BackOffice());
//		base.click_Ele(Navigation_Confirm_No_Btn);

	}
	
	public void operation() throws Throwable {
		lp = new Login_Page(driver, test);
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		base.isEleEnabled(Pin_SCreen_Operations(), "Operation");
		base.click_Ele(Pin_SCreen_Operations());
		lp.EnterPin_Popup(Pin_SCreen_Operations(),"Operation");
		base.click_Ele(Operation_POS_Btn);
		base.click_Ele(LogOff_Btn);

	}
	
	public void devices() throws Throwable {
		lp = new Login_Page(driver, test);
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		base.isEleEnabled(Pin_SCreen_Devices(), "Devices");
		base.click_Ele(Pin_SCreen_Devices());
		base.text_Confirm(Pin_SCreen_Connected_Devices, "Connected Devices");
		base.click_Ele(deviecs_Close_Btn);
		Thread.sleep(1000);

	}
	
	
	public void Pin_Screen_Validations() throws Throwable {
		lp = new Login_Page(driver, test);
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		Thread.sleep(2000);
		base.text_Confirm(Pin_SCreen_Store_Name(), Utility.getProperty("Store_Name"));
		base.text_Confirm_without_Screenshot(Pin_Screen_pinentry_text(), "To login enter your ID number");
		sync_Checks();
		Sync();
		clock_In();
		clock_Out();
		backOffice();
		operation();
		devices();
		
	}
	
	
	
	

}
