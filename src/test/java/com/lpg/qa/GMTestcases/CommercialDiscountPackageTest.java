
package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.CommercialDiscountPackage;


	public class CommercialDiscountPackageTest  extends LpgTestBase{

		WebDriver driver;
	   
		@BeforeClass
		public void setup() {
			intializeBrowser("chrome");
		}
		
		@AfterClass
		public void teardown() {
		//	TestBase.driver.close();
		}
		
		
		@Test
		public void CommercialDiscountPackagPageTest() throws InterruptedException {
			CommercialDiscountPackage cdp=new CommercialDiscountPackage(LpgTestBase.driver); 
			//lpg.VerifyandClickonMyerpLoginwithoutBtn1();
			cdp.verifyMyerpagancycode();
			cdp.verifyMyerpUserid();
			cdp.verifyMyerpPassword();
			cdp.VerifyandClickonMyerpLoginBtn();
			cdp.VerifyMyerpMasterModule();
			cdp.VerifyMyerpGenralMasterModule();
			cdp.VerifyGenralMasterPageNavigation1();
			cdp.VerifyGenralMasterPageNavigation2();
			cdp.VerifyCommercialDiscountPackageForm();
			cdp.VerifyCommercialDiscountPackageName();
			cdp.VerifyCommercialDPDiscription();
			cdp.VerifyCommercialDAmount();
			cdp.VerifyCommercialDPClearBtn();
			cdp.VerifyCommercialDiscountPackageName1();
			cdp.VerifyCommercialDPDiscription1();
			cdp.VerifyCommercialDAmount1();
			cdp.VerifyCommercialSubmitBtn();
			cdp.VerifyCommercialSubmitOKBtn();
			cdp.VerifyandClickonPSearchbar1();
			cdp.VerifyCDPEditBtn();
			cdp.VerifyCDPYesUpdateItBtn();
			cdp.VerifyCommercialDiscountPackageName2();
			cdp.VerifyCommercialDPDiscription2();
			cdp.VerifyCDPUpdateBtn();
			cdp.VerifyCDPUpdateOKBtn();
			cdp.VerifyExportBtn();
			cdp.VerifyandClickonPSearchbar2();
			
		   
		} 
	}



