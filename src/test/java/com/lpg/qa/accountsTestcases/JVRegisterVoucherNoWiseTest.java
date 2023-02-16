package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.JVRegisterVoucherNoWise;




		public class JVRegisterVoucherNoWiseTest extends LpgTestBase{

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
			public void   JVRegisterVoucherNoWisePageTest() throws InterruptedException {
				JVRegisterVoucherNoWise ddr=new JVRegisterVoucherNoWise(LpgTestBase.driver); 
				 ddr.verifyMyerpagancycode();
				 ddr.verifyMyerpUserid();
				 ddr.verifyMyerpPassword();
				 ddr.VerifyandClickonMyerpLoginBtn();
				 ddr.VerifyandClickonMyerpAccountReport();
				 ddr.VerifyandClickonMyerpAccountingReport();
			     ddr.VerifyandClickonMyerpJVNoWiseReport();
				 ddr.verifyMyerpSelectCompany();
				 ddr.VerifyMyerpFromDocNo();
				 ddr.VerifyMyerpToDocNo();
				 ddr.VerifyandClickonMyerpGetdataBtn();
				 
				 
			}
		}