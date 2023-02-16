package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.CommercialPendingBillListForm;

public class CommercialPendingBillListTest extends LpgTestBase{

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
	public void CommercialPendingBillListtest() throws InterruptedException{
		CommercialPendingBillListForm cp= new CommercialPendingBillListForm(LpgTestBase.driver);
		cp.verifyMyerpagancycode();
		cp.verifyMyerpusrname();
		cp.verifyMyerppassword();
		cp.verifyMyerploginbtn();
		cp.verifyMyerpAccounts();
		cp.verifyMyerpCompenbillist();
		cp.verifyMyerpFromdate();
		cp.verifyMyerpTodate();
		cp.verifyMyerpGetdata();
	
	
	}
}
