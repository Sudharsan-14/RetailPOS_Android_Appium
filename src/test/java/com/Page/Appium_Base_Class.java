package com.Page;

import java.net.URL;
import java.text.DecimalFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation;
import org.apache.maven.surefire.shared.lang3.RandomUtils;
import org.aspectj.weaver.tools.cache.AsynchronousFileCacheBacking.RemoveCommand;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Utility.Utility;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Appium_Base_Class {

	public AppiumDriver<?> driver;
	public ExtentTest test;
	Utility ut = new Utility();
	Float Total_Price_Amount = 0.0f;
	Float total_Total_Amount = 0.0f;
	
	double totAmount = 0.00;
	double discAmount = 0.00;

	public Appium_Base_Class(AppiumDriver<?> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(30)), this);
	}

	public void Appium_driver(AppiumDriver<?> driver) throws Throwable {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", Utility.getProperty("platformName1"));
		cap.setCapability("platformVersion", Utility.getProperty("platformVersion1"));
		cap.setCapability("udid", Utility.getProperty("udid1"));
		cap.setCapability("deviceName", Utility.getProperty("deviceName1")); 
		System.out.println(Utility.getProperty("Cloud_packageName1"));
		cap.setCapability("packageName", Utility.getProperty("Cloud_packageName1"));
		cap.setCapability("appActivity", Utility.getProperty("Cloud_appActivity1"));
		driver = new AppiumDriver(new URL(Utility.getProperty("Appium_URL")), cap);
		// Open the Application
		driver.activateApp(Utility.getProperty("Cloud_packageName1"));
		Thread.sleep(5000);
	}

	public void click_Ele(AndroidElement ele) {
		ele.click();
	}

	public void send_data(AndroidElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
	}
	
	public void ClearData_inputBOX(AndroidElement ele) {
		
		ele.clear();

	}
	
	public void Random_Selection(AppiumDriver<?> driver, String xpath) throws Throwable {

		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));

		// Getting size of options available
		int size = itemsInDropdown.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		click_Ele((AndroidElement) itemsInDropdown.get(randnMumber));

		Thread.sleep(2000);
		
       try {
			
			if (driver.findElement(By.xpath("//*[@text='Select Variant']")).isDisplayed()) {
				
				text_Confirm((AndroidElement) driver.findElement(By.xpath("//*[@text='Select Variant']")), "Select Variant");
				
				List<?> ListOfAttributes = driver.findElements(By.xpath("//android.view.View[2]/android.view.View/android.view.View/android.view.View"));
				
				System.out.println("Arributes List Size"+ListOfAttributes.size());
				
				for (int i = 1; i <= ListOfAttributes.size(); i++) {
					
					List<?> ListOfAttributesmapped = driver.findElements(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)["+i+"]//android.widget.Button"));
					
					System.out.println("Lists of Mapped"+ListOfAttributesmapped.size());
					
						// Generate a random number with in range
						int randnMumber1 = ThreadLocalRandom.current().nextInt(0, size);

						// Selecting random value
						click_Ele((AndroidElement) ListOfAttributesmapped.get(randnMumber1));
						
//						String selcted_Attribute = driver.findElement(By.xpath("//*[@focused='true']")).getText();
						
				}
				
				Thread.sleep(2000);
				click_Ele((AndroidElement) driver.findElement(By.xpath("//*[@text=' Done']")));
				
			} else {
				
				int i = 1/0;

			}
			
		} catch (Exception e) {
		}

	}
	
	public void Random_Selection_KitAssembly(AppiumDriver<?> driver, String xpath) throws Throwable {

		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));

		// Getting size of options available
		int size = itemsInDropdown.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		click_Ele((AndroidElement) itemsInDropdown.get(randnMumber));

		Thread.sleep(2000);
		
       try {
			
			if (driver.findElement(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)//android.widget.Button/..")).isDisplayed()) {
				
				//get the number of rows available in the kit assembly page
				List<?> ListOfAttributes = driver.findElements(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)//android.widget.Button/.."));
				
				System.out.println("Arributes List Size"+ListOfAttributes.size());
				
				for (int i = 1; i <= ListOfAttributes.size(); i++) {
					
					List<?> ListOfAttributesmapped = driver.findElements(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)["+i+"]//android.widget.Button"));
					
					System.out.println("Lists of Mapped"+ListOfAttributesmapped.size());
					
						// Generate a random number with in range
						int randnMumber1 = ThreadLocalRandom.current().nextInt(0, size);

						// Selecting random value
						click_Ele((AndroidElement) ListOfAttributesmapped.get(randnMumber1));
						
//						String selcted_Attribute = driver.findElement(By.xpath("//*[@focused='true']")).getText();
						
				}
				
				
			} else {
				
				int i = 1/0;

			}
			
		} catch (Exception e) {
		}
       
       Thread.sleep(2000);
		click_Ele((AndroidElement) driver.findElement(By.xpath("//*[@text=' Done']")));

	}
	
	

	
	public void Random_ForMultipule_Selection(AppiumDriver<?> driver, String xpath) throws Throwable {

		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));

		// Getting size of options available
		int size = itemsInDropdown.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(1, size);

		// Selecting random value
		click_Ele((AndroidElement) itemsInDropdown.get(randnMumber));
		
		Thread.sleep(2000);

		// Generate a random number with in range
		int randnMumber1 = ThreadLocalRandom.current().nextInt(1, size);

		// Selecting random value
		click_Ele((AndroidElement) itemsInDropdown.get(randnMumber1));

		Thread.sleep(2000);

		// Generate a random number with in range
		int randnMumber2 = ThreadLocalRandom.current().nextInt(1, size);

		// Selecting random value
		click_Ele((AndroidElement) itemsInDropdown.get(randnMumber2));

		Thread.sleep(2000);

	}
	
	public void Click_and_close_ParkedSales(AppiumDriver<?> driver, String xpath) throws Throwable {
		
		        // Getting list of options
				List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));

				// Getting size of options available
				int size = itemsInDropdown.size();

				System.out.println(size);

				// for loop for clicking on every time in the list
				for (int i = 1; i <= size; i++) {

					driver.findElement(By.xpath("" + xpath + "[" + 1 + "]")).click();
					click_Ele((AndroidElement) driver.findElement(By.xpath("//*[@text='Cash']")));
					click_Ele((AndroidElement) driver.findElement(By.xpath("//*[@text='Cash']")));
					click_Ele((AndroidElement) driver.findElement(By.xpath("//*[@resource-id='background-content']/../android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")));
					click_Ele((AndroidElement) driver.findElement(By.xpath("//*[@text='Enter']")));
					click_Ele((AndroidElement) driver.findElement(By.xpath("//*[@text='Retreive Sale']")));
					Thread.sleep(1000);
				}

				Thread.sleep(2000);
		
		

	}

	public void click_On_EveryItem_INLIST(AppiumDriver<?> driver, String xpath) throws Throwable {

		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));

		// Getting size of options available
		int size = itemsInDropdown.size();

		System.out.println(size);

		// for loop for clicking on every time in the list
		for (int i = 1; i <= size; i++) {

			driver.findElement(By.xpath("" + xpath + "[" + 1 + "]")).click();
			Thread.sleep(1000);
		}

		Thread.sleep(2000);

	}
	
	public void Removing_Sing_MenuItem() throws Throwable {

		Thread.sleep(1000);
			driver.findElement(By.xpath("(//*[@text='X'])[1]")).click();
		Thread.sleep(2000);

	}

	public Float Get_Price_Amount_For_Every_MenuItem(AppiumDriver<?> driver, String xpath, String xpath2)
			throws Throwable {

		// Getting list of options
		//List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));
		List<Float> Price_Amount_List = new ArrayList<Float>();
		List<Float> Menu_Quntaity_List = new ArrayList<Float>();
		List<Float> Calculated_Price_Amount = new ArrayList<Float>();
		Float total_SubTotal_Value = 0.0f;
		
        //Removing Icon Count
		List<?> itemsInDropdownForRemovingMenu = driver.findElements(By.xpath("(//*[@text='X'])"));
		
		int CountForRemovingIcon = itemsInDropdownForRemovingMenu.size();

		// Getting size of options available
		//int size = itemsInDropdown.size() - CountForRemovingIcon;

		System.out.println(CountForRemovingIcon);
		
		//For Loop for getting the quantity for the Menu Items
		for (int i = 1; i <= CountForRemovingIcon; i++) {

			String Price_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
			String Report_Taxes = Price_Amount.replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			float gobal_actual = Float.parseFloat(Report_Taxes);
			Menu_Quntaity_List.add(gobal_actual);
			System.out.println("Quantity List " + gobal_actual);

			Thread.sleep(1000);
		}

		// for loop for clicking on every time in the list
		for (int i = 1; i <= CountForRemovingIcon; i++) {

			String Price_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]" + xpath2)).getText();
			String Report_Taxes = Price_Amount.replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			float gobal_actual = Float.parseFloat(Report_Taxes);
			Price_Amount_List.add(gobal_actual);
			System.out.println("sum 2 " + gobal_actual);

			Thread.sleep(1000);
		}
		
		for (int i = 0; i < CountForRemovingIcon; i++) {
			
			float value = Menu_Quntaity_List.get(i)*Price_Amount_List.get(i);
			Calculated_Price_Amount.add(value);
			System.out.println("Added value of Subtotal : "+Calculated_Price_Amount);
			Thread.sleep(1000);
		}
		
		

		for (int i = 0; i < Calculated_Price_Amount.size(); i++) {
			total_SubTotal_Value += Calculated_Price_Amount.get(i);

		}

		Thread.sleep(2000);
		
		System.out.println("**Calculated Total price Amount**: "+total_SubTotal_Value);
		
		//DecimalFormat df = new DecimalFormat("0.00");
		float Total_Calculated_Sub_Total_Value = (float) (Math.round(total_SubTotal_Value * 100.00)/100.00);
		
		 // DecimalFormat, default is RoundingMode.HALF_EVEN
