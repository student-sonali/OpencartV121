package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisstraionPage extends BasePage
{
	WebDriver driver;
	 
	public RegisstraionPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath=("//input[@id='input-firstname']"))
	WebElement firstname;
	
	@FindBy(xpath=("//input[@id='input-lastname']"))
	WebElement lastname;
	
	@FindBy(xpath=("//input[@id='input-email']"))
	WebElement email;
	
	@FindBy(xpath=("//input[@id='input-telephone']"))
	WebElement telephone;
	
	@FindBy(xpath=("//input[@id='input-password']"))
	WebElement pass;
	
	@FindBy(xpath=("//input[@id='input-confirm']"))
	WebElement confirmpass;
	
	@FindBy(xpath=("//input[@name='agree']"))
	WebElement checkpolicy;
	
	@FindBy(xpath=("//input[@value='Continue']"))
	WebElement continuebtn;
	
	@FindBy(xpath=("//h1[normalize-space()='your account has been created']"))
	WebElement msgconfirmation;
	
	
	public void setfrstname(String name) 
	{
		firstname.sendKeys(name);
	}
	
	public void lastname(String last) 
	{
		lastname.sendKeys(last);
	}
	
	public void setemail(String emails) 
	{
		email.sendKeys(emails);
	}
	
	public void settelephone(String tel) 
	{
		telephone.sendKeys(tel);
	}
	
	public void setpass(String password) 
	{
		pass.sendKeys(password);
	}
	
	public void setconpass(String password) 
	{
		confirmpass.sendKeys(password);
	}
	
	public void chkprivacy() 
	{
		checkpolicy.click();
	}
	
	public void clickcontinue() 
	{
		continuebtn.click();
	}
	
	public String getconfirmationmsg() 
	{
		try {
		return (msgconfirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
}
