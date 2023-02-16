package com.lpg.qa.PurchaseTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.PurchasePages.PurchaseInvoiceDetails;


public class PurchaseInvoiceDetailsTest  extends LpgTestBase{

	WebDriver driver;
   
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
	//	TestBase.driver.close();
	}
	
	
	@Test
	public void PurchaseInvoiceDetailsPageTest() throws InterruptedException {
		PurchaseInvoiceDetails pr=new PurchaseInvoiceDetails(LpgTestBase.driver); 
		pr.verifyMyerpagancycode();
		pr.verifyMyerpUserid();
		pr.verifyMyerpPassword();
		pr.VerifyandClickonMyerpLoginBtn();
		pr.VerifyandClickonMyerpGeneralReport();
		pr.VerifyandClickonMyerpPurchaseInvoiceDetails();
		pr.verifyMyerpSelectCompany();
		pr.VerifyandClickonMyerpPurchaseBillNumber();
		pr.VerifyandClickonMyerpGetdataBtn();
	   
	} 
}
