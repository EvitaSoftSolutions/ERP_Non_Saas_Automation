package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.AddCommercialDiscountPackageForm;


public class AddCommercialDiscountPackageTest extends LpgTestBase{

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
	public void AddCommercialDiscountPackagetest() throws InterruptedException{
		AddCommercialDiscountPackageForm nl=new AddCommercialDiscountPackageForm(LpgTestBase.driver);
		nl.verifyMyerpagancycode();
		nl.verifyMyerpusrname();
		nl.verifyMyerppassword();
		nl.verifyMyerploginbtn();
		nl.verifyMyerpMaster();
		nl.verifyMyerpAccountMaster();
		nl.verifyMyerpAddComDispack();
		nl.verifyMyerpDispackname();
		nl.verifyMyerpDiscription();
		nl.verifyMyerpDiscountamt();
		nl.verifyMyerpClearbtn();
		nl.verifyMyerpDispackname1();
		nl.verifyMyerpDiscription1();
		nl.verifyMyerpDiscountamt1();
		nl.verifyMyerpSubmitbtn();
		nl.verifyMyerpOkbutton();
		nl.VerifyandClickonPSearchbar1();
		nl.verifyMyerpEditbtn();
		nl.verifyMyerpConfirmbtn();
		nl.verifyMyerpDispackname2();
		nl.verifyMyerpDiscription2();
		nl.verifyMyerpUpdatebtn();
		nl.VerifyCDPUpdateOKBtn();
		nl.VerifyExportBtn();
		nl.VerifyandClickonPSearchbar2();

	}
}
