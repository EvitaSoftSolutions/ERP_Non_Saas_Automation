package com.lpg.qa.CommercialcylsaleTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.commercialcylsale.CashcollectionForm;


public class CashcollectionTest extends LpgTestBase{

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
	public void CashcollectionPagetest() throws InterruptedException{
		CashcollectionForm cc= new CashcollectionForm(LpgTestBase.driver);
		cc.verifyMyerpagancycode();
		cc.verifyMyerpusrname();
		cc.verifyMyerppassword();
		cc.verifyMyerploginbtn();
		cc.verifyMyerpCommercialcylsale();
		cc.verifyMyerpCashcollection();
		cc.Deliveryman();
		cc.Selectparty();
		cc.verifyMyerpChallanno();
		cc.ModeofPayment();
		cc.verifyMyerpCashAmount();
		cc.verifyMyerpClearbtn();
		cc.Deliveryman1();
		cc.Selectparty1();
		cc.verifyMyerpChallanno1();
		cc.ModeofPayment1();
		cc.verifyMyerpCashAmount1();
		cc.verifyMyerpSubmitbtn();
		
	}
}
