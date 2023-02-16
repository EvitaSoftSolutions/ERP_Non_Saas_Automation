package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.SaleRegister;


public class SaleRegisterTest  extends LpgTestBase{

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
	public void SaleRegisterPageTest() throws InterruptedException {
		SaleRegister cs=new SaleRegister(LpgTestBase.driver); 
		cs.verifyMyerpagancycode();
		cs.verifyMyerpUserid();
		cs.verifyMyerpPassword();
		cs.VerifyandClickonMyerpLoginBtn();
		cs.VerifyandClickonMyerpGeneralReport();
		cs.VerifyandClickonMyerpSaleRegister();
		cs.verifyMyerpSelectCompany();
		cs.verifyMyerpSelectSaleType();
		cs.VerifyandClickonMyerpPlaseFromSelectDate();
		cs.VerifyandClickonMyerpGetdataBtn();
		
		
		
	}
}