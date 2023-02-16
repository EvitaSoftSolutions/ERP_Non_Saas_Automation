package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.DebitNoteVoucher;


 public class DebitNoteVoucherTest  extends LpgTestBase{

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
			public void DebitNoteVoucherPageTest() throws InterruptedException {
				DebitNoteVoucher dbv=new  DebitNoteVoucher(LpgTestBase.driver); 
				
				dbv.verifyMyerpagancycode();
				dbv.verifyMyerpUserid();
				dbv.verifyMyerpPassword();
				dbv.VerifyandClickonMyerpLoginBtn();
				dbv.VerifyandClickonMyerpAccountsModule();
				dbv.VerifyandClickonMyerpDebitNoteVoucherForm();
				dbv.VerifyandClickonMyerpDBVoucherNumber();
				dbv.VerifyandClickonMyerpDBVTransactionDate();
				dbv.VerifyandClickonMyerpDBVDebitFromLedger();
				dbv.VerifyandClickonMyerpDBVAmount();
				dbv.VerifyandClickonMyerpDBVLedger1();
				dbv.VerifyandClickonMyerpDBVAmountTextbox1();
				dbv.VerifyandClickonMyerpDBVNarration1();
				dbv.VerifyandClickonMyerpDBVNewbtn();
				dbv.VerifyandClickonMyerpDBVoucherNumber();
				dbv.VerifyandClickonMyerpDBVTransactionDate();
				dbv.VerifyandClickonMyerpDBVDebitFromLedger();
				dbv.VerifyandClickonMyerpDBVAmount();
				dbv.VerifyandClickonMyerpDBVLedger1();
				dbv.VerifyandClickonMyerpDBVAmountTextbox1();
				dbv.VerifyandClickonMyerpDBVNarration1();
				dbv.VerifyandClickonMyerpDBVSavebtn();
				dbv.VerifyandClickonMyerpUpdateDebitNoteVoucherForm();
				dbv.VerifyandClickonMyerpDBVUpdateDocNumber();
				dbv.VerifyandClickonMyerpUpdateGetDataBtn();
				dbv.VerifyandClickonMyerpAlertpopup();
				 }
		}
