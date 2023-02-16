package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.PaymentVoucher;


 public class PaymentVoucherTest  extends LpgTestBase{

			WebDriver driver;
		   
			@BeforeClass
			public void setup() {
				intializeBrowser("chrome");
			}
			
			@AfterClass
			public void teardown() {
				LpgTestBase.driver.close();
			}	
			
			@Test
			public void PaymentVoucherPageTest() throws InterruptedException {
				PaymentVoucher apv=new  PaymentVoucher(LpgTestBase.driver); 
				
				apv.verifyMyerpagancycode();
				apv.verifyMyerpUserid();
				apv.verifyMyerpPassword();
				apv.VerifyandClickonMyerpLoginBtn();
				apv.VerifyandClickonMyerpAccountsModule();
				apv.VerifyandClickonMyerpPayementVoucherForm();
				apv.VerifyandClickonMyerpPayementVoucherNumber();
				apv.VerifyandClickonMyerpPVTransactionDate();
				apv.VerifyMyerpPVSelectBankORCash();
				apv.VerifyandClickonMyerpPVChequeNumber();
				apv.VerifyandClickonMyerpPVChequeDate();
				apv.VerifyandClickonMyerpPVNarration1();
				apv.VerifyandClickonMyerpPVLedger();
				apv.VerifyandClickonMyerpPVAmountTextbox();
				apv.VerifyandClickonMyerpPVSelectDebitCredit();
				apv.VerifyandClickonMyerpPVNewbtn();
				apv.VerifyandClickonMyerpPayementVoucherNumber();
				apv.VerifyandClickonMyerpPVTransactionDate();
				apv.VerifyMyerpPVSelectBankORCash();
				apv.VerifyandClickonMyerpPVChequeNumber();
				apv.VerifyandClickonMyerpPVChequeDate();
				apv.VerifyandClickonMyerpPVNarration1();
				apv.VerifyandClickonMyerpPVLedger();
				apv.VerifyandClickonMyerpPVAmountTextbox();
				apv.VerifyandClickonMyerpPVSelectDebitCredit();
				apv.VerifyandClickonMyerpPVSavebtn();
				apv.VerifyandClickonMyerpPVAddHeaderbtn();
				//apv.VerifyandClickonMyerpPVLedger1();
				//apv.VerifyandClickonMyerpPVAmountTextbox1();
				//apv.VerifyandClickonMyerpPVSelectDebitCredit1();
				//apv.VerifyandClickonMyerpPVSavebtn1();
				
				
				
				
			
				 
				 }
		}
