package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.PaymentRegisterNoWiseReport;




		public class PaymentRegisterNoWiseReportTest extends LpgTestBase{

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
			public void   PaymentRegisterNoWisePageTest() throws InterruptedException {
				PaymentRegisterNoWiseReport ddr=new PaymentRegisterNoWiseReport(LpgTestBase.driver); 
				 ddr.verifyMyerpagancycode();
				 ddr.verifyMyerpUserid();
				 ddr.verifyMyerpPassword();
				 ddr.VerifyandClickonMyerpLoginBtn();
				 ddr.VerifyandClickonMyerpAccountReport();
				 ddr.VerifyandClickonMyerpAccountingReport();
			     ddr.VerifyandClickonMyerpPaymentNoWiseReport();
				 ddr.verifyMyerpSelectCompany();
				 ddr.VerifyMyerpFromDocNo();
				 ddr.VerifyMyerpToDocNo();
				 ddr.VerifyandClickonMyerpGetdataBtn();
				 
				 
			}
		}