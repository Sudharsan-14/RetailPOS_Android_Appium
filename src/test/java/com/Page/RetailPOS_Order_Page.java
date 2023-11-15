package com.Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.Utility.Utility;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RetailPOS_Order_Page {
	
	public AppiumDriver<?> driver;
	public ExtentTest test;
	Appium_Base_Class base;
	public Login_Page lp;
	public Common_xpath cm;
	public Pin_Screen_Page psp;
    Utility ut = new Utility();
    Float unknownValue = 0.0f;
	
	public RetailPOS_Order_Page(AppiumDriver<?> driver,ExtentTest test)
	{
		this.driver= driver;
		this.test= test;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
	}
	
	
	@AndroidFindBy(xpath = "//*[@text='Log Off']")
	AndroidElement Order_Screen_LogOff;
	
	@AndroidFindBy(xpath = "//*[@text='ITEM']")
	AndroidElement Order_Screen_Item_ColumnTxt;
	
	@AndroidFindBy(xpath = "//*[@text='VARIANT']")
	AndroidElement Order_Screen_Variant_ColumnTxt;
	
	@AndroidFindBy(xpath = "//*[@text='SKU CODE']")
	AndroidElement Order_Screen_SkuCode_ColumnTxt;
	
	@AndroidFindBy(xpath = "//*[@text='QTY']")
	AndroidElement Order_Screen_Qty_ColumnTxt;
	
	@AndroidFindBy(xpath = "//*[@text='PRICE']")
	AndroidElement Order_Screen_Price_ColumnTxt;
	
	@AndroidFindBy(xpath = "//*[@text='DISCOUNT']")
	AndroidElement Order_Screen_Discount_ColumnTxt;
	
	@AndroidFindBy(xpath = "//*[@text='TOTAL']")
	AndroidElement Order_Screen_Total_ColumnTxt;
	
	@AndroidFindBy(xpath = "//*[@text='Receipt No']")
	AndroidElement Order_Screen_Receipt_NoTxt;
	
	@AndroidFindBy(xpath = "//*[@text='Receipt No']/../android.widget.TextView[3]")
	AndroidElement Order_Screen_Check_No;
	
	@AndroidFindBy(id = "operations")
	AndroidElement Order_Screen_OperationsBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Void']")
	AndroidElement Order_Screen_VoidBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Sale History']")
	AndroidElement Order_Screen_Sale_HistoryBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Park Sale']")
	AndroidElement Order_Screen_Park_SaleBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Retrieve Sale']")
	AndroidElement Order_Screen_Retreive_SaleBtn;
	
	@AndroidFindBy(xpath = "//*[@text='layaway']")
	AndroidElement Order_Screen_layawayBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Option']")
	AndroidElement Order_Screen_OptionBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Print']")
	AndroidElement Order_Screen_PrintBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Discount']")
	AndroidElement Order_Screen_DiscountBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Cash']")
	AndroidElement Order_Screen_CashBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Payment']")
	AndroidElement Order_Screen_PaymentBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']")
	AndroidElement Order_Screen_Add_CustomerBtn;
	
	@AndroidFindBy(xpath = "//android.view.View/android.view.View[2]/android.widget.EditText")
	AndroidElement Order_Screen_Menu_Search_TextBox;
	
	@AndroidFindBy(xpath = "//android.view.View/android.view.View[2]/android.widget.Button/android.widget.Image")
	AndroidElement Order_Screen_Category_ExpandBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']")
	AndroidElement Order_Screen_Add_Customer_popupText;
	
	@AndroidFindBy(xpath = "//*[@text='By Phone']")
	AndroidElement Order_Screen_By_PhoneBtn;
	
	@AndroidFindBy(xpath = "//*[@text='By Name / Email']")
	AndroidElement Order_Screen_By_Name_EmailBtn;
	
	@AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.widget.EditText")
	AndroidElement Order_Screen_CustomerSearch_Input_Box;
	
	@AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")
	AndroidElement Order_Screen_Total_Amount;
	
	@AndroidFindBy(xpath = "//*[@text='Subtotal']")
	AndroidElement Order_Screen_SubTotal_Txt;
	
	@AndroidFindBy(xpath = "//*[@text='Tax']")
	AndroidElement Order_Screen_Tax_Txt;
	
	@AndroidFindBy(xpath = "//*[@text='Total']")
	AndroidElement Order_Screen_Total_Txt;
	
	@AndroidFindBy(xpath = "//*[@text='Paid Amount']")
	AndroidElement Order_Screen_Paid_Amount_Txt;
	
	@AndroidFindBy(xpath = "//*[@text='Balance Amount']")
	AndroidElement Order_Screen_Balance_Amount_Txt;
	
	@AndroidFindBy(xpath = "//*[@text='Receipt No']/../../android.view.View//android.widget.TextView[3]")
	AndroidElement Order_Screen_Check_NO;
	
	@AndroidFindBy(xpath = "//*[@text='Subtotal']/../android.view.View/android.view.View/android.widget.TextView")
	AndroidElement Order_Screen_SubTotal_Value;
	
	@AndroidFindBy(xpath = "//*[@text='Discount']/../android.view.View/android.view.View/android.widget.TextView")
	AndroidElement Order_Screen_Discount_Value;
	
	public AndroidElement getOrder_Screen_Discount_Value() {
		return Order_Screen_Discount_Value;
	}
	
	public AndroidElement getOrder_Screen_SubTotal_Value() {
		return Order_Screen_SubTotal_Value;
	}

	public AndroidElement getOrder_Screen_Tax_Value() {
		return Order_Screen_Tax_Value;
	}

	public AndroidElement getOrder_Screen_Total_Value() {
		return Order_Screen_Total_Value;
	}

	public AndroidElement getOrder_Screen_Paid_Amount_Value() {
		return Order_Screen_Paid_Amount_Value;
	}

	public AndroidElement getOrder_Screen_Balance_Amount_Value() {
		return Order_Screen_Balance_Amount_Value;
	}


	@AndroidFindBy(xpath = "//*[@text='Tax']/../android.view.View/android.view.View/android.widget.TextView")
	AndroidElement Order_Screen_Tax_Value;
	
	@AndroidFindBy(xpath = "//*[@text='Total']/../android.view.View/android.view.View/android.widget.TextView")
	AndroidElement Order_Screen_Total_Value;
	
	@AndroidFindBy(xpath = "//*[@text='Paid Amount']/../android.view.View/android.view.View/android.widget.TextView")
	AndroidElement Order_Screen_Paid_Amount_Value;
	
	@AndroidFindBy(xpath = "//*[@text='Balance Amount']/../android.view.View/android.view.View/android.widget.TextView")
	AndroidElement Order_Screen_Balance_Amount_Value;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.ListView']//android.view.View//android.view.View//android.view.View")
	AndroidElement Order_Screen_Customer_Serach_List;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.ListView']//android.view.View//android.view.View//android.view.View[1]")
	AndroidElement Order_Screen_Customer_Serach_List_First_Result;
	
	@AndroidFindBy(xpath = "//*[@text='Remove']")
	AndroidElement Order_Screen_Customer_Remove_Btn;
	
	@AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView")
	AndroidElement Order_Screen_Customer_Name_Btn;
	
	@AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'Standard Item')]")
	AndroidElement Order_Screen_Category_StandardItem;
	
	@AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'Variant Item')]")
	AndroidElement Order_Screen_Category_VariantItem;
	
	@AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'Kit Accessible Item Cat')]")
	AndroidElement Order_Screen_Category_Kit_Accessible_Item_Cat;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Back')]")
	AndroidElement Order_Screen_Category_Back_Btn;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'MENU ITEMS OF')]")
	AndroidElement Order_Screen_Category_Name_InPopUp;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id,'menu-item')]")
	AndroidElement Order_Screen_Menu_Item_List2;
	
	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
	AndroidElement Order_Screen_Menu_Cancel_Btn;
	
	@AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']//android.view.View[1]//android.widget.TextView[5]")
	AndroidElement Order_Screen_Menu_Prices_List;
	
	@AndroidFindBy(xpath = "//*[@text=' Done']")
	AndroidElement Order_Screen_Variant_Menu_Done_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Search']")
	AndroidElement Order_Screen_Serach_Box;
	
	@AndroidFindBy(xpath = "//*[@text='Standard Item 3']")
	AndroidElement Order_Screen_Menu_Serach_Result;
	
	@AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']/android.view.View/android.widget.TextView[1]")
	AndroidElement Order_Screen_Menu_Item_List;
	
	@AndroidFindBy(xpath = "//*[@text='Void']")
	public
	AndroidElement Order_Screen_Void_Btn;
	
	@AndroidFindBy(xpath = "//*[@resource-id='alert-done-popup']/android.widget.TextView")
	AndroidElement Order_Screen_Void_POP_up_Text;
	
	@AndroidFindBy(xpath = "//*[@text='Done']")
	AndroidElement Order_Screen_Void_pop_up_Done_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='1']")
	AndroidElement Order_Screen_NumberPad_1;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='2']")
	AndroidElement Order_Screen_NumberPad_2;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='3']")
	AndroidElement Order_Screen_NumberPad_3;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='4']")
	AndroidElement Order_Screen_NumberPad_4;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='5']")
	AndroidElement Order_Screen_NumberPad_5;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='6']")
	AndroidElement Order_Screen_NumberPad_6;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='7']")
	AndroidElement Order_Screen_NumberPad_7;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='8']")
	AndroidElement Order_Screen_NumberPad_8;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='9']")
	AndroidElement Order_Screen_NumberPad_9;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='0']")
	AndroidElement Order_Screen_NumberPad_0;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='00']")
	AndroidElement Order_Screen_NumberPad_00;
	
	@AndroidFindBy(xpath = "//*[@text='Add Customer']/../../android.view.View/android.widget.Button[@text='C']")
	AndroidElement Order_Screen_NumberPad_Clear;
	
	@AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']/android.view.View/android.widget.TextView[4]")
	AndroidElement Order_Screen_MenuItem_Count_Btn;
	
	@AndroidFindBy(xpath = "(//android.view.View[2]/android.view.View/android.view.View/android.view.View)//android.widget.Button")
	AndroidElement Kit_Variant_Box;

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
	
