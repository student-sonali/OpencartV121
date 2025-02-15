package seleniumprctice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMwithoutPageFactory
{
	WebDriver driver;
	
	POMwithoutPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
  By uname= By.xpath("//input[@placeholder='Username']");
  
  By pass= By.xpath("//input[@placeholder='Password']");
  
  By login= By.xpath("//button[normalize-space()='Login']");
  
  
  void setuname(String u) 
  {
	  driver.findElement(uname).sendKeys(u);
  }
  
  void setpass(String p) 
  {
	  driver.findElement(pass).sendKeys(p);
  }
  
  void submit() 
  {
	  driver.findElement(login).click();
  }
	

}
