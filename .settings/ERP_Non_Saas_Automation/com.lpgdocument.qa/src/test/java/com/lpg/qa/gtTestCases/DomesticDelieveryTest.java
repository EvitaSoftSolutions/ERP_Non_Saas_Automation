
package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.DomesticDelievery;



		public class DomesticDelieveryTest  extends LpgTestBase{

			WebDriver driver;
		   
			@BeforeClass
			public void setup() {
			driver=intializeBrowser("chrome");
			}
			
			@AfterClass
			public void teardown() {
			//	TestBase.driver.close();
			}	
			
			@Test
			public void DomesticDeliveryPageTest() throws InterruptedException {
				DomesticDelievery erv=new  DomesticDelievery(LpgTestBase.driver); 
				
				/*
				 * erv.verifyMyerpagancycode(); erv.verifyMyerpUserid();
				 * erv.verifyMyerpPassword(); erv.VerifyandClickonMyerpLoginBtn();
				 */
				 erv.setup(driver);
				 erv.VerifyandClickonMyerpGodownTransactionModule();
				 erv.VerifyandClickonMyerpGTDomesticDeliveryForm();
				 erv.VerifyMyerpTVSelectProduct();
				 erv.VerifyandClickonMyerpGTDDSearchBtn();
				 erv.VerifyMyerpTVSelectGodown();
				 erv.VerifyandClickonMyerpGTDDFullCyl();
				 erv.VerifyandClickonMyerpGTDDEmptyCyl();
				 erv.VerifyandClickonMyerpGTDDESubmitBtn();
				 
				 erv.VerifyMyerpTVSelectProduct();
				 erv.VerifyMyerpTVSelectGodown();
				 erv.VerifyandClickonMyerpGTDDGetDataBtn();
				 
				 erv.VerifyMyerpTVSelectProduct1();
				 erv.VerifyandClickonMyerpGTDDSearchBtn1();
				 erv.VerifyMyerpTVSelectGodown1();
				 erv.VerifyandClickonMyerpGTDDFullCyl1();
				 erv.VerifyandClickonMyerpGTDDEmptyCyl1();
				 erv.VerifyandClickonMyerpGTDDESubmitBtn1();
				 
				 erv.VerifyMyerpTVSelectProduct1();
				 erv.VerifyMyerpTVSelectGodown1();
				 erv.VerifyandClickonMyerpGTDDGetDataBtn1();
				 
				 erv.VerifyMyerpGenralReportModule();
				 erv.VerifyMyerpDailyComplaintReport();
				 erv.verifyMyerpSelectGodown();
				 erv.VerifyandClickonMyerpGetDataBtn();
				 }
		}