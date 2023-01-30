package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[text()='My Account']") // MyAccount Page heading
	WebElement msgHeading;
	
	@FindBy(xpath = "//aside[@id='column-right']//a[normalize-space()='Logout']")
	WebElement lnkLogout;
	
	@FindBy(xpath = "//a[normalize-space()='Continue']")
	WebElement lnkContinue;
	

	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void clickLogout() {
		lnkLogout.click();
		lnkContinue.click();
		

	}
}


