package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.CounterSaleInvoiceDetails;


public class CounterSaleInvoiceDetailsTest  extends LpgTestBase{

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
	public void CounterSaleInvoiceDetailsPageTest() throws InterruptedException {
		CounterSaleInvoiceDetails csid=new CounterSaleInvoiceDetails(LpgTestBase.driver); 
		csid.verifyMyerpagancycode();
		csid.verifyMyerpUserid();
		csid.verifyMyerpPassword();
		csid.VerifyandClickonMyerpLoginBtn();
		csid.VerifyandClickonMyerpGeneralReport();
		csid.VerifyandClickonMyerpConterInvoiceDetails();
		csid.verifyMyerpSelectCompany();
		csid.VerifyandClickonMyerpCounterSaleVoucherNumber();
		csid.VerifyandClickonMyerpGetdataBtn();
		csid.VerifyandClickonMyerpPrintInvoiceBtn();
	   
	} 
}
