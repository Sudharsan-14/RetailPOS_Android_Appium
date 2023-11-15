package com.Page;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Common_xpath {
	
	
	public AppiumDriver<?> driver;
	public ExtentTest test;
	
	public Common_xpath(AppiumDriver<?> driver,ExtentTest test)
	{
		this.driver= driver;
		this.test= test;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
	}

	
	@AndroidFindBy(xpath = "//android.app.Dialog/android.view.View[1]/android.widget.TextView")
	AndroidElement pin_popup_Header_Text;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.TextView")
	AndroidElement AlertPopUpMsg;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.TextView")
	AndroidElement Pin_SCreen_Msg_popup;
	
	@AndroidFindBy(className = "android.widget.Image")
	AndroidElement pin_popup_Close_Btn;
	
//	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View[1]/android.view.View/android.view.View/android.widget.Image")
//	AndroidElement pin_popup_Close_Btn;
	
	@AndroidFindBy(xpath = "//android.view.View/android.view.View/android.app.Dialog/android.widget.EditText")
	AndroidElement pin_popup_enterpin_inoutbox;
	
	@AndroidFindBy(xpath = "//*[@text='1']")
	AndroidElement pin_popup_NO_One;
	
	@AndroidFindBy(xpath = "//*[@text='2']")
	AndroidElement pin_popup_NO_Two;
	
	@AndroidFindBy(xpath = "//*[@text='3']")
	AndroidElement pin_popup_NO_Three;
	
	@AndroidFindBy(xpath = "//*[@text='4']")
	AndroidElement pin_popup_NO_Four;
	
	@AndroidFindBy(xpath = "//*[@text='5']")
	AndroidElement pin_popup_NO_Five;
	
	@AndroidFindBy(xpath = "//*[@text='6']")
	AndroidElement pin_popup_NO_Six;
	
	@AndroidFindBy(xpath = "//*[@text='7']")
	AndroidElement pin_popup_NO_Seven;
	
	@AndroidFindBy(xpath = "//*[@text='8']")
	AndroidElement pin_popup_NO_Eight;
	
	@AndroidFindBy(xpath = "//*[@text='9']")
	AndroidElement pin_popup_NO_Nine;
	
	@AndroidFindBy(xpath = "//*[@text='C']")
	AndroidElement pin_popup_Clear_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Clear']")
	AndroidElement pin_popup_Clear_Btn2;
	
	@AndroidFindBy(xpath = "//*[@text='0']")
	AndroidElement pin_popup_NO_Zero;
	
	@AndroidFindBy(xpath = "//android.app.Dialog/android.view.View[13]/android.widget.Button")
	AndroidElement pin_popup_Delete_Btn;
	
	@AndroidFindBy(xpath = "//android.view.View[2]/android.view.View[12]/android.widget.Button")
	AndroidElement Login_Screen_Delete_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Continue']")
	AndroidElement pin_popup_Continue_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Select Role']")
	AndroidElement Select_Role_popup;
	
	public AndroidElement Select_Role_popup() {
		return Select_Role_popup;
	}
	
	@AndroidFindBy(xpath = "//*[@text='Admin']")
	AndroidElement Select_Role_popup_Admin;
	
	public AndroidElement Select_Role_popup_Admin() {
		return Select_Role_popup_Admin;
	}


	@AndroidFindBy(xpath = "//*[@text='Admin']")
	AndroidElement Select_Firstrole_IN_Role_popup;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	AndroidElement Select_Role_popup_Ok_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Cancel']")
	AndroidElement Select_Role_popup_Cancel_Btn;
	
	
	
}
