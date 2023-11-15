package com.Page;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import com.Utility.Utility;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login_Page {
	
	public AppiumDriver<?> driver;
	public ExtentTest test;
	Appium_Base_Class base;
	RetailPOS_Order_Page Rop;
    
    Common_xpath cm;
    public Pin_Screen_Page psp;
    
	
	public Login_Page(AppiumDriver<?> driver,ExtentTest test)
	{
		this.driver= driver;
		this.test= test;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);	
	}
	
	
	@AndroidFindBy(xpath = "//*[@text='Login']")
	AndroidElement pinscreen_Login_Btn;
	
	@AndroidFindBy(id = "pin-display")
	AndroidElement pinscreen_PinDisplay;
	
	@AndroidFindBy(xpath = "//*[@text='Store Login']")
	AndroidElement Signin_StoreLogin_text;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	AndroidElement Signin_Page_Username;
	
	public AndroidElement Signin_Page_Username() {
		return Signin_Page_Username;
	}

	public AndroidElement Signin_Page_Password() {
		return Signin_Page_Password;
	}

	public AndroidElement Signin_Page_Login_Btn() {
		return Signin_Page_Login_Btn;
	}

	@AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	AndroidElement Signin_Page_Password;
	
	@AndroidFindBy(xpath = "//*[@text='Login']")
	AndroidElement Signin_Page_Login_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Forgot Password']")
	AndroidElement Signin_Page_forgotpws;
	
	@AndroidFindBy(xpath = "//*[@text='Forgot Password']")
	AndroidElement Signin_Page_forgotpws_Btn;
	
	
	public void Signin_Valid_Cred() throws Exception {
		base = new Appium_Base_Class(driver, test);
		cm = new Common_xpath(driver, test);
		Thread.sleep(4000);
		base.text_Confirm(Signin_StoreLogin_text, "Store Login");
		try {
		base.text_Confirm_without_Screenshot(Signin_Page_forgotpws, "Forget Password");
		}catch (Exception e) {
		}
		base.send_data(Signin_Page_Username(), Utility.getProperty("Username"));
		driver.hideKeyboard();
		base.send_data(Signin_Page_Password(), Utility.getProperty("Password"));
		driver.hideKeyboard();
		base.click_Ele(Signin_Page_Login_Btn());
		base.explicit_Wait(driver, cm.Pin_SCreen_Msg_popup);
		base.text_Confirm(cm.Pin_SCreen_Msg_popup, "Signed In Successfully");
		Thread.sleep(10000);
	}
	
	public void enterpin() throws Throwable {
		base = new Appium_Base_Class(driver, test);
		Rop = new RetailPOS_Order_Page(driver, test);
		cm = new Common_xpath(driver, test);
		base.click_Ele(cm.pin_popup_Clear_Btn2);
		base.click_Ele(cm.pin_popup_NO_One);
		base.click_Ele(cm.pin_popup_NO_Two);
		base.click_Ele(cm.pin_popup_NO_Three);
		base.click_Ele(cm.pin_popup_NO_Four);
		base.click_Ele(Signin_Page_Login_Btn());
		Thread.sleep(2000);
		try {
			if (cm.Select_Role_popup.isDisplayed()) {
				
				base.click_Ele(cm.Select_Role_popup_Admin());
				Thread.sleep(1000);
				base.click_Ele(cm.Select_Role_popup_Ok_Btn);
				Thread.sleep(2000);
				
			} 
			}catch (Exception e) {
			}
		Thread.sleep(5000);
		base.click_Ele(Rop.Order_Screen_LogOff);

	}
	
	
	public void PinEntery_Login() throws Throwable {
		base = new Appium_Base_Class(driver, test);
		Rop = new RetailPOS_Order_Page(driver, test);
		cm = new Common_xpath(driver, test);
		
		base.click_Ele(cm.pin_popup_Clear_Btn2);
		base.click_Ele(cm.pin_popup_NO_One);
		base.click_Ele(cm.pin_popup_NO_Two);
		base.click_Ele(cm.pin_popup_NO_Three);
		base.click_Ele(cm.pin_popup_NO_Four);
		base.click_Ele(Signin_Page_Login_Btn());
		Thread.sleep(2000);
		try {
			if (cm.Select_Role_popup.isDisplayed()) {
				
				base.click_Ele(cm.Select_Role_popup_Admin());
				Thread.sleep(1000);
				base.click_Ele(cm.Select_Role_popup_Ok_Btn);
				Thread.sleep(2000);
				
			} 
			}catch (Exception e) {
			}
		Thread.sleep(5000);
	}
	
	
	public void SignOut() throws Throwable {
		
		base = new Appium_Base_Class(driver, test);
		psp = new Pin_Screen_Page(driver, test);
		cm = new Common_xpath(driver, test);
		base.click_Ele(psp.Pin_SCreen_SignOut_Btn());
		Thread.sleep(1000);
		base.text_Confirm(psp.Logout_Confirmation_Mgs(), "Do you want to Logout?");
		Thread.sleep(1000);
		base.click_Ele(psp.Logout_No_Btn());
		Thread.sleep(1000);
		base.click_Ele(psp.Pin_SCreen_SignOut_Btn());
		Thread.sleep(1000);
		base.click_Ele(psp.Logout_Yes_Btn());
		Thread.sleep(1000);
		EnterPin_Popup(psp.Pin_SCreen_SignOut_Btn(),"Sign Out");
		
	}
	
	public void EnterPin_Again(AndroidElement ele) throws Throwable {
		base = new Appium_Base_Class(driver, test);
		psp = new Pin_Screen_Page(driver, test);
		cm = new Common_xpath(driver, test);
		Thread.sleep(1000);
		base.click_Ele(ele);
		Thread.sleep(1000);
		base.click_Ele(cm.pin_popup_NO_One);
		base.click_Ele(cm.pin_popup_NO_Two);
		base.click_Ele(cm.pin_popup_NO_Three);
		base.click_Ele(cm.pin_popup_NO_Four);
		base.click_Ele(cm.pin_popup_Continue_Btn);

	}
	
	public void EnterPin_Popup(AndroidElement ele, String text) throws Throwable {
		base = new Appium_Base_Class(driver, test);
		psp = new Pin_Screen_Page(driver, test);
		cm = new Common_xpath(driver, test);
		
		Thread.sleep(2000);
		base.text_Confirm(cm.pin_popup_Header_Text, "text");
		Thread.sleep(1000);
		base.click_Ele(cm.pin_popup_NO_One);
		base.click_Ele(cm.pin_popup_NO_Two);
		base.click_Ele(cm.pin_popup_NO_Three);
		base.click_Ele(cm.pin_popup_NO_Four);
		base.click_Ele(cm.pin_popup_Clear_Btn);
		base.send_data(cm.pin_popup_enterpin_inoutbox, Utility.getProperty("UserPin"));
		for (int i = 0; i < 4; i++) {
			base.click_Ele(cm.pin_popup_Delete_Btn);
		}
		Thread.sleep(1000);
		base.click_Ele(cm.pin_popup_Close_Btn);
		Thread.sleep(1000);
		base.click_Ele(ele);
		Thread.sleep(1000);
		base.click_Ele(cm.pin_popup_NO_One);
		base.click_Ele(cm.pin_popup_NO_Two);
		base.click_Ele(cm.pin_popup_NO_Three);
		base.click_Ele(cm.pin_popup_NO_Four);
		base.click_Ele(cm.pin_popup_Continue_Btn);
		Thread.sleep(2000);
		try {
		if (((AndroidElement) cm.Select_Role_popup).isDisplayed()) {
			
			base.click_Ele(cm.Select_Firstrole_IN_Role_popup);
			Thread.sleep(1000);
			base.click_Ele(cm.Select_Role_popup_Ok_Btn);
			Thread.sleep(2000);
			
		} 
		}catch (Exception e) {
		}
	}
	
	public void message_Confirmation(String text) {
		base = new Appium_Base_Class(driver, test);
		psp = new Pin_Screen_Page(driver, test);
		cm = new Common_xpath(driver, test);
		
//		base.explicit_Wait(driver, cm.Pin_SCreen_Msg_popup);
		base.text_Confirm(cm.Pin_SCreen_Msg_popup, text);

	}
	

}
