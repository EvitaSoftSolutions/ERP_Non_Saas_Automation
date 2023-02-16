package com.lpg.qa.tvmoduletestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.tvmodules.TVOutDetailsReport;


		public class TVOutDetailsReportTest extends LpgTestBase{

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
			public void  TVOutDetailsReportPageTest() throws InterruptedException {
				TVOutDetailsReport tvreg=new  TVOutDetailsReport(LpgTestBase.driver); 
				tvreg.verifyMyerpagancycode();
				tvreg.verifyMyerpUserid();
				tvreg.verifyMyerpPassword();
				tvreg.VerifyandClickonMyerpLoginBtn();
				tvreg.VerifyMyerpGenralReportModule();
				tvreg.VerifyMyerpTVModuleTVoutdetailsReport();
				tvreg.VerifyMyerpGRTVRPlaseSelectFromDate();
				tvreg.VerifyMyerpGRTVoRegTVRPlaseSelectToDate();
				tvreg.VerifyandClickonMyerpTVOUTRegBoxbody();
				tvreg.VerifyMyerpGRTVoRegConsumerNumber();
				tvreg.VerifyandClickonMyerpTVOUTReg1Boxbody();
				tvreg.VerifyandClickonMyerpTVOUTRegGetDataBtn();
				
	         }
	   }
		
		
		