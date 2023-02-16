package com.lpg.qa.PurchaseTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.PurchasePages.PurchaseServiceForm;

public class PurchaseServiceTest extends LpgTestBase{

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
	public void PurchaseServicetest() throws InterruptedException{
		PurchaseServiceForm ps=new PurchaseServiceForm(LpgTestBase.driver);
		ps.verifyMyerpagancycode();
		ps.verifyMyerpusrname();
		ps.verifyMyerppassword();
		ps.verifyMyerploginbtn();
		ps.verifyMyerpPurchaseModule();
		ps.verifyMyerpPurchaseService();
		ps.SelectCompany();
		ps.verifyMyerpInvoiceNumber();
		ps.Supllier();
		ps.verifyMyerpNarration();
		ps.verifyMyerpServices();
		ps.verifyMyerpQuntity();
		ps.verifyMyerpUnitCost();
		ps.verifyMyerpClearbtn();
		ps.SelectCompany1();
		ps.verifyMyerpInvoiceNumber1();
		ps.Supllier1();
		ps.verifyMyerpNarration1();
		ps.verifyMyerpSubmitbtn();
		ps.verifyMyerpServices1();
		ps.verifyMyerpQuntity1();
		ps.verifyMyerpUnitCost1();
		ps.verifyMyerpSubmitbtn();
		
	}
}
