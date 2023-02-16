package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.CommercialParty;



public class CommercialPartytest extends LpgTestBase{

	WebDriver driver;

	// Open browser ==> Test Registration page ==> ==>close the browser.

	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//		TestBase.driver.close();
	}



	@Test
	public void CommercialPartyPagetest() throws InterruptedException {
		CommercialParty co=new CommercialParty(LpgTestBase.driver); 
		/*
		 * e.verifyMyerpagancycode(); e.verifyMyerpUserid(); e.verifyMyerpPassword();
		 * e.VerifyandClickonMyerpLoginBtn();
		 */
		co.setup(driver);
		co.VerifyMyerpMasterModule();
		co.VerifyMyerpGenralMasterModule();
		co.VerifyMyerpCommercialPartyForm();
		co.VerifyMyerpConsumerNumber1();
		co.VerifyMyerpCPBusinessname1();
		co.VerifyMyerpCPSelectBusinessType1();
		co.VerifyMyerpCPSelectGroup1();
		co.VerifyMyerpCPAddress11();
		
		co.VerifyMyerpCPSelectState1();
		co.VerifyMyerpCPSelectDistrict1();
		co.VerifyMyerpCPSelectTehsil1();
		co.VerifyMyerpCPSelectCity1();
		co.VerifyMyerpCPPincode1();
		co.VerifyMyerpCPEmailId1();
		co.VerifyMyerpCPContactDetail1();
		co.VerifyMyerpCPContactPersonName1();
		co.VerifyMyerpCPMobileNumber1();

		co.VerifyMyerpbillingtype();
		co.VerifyMyerpCPActivechk1();
		co.VerifyMyerpCPProduct1();
		co.VerifyMyerpCPPQantity1();
		co.VerifyMyerpCPPOpeningCycle1();
		
		co.VerifyMyerpCPSubmitBtn();
		co.VerifyMyerpCPGetListBtn();
		co.VerifyandClickonPSearchbar1();
		co.VerifyMyerpCPClearBtn1();
		/*
		 * co.VerifyMyerpConsumerNumber(); co.VerifyMyerpCPBusinessname();
		 * co.VerifyMyerpCPSelectBusinessType(); co.VerifyMyerpCPSelectGroup();
		 * co.VerifyMyerpCPAddress1(); co.VerifyMyerpCPSelectState();
		 * co.VerifyMyerpbillingtype1(); co.VerifyMyerpCPActivechk();
		 * co.VerifyMyerpCPProduct(); co.VerifyMyerpCPPQantity();
		 * co.VerifyMyerpCPPOpeningCycle();
		 */
		//co.VerifyMyerpCPDeleteBtn();
		//co.VerifyandClickonPSearchbar1();
		co.VerifyMyerpConsumerNumber2();
		co.VerifyMyerpCPBusinessname2();
		co.VerifyMyerpCPSelectBusinessType2();
		co.VerifyMyerpCPSelectGroup2();
		co.VerifyMyerpCPAddress12();
		co.VerifyMyerpCPSelectState2();
		co.VerifyMyerpCPSelectDistrict1();
		co.VerifyMyerpCPSelectTehsil1();
		co.VerifyMyerpCPSelectCity1();
		co.VerifyMyerpCPPincode1();
		co.VerifyMyerpCPEmailId1();
		co.VerifyMyerpCPContactDetail1();
		co.VerifyMyerpCPContactPersonName1();
		co.VerifyMyerpCPMobileNumber1();
		co.VerifyMyerpbillingtype2();
		co.VerifyMyerpCPActivechk2();
		co.VerifyMyerpCPProduct2();
		co.VerifyMyerpCPPQantity2();
		co.VerifyMyerpCPPOpeningCycle2();
		co.VerifyMyerpCPSubmitBtn();
		co.VerifyMyerpCPGetListBtn();
		co.VerifyandClickonPSearchbar2();
		
		/*
		 * co.VerifyMyerpCPEditBtn(); co.VerifyMyerpCPYesUpdateBtn();
		 * co.VerifyMyerpCPUpdateBtn(); co.VerifyMyerpCPUpdateokBtn();
		 */
		co.VerifyMyerpConsumerNumber3();
		co.VerifyMyerpCPBusinessname3();
		co.VerifyMyerpCPSelectBusinessType3();
		co.VerifyMyerpCPSelectGroup3();
		co.VerifyMyerpCPAddress3();
		co.VerifyMyerpCPSelectState3();
		co.VerifyMyerpCPSelectState1();
		co.VerifyMyerpCPSelectDistrict1();
		co.VerifyMyerpCPSelectTehsil1();
		co.VerifyMyerpCPSelectCity1();
		co.VerifyMyerpCPPincode1();
		co.VerifyMyerpCPEmailId1();
		co.VerifyMyerpCPContactDetail1();
		co.VerifyMyerpCPContactPersonName1();
		co.VerifyMyerpCPMobileNumber1();
		co.VerifyMyerpbillingtype3();
		co.VerifyMyerpCPActivechk3();
		co.VerifyMyerpCPProduct3();
		co.VerifyMyerpCPPQantity3();
		co.VerifyMyerpCPPOpeningCycle3();
		co.VerifyMyerpCPSubmitBtn3();
		co.VerifyMyerpCPGetListBtn3();
		co.VerifyandClickonPSearchbar3();
		
		co.VerifyMyerpConsumerNumber4();
		co.VerifyMyerpCPBusinessname4();
		co.VerifyMyerpCPSelectBusinessType4();
		co.VerifyMyerpCPSelectGroup4();
		co.VerifyMyerpCPAddress4();
		co.VerifyMyerpCPSelectState4();
		co.VerifyMyerpCPSelectState1();
		co.VerifyMyerpCPSelectDistrict1();
		co.VerifyMyerpCPSelectTehsil1();
		co.VerifyMyerpCPSelectCity1();
		co.VerifyMyerpCPPincode1();
		co.VerifyMyerpCPEmailId1();
		co.VerifyMyerpCPContactDetail1();
		co.VerifyMyerpCPContactPersonName1();
		co.VerifyMyerpCPMobileNumber1();
		co.VerifyMyerpbillingtype4();
		co.VerifyMyerpCPActivechk4();
		co.VerifyMyerpCPProduct4();
		co.VerifyMyerpCPPQantity4();
		co.VerifyMyerpCPPOpeningCycle4();
		co.VerifyMyerpCPSubmitBtn4();
		co.VerifyMyerpCPGetListBtn4();
		co.VerifyandClickonPSearchbar4();
		
		co.VerifyMyerpConsumerNumber5();
		co.VerifyMyerpCPBusinessname5();
		co.VerifyMyerpCPSelectBusinessType5();
		co.VerifyMyerpCPSelectGroup5();
		co.VerifyMyerpCPAddress5();
		co.VerifyMyerpCPSelectState5();
		co.VerifyMyerpCPSelectState1();
		co.VerifyMyerpCPSelectDistrict1();
		co.VerifyMyerpCPSelectTehsil1();
		co.VerifyMyerpCPSelectCity1();
		co.VerifyMyerpCPPincode1();
		co.VerifyMyerpCPEmailId1();
		co.VerifyMyerpCPContactDetail1();
		co.VerifyMyerpCPContactPersonName1();
		co.VerifyMyerpCPMobileNumber1();
		co.VerifyMyerpbillingtype5();
		co.VerifyMyerpCPActivechk5();
		co.VerifyMyerpCPProduct5();
		co.VerifyMyerpCPPQantity5();
		co.VerifyMyerpCPPOpeningCycle5();
		co.VerifyMyerpCPSubmitBtn5();
		co.VerifyMyerpCPGetListBtn5();
		co.VerifyandClickonPSearchbar5();
		co.VerifyMyerpTExportBtn();
		co.VerifyandClickonPSearchbar3();
		co.VerifyMyerpTExportBtn();


	}
}

