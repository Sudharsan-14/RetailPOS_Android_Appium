package com.appium.Android_Retail_POS;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
       
        
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Calendar c = Calendar.getInstance();
        
        String curr_date = DateFormat.format(c.getTime());
        System.out.println("Formatted Date: " + curr_date);
        
        
    }
}
