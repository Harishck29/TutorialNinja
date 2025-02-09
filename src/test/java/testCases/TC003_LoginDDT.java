package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DataProviders;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import pageObjects.homepage;
import testbase.BaseClass;

public class TC003_LoginDDT extends BaseClass {

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="datadriven")
public void verify_LoginDDT (String email,String pwd,String exp){
		
		logger.info("** TC003 Starting DDT Testing     ***");
		
	 //HomePage	
	try {	
	 homepage hp =new homepage(driver);
     hp.clickmaccount();
     hp.clicklogin();
     
     //LoginPage     
     LoginPage lp =new LoginPage(driver);
     lp.SetEmail(email);
     lp.SetPassword(pwd);
     lp.cliklogin();
     
     // MYAccountPage    
     MyAccountpage myaccpg=new MyAccountpage(driver);
     boolean targetpage=myaccpg.isMyAcountPageExists();
//     Assert.assertEquals(targetpage, true,"Login failed");
//     Assert.assertTrue(targetpage);
	
	if(exp.equalsIgnoreCase("valid")) {
	
		if(targetpage==true) {
			myaccpg.clicklogout();
			Assert.assertTrue(true);
		
		}
		else {
			Assert.assertTrue(false);
		}
	}
		
		if(exp.equalsIgnoreCase("invalid")) {
			
			if(targetpage==true) {
				myaccpg.clicklogout();
				Assert.assertTrue(false);
			
			}
			else {
				Assert.assertTrue(true);
			}
		}
	
	}catch(Exception e) {
		Assert.fail();
	}
	logger.info("** TC003 Finished DDT Testing     ***");
	}
	
	}
