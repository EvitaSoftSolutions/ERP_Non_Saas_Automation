package com.lpg.qa.CommercialcylsaleTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.commercialcylsale.CommercialSaleInvoiceDetailsReport;


	public class CommercialSaleInvoiceDetailsReportTest extends LpgTestBase{

		WebDriver driver;

		// Open browser ==> Test Registration page ==> close the browser.
		
		@BeforeClass
		public void setup() {
			intializeBrowser("chrome");
		}
		
		@AfterClass
		public void teardown() {
//			TestBase.driver.close();
		}
		
		@Test
		public void CommercialSaleInvoiceDetailsReportPagetest() throws InterruptedException{
			CommercialSaleInvoiceDetailsReport ccl= new CommercialSaleInvoiceDetailsReport(LpgTestBase.driver);
			ccl.verifyMyerpagancycode();
			ccl.verifyMyerpUserid();
			ccl.verifyMyerpPassword();
			ccl.VerifyandClickonMyerpLoginBtn();
			ccl.VerifyMyerpGenralReportModule();
			ccl.VerifyMyerpCommercialSaleInvoiceDetailsReport();
			ccl.verifyMyerpSelectCompany();
			ccl.VerifyandVoucherNoTextBox();
			ccl.VerifyandClickonMyerpGetDataBtn();
			
		
			
			
			
			
			
		
		
		}
	}


