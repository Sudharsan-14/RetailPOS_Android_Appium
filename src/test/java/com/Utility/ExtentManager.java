package com.Utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
public static ExtentReports extent;
public static ExtentReports getInstance()
{
	
	if(extent == null)
	{ String dateName = new SimpleDateFormat("yyyy-MMM-dd HH-mm-ss").format(new Date());
		//extent = new ExtentReports("./reports.html", true);  
		extent = new ExtentReports("./Extent_Report/"+dateName+"/Extent Report.html", true);  
		extent.loadConfig(new File(System.getProperty("user.dir")+"//extent-config.xml"));
	}
	return extent;
}
}
