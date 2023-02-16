package com.lpg.qa.PurchaseTestCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.PurchasePages.PurchaseRegister;

public class PurchaseRegisterTest  extends LpgTestBase{

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
	public void PurchaseRegisterPageTest() throws InterruptedException {
		PurchaseRegister pr=new PurchaseRegister(LpgTestBase.driver); 
		pr.verifyMyerpagancycode();
		pr.verifyMyerpUserid();
		pr.verifyMyerpPassword();
		pr.VerifyandClickonMyerpLoginBtn();
		pr.VerifyandClickonMyerpGeneralReport();
		pr.VerifyandClickonMyerpPurchaseRegister();
		pr.VerifyandClickonMyerpPlaseFromSelectDate();
		pr.verifyMyerpSelectCompany();
		pr.verifyMyerpSelectSupplier();
		pr.verifyMyerpSelectPurchaseType();
		pr.VerifyandClickonMyerpGetdataBtn();		
	   
	} 
}
