package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.BillingTypeForm;


public class BillingTypeTest extends LpgTestBase{

	WebDriver driver;

	
	
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
//		TestBase.driver.close();
	}
	
	@Test
	public void BillingTypetest() throws InterruptedException{
		BillingTypeForm bt=new BillingTypeForm(LpgTestBase.driver);
		bt.verifyMyerpagancycode();
		bt.verifyMyerpusrname();
		bt.verifyMyerppassword();
		bt.verifyMyerploginbtn();
		bt.verifyMyerpMaster();
		bt.verifyMyerpAccountMaster();
		bt.verifyMyerpBillingType();
		bt.verifyMyerpTypeName();
		bt.verifyMyerpNoofType();
		bt.verifyMyerpCheckActive();
		bt.verifyMyerpButtonclear();
		bt.verifyMyerpTypeName1();
		bt.verifyMyerpNoofType1();
		bt.verifyMyerpCheckActive1();
		bt.verifyMyerpSubmitbutton();
		bt.verifyMyerpOkButton();
		bt.VerifyandClickonPSearchbar1();
		bt.verifyMyerpEditButton();
		bt.verifyMyerpConfirmBtn();
		bt.verifyMyerpTypeName2();
		bt.verifyMyerpNoofType2();
		bt.verifyMyerpCheckActive2();
		bt.verifyMyerpUpdateBtn();
		bt.verifyMyerpOkButton1();
		bt.VerifyMyerpTExportBtn();
		bt.VerifyandClickonPSearchbar3();
		
		
		
	}
}
