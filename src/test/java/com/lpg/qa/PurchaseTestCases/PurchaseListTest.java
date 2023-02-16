package com.lpg.qa.PurchaseTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.PurchasePages.PurchaselistForm;


public class PurchaseListTest extends LpgTestBase{

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
	public void Purchaselisttest() throws InterruptedException{
		PurchaselistForm pl=new PurchaselistForm(LpgTestBase.driver);
		pl.verifyMyerpagancycode();
		pl.verifyMyerpusrname();
		pl.verifyMyerppassword();
		pl.verifyMyerploginbtn();
		pl.verifyMyerpPurchaseModule();
		pl.verifyMyerpPurhaseList();
		pl.verifyMyerpSubmitBtn();
		
	}
}
