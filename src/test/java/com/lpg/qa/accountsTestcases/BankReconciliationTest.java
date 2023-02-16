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
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
//		TestBase.driver.close();
	}
	
	@Test
	public void BankReconciliationtest() throws InterruptedException{
		BankReconciliationForm br= new BankReconciliationForm(LpgTestBase.driver);
		br.verifyMyerpagancycode();
		br.verifyMyerpusrname();
		br.verifyMyerppassword();
		br.verifyMyerploginbtn();
		br.verifyMyerpAccounts();
		br.verifyMyerpBankReconciliation();
		br.verifyMyerpRetiobtn();
		br.selectbank();
		br.selectbank1();
		br.verifyMyerpGetdata();
		br.verifyMyerpClrdatesel();
		br.verifyMyerpClrdatesel1();
		br.verifyMyerpSubmitbutton();
		br.verifyMyerpRetiobtn1();

	}
}
