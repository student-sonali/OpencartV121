package testCases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
//import java.util.logging.LogManager;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class BaseClass 
{
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	@BeforeClass(groups= {"Sanity","Regression","master"})
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException 
	{
		//Loadingconfig.properties file
		FileReader file =new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		
		
		
		
		logger=LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase()) 
		{
		case "chrome" : driver= new ChromeDriver();break;
		case "edge" : driver= new EdgeDriver();break;
		case "firefox" : driver= new FirefoxDriver();break;
		default : System.out.println("Invalid browser name.."); return;
		
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(p.getProperty("appURL"));//reading url from properties file
		driver.manage().window().maximize();
	}
	@AfterClass(groups= {"Sanity","Regression","master"})
	public void teardown() 
	{
		driver.quit();
	}
	public String randomeString() 
	 {
		String generatestring= RandomStringUtils.randomAlphabetic(5);
		return generatestring;
	 }
	 public String randomeNumber() 
	 {
		String generatenumber= RandomStringUtils.randomNumeric(10);
		return generatenumber;
	 }
	 
	 public String randomeAlphaNumric() 
	 {
		 String generatestring= RandomStringUtils.randomAlphabetic(3);
		String generatenumber= RandomStringUtils.randomNumeric(3);
		return (generatestring+"@"+generatenumber);
	 }
   

}
