package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.PaymentVoucherReferencingForm;



public class PaymentVoucherReferencingTest extends LpgTestBase{

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
	public void PaymentVoucherReferencingtest() throws InterruptedException{
		PaymentVoucherReferencingForm pv= new PaymentVoucherReferencingForm(LpgTestBase.driver);
		pv.verifyMyerpagancycode();
		pv.verifyMyerpusrname();
		pv.verifyMyerppassword();
		pv.verifyMyerploginbtn();
		pv.verifyMyerpAccounts();
		pv.verifyMyerpPamentreferencing();
		pv.Selecttyp();
		pv.Selectreftyp();
		pv.verifyMyerpAccountahead();
		pv.Nothingselect();
		pv.verifyMyerpAmount();
		pv.verifyMyerpClear();
		
	}
}
