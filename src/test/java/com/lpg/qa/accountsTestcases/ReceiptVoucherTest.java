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
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() { 
		//TestBase.driver.close(); 
	}


	@Test
	public void ReceiptVoucherPageTest() throws InterruptedException {
		ReceiptVoucher arv=new  ReceiptVoucher(LpgTestBase.driver); 

		/*arv.verifyMyerpagancycode();
				arv.verifyMyerpUserid();
				arv.verifyMyerpPassword();
				arv.VerifyandClickonMyerpLoginBtn();
		 */
		arv.setup(driver);
		arv.VerifyandClickonMyerpAccountsModule();
		arv.VerifyandClickonMyerpReceiptVoucherForm();
	/*	arv.VerifyandClickonMyerpReceiptVoucherNumber();
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
		/*  arv.VerifyandClickonMyerpRVAddHeaderbtn();
				arv.VerifyandClickonMyerpRVLedger();
				arv.VerifyandClickonMyerpRVAmountTextbox();
				arv.VerifyandClickonMyerpRVSelectDebitCredit1();
				arv.VerifyandClickonMyerpRVSavebtn();
				arv.VerifyandClickonMyerpAccountsModule();

		 */
		arv.VerifyandClickonMyerpupdatepaymentvoucher();
		arv.VerifyandClickonMyerpdocumentno();
		arv.VerifyandClickonMyerpugetdatabtn();
		arv.VerifyandClickonMyerpusubmitbtn();


		arv.VerifyandClickonMyerpAccountReport();
		 arv.VerifyandClickonMyerpAccountingReport();
		 arv.VerifyandClickonMyerpRepceiptRegisterReport();
		 arv.verifyMyerpSelectCompany();
		 arv.verifyMyerpSelectSaleType();
		 arv.VerifyMyerpFromDate();
		 arv.VerifyMyerpTodate();
		 arv.VerifyMyerpPVSelectBank();
		 arv.VerifyandClickonMyerpGetdataBtn();
		 
		 
		arv.VerifyandClickonMyerpAccountReport();
		arv.VerifyandClickonMyerpAccountingReport();
		arv.VerifyandClickonMyerpRepceiptNoWiseReport();
		arv.verifyMyerpSelectCompany();
		arv.VerifyMyerpFromDocNo();
		arv.VerifyMyerpToDocNo();
		arv.VerifyandClickonMyerpGetdataBtn();



	}
}