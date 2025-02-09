package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends BasePage {

	
	public homepage(WebDriver driver)
	{
		
		super(driver);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement clickmyaccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement clickmyregister;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement cliklogin;
	
	
	public void clickmaccount() 
	{
	  clickmyaccount.click();
	
	}
	
	public void clickregister()
	{
		clickmyregister.click();
	}
	
	public void clicklogin() 
	{
		cliklogin.click();
	}
	
}
