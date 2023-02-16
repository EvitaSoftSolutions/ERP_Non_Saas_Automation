package com.lpg.qa.CommercialcylsaleTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.commercialcylsale.SaleEmptyReceivedForm;


public class SaleEmptyReceivedTest extends LpgTestBase{

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
	public void SaleEmptyReceivedtest() throws InterruptedException{
		SaleEmptyReceivedForm se= new SaleEmptyReceivedForm(LpgTestBase.driver);
		se.verifyMyerpagancycode();
		se.verifyMyerpusrname();
		se.verifyMyerppassword();
		se.verifyMyerploginbtn();
		se.verifyMyerpCommercialcylsale();
		se.verifyMyerpSalempyreceived();
		se.Deliveryman();
		se.Party();
		se.verifyMyerpChallanno();
		se.verifyMyerpConsumerno();
		se.Delivarymode();
		se.Selectarea();
		se.Product();
		se.verifyMyerpFullqty();
		se.verifyMyerpEmptycylReceived();
		se.Modeofpayment();
		se.verifyMyerpCashamount();
		se.verifyMyerpClearbtn();
		se.Deliveryman1();
		se.Party1();
		se.verifyMyerpChallanno1();
		se.verifyMyerpConsumerno1();
		se.Delivarymode1();
		se.Selectarea1();
		se.Product1();
		se.verifyMyerpFullqty1();
		se.verifyMyerpEmptycylReceived1();
		se.Modeofpayment1();
		se.verifyMyerpCashamount1();
		se.verifyMyerpSubmitbtn();
		
	}
}
