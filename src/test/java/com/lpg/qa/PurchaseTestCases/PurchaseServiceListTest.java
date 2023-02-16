package com.lpg.qa.PurchaseTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.PurchasePages.PurchaseServiceListForm;


public class PurchaseServiceListTest extends LpgTestBase{

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
	public void PurchaseServiceListtest() throws InterruptedException{
		PurchaseServiceListForm pl=new PurchaseServiceListForm(LpgTestBase.driver);
		pl.verifyMyerpagancycode();
		pl.verifyMyerpusrname();
		pl.verifyMyerppassword();
		pl.verifyMyerploginbtn();
		pl.verifyMyerpPurchaseModule();
		pl.verifyMyerpPurchaseServiceList();
		pl.verifyMyerpSubmitbtn();
		pl.verifyMyerpEditbtn();
		pl.verifyMyerpDeletebtn();
		
	}
}
