package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.CommercialDeliveryReport;


		public class CommercialDeliveryReportTest extends LpgTestBase{

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
			public void   CommercialDeliveryReportPageTest() throws InterruptedException {
				CommercialDeliveryReport ddr=new CommercialDeliveryReport(LpgTestBase.driver); 
				
				 ddr.verifyMyerpagancycode();
				 ddr.verifyMyerpUserid();
				 ddr.verifyMyerpPassword();
				 ddr.VerifyandClickonMyerpLoginBtn();
				 ddr.VerifyandClickonMyerpGeneralReport();
				 ddr.VerifyandClickonMyerpGRCommercialDeliveryReport();
				 ddr.VerifyandClickonMyerpPlaseSelectDate();
				 ddr.VerifyandClickonMyerpGetdataBtn();
				 
				 
			}
		}