
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
				intializeBrowser("chrome");
			}
			
			@AfterClass
			public void teardown() {
			//	TestBase.driver.close();
			}	
			
			@Test
			public void DomesticDeliveryPageTest() throws InterruptedException {
				DomesticDelievery erv=new  DomesticDelievery(LpgTestBase.driver); 
				
				 erv.verifyMyerpagancycode();
				 erv.verifyMyerpUserid();
				 erv.verifyMyerpPassword();
				 erv.VerifyandClickonMyerpLoginBtn();
				 erv.VerifyandClickonMyerpGodownTransactionModule();
				 erv.VerifyandClickonMyerpGTDomesticDeliveryForm();
				 erv.VerifyMyerpTVSelectProduct();
				 erv.VerifyandClickonMyerpGTDDSearchBtn();
				 erv.VerifyandClickonMyerpGTDDEmptyCyl();
				 erv.VerifyandClickonMyerpGTDDFullCyl();
				 erv.VerifyandClickonMyerpGTDDESubmitBtn();
			}
		}