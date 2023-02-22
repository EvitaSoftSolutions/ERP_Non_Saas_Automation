package com.lpg.qa.tvmoduletestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.tvmodules.TVOutInvoiceDetailsReport;


		public class TVOutInvoiceDetailsReportTest extends LpgTestBase{

			WebDriver driver;
		   
			@BeforeClass
			public void setup() {
				intializeBrowser("chrome");
			}
			
			@AfterClass
			public void teardown() {
			//	 TestBase.driver.close();
			}	
			
			@Test
			public void  TVOutInvoiceDetailsReporttPageTest() throws InterruptedException {
				TVOutInvoiceDetailsReport tvire=new  TVOutInvoiceDetailsReport(LpgTestBase.driver); 
				tvire.verifyMyerpagancycode();
				tvire.verifyMyerpUserid();
				tvire.verifyMyerpPassword();
				tvire.VerifyandClickonMyerpLoginBtn();
				tvire.VerifyMyerpGenralReportModule();
				tvire.VerifyMyerpTVOUTInvoiceDetailReport();
				tvire.VerifyMyerpTVoutinvoicedetailsReportDocnum();
				tvire.VerifyMyerpGRTVoInvoiveDetailsReportGetDataBtn();
	
				
	         }
	   }
		
		
		