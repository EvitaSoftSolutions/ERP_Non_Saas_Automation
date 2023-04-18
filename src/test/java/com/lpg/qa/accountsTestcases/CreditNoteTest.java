package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.CreditNoteForm;


public class CreditNoteTest extends LpgTestBase{

	WebDriver driver;

	// Open browser ==> Test Registration page ==> close the browser.


	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//		TestBase.driver.close();
	}

	@Test
	public void CreditNotetest() throws InterruptedException{
		CreditNoteForm cn= new CreditNoteForm(LpgTestBase.driver);
		/*
		 * cn.verifyMyerpagancycode(); cn.verifyMyerpusrname();
		 * cn.verifyMyerppassword(); cn.verifyMyerploginbtn();
		 */
		cn.setup(driver);
		cn.verifyMyerpAccounts();
		cn.verifyMyerpCreditnot();
		cn.verifyMyerpVoucherno();
		cn.verifyMyerpCreditledger();
		cn.verifyMyerpCreditamount();
		cn.verifyMyerpAccount();
		cn.verifyMyerpAmount();
		cn.verifyMyerpNarration();
		cn.verifyMyerpNarration1();
		cn.verifyMyerpNewbtn();
		cn.verifyMyerpCreditledger();
		cn.verifyMyerpCreditamount();
		cn.verifyMyerpAccount();
		cn.verifyMyerpAmount();

		cn.verifyMyerpPlusbtn();
		cn.verifyMyerpAccount1();
		cn.verifyMyerpAmount1();
		cn.verifyMyerpPlusbtn1();
		cn.verifyMyerpAccount2();
		cn.verifyMyerpAmount2();


		cn.verifyMyerpNarration();
		cn.verifyMyerpNarration1();
		cn.verifyMyerpVoucherno();
		cn.verifyMyerpSubmitbtn();

		cn.VerifyandClickonMyerpupdatecreditnote();
		cn.VerifyandClickonMyerpdocumentno();
		cn.VerifyandClickonMyerpugetdatabtn();
		cn.VerifyandClickonMyerpusubmitbtn();

		cn.VerifyandClickonMyerpAccountReport();
		cn.VerifyandClickonMyerpAccountingReport();
		cn.VerifyandClickonMyerpPageNavigation1();
		cn.VerifyandClickonMyerpCreditnoteRegisterReport();
		cn.verifyMyerpSelectCompany();
		cn.VerifyMyerpFromDate();
		cn.VerifyMyerpTodate();
		cn.VerifyandClickonMyerpGetdataBtn();
		
		 cn.VerifyandClickonMyerpAccountReport();
		 cn.VerifyandClickonMyerpAccountingReport();
		 cn.VerifyandClickonMyerpPageNavigation2();
	     cn.VerifyandClickonMyerpCreditNoteNoWiseReport();
		 cn.verifyMyerpSelectCompany1();
		 cn.VerifyMyerpFromDocNo();
		 cn.VerifyMyerpToDocNo();
		 cn.VerifyandClickonMyerpGetdataBtn1();
		 




	}
}
