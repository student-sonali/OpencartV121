package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage 
{
	WebDriver driver;
	
	 public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
    WebElement register;
	
	@FindBy(linkText="Login")
	WebElement linklogin;
	
	public void clickmyacc() 
	{
		myaccount.click();
	}
	
	public void clickregister() 
	{
		register.click();
		
	}
	
	public void clickLogin() 
	{
		linklogin.click();
		
	}
	
			

}
