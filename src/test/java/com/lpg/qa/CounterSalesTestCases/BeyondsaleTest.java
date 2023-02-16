package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.BeyondsaleForm;


public class BeyondsaleTest extends LpgTestBase{

	WebDriver driver;

	// Open browser ==> Test Registration page ==> close the browser.
	
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
//		TestBase.driver.close();
	}
	
	@Test
	public void Beyondsaletest() throws InterruptedException{
		BeyondsaleForm bs=new BeyondsaleForm(LpgTestBase.driver);
		bs.verifyMyerpagancycode();
		bs.verifyMyerpusrname();
		bs.verifyMyerppassword();
		bs.verifyMyerploginbtn();
		bs.verifyMyerpCounterSales();
		bs.verifyMyerpBeyondsale();
		bs.verifyMyerpConsumerNumberSearch();
		bs.verifyMyerpSubmitBtnClick();
		bs.verifyMyerpInvoiceno();
		bs.verifyMyerpGstin();
		bs.verifyMyerpDistributercode();
		bs.State();
		bs.Tahsil();
		bs.verifyMyerpEntercity();
		bs.verifyMyerpEmail();
		bs.ModeofPayment();
		bs.verifyMyerpCashamount();
		bs.verifyMyerpProduct();
		bs.verifyMyerpClearbtn();
		bs.verifyMyerpConsumerNumberSearch1();
		bs.verifyMyerpSubmitBtnClick1();
		bs.verifyMyerpInvoiceno1();
		bs.verifyMyerpGstin1();
		bs.verifyMyerpDistributercode1();
		bs.State1();
		bs.Tahsil1();
		bs.verifyMyerpEntercity1();
		bs.verifyMyerpEmail1();
		bs.ModeofPayment1();
		bs.verifyMyerpCashamount1();
		bs.verifyMyerpProduct1();
		bs.verifyMyerpSubmitbtn();
	
	
	}
}
