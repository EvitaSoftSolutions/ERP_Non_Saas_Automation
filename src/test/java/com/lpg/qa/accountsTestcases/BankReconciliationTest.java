package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.BankReconciliationForm;



public class BankReconciliationTest extends LpgTestBase{

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
	public void BankReconciliationtest() throws InterruptedException{
		BankReconciliationForm br= new BankReconciliationForm(LpgTestBase.driver);
		/*
		 * br.verifyMyerpagancycode(); br.verifyMyerpusrname();
		 * br.verifyMyerppassword(); br.verifyMyerploginbtn();
		 */
		br.setup(driver);
		br.verifyMyerpAccounts();
		br.verifyMyerpBankReconciliation();
		br.verifyMyerpBankWiseunclear();
		br.selectbank();
		br.verifyMyerpClearbtn();
		br.selectbank1();
		br.verifyMyerpGetdata();
		br.verifyMyerpClrdatesel();
		//br.verifyMyerpClrdatesel1();
		br.verifyMyerpSubmitbutton();
		
		br.verifyMyerpDateWiseUnclear();
		br.selectbank();
		br.verifyMyerpselectformdate();
		br.verifyMyerpGetdata();
		br.verifyMyerpClrdatesel2();
		br.verifyMyerpSubmitbutton();
		
		br.verifyMyerpChequeNoWise();
		br.selectbank();
		br.verifyMyerpchequeno();
		br.verifyMyerpGetdata();
		
		br.verifyMyerpUpdateDetailclear();
		br.verifyMyerpselectformdate1();
		br.selectbank();
		br.verifyMyerpselectformdate1();
		br.verifyMyerpselecttodate1();
		br.verifyMyerpGetdata();
		br.verifyMyerpClrdatesel3();
		br.verifyMyerpSubmitbutton();
		
		

	}
}
