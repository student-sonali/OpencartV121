package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisstraionPage;

public class TC001_AccountRegistrationTest extends BaseClass
{
	
	@Test(groups={"Regression","Master"})
	public void verify_account_registration() 
	{
		logger.info("***** Starting TC001_AccountRegistrationTest ****** ");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickmyacc();
		logger.info("Clicked on MyAccount Link ");
		hp.clickregister();
		logger.info("Clicked on Register Link ");
		
		RegisstraionPage rr= new RegisstraionPage(driver);
		logger.info("Providing customer details... ");
		rr.setfrstname(randomeString().toUpperCase());
		rr.lastname(randomeString().toUpperCase());
		rr.setemail(randomeString()+"@gmail.com");
		rr.settelephone(randomeNumber());
		String passwod= randomeAlphaNumric();
		rr.setpass(passwod);
		rr.setconpass(passwod);
		rr.chkprivacy();
		rr.clickcontinue();
		
	String confmsg=	rr.getconfirmationmsg();
	//Assert.assertEquals(confmsg, "Your Account Has Been Created!!");
		}
		catch(Exception e)
		{
			logger.error("Test Failed");
			logger.debug("Debug logs...");
			Assert.fail();
		}
	}
	
	 
}
