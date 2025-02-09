package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.homepage;
import testbase.BaseClass;

public class TC001_AccountRegistrationTest  extends BaseClass{


	 
	 @Test(groups={"Regression","Master"})
	 public void verify_account_registration ()
	 {
		 logger.info("**** Starting Tc-01 Account Registration ***");
		 
		try { 
		 homepage hp=new homepage(driver);
		 hp.clickmaccount();
		 hp.clickregister();
		 
		 logger.info("**** clicked registered ***");
		 
	 AccountRegistrationPage accreg=new AccountRegistrationPage(driver);
		 
	 logger.info("**** providing customer details ***");
	 
		 accreg.setfirstname(randomString().toUpperCase());
		 accreg.setlastname(randomString().toUpperCase());
		 accreg.setemail(randomString()+"@gmail.com"); //generate randomly email
		 accreg.settelephone(randomnumeric());
		 
		 
		 String password= randomalphanumeric();
		 
		 accreg.setpassword(password);
		 accreg.setconfirmpwd(password);
		 
		 accreg.setprivacypolicy();
		 accreg.clickcontinue();
		 
		 logger.info("**** Successful Registration ***");
		 
//		String conmsg=accreg.getConfirmationMsg();
//		Assert.assertEquals(conmsg, "Your Account Has Been Created!");
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		logger.info("***      TC-01 AccountRegisterationTest finished ***");
	 }
	 
	
	
	 
	 
	 
}
