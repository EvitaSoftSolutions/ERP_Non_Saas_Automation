package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.ContraVoucher;


 public class ContraVoucherTest  extends LpgTestBase{

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
			public void ContraVoucherPageTest() throws InterruptedException {
				ContraVoucher acv=new  ContraVoucher(LpgTestBase.driver); 
				
				acv.verifyMyerpagancycode();
				acv.verifyMyerpUserid();
				acv.verifyMyerpPassword();
				acv.VerifyandClickonMyerpLoginBtn();
				acv.VerifyandClickonMyerpAccountsModule();
				acv.VerifyandClickonMyerpContraVoucherForm();
				acv.VerifyandClickonMyerpCVTransactionDate();
				acv.VerifyandClickonMyerpContraVoucherNumber();
				acv.VerifyandClickonMyerpCVChequeNumber();
				acv.VerifyandClickonMyerpCVChequeDate();
				acv.VerifyandClickonMyerpCVAmountTextbox();
				acv.VerifyMyerpCVSelectDepositeIn();
				acv.VerifyMyerpCVSelectDrownFrom();
				acv.VerifyandClickonMyerpRVNarration1();
				acv.VerifyandClickonMyerpCVNewbtn();
				acv.VerifyandClickonMyerpCVTransactionDate();
				acv.VerifyandClickonMyerpContraVoucherNumber();
				acv.VerifyandClickonMyerpCVChequeNumber();
				acv.VerifyandClickonMyerpCVChequeDate();
				acv.VerifyandClickonMyerpCVAmountTextbox();
				acv.VerifyMyerpCVSelectDepositeIn();
				acv.VerifyMyerpCVSelectDrownFrom();
				acv.VerifyandClickonMyerpRVNarration1();
				acv.VerifyandClickonMyerpCVSavebtn();
				acv.VerifyandClickonMyerpCVAlertpopup();
				
				 }
		}
