package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import pageObjects.Purchasetablet;
import pageObjects.homepage;
import testbase.BaseClass;

public class TC002LoginPage extends BaseClass {

	
	
	@Test(groups={"Sanity","Master"})
	public void verifylogintest() 
	
	{
	       logger.info("***  Starting TC__02 LoginPage****");
	       try {
	       homepage hp =new homepage(driver);
	       hp.clickmaccount();
	       hp.clicklogin();
	       
	       LoginPage lp =new LoginPage(driver);
	       lp.SetEmail(p.getProperty("email"));
	       lp.SetPassword(p.getProperty("password"));
	       lp.cliklogin();
	       
	       MyAccountpage myaccpg=new MyAccountpage(driver);
	       boolean targetpage=myaccpg.isMyAcountPageExists();
//	       Assert.assertEquals(targetpage, true,"Login failed");
	       Assert.assertTrue(targetpage);
	       }
	       catch(Exception e) {
	    	   Assert.fail();
	       }
	       logger.info("***  Finished TC__02 LoginPage****");
	       
	       
	       logger.info("TC_OOO4  Starting ");
			
			Purchasetablet pb=new Purchasetablet(driver);
			
			pb.clicktablets();
			pb.clickproductsamsunggalaxy();
			pb.clickaddtocart();
			
			logger.info("TC_OOO4  Finished ");
	}
	
}
