package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegisterPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	@Test
	public void test_account_Registration() throws InterruptedException
	{
		logger.info("***Starting TC_001_AccountRegistrationTest***");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My account link");
		
		hp.clickRegister();
		logger.info("Clicked on register link");
		
		AccountRegisterPage regpage=new AccountRegisterPage(driver);
		logger.info("Providing customer data");
		
		regpage.setFirstName(randomeString().toUpperCase());
		
		regpage.setLastName(randomeString().toUpperCase());
		
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		
		//regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		//regpage.setConfirmPassword(password);
		
		regpage.clickAgree();
		
		regpage.clickContinue();
		logger.info("Clicked on continue");
		Thread.sleep(2000);
		String confmsg=regpage.getConfirmationMsg();
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e) {
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("***Finished TC_001_AccountRegistrationTest***");
		
	}
}
