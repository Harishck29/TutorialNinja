package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Purchasetablet extends BasePage{
     
	

	public Purchasetablet (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Tablets']")
	WebElement clicktablet;
	
	
	@FindBy(xpath="//a[text()='Samsung Galaxy Tab 10.1']")
		WebElement clickproductgalaxy;
	
	
	@FindBy(xpath="//button[@id='button-cart']") 
	WebElement clickaddtocart;
	
	@FindBy(xpath="//span[@id='cart-total']")
	WebElement lnkcard;
	
	public void clicktablets() {
		clicktablet.click();
	}
	
	public void clickproductsamsunggalaxy() {
		clickproductgalaxy.click();
	}
	
	public void clickaddtocart() {
		clickaddtocart.click();
	}
	
	public void clickcart() {
		lnkcard.click();
	}
}
