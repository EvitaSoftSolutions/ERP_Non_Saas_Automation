package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.ARReceiptRegister;



		public class ARReceiptRegisterTest extends LpgTestBase{

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
			public void   ARReceiptRegisterPageTest() throws InterruptedException {
				ARReceiptRegister ddr=new ARReceiptRegister(LpgTestBase.driver); 
				 ddr.verifyMyerpagancycode();
				 ddr.verifyMyerpUserid();
				 ddr.verifyMyerpPassword();
				 ddr.VerifyandClickonMyerpLoginBtn();
				 ddr.VerifyandClickonMyerpAccountReport();
				 ddr.VerifyandClickonMyerpAccountingReport();
				 ddr.VerifyandClickonMyerpRepceiptRegisterReport();
				 ddr.verifyMyerpSelectCompany();
				 ddr.verifyMyerpSelectSaleType();
				 ddr.VerifyMyerpFromDate();
				 ddr.VerifyMyerpTodate();
				 ddr.VerifyMyerpPVSelectBank();
				 ddr.VerifyandClickonMyerpGetdataBtn();
				 
				 
			}
		}