package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage 
{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath=("//input[@id='input-email']"))
	WebElement emailnme;
	
	@FindBy(xpath=("//input[@id='input-password']"))
	WebElement password;
	
	@FindBy(xpath=("//input[@value='Login']"))
	WebElement loginbtn;
	
	public void email(String eee) 
	{
		emailnme.sendKeys(eee);
	}
	
	public void passwordset(String pass) 
	{
		password.sendKeys(pass);
	}
	
	public void Clicklogin() 
	{
		loginbtn.click();
	}
}
