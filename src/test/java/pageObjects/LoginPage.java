package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy (id="input-email")
	WebElement txtEmailAddress;
	
	@FindBy(id="input-password")
	WebElement txtPassword;
	
	@FindBy (xpath= "//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	public void setEmail (String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPassword (String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();",btnLogin);
	}
	

}
