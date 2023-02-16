package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.PaymentModeForm;


public class PaymentModeTest extends LpgTestBase{

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
	public void PaymentModetest() throws InterruptedException{
		PaymentModeForm pm=new PaymentModeForm(LpgTestBase.driver);
		pm.verifyMyerpagancycode();
		pm.verifyMyerpusrname();
		pm.verifyMyerppassword();
		pm.verifyMyerploginbtn();
		pm.verifyMyerpMaster();
		pm.verifyMyerpAccountMaster();
		pm.verifyMyerpPaymentMode();
		pm.verifyMyerpModeDescription();
		pm.verifyMyerpCheckAtivebtn();
		pm.verifyMyerpClearButton();
		pm.verifyMyerpModeDescription1();
		pm.verifyMyerpCheckAtivebtn1();
		pm.verifyMyerpSubmitButton();
		pm.verifyMyerpOkButton();
		pm.VerifyandClickonPSearchbar1();
		pm.verifyMyerpEditButton();
		pm.verifyMyerpConfirmButton();
		pm.verifyMyerpModeDescription2();
		pm.verifyMyerpCheckAtivebtn2();
		pm.verifyMyerpUpdateButton();
		pm.VerifyMyerpCPUpdateokBtn();
		pm.VerifyMyerpTExportBtn();
		pm.VerifyandClickonPSearchbar3();
		
	}
}
