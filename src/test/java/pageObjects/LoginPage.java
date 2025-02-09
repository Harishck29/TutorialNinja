package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.BaseClass;

public class LoginPage extends BasePage {

	
	
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement textemail;
	

	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	

	@FindBy(xpath="//input[@value='Login']")
	WebElement clicklogin;
	
	
	  public void SetEmail(String email) {
		  
		  textemail.sendKeys(email);
	  }
	
  public void SetPassword(String pwd) {
		  
		  txtpassword.sendKeys(pwd);
	  }
	
	
  public void cliklogin() {
	  
	  clicklogin.click();
  }
	
	
	
	
	
	
	
	
	
	
	
}
    