package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.BillGenerationForm;


public class BillGenerationTest extends LpgTestBase{

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
	public void BillGenerationtest() throws InterruptedException{
		BillGenerationForm bg= new BillGenerationForm(LpgTestBase.driver);
		/*
		 * bg.verifyMyerpagancycode(); bg.verifyMyerpusrname();
		 * bg.verifyMyerppassword(); bg.verifyMyerploginbtn();
		 */
		bg.setup(driver);
		bg.verifyMyerpAccounts();
		bg.verifyMyerpBillgenerationDaily();
		bg.verifyMyerpBillingtypeDaily();
		bg.verifyMyerpBillingdatedaily();
		bg.verifyMyerpinvoicenumber();
		//bg.verifyMyerpclearbtn(); //not working
		//bg.Billingtype();
		//bg.verifyMyerpBillingdate();
		//bg.verifyMyerpinvoicenumber();
		bg.verifyMyerpSubmitbtn();
		
		bg.verifyMyerpBillgenerationMonthly();
		bg.verifyMyerpBillingtypemonthly();
		bg.verifyMyerpSelectMonth();
		bg.verifyMyerpBillgenerationmonthYear();
		bg.verifyMyerpBillingdatemon();
		bg.verifyMyerpinvoicenumber();
	    bg.verifyMyerpSubmitbtn();
	    
	    bg.verifyMyerpbillgenerationForthNight();
	    bg.verifyMyerpbillingtypefn();
	    bg.verifyMyerpSelectMonthFN();
	    bg.verifyMyerpBillgenerationmonthYearFN();
	    bg.verifyMyerpBillinddateFN();
	    bg.verifyMyerpinvoicenumber();
	    bg.verifyMyerpSubmitbtn();
	    
	    bg.verifyMyerpbillgenerationcustom();
	    bg.verifyMyerpbillingtypecustom();
	    bg.verifyMyerpselectpartycustom();
	    bg.verifyMyerpbillinddatecustom();
	    bg.verifyMyerpinvoicenumber();
	    bg.verifyMyerpSubmitbtn();
	    
	    bg.verifyMyerpbillgenerationimmegiate();
	    bg.verifyMyerpbillingtypeimmegiate();
	    bg.verifyMyerpbillinddateimmegiate();
	    bg.verifyMyerpinvoicenumber();
	    bg.verifyMyerpSubmitbtn();
	    
	    
		
		


	}
}