//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	AndroidElement Order_Screen_Menu_Cancel_Btn;
	
//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	AndroidElement Order_Screen_Menu_Cancel_Btn;

//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	AndroidElement Order_Screen_Menu_Cancel_Btn;

	public AndroidElement Order_Screen_Menu_Cancel_Btn(int value) {
		
		AndroidElement Order_Screen_Menu_Cancel_Btn = (AndroidElement) driver.findElement(By.xpath("(//*[@text='X'])["+value+"]"));
		return Order_Screen_Menu_Cancel_Btn;
	}

	public AndroidElement getOrder_Screen_LogOff() {
		return Order_Screen_LogOff;
	}

	public AndroidElement getOrder_Screen_Item_ColumnTxt() {
		return Order_Screen_Item_ColumnTxt;
	}

	public AndroidElement getOrder_Screen_Variant_ColumnTxt() {
		return Order_Screen_Variant_ColumnTxt;
	}

	public AndroidElement getOrder_Screen_SkuCode_ColumnTxt() {
		return Order_Screen_SkuCode_ColumnTxt;
	}

	public AndroidElement getOrder_Screen_Qty_ColumnTxt() {
		return Order_Screen_Qty_ColumnTxt;
	}

	public AndroidElement getOrder_Screen_Price_ColumnTxt() {
		return Order_Screen_Price_ColumnTxt;
	}

	public AndroidElement getOrder_Screen_Discount_ColumnTxt() {
		return Order_Screen_Discount_ColumnTxt;
	}

	public AndroidElement getOrder_Screen_Total_ColumnTxt() {
		return Order_Screen_Total_ColumnTxt;
	}

	public AndroidElement getOrder_Screen_Receipt_NoTxt() {
		return Order_Screen_Receipt_NoTxt;
	}

	public AndroidElement getOrder_Screen_Check_No() {
		return Order_Screen_Check_No;
	}

	public AndroidElement getOrder_Screen_OperationsBtn() {
		return Order_Screen_OperationsBtn;
	}

	public AndroidElement getOrder_Screen_VoidBtn() {
		return Order_Screen_VoidBtn;
	}

	public AndroidElement getOrder_Screen_Sale_HistoryBtn() {
		return Order_Screen_Sale_HistoryBtn;
	}

	public AndroidElement getOrder_Screen_Park_SaleBtn() {
		return Order_Screen_Park_SaleBtn;
	}

	public AndroidElement getOrder_Screen_Retreive_SaleBtn() {
		return Order_Screen_Retreive_SaleBtn;
	}

	public AndroidElement getOrder_Screen_layawayBtn() {
		return Order_Screen_layawayBtn;
	}

	public AndroidElement getOrder_Screen_OptionBtn() {
		return Order_Screen_OptionBtn;
	}

	public AndroidElement getOrder_Screen_PrintBtn() {
		return Order_Screen_PrintBtn;
	}

	public AndroidElement getOrder_Screen_DiscountBtn() {
		return Order_Screen_DiscountBtn;
	}

	public AndroidElement getOrder_Screen_CashBtn() {
		return Order_Screen_CashBtn;
	}

	public AndroidElement getOrder_Screen_PaymentBtn() {
		return Order_Screen_PaymentBtn;
	}

	public AndroidElement getOrder_Screen_Add_CustomerBtn() {
		return Order_Screen_Add_CustomerBtn;
	}

	public AndroidElement getOrder_Screen_Menu_Search_TextBox() {
		return Order_Screen_Menu_Search_TextBox;
	}

	public AndroidElement getOrder_Screen_Category_ExpandBtn() {
		return Order_Screen_Category_ExpandBtn;
	}
	
	public void Reatail_OrderScreen_Columns_Validation() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		Thread.sleep(2000);
		base.text_Confirm(getOrder_Screen_Item_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_Item"));
		base.text_Confirm_without_Screenshot(getOrder_Screen_Variant_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_Variant"));
		base.text_Confirm_without_Screenshot(getOrder_Screen_SkuCode_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_SkuCode"));
		base.text_Confirm_without_Screenshot(getOrder_Screen_Qty_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_QTY"));
		base.text_Confirm_without_Screenshot(getOrder_Screen_Price_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_Price"));
		base.text_Confirm_without_Screenshot(getOrder_Screen_Discount_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_Discount"));
		base.text_Confirm_without_Screenshot(getOrder_Screen_Total_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_Total"));
		
	}
	
	public void add_CustomerBY_Phone_NO() {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		
		
		
	}
	
	public void Void_MenuItems() {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		base.click_Ele(Order_Screen_Void_Btn);
		base.text_Confirm(Order_Screen_Void_POP_up_Text, "All Orders Are Voided");
		base.click_Ele(Order_Screen_Void_pop_up_Done_Btn);
		
	}
	
	public void Log_Off_to_Pinscreen() {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		psp = new Pin_Screen_Page(driver, test);
		
		base.click_Ele(psp.LogOff_Btn);
		
	}
	
	
	public void multipleMenu_Selection_Random() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		base.click_Ele(Order_Screen_Category_StandardItem);
		Thread.sleep(2000);
		base.Random_ForMultipule_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		base.click_Ele(Order_Screen_Category_Back_Btn);
		Thread.sleep(1000);
		
	}
	
	public void multipleMenu_Selection_Random_Kit_Accessible() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		base.click_Ele(Order_Screen_Category_Kit_Accessible_Item_Cat);
		Thread.sleep(2000);
		base.Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		base.Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		base.click_Ele(Order_Screen_Category_Back_Btn);
		Thread.sleep(1000);
		
	}
	
//	public void Close_Check_BYCASH() throws Throwable {
//		cm = new Common_xpath(driver, test);
//		base = new Appium_Base_Class(driver, test);
//		
//		Thread.sleep(2000);
//		base.click_Ele(getOrder_Screen_CashBtn());
//		base.click_Ele();
//		
//		
//	}
	
	public void Removing_Menu_Items() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		Thread.sleep(2000);
		base.click_On_EveryItem_INLIST(driver, "(//*[@text='X'])");

	}
	
	public void Single_Random_Menu_Selection() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		base.click_Ele(Order_Screen_Category_StandardItem);
		Thread.sleep(2000);
		base.Random_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		base.click_Ele(Order_Screen_Category_Back_Btn);
		Thread.sleep(1000);
	}
	
	public void Single_Random_Menu_SelectionFor_VariantItem() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		base.click_Ele(Order_Screen_Category_VariantItem);
		Thread.sleep(2000);
		base.Random_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(1000);
		base.click_Ele(Order_Screen_Category_Back_Btn);
		Thread.sleep(1000);
	}
	
	public void OrderScreen_Serach() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		base.click_Ele(Order_Screen_Serach_Box);
		base.send_data(Order_Screen_Serach_Box, "standard Item");
		driver.hideKeyboard();
		base.Random_Selection(driver, "//*[contains(@text,'Search')]/android.view.View/android.view.View/android.view.View");
		base.click_Ele(Order_Screen_Total_ColumnTxt);
		base.ClearData_inputBOX(Order_Screen_Serach_Box);
		
	}
	
	public void OrderScreen_NumberPad() throws Throwable {
		
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		multipleMenu_Selection_Random();
		base.Random_Selection(driver, "//*[@resource-id='react-ordder-list-render']/android.view.View/android.widget.TextView[1]");
		base.click_Ele(Order_Screen_NumberPad_1);
		base.click_Ele(Order_Screen_NumberPad_2);
		base.click_Ele(Order_Screen_NumberPad_3);
		base.click_Ele(Order_Screen_NumberPad_Clear);
		base.click_Ele(Order_Screen_MenuItem_Count_Btn);
		Thread.sleep(2000);
		base.click_Ele(cm.pin_popup_Clear_Btn);
		base.click_Ele(cm.pin_popup_NO_One);
		base.click_Ele(cm.pin_popup_NO_Two);
		base.click_Ele(cm.pin_popup_Delete_Btn);
		base.click_Ele(cm.pin_popup_NO_One);
		base.click_Ele(cm.pin_popup_NO_Two);
		base.click_Ele(cm.pin_popup_Continue_Btn);
		Thread.sleep(2000);
		base.text_Confirm_without_Screenshot((AndroidElement) driver.findElement(By.xpath("//*[@resource-id='react-ordder-list-render']/android.view.View/android.widget.TextView[1]")), "12");
		Thread.sleep(2000);
		base.click_Ele(Order_Screen_MenuItem_Count_Btn);
		Thread.sleep(2000);
		base.click_Ele(cm.pin_popup_Clear_Btn);
		base.click_Ele(cm.pin_popup_NO_One);
		base.click_Ele(cm.pin_popup_Continue_Btn);
		Thread.sleep(2000);
		base.text_Confirm_without_Screenshot((AndroidElement) driver.findElement(By.xpath("//*[@resource-id='react-ordder-list-render']/android.view.View/android.widget.TextView[1]")), "1");

	}
	
	
	
	public void Check_Values_Validations() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		//Total price value calculated in float
		Float Calculated_Total_Price = base.Get_Price_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[5]");
		//Total total amount value calculated in float
		Float Calculated_Total_Amount = base.Get_Total_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[7]");
		//Total total amount value calculated in float
		double Calculated_Disc_Amount = base.Get_Disc_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[6]");

		//Actual Sub Total value in ordre screen
		String actualText1 = getOrder_Screen_SubTotal_Value().getText();
		
		            // Replace all commo's with empty space
					String actualText = actualText1.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

					// Convert the String value of the Net Sales element into float value
					float actual_SubTotal_Value = Float.parseFloat(actualText);
					
					System.out.println("Actual Sub-Total Vlaue :" + actual_SubTotal_Value);
					
					String actualText2 = getOrder_Screen_Total_Value().getText();
					
		            // Replace all commo's with empty space
					String actualText3 = actualText2.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

					// Convert the String value of the Net Sales element into float value
					float actual_Total_Value = Float.parseFloat(actualText3);	
					
					System.out.println("Actual Total Vlaue :" + actual_Total_Value);
					
					String discount = getOrder_Screen_Discount_Value().getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
					double disc1 = Double.parseDouble(discount);
					System.out.println("Actual Discount Vlaue :" + disc1);
		
		// Check weather the Calculated Price amount and Actual Price amount is same or not
		if (Calculated_Total_Price == actual_SubTotal_Value) {
			test.log(LogStatus.PASS, "Actual and Expected Sub-Total amount are same");

			// Print the actual value
			System.out.println("The Actual Sub-Total Value is : " + actual_SubTotal_Value);

			test.log(LogStatus.PASS, "The Actual Sub-Total Value is : " + actual_SubTotal_Value);
		}

		else if (actual_SubTotal_Value == unknownValue) {
			test.log(LogStatus.PASS, "Here we don't have the exact expected value");

			System.out.println("The Actual Sub-Total value is : " + actual_SubTotal_Value);

			test.log(LogStatus.INFO, "The Actual Sub-Total value is : " + actual_SubTotal_Value);
		}

		else {
			test.log(LogStatus.FAIL, "Actual and Expected Sub-Total values are different");

			// Get the different
			float different = Calculated_Total_Price - actual_SubTotal_Value;

			// Print the different value
			System.out.println("Sub-Total Value different is : " + different);

			test.log(LogStatus.FAIL, "Sub-Total Value different is : " + different);
		}
		
		// Check weather the Calculated Total amount and Actual Total amount is same or not
				if (Calculated_Total_Amount == actual_Total_Value) {
					test.log(LogStatus.PASS, "Actual and Expected Total amount are same");

					// Print the actual value
					System.out.println("The Actual Total Value is : " + actual_Total_Value);

					test.log(LogStatus.PASS, "The Actual Total Value is : " + actual_Total_Value);
				}

				else if (actual_Total_Value == unknownValue) {
					test.log(LogStatus.PASS, "Here we don't have the exact expected value");

					System.out.println("The Actual Total value is : " + actual_Total_Value);

					test.log(LogStatus.INFO, "The Actual Total value is : " + actual_Total_Value);
				}

				else {
					test.log(LogStatus.FAIL, "Actual and Expected Total values are different");

					System.out.println("******************");
					System.out.println(Calculated_Total_Amount);
					System.out.println(actual_Total_Value);
					System.out.println("******************");
					
					// Get the different
					float different = Calculated_Total_Amount - actual_Total_Value;

					// Print the different value
					System.out.println("Total Value different is : " + different);

					test.log(LogStatus.FAIL, "Total Value different is : " + different);
				}
				
				
				// Check weather the Calculated Total amount and Actual Total amount is same or not
				if (Calculated_Disc_Amount == disc1) {
					test.log(LogStatus.PASS, "Actual and Expected Discount amount are same");

					// Print the actual value
					System.out.println("The Actual Discount Value is : " + disc1);

					test.log(LogStatus.PASS, "The Actual Total Value is : " + disc1);
				}
				else {
					
					double diff = Calculated_Disc_Amount - disc1;
					
					test.log(LogStatus.FAIL, "Actual and Expected Discount values are different and the difference is : "+diff);

					// Print the different value
					System.out.println("Total Value different is : " + diff);
				}
				
		
		
	}
	
	
	public String get_Check_NO() {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		String Check_NO = base.Get_Text(getOrder_Screen_Check_No());
		
		return Check_NO;
		
	}
	
	public void balance_Amount() {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		        //Actual Sub Total value in ordre screen
				String actualText1 = getOrder_Screen_Total_Value().getText();
			
				// Replace all commo's with empty space
			    String actualText = actualText1.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

				// Convert the String value of the Net Sales element into float value
				float actual_Total_Value = Float.parseFloat(actualText);
				
				 //Actual Sub Total value in ordre screen
				String actualText2 = getOrder_Screen_Total_Value().getText();
			
				// Replace all commo's with empty space
			    String actualText_Paid_Amount = actualText2.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

				// Convert the String value of the Net Sales element into float value
				float actual_Paid_Amount_Value = Float.parseFloat(actualText_Paid_Amount);
				
				 //Actual Sub Total value in ordre screen
				String actualText3 = getOrder_Screen_Total_Value().getText();
			
				// Replace all commo's with empty space
			    String actualText_Balance_Amount = actualText3.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

				// Convert the String value of the Net Sales element into float value
				float actual_Balance_Amount_Value = Float.parseFloat(actualText_Balance_Amount);
				
				//Gettign subtracted wiht the Check total and the Paud amount we can get the calculated balance amount
				Float Calculated_Balance_Amount =  actual_Total_Value - actual_Paid_Amount_Value;
				
				// Check weather the Calculated Balance amount and Actual Balance amount is same or not
				if (Calculated_Balance_Amount == actual_Balance_Amount_Value) {
					test.log(LogStatus.PASS, "Actual and Expected Balance amount are same");

					// Print the actual value
					System.out.println("The Actual Balance amount Value is : " + actual_Balance_Amount_Value);

					test.log(LogStatus.PASS, "The Actual Balance amount Value is : " + actual_Balance_Amount_Value);
				}

				else if (actual_Balance_Amount_Value == unknownValue) {
					test.log(LogStatus.PASS, "Here we don't have the exact expected value");

					System.out.println("The Actual Balance amount value is : " + actual_Balance_Amount_Value);

					test.log(LogStatus.INFO, "The Actual Balance amount value is : " + actual_Balance_Amount_Value);
				}

				else {
					test.log(LogStatus.FAIL, "Actual and Expected Balance amount values are different");

					// Get the different
					float different = Calculated_Balance_Amount - actual_Balance_Amount_Value;

					// Print the different value
					System.out.println("Balance amount Value different is : " + different);

					test.log(LogStatus.FAIL, "Balance amount Value different is : " + different);
				}
				
				
							
		
	}
	
	public void balance_Amount1() {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		        //Get the value of Total amount from the Order Screen
				String actual_Total = getOrder_Screen_Total_Value().getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
				
				//Parse the total string value into double
				double act_Total = Double.parseDouble(actual_Total);
				
				 //Get the value of Paid amount from the Order Screen
				String actual_Paid = getOrder_Screen_Paid_Amount_Value().getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
			
				//Parse the paid string value into double
				double act_Paid = Double.parseDouble(actual_Paid);
				
				 //Get the value of balance amount from the Order Screen
				String actual_Balance = getOrder_Screen_Balance_Amount_Value().getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
			
				//Parse the balance string value into double
				double act_Balance = Double.parseDouble(actual_Balance);
				
				//Subtract the paid value from the Total value then we get the balance amount
				double Calculated_Balance_Amount =  act_Total - act_Paid;
				
				// Check weather the Calculated Balance amount and Actual Balance amount is same or not
				if (Calculated_Balance_Amount == act_Balance) {
					test.log(LogStatus.PASS, "Actual and Expected Balance amount are same");

					// Print the actual value
					System.out.println("The Actual Balance amount Value is : " + act_Balance);

					test.log(LogStatus.PASS, "The Actual Balance amount Value is : " + act_Balance);
				}

				else {
					test.log(LogStatus.FAIL, "Actual and Expected Balance amount values are different");

					// Get the different
					double different = Calculated_Balance_Amount - act_Balance;

					// Print the different value
					System.out.println("Balance amount Value different is : " + different);

					test.log(LogStatus.FAIL, "Balance amount Value different is : " + different);
				}
				
				
							
		
	}
	
	
	public void Exclusive_Tax_Calculation() throws Throwable {
		cm = new Common_xpath(driver, test);
		base = new Appium_Base_Class(driver, test);
		
		//Actual sub taotal value in order screen
		String actualText1 = getOrder_Screen_SubTotal_Value().getText();
							
		float Calculated_Tax_Value = base.Exclusive_Tax(actualText1);
		
		String actualTextvalue = getOrder_Screen_Tax_Value().getText();
		String Report_Taxes = actualTextvalue.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		float actual_Tax_Value = Float.parseFloat(Report_Taxes);
		System.out.println("Actual Total Tax Vlaue :" + actual_Tax_Value);
		
		// Check weather the Calculated Total amount and Actual Total Tax amount is same or not
		if (Calculated_Tax_Value == actual_Tax_Value) {
			test.log(LogStatus.PASS, "Actual and Expected Total Tax amount are same");

			// Print the actual value
			System.out.println("The Actual Total Tax Value is : " + actual_Tax_Value);

			test.log(LogStatus.PASS, "The Actual Total Tax Value is : " + actual_Tax_Value);
		}

		else if (actual_Tax_Value == unknownValue) {
			test.log(LogStatus.PASS, "Here we don't have the exact expected value");

			System.out.println("The Actual Total Tax value is : " + actual_Tax_Value);

			test.log(LogStatus.INFO, "The Actual Total Tax value is : " + actual_Tax_Value);
		}

		else {
			test.log(LogStatus.FAIL, "Actual and Expected Total Tax values are different");

			// Get the different
			float different = Calculated_Tax_Value - actual_Tax_Value;

			// Print the different value
			System.out.println("Total Tax Value different is : " + different);

			test.log(LogStatus.FAIL, "Total Tax Value different is : " + different);
		}
		
	}
	

}
