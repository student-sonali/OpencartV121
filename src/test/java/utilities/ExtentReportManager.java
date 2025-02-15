package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) 
	{
		sparkReporter =new ExtentSparkReporter("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\reports\\myReport.html");
	}

}
