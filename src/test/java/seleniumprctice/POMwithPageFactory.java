package seleniumprctice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMwithPageFactory {

	
		WebDriver driver;
		POMwithPageFactory (WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		}
		
		@FindBy(xpath="//input[@placeholder='Username']")
		WebElement uname;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement pass;
		
		@FindBy(xpath="//button[normalize-space()='Login']")
		WebElement submit;
		
		void setusername(String u) 
		{
			uname.sendKeys(u);
		}
		
		void setpass(String p) 
		{
			pass.sendKeys(p);
		}
		
		void subbtn() 
		{
			submit.click();
		}
		

	}