//	      System.out.println("Total Calculated Sub Total Value: " + df.format(total_SubTotal_Value)); 
	      
	      this.Total_Price_Amount = Total_Calculated_Sub_Total_Value;
	      
	      System.out.println("**Calculated Total price Amount with tow decimal conversion**: "+Total_Calculated_Sub_Total_Value);

		  return Total_Calculated_Sub_Total_Value;

	}
	
	public Float Get_Total_Amount_For_Every_MenuItem(AppiumDriver<?> driver, String xpath, String xpath2)
			throws Throwable {

		// Getting list of options
//		List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));
		List<Float> Total_Amount_List = new ArrayList<Float>();
		Float toatl_Amount_Value = 0.0f;

		// Getting size of options available
//		int size = itemsInDropdown.size() / 2;
		
		//Removing Icon Count
				List<?> itemsInDropdownForRemovingMenu = driver.findElements(By.xpath("(//*[@text='X'])"));
				
				int CountForRemovingIcon = itemsInDropdownForRemovingMenu.size();

		System.out.println(CountForRemovingIcon);
		
		

		// for loop for clicking on every time in the list
		for (int i = 1; i <= CountForRemovingIcon; i++) {

			String Total_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]" + xpath2)).getText();
			String Report_Taxes = Total_Amount.replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			float gobal_actual = Float.parseFloat(Report_Taxes);
			Total_Amount_List.add(gobal_actual);
			System.out.println("sum 2 " + gobal_actual);

			Thread.sleep(1000);
		}

		for (int i = 0; i < Total_Amount_List.size(); i++) {
			toatl_Amount_Value += Total_Amount_List.get(i);

		}

		System.out.println("**Calculated Total Amount**: "+toatl_Amount_Value);
		
