package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_LoginTest extends BaseClass
{
	@Test(groups={"Sanity","Master"})
	public void verify_login() 
	{
		logger.info("****Staring TC002_LoginTest");
		try 
		{
		HomePage hp=new HomePage(driver);
		hp.clickmyacc();
		hp.clickLogin();
		
		LoginPage lp= new LoginPage(driver);
		lp.email(p.getProperty("Email"));
		lp.passwordset(p.getProperty("Password"));
		lp.Clicklogin();
		
		MyAccountPage macc= new MyAccountPage(driver);
		boolean targetpage=macc.ismyAcountPageExists();
		
		Assert.assertTrue(targetpage);
		}
		catch(Exception e) 
		{
			Assert.fail();
		}
		
		logger.info("****finished TC002_LoginTest");
	}
	

}
