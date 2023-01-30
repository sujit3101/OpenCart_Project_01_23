package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterPage extends BasePage {

	public AccountRegisterPage(WebDriver driver) {
		super(driver);
		
	}
	JavascriptExecutor je=(JavascriptExecutor)driver;
	
	//elements
	@FindBy (name="firstname")
	WebElement txtFirstName;
	
	@FindBy (name="lastname")
	WebElement txtLastName;
	
	@FindBy (name="email")
	WebElement txtEmail;
	
	@FindBy (name="password")
	WebElement txtPassword;
	
	@FindBy (name="agree")
	WebElement cbAgree;
	
	@FindBy (xpath="//*[@id=\"form-register\"]/div/div/button")
	WebElement btnContinue;
	
	@FindBy (xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	//Actions
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickAgree()
	{
		je.executeScript("arguments[0].click()", cbAgree);
		
	}
	
	public void clickContinue()
	{
		je.executeScript("arguments[0].click()", btnContinue);
	}
	
	public String getConfirmationMsg() {
		try {
			
			return msgConfirmation.getText();
		}
		catch(Exception e) {
			return e.getMessage();
		}
		
	}
	
}
