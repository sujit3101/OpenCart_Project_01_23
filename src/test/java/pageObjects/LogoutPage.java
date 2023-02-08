package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

	public LogoutPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy (linkText ="Login")
	WebElement lnkLogin;
	
	public boolean isOptionExist()
	{
		try{
			return lnkLogin.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	

}
