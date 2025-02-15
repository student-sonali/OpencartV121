package seleniumprctice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWithPageFactoryPOM 
{
	WebDriver driver;
	@BeforeMethod
	void setup() 
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void login() 
	{
		POMwithPageFactory pg= new POMwithPageFactory(driver);
		pg.setusername("Admin");
		pg.setpass("admin123");
		pg.subbtn();
	}
	
	@AfterMethod
	void teardown() 
	{
		driver.quit();
	}

}
