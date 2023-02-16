package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.BankReconcilationReport;



		public class BankReconcilationReportTest extends LpgTestBase{

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
			public void BankReconcilationReportPageTest() throws InterruptedException {
				BankReconcilationReport ddr=new BankReconcilationReport(LpgTestBase.driver); 
				 ddr.verifyMyerpagancycode();
				 ddr.verifyMyerpUserid();
				 ddr.verifyMyerpPassword();
				 ddr.VerifyandClickonMyerpLoginBtn();
				 ddr.VerifyandClickonMyerpAccountReport();
				 ddr.VerifyandClickonMyerpAccountingReport();
				 ddr.VerifyandClickonMyerpPageNavigation();
				 ddr.VerifyandClickonMyerpBankReconcilationReport();
				 ddr.verifyMyerpSelectCompany();
				 ddr.VerifyMyerpPVSelectBank();
				 ddr.VerifyMyerpFromDate();
				 ddr.VerifyMyerpTodate();
				 ddr.VerifyandClickonMyerpGetdataBtn();
				 
				 
			}
		}