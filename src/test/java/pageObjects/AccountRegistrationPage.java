package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountRegistrationPage extends BasePage {

	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement txttelephone;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtpassword;
			
	@FindBy(xpath="//input[@name='confirm']")
	WebElement txtconfirmpassword;
			
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement clikcheckboxpolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement clikcontinue;
	
	
	public void setfirstname(String fname) 
	{
		txtfirstname.sendKeys(fname);
	}
	
	public void setlastname(String lname) 
	{
		txtlastname.sendKeys(lname);
	}
	
	public void setemail(String email) 
	{
		txtemail.sendKeys(email);
	}
	
	public void settelephone(String telep) 
	{
		txttelephone.sendKeys(telep);	
    }
	
	public void setpassword(String pwd) 
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void setconfirmpwd(String cpwd) 
	{
		txtconfirmpassword.sendKeys(cpwd);
	}
	
	public void setprivacypolicy() 
	{
		clikcheckboxpolicy.click();
	}
	
	public void clickcontinue() 
	{
		clikcontinue.click();
	}
	
	
	
//	public String getConfirmationMsg() {
//		
//		try {
//			return(msg e.)
//			
//		}catch(Exception e)
//		{
//			return(e.getMessage());
//		}
//		
//		
//	}		
}
	
	
	
	


