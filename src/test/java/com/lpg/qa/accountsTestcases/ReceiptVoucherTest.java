package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.ReceiptVoucher;


 public class ReceiptVoucherTest  extends LpgTestBase{

	     WebDriver driver;
		   
			@BeforeClass
			public void setup() {
				intializeBrowser("chrome");
			}
			
			@AfterClass
			 public void teardown() { 
				//TestBase.driver.close(); 
			}
			
			 
			@Test
			public void ReceiptVoucherPageTest() throws InterruptedException {
				ReceiptVoucher arv=new  ReceiptVoucher(LpgTestBase.driver); 
				
				arv.verifyMyerpagancycode();
				arv.verifyMyerpUserid();
				arv.verifyMyerpPassword();
				arv.VerifyandClickonMyerpLoginBtn();
				arv.VerifyandClickonMyerpAccountsModule();
				arv.VerifyandClickonMyerpReceiptVoucherForm();
				arv.VerifyandClickonMyerpReceiptVoucherNumber();
				arv.VerifyandClickonMyerpRVTransactionDate();
				arv.VerifyMyerpRVSelectBankORCash();
				arv.VerifyandClickonMyerpRVChequeNumber();
				arv.VerifyandClickonMyerpRVChequeDate();
				arv.VerifyandClickonMyerpRVNarration1();
				arv.VerifyandClickonMyerpRVLedger();
				arv.VerifyandClickonMyerpRVAmountTextbox();
				arv.VerifyandClickonMyerpRVSelectDebitCredit();
				arv.VerifyandClickonMyerpRVNewbtn();
				arv.VerifyandClickonMyerpReceiptVoucherNumber();
				arv.VerifyMyerpRVSelectBankORCash();
				arv.VerifyandClickonMyerpRVChequeNumber();
				arv.VerifyandClickonMyerpRVChequeDate();
				arv.VerifyandClickonMyerpRVNarration1();
				arv.VerifyandClickonMyerpRVLedger();
				arv.VerifyandClickonMyerpRVAmountTextbox();
				arv.VerifyandClickonMyerpRVSelectDebitCredit();
				arv.VerifyandClickonMyerpRVSavebtn();
				arv.VerifyandClickonMyerpRVAlertpopup();
				arv.VerifyandClickonMyerpRVAddHeaderbtn();
				arv.VerifyandClickonMyerpRVLedger();
				arv.VerifyandClickonMyerpRVAmountTextbox();
				arv.VerifyandClickonMyerpRVSelectDebitCredit1();
				arv.VerifyandClickonMyerpRVSavebtn();
				arv.VerifyandClickonMyerpAccountsModule();
				
				
			
				 
				 }
		}
