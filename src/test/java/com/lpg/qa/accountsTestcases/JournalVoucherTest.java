package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.JournalVoucher;


 public class JournalVoucherTest  extends LpgTestBase{

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
			public void JournalVoucherPageTest() throws InterruptedException {
				JournalVoucher jv=new  JournalVoucher(LpgTestBase.driver); 
				
				/*
				 * jv.verifyMyerpagancycode(); jv.verifyMyerpUserid(); jv.verifyMyerpPassword();
				 * jv.VerifyandClickonMyerpLoginBtn();
				 */
				jv.setup(driver);
				jv.VerifyandClickonMyerpAccountsModule();
				jv.VerifyandClickonMyerpJournalVoucherForm();
				jv.VerifyandClickonMyerpJVTransactionDate();
				jv.VerifyandClickonMyerpJVNarration();
				jv.VerifyandClickonMyerpJVLedger();
				jv.VerifyandClickonMyerpJVAmount();
				jv.VerifyandClickonMyerpJVSelectDebitCredit();
				jv.VerifyandClickonMyerpJVSavebtn();
			//	jv.VerifyandClickonMyerpJVNewbtn();
				//jv.VerifyandClickonMyerpJVAddHeaderbtn();
				//jv.VerifyandClickonMyerpJVLedger();
				//jv.VerifyandClickonMyerpJVAmount();
			//	jv.VerifyandClickonMyerpJVSavebtn();
				
				
				 }
		}
