package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import pageObjects.Purchasetablet;
import pageObjects.homepage;
import testbase.BaseClass;

public class TC_004PurchaseTablet extends BaseClass {

	

	@Test(groups="Master")
	public void verifypurchasetablet() {
		
		
		
		
		Purchasetablet pb=new Purchasetablet(driver);
		
		pb.clicktablets();
		pb.clickproductsamsunggalaxy();
		pb.clickaddtocart();
		pb.clickcart();
		logger.info("TC_OOO4  Finished ");
	}
	
	
	
}
