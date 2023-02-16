package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.AddCommercialPartyForm;

public class AddCommercialPartyTest extends LpgTestBase{

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
	public void AddCommercialPartytest() throws InterruptedException{
		AddCommercialPartyForm cp=new AddCommercialPartyForm(LpgTestBase.driver);
		cp.verifyMyerpagancycode();
		cp.verifyMyerpusrname();
		cp.verifyMyerppassword();
		cp.verifyMyerploginbtn();
		cp.verifyMyerpMaster();
		cp.verifyMyerpAccountMaster();
		cp.verifyMyerpAddCommparty();
		cp.VerifyMyerpConsumerNumber1();
		cp.VerifyMyerpCPBusinessname1();
		cp.VerifyMyerpCPSelectBusinessType1();
		cp.VerifyMyerpCPSelectGroup1();
		cp.VerifyMyerpCPAddress11();
		cp.VerifyMyerpCPSelectState1();
		cp.VerifyMyerpCPActivechk1();
		cp.VerifyMyerpCPProduct1();
		cp.VerifyMyerpCPPQantity1();
		cp.VerifyMyerpCPPOpeningCycle1();
		cp.VerifyMyerpCPClearBtn1();
		cp.VerifyMyerpConsumerNumber();
		cp.VerifyMyerpCPBusinessname();
		cp.VerifyMyerpCPSelectBusinessType();
		cp.VerifyMyerpCPSelectGroup();
		cp.VerifyMyerpCPAddress1();
		cp.VerifyMyerpCPSelectState();
		cp.VerifyMyerpCPActivechk();
		cp.VerifyMyerpCPProduct();
		cp.VerifyMyerpCPPQantity();
		cp.VerifyMyerpCPPOpeningCycle();
		cp.VerifyMyerpCPDeleteBtn();
		cp.VerifyandClickonPSearchbar1();
		cp.VerifyMyerpConsumerNumber2();
		cp.VerifyMyerpCPBusinessname2();
		cp.VerifyMyerpCPSelectBusinessType2();
		cp.VerifyMyerpCPSelectGroup2();
		cp.VerifyMyerpCPAddress12();
		cp.VerifyMyerpCPSelectState2();
		cp.VerifyMyerpCPActivechk2();
		cp.VerifyMyerpCPProduct2();
		cp.VerifyMyerpCPPQantity2();
		cp.VerifyMyerpCPPOpeningCycle2();
		cp.VerifyMyerpCPSubmitBtn();
		cp.VerifyMyerpCPGetListBtn();
		cp.VerifyandClickonPSearchbar2();
		cp.VerifyMyerpCPEditBtn();
		cp.VerifyMyerpCPYesUpdateBtn();
		cp.VerifyMyerpCPYesUpdateBtn();
		cp.VerifyMyerpCPUpdateokBtn();
		cp.VerifyMyerpTExportBtn();
		
	}
		
}