package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountpage extends BasePage {

	
	public MyAccountpage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement msgheading;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement clicklogout;
	
	public boolean isMyAcountPageExists() {
		
		
		
		try {
		return(msgheading.isDisplayed());
	}catch(Exception e) {
		return false;
	}
	
	}
	
	public void clicklogout() {
		clicklogout.click();
	}
	
}
