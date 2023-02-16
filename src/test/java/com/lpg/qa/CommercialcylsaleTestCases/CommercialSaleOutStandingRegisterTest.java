package com.lpg.qa.CommercialcylsaleTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.commercialcylsale.CommercialSaleOutStandingRegister;


	public class CommercialSaleOutStandingRegisterTest extends LpgTestBase{

		WebDriver driver;
		
		@BeforeClass
		public void setup() {
			intializeBrowser("chrome");
		}
		
		@AfterClass
		public void teardown() {
//			TestBase.driver.close();
		}
		
		@Test
		public void CommercialSaleOutStandingRegisterPagetest() throws InterruptedException{
			CommercialSaleOutStandingRegister ccl= new CommercialSaleOutStandingRegister(LpgTestBase.driver);
			ccl.verifyMyerpagancycode();
			ccl.verifyMyerpUserid();
			ccl.verifyMyerpPassword();
			ccl.VerifyandClickonMyerpLoginBtn();
			ccl.VerifyMyerpGenralReportModule();
			ccl.VerifyMyerpCommercialCylSaleOutstandingRegister();
			ccl.VerifyMyerpFromDate();
			ccl.VerifyMyerpTodate();
			ccl.verifyMyerpSelectParty();
			ccl.VerifyandClickonMyerpGetDataBtn();
			ccl.VerifyandClickonMyerpGetDataBtn();
		
			
			
			
			
			
		
		
		}
	}


