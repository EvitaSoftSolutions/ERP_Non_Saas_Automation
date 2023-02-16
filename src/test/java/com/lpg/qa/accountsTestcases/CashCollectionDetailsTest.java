package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.CashCollectionDetailsForm;

public class CashCollectionDetailsTest extends LpgTestBase{

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
	public void CashCollectionDetailstest() throws InterruptedException{
		CashCollectionDetailsForm cd= new CashCollectionDetailsForm(LpgTestBase.driver);
		cd.verifyMyerpagancycode();
		cd.verifyMyerpusrname();
		cd.verifyMyerppassword();
		cd.verifyMyerploginbtn();
		cd.verifyMyerpAccounts();
		cd.verifyMyerpCashcolldet();
		cd.verifyMyerpCashdate();
		cd.verifyMyerpGetdata();
		
	}
}
