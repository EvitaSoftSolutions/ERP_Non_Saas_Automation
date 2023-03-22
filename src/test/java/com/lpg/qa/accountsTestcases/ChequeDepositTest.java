package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.ChequeDepositForm;



public class ChequeDepositTest extends LpgTestBase{

	WebDriver driver;

	// Open browser ==> Test Registration page ==> close the browser.


	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//LpgTestBase.driver.close();
	}

	@Test
	public void ChequeDepositPagetest() throws InterruptedException{ 
		ChequeDepositForm cd= new ChequeDepositForm(LpgTestBase.driver);
		/*
		 * cd.verifyMyerpagancycode(); cd.verifyMyerpusrname();
		 * cd.verifyMyerppassword(); cd.verifyMyerploginbtn();
		 */
		cd.setup(driver);
		cd.verifyMyerpAccounts();
		cd.verifyMyerpChequedeposit();
		cd.VerifyMyerpPVSelectBank();
		cd.VerifyMyerpSelectdate();
		cd.VerifyandClickonMyerpshowbtnBtn();
		cd.VerifyandClickonMyerpClearingRadioBtn();
		cd.VerifyandClickonMyerpPrintBtn();
		cd.VerifyandClickonMyerpsubmitbtn();
	
		cd.verifyMyerpAccounts();
		cd.verifyMyerpAccounts();
		cd.verifyMyerpChequedeposit();
		cd.VerifyMyerpPVSelectBank();
		cd.VerifyMyerpSelectdate();
		cd.VerifyandClickonMyerpshowbtnBtn();
		cd.VerifyandClickonMyerpTransferRadioBtn();
		cd.VerifyandClickonMyerpPrintBtn();
		cd.VerifyandClickonMyerpsubmitbtn();

	

	}
}
 