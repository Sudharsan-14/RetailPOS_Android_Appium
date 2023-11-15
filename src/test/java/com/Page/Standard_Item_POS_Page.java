package com.Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Standard_Item_POS_Page {
	
	
	public AppiumDriver<?> driver;
	public ExtentTest test;
	Appium_Base_Class base;
	RetailPOS_Order_Page rop;
	Login_Page lp;
	
    Common_xpath cm;
    public Standard_Item_POS_Page sip;
    
	public Standard_Item_POS_Page(AppiumDriver<?> driver,ExtentTest test)
	{
		this.driver= driver;
		this.test= test;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);	
	}
    
	@AndroidFindBy(xpath = "//*[@text='Cash']")
	AndroidElement Order_Screen_CashBtn;
    
	@AndroidFindBy(xpath = "//*[@text='Exact']")
	AndroidElement Cash_Screen_ExactBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Enter']")
	AndroidElement Cash_Screen_EnterBtn;
	
	public AndroidElement getOrder_Screen_CashBtn() {
		return Order_Screen_CashBtn;
	}
	
	public AndroidElement getCash_Screen_ExactBtn() {
		return Cash_Screen_ExactBtn;
	}
	
	public AndroidElement getCash_Screen_EnterBtn() {
		return Cash_Screen_EnterBtn;
	}
	
	
	public void Cash_Payment_Selection_And_Completed() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		//Click the cash option from the order screen
		base.click_Ele(getOrder_Screen_CashBtn());
		
		Thread.sleep(1000);
		//click the exact button from the cash payment screen
		base.click_Ele(getCash_Screen_ExactBtn());
		
		Thread.sleep(1000);
		//Click the enter button from the cash payment screen
		base.click_Ele(Cash_Screen_EnterBtn);
		

		Thread.sleep(1000);
	}
	
	@AndroidFindBy(xpath = "//*[@text='Sale History']")
	AndroidElement Order_Screen_Sale_HistoryBtn;
	
	public AndroidElement getOrder_Screen_Sale_HistoryBtn() {
		return Order_Screen_Sale_HistoryBtn;
	}
	
	@AndroidFindBy(xpath = "//*[@text='Check No']/../android.widget.EditText")
	AndroidElement AllOrders_Search_Fld;
	
	public AndroidElement getAllOrders_Search_Fld() {
		return AllOrders_Search_Fld;
	}
	
	@AndroidFindBy(xpath = "//*[@text='Retail']")
	AndroidElement AllOrders_Retail_Btn;
	
	public AndroidElement getAllOrders_Retail_Btn() {
		return AllOrders_Retail_Btn;
	}
	
	public void Verify_The_Closed_Check(String CheckNo) throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		Thread.sleep(2000);
		//click the sale history button
		base.click_Ele(getOrder_Screen_Sale_HistoryBtn());
		
		Thread.sleep(2000);
		//clear the search field
		base.ClearData_inputBOX(getAllOrders_Search_Fld());
		
		Thread.sleep(500);
		
		//enter the check number
		base.send_data(getAllOrders_Search_Fld(), CheckNo);
		
		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Closed) check number is available in the Closed tab after completing the check");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Closed) check number is not available in the Closed tab after completing the check");
		}
		
		Thread.sleep(1000);
		//click the retail button from the All orders page
		base.click_Ele(AllOrders_Retail_Btn);
		
		Thread.sleep(2000);
	}
	
//	@AndroidFindBy(xpath = "//*[@text='Add Customer']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='1']")
//	AndroidElement Numpad1;
//	
//	public AndroidElement getNumpad1() {
//		return Numpad1;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='2']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='3']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='4']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='5']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='6']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='7']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='8']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='9']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='C']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='0']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='By Phone']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//android.widget.EditText")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//android.widget.ListView/android.view.View/android.view.View/android.view.View[1]")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	@AndroidFindBy(xpath = "//*[@text='Remove']/../../android.view.View[1]")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
//	
//	
//	@AndroidFindBy(xpath = "//*[@text='No Previous Order']")
//	AndroidElement OrderScreen_Add_Customer;
//	
//	public AndroidElement getOrderScreen_Add_Customer() {
//		return OrderScreen_Add_Customer;
//	}
	
	
}
