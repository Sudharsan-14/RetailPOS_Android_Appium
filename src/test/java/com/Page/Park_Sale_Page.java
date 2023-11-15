package com.Page;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Park_Sale_Page {
	
	public AppiumDriver<?> driver;
	public ExtentTest test;
	Appium_Base_Class base;
	RetailPOS_Order_Page rop;
	Login_Page lp;
	
    Common_xpath cm;
    public Pin_Screen_Page psp;
    
	
	public Park_Sale_Page(AppiumDriver<?> driver,ExtentTest test)
	{
		this.driver= driver;
		this.test= test;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);	
	}
	
	
	@AndroidFindBy(xpath = "//*[@class='android.app.Dialog']/android.view.View/android.widget.TextView")
	AndroidElement park_Sale_no_Menuitem_pop_up_msg;
	
	@AndroidFindBy(xpath = "//*[@text='Park Sale']")
	AndroidElement park_Sale_pop_up_headerName;

	@AndroidFindBy(xpath = "//*[@text='Park Sale']/../../android.view.View/android.view.View/android.widget.TextView")
	AndroidElement park_Sale_pop_up_reason_Specify_text;
	
	@AndroidFindBy(xpath = "//*[@text='Park']")
	AndroidElement park_Sale_pop_up_Park_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Park Sale']/../../android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	AndroidElement park_Sale_pop_up_reason_inputBOX;
	
	@AndroidFindBy(xpath = "//*[@text='Reason']")
	AndroidElement park_Sale_pop_up_reason_text;

	@AndroidFindBy(xpath = "//*[@resource-id='alert-content']/android.view.View/android.widget.TextView")
	AndroidElement park_Sale_pop_up_Please_EnterReason_PopUP_Text;
	
	@AndroidFindBy(xpath = "//*[@resource-id='alert-content']")
	AndroidElement park_Sale_pop_up_Alert;
	
	@AndroidFindBy(xpath = "//*[@resource-id='retrieve-sale']/android.view.View[1]/android.view.View[2]/android.widget.TextView")
	AndroidElement park_Sale_Retrieve_Sale_header_text;

	@AndroidFindBy(xpath = "//*[@resource-id='retrieve-sale']/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
	AndroidElement park_Sale_Retrieve_Sale_PopUp_Search_field;
	
	@AndroidFindBy(xpath = "//*[@text='Cancel']")
	AndroidElement park_Sale_Retrieve_Sale_PopUp_Cancel_Btn;
	
//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	AndroidElement Order_Screen_Menu_Cancel_Btn;

//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	AndroidElement Order_Screen_Menu_Cancel_Btn;
	
//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	AndroidElement Order_Screen_Menu_Cancel_Btn;
	
//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	AndroidElement Order_Screen_Menu_Cancel_Btn;

//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	AndroidElement Order_Screen_Menu_Cancel_Btn;
	
	
	public void No_Menu_Park_Sale_validation() {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		rop = new RetailPOS_Order_Page(driver, test);
		lp = new Login_Page(driver, test);
		
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
		base.text_Confirm(park_Sale_no_Menuitem_pop_up_msg, "You have to order before parking sale");
		base.click_Ele(rop.Order_Screen_Void_pop_up_Done_Btn);
		
	}
	
	public void ParkSale_screen_Validation() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		rop = new RetailPOS_Order_Page(driver, test);
		lp = new Login_Page(driver, test);
		
		rop.multipleMenu_Selection_Random();
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
		base.text_Confirm(park_Sale_pop_up_headerName, "Park Sale");
		base.text_Confirm_without_Screenshot(park_Sale_pop_up_reason_Specify_text, "Please specify the reason to park sale");
		base.text_Confirm_without_Screenshot(park_Sale_pop_up_reason_text, "Reason");
		base.text_Confirm_without_Screenshot(cm.Select_Role_popup_Cancel_Btn, "Cancel");
		base.text_Confirm_without_Screenshot(park_Sale_pop_up_Park_Btn, "Park");
		base.click_Ele(cm.Select_Role_popup_Cancel_Btn);
		
	}
	
	public void ParkSale_Pop_up_No_reason() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		rop = new RetailPOS_Order_Page(driver, test);
		lp = new Login_Page(driver, test);
		
		rop.multipleMenu_Selection_Random();
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
		base.click_Ele(park_Sale_pop_up_Park_Btn);
		base.text_Confirm(park_Sale_pop_up_Please_EnterReason_PopUP_Text, "Please enter reasons to proceed");
		base.click_Ele(rop.Order_Screen_Void_pop_up_Done_Btn);
		base.click_Ele(cm.Select_Role_popup_Cancel_Btn);
		
	}
	
	public void RetailPOS_ParkSale_Reason_Entering_Restriction() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		rop = new RetailPOS_Order_Page(driver, test);
		lp = new Login_Page(driver, test);
		String Check_NO1;
		
		rop.multipleMenu_Selection_Random();
		Check_NO1 = rop.get_Check_NO();
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
		driver.hideKeyboard();
		base.send_data(park_Sale_pop_up_reason_inputBOX, RandomStringUtils.randomAlphabetic(60));
		base.click_Ele(park_Sale_pop_up_Park_Btn);
		try {
			if (park_Sale_pop_up_Alert.isDisplayed()) {
				
				base.click_Ele(rop.Order_Screen_Void_pop_up_Done_Btn);
				test.log(LogStatus.PASS, "Park Reason Field restriction - Upto 50 character can be entered");
				base.click_Ele(cm.Select_Role_popup_Cancel_Btn);
				rop.Void_MenuItems();
			}
			
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Park Reason Field restriction - User can be enter above 50 characters in the Reason field");
		}
		
		rop.multipleMenu_Selection_Random();
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
		driver.hideKeyboard();
		base.send_data(park_Sale_pop_up_reason_inputBOX, RandomStringUtils.randomAlphanumeric(15));
		base.click_Ele(park_Sale_pop_up_Park_Btn);
		
		rop.multipleMenu_Selection_Random();
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
		driver.hideKeyboard();
		base.send_data(park_Sale_pop_up_reason_inputBOX, "  ");
		base.click_Ele(park_Sale_pop_up_Park_Btn);
		try {
			if (park_Sale_pop_up_Alert.isDisplayed()) {
				
				base.click_Ele(rop.Order_Screen_Void_pop_up_Done_Btn);
				test.log(LogStatus.PASS, "Entering Space in the reason input box, the application don't allow to park sale");
				base.click_Ele(cm.Select_Role_popup_Cancel_Btn);
				rop.Void_MenuItems();
				
			}
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Entering Space in the reason input box, the application do allow to park sale");
		}
		
	}
	
	public void RetailPOS_ParkSale_Retrive_Sale() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		rop = new RetailPOS_Order_Page(driver, test);
		lp = new Login_Page(driver, test);
		String Check_NO1;
		
		Check_NO1 = rop.get_Check_NO();
		base.click_Ele(rop.Order_Screen_Retreive_SaleBtn);
		base.text_Confirm(park_Sale_Retrieve_Sale_header_text, "Parked Sales");
		base.isEleDisplayed(park_Sale_Retrieve_Sale_PopUp_Search_field, "Retrieve Sale Serach field");
		base.isEleDisplayed(park_Sale_Retrieve_Sale_PopUp_Cancel_Btn, "Retrieve Sale Cancel field");
		base.click_Ele(park_Sale_Retrieve_Sale_PopUp_Cancel_Btn);
		base.click_Ele(rop.Order_Screen_Retreive_SaleBtn);
		base.Click_and_close_ParkedSales(driver, "//*[@resource-id='retrieve-sale']/android.view.View[2]/android.view.View/android.widget.TextView");
		
		
	}
	

}
