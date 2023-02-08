package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_003_LogoutTest extends BaseClass {
	
	@Test
	public void logout_Test()
	{
		logger.info("Starting TC_003_LogoutTest");
		
		try{
			
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		lp.setPassword(rb.getString("Password"));
		lp.clickLogin();
		
		hp.clickMyAccount();
		MyAccountPage map=new MyAccountPage(driver);
		map.clickLogout();
		
		LogoutPage lop=new LogoutPage(driver);
		boolean result=lop.isOptionExist();
		Assert.assertEquals(result, true);
		
		}
		catch(Exception e)
		{
			logger.error("test failed");
		}
		
		logger.info("Finished TC_003_LogoutTest");
		
		
		
	}
	

}