//		DecimalFormat df = new DecimalFormat("0.00");
		
		float Total_Calculated_Total_Value = (float) (Math.round(toatl_Amount_Value * 100.00)/100.00);
		
		 // DecimalFormat, default is RoundingMode.HALF_EVEN
//	      System.out.println("Total Calculated Total Value: " + df.format(toatl_Amount_Value)); 
	      
	      this.total_Total_Amount = Total_Calculated_Total_Value;
	      
	      System.out.println("**Calculated Total Amount with two decimal conversion**: "+Total_Calculated_Total_Value);

		  return Total_Calculated_Total_Value;

	}
	
	public double Get_Disc_Amount_For_Every_MenuItem(AppiumDriver<?> driver, String xpath, String xpath2)
			throws Throwable {

		// Getting list of options
		List<Double> Total_Amount_List = new ArrayList<Double>();
		List<Double> Total_Disc_List = new ArrayList<Double>();
		
		double toatl_Amount_Value = 0.00;
		double toatl_Disc_Value = 0.00;

		//Removing Icon Count
				List<?> itemsInDropdownForRemovingMenu = driver.findElements(By.xpath("(//*[@text='X'])"));
				
				int CountForRemovingIcon = itemsInDropdownForRemovingMenu.size();

		System.out.println(CountForRemovingIcon);
		
		
		// for loop for clicking on every time in the list
		for (int i = 1; i <= CountForRemovingIcon; i++) {
			
			String Qty = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[4]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double AQty = Double.parseDouble(Qty);
			
			String subt = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[5]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double Asubt = Double.parseDouble(subt);
			
			double price = AQty * Asubt;
			price = Math.round(price*100.00)/100.00;
			
			String discPer = Utility.getProperty("Discount_IB_AfterTax");
			double AdiscPer = Double.parseDouble(discPer);
			
			double Disc = price * (AdiscPer / 100);
			Disc = Math.round(Disc*100.00)/100.00;
			System.out.println("The Calculated Discount Value for the Item "+i+" is : "+Disc);
			
			String taxPer = Utility.getProperty("Exclusive_Tax_Percentage");
			double AtaxPer = Double.parseDouble(taxPer);
			
			double Tax = price * (AtaxPer / 100);
			Tax = Math.round(Tax*100.00)/100.00;
			System.out.println("The Calculated Tax Value for the Item "+i+" is : "+Tax);
			
			double Total = (price - Disc) + Tax;
			Total = Math.round(Total*100.00)/100.00;
			System.out.println("The Calculated Total Value for the Item "+i+" is : "+Total);
			
			
			String Disc_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[6]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double ActDisc = Double.parseDouble(Disc_Amount);
			
			String Total_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[7]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double ActTot = Double.parseDouble(Total_Amount);

			
			if(Disc == ActDisc && Total == ActTot)
			{
				System.out.println("Discount and Total Values are calculated for the Item "+i+" and the values are : "+Disc+"(Discount) and "+Total+"(Total)");
				Total_Amount_List.add(Total);
				Total_Disc_List.add(Disc);
				
				System.out.println("The values are (Discount and Total) : " + Disc+ " "+Total);
			}

			Thread.sleep(1000);
		}

		for (int i = 0; i < Total_Amount_List.size(); i++) {
			
			toatl_Disc_Value += Total_Disc_List.get(i);
			toatl_Amount_Value += Total_Amount_List.get(i);

		}

		System.out.println("**Calculated Disc Amount**: "+toatl_Disc_Value);
		System.out.println("**Calculated Total Amount**: "+toatl_Amount_Value);
		
//		DecimalFormat df = new DecimalFormat("0.00");
		
		double Total_Calculated_Disc_Value = (double) (Math.round(toatl_Disc_Value * 100.00)/100.00);
		
		double Total_Calculated_Total_Value = (double) (Math.round(toatl_Amount_Value * 100.00)/100.00);
		 // DecimalFormat, default is RoundingMode.HALF_EVEN
//	      System.out.println("Total Calculated Total Value: " + df.format(toatl_Amount_Value)); 
	      
	      this.totAmount = Total_Calculated_Total_Value;
	      
	      this.discAmount = Total_Calculated_Disc_Value;
	      
	      System.out.println("**Calculated Discount Amount with two decimal conversion**: "+Total_Calculated_Disc_Value);

	      System.out.println("**Calculated Total Amount with two decimal conversion**: "+Total_Calculated_Total_Value);

		  return Total_Calculated_Disc_Value;

	}

	public void text_Confirm(AndroidElement ele, String text) {

		if (ele.getText().equals(text)) {

			test.log(LogStatus.PASS, "The Text Message shown correctly : " + text + "");

			ut.PassedCaptureScreenshotAsBASE64(driver, test);
		} else {
			test.log(LogStatus.FAIL, "The Text Message not shown correctly : " + text + "");

			ut.FailedCaptureScreenshotAsBASE64(driver, test);
		}

	}
	
	public String Get_Text(AndroidElement ele) {
		
		String value = ele.getText();
		
		return value;

	}
	
	public float Exclusive_Tax(String value) throws Throwable {
		
		String Report_Taxes = value.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		float actual_Tax_Value = Float.parseFloat(Report_Taxes);
		float Tax_Value_Conversion = Float.parseFloat(Utility.getProperty("Exclusive_Tax_Percentage"));
		float caculated_Tax_value = ((actual_Tax_Value * Tax_Value_Conversion )/100);
		//DecimalFormat df = new DecimalFormat("0.00");
		 // DecimalFormat, default is RoundingMode.HALF_EVEN
	   // System.out.println("Total Calculated Tax Value: " + df.format(caculated_Tax_value)); 
		caculated_Tax_value = (float) (Math.round(caculated_Tax_value * 100.00)/100.00);
		System.out.println("Total Calculated Tax Value: " + caculated_Tax_value);
		return caculated_Tax_value;
	}
	
    public float Inclusive_Tax(String value) throws Throwable {
		
		String Report_Taxes = value.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		float actual_Tax_Value = Float.parseFloat(Report_Taxes);
		float Tax_Value_Conversion = Float.parseFloat(Utility.getProperty("Inclusive_Tax_Percentage"));
		//Menu Price – Menu price / (1+(tax %/100))
		float caculated_Tax_value = (actual_Tax_Value - actual_Tax_Value / (1+( Tax_Value_Conversion /100)));
		DecimalFormat df = new DecimalFormat("0.00");
		 // DecimalFormat, default is RoundingMode.HALF_EVEN
	    System.out.println("Total Calculated Total Value: " + df.format(caculated_Tax_value)); 
		return caculated_Tax_value;
		
	}

	public void text_Confirm_without_Screenshot(AndroidElement ele, String text) {

		if (ele.getText().equals(text)) {

			test.log(LogStatus.PASS, "The Text Message shown correctly : " + text + "");

		} else {
			test.log(LogStatus.FAIL, "The Text Message not shown correctly : " + text + "");

		}

	}

	public void isEleDisplayed(AndroidElement ele, String text) {

		if (ele.isDisplayed()) {

			test.log(LogStatus.PASS, "The" + text + "Element is displayed");

		} else {
			test.log(LogStatus.FAIL, "The" + text + "Element is not displayed");

		}
	}

	public void isEleEnabled(AndroidElement ele, String text) {

		if (ele.isDisplayed()) {

			test.log(LogStatus.PASS, "The" + text + "Element is Displayed and Enabled");

		} else {
			test.log(LogStatus.FAIL, "The" + text + "Element is not Displayed and Enabled");

		}

	}

	public void explicit_Wait(AppiumDriver<?> driver, AndroidElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

}
