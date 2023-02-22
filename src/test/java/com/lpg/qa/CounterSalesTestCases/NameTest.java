package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.NameForm;



public class NameTest extends LpgTestBase{

	WebDriver driver;

	// Open browser ==> Test Registration page ==> close the browser.

	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//		TestBase.driver.close();
	}

	@Test
	public void Nametest() throws InterruptedException{
		NameForm n= new NameForm(LpgTestBase.driver);
		/*
		 * n.verifyMyerpagancycode(); n.verifyMyerpusrname(); n.verifyMyerppassword();
		 * n.verifyMyerploginbtn();
		 */
		
		n.setup(driver);
		n.verifyMyerpCounterSales();
		n.verifyMyerpNamechange();
		n.verifyMyerpConsumerno();
		n.verifyMyerpSearchbtn();
		n.verifyMyerpGstin();
		n.verifyMyerpDocserno();
		n.verifyMyerpNewConsumerName();
		n.verifyMyerpEntercity();
		n.State();
		n.District();
		n.Tehasil();
		n.verifyMyerpDistributorcode();
		n.verifyMyerpEmail();
		n.Modeofpayment();
		n.verifyMyerpCashamount();
		n.verifyMyerpService();
		n.verifyMyerpSrvquantity();
		n.verifyMyerpSubmitbtn();
		n.verifyMyerpubackbtn();
		
		n.verifyMyerpCounterSales();
		n.verifyMyerpNamechange();
		n.verifyMyerpConsumerno();
		n.verifyMyerpSearchbtn();
		n.verifyMyerpGstin();
		n.verifyMyerpDocserno();
		n.verifyMyerpNewConsumerName();
		n.verifyMyerpEntercity();
		n.State();
		n.District();
		n.Tehasil();
		n.verifyMyerpDistributorcode();
		n.verifyMyerpEmail();
		n.Modeofpayment();
		n.verifyMyerpCashamount();
		n.verifyMyerpService();
		n.verifyMyerpSrvquantity();
		n.verifyMyerpClearbtn();
		
		n.verifyMyerpunamechangeform();
		n.verifyMyerpupdatedocno();
		n.verifyMyerpugetdatabtn();
		n.verifyMyerpUprevoiusconsumername();
		n.verifyMyerpNewConsumerName();
		n.verifyMyerpEntercity();
		n.State();
		n.District();
		n.Tehasil();
		n.verifyMyerpEmail();
		n.verifyMyerpUSubmitbtn();
		
		

	}
}