package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.CounterSaleRegister;


public class CounterSaleRegisterTest  extends LpgTestBase{

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
	public void CounterSaleRegisterPageTest() throws InterruptedException {
		CounterSaleRegister cs=new CounterSaleRegister(LpgTestBase.driver); 
		cs.verifyMyerpagancycode();
		cs.verifyMyerpUserid();
		cs.verifyMyerpPassword();
		cs.VerifyandClickonMyerpLoginBtn();
		cs.VerifyandClickonMyerpGeneralReport();
		cs.VerifyandClickonMyerpCountersaleRegister();
		cs.VerifyandClickonMyerpPlaseFromSelectDate();
		cs.verifyMyerpSelectCompany();
		cs.verifyMyerpSelectPaymentMode();
	    cs.VerifyandClickonMyerpConsumerNumber();
		cs.VerifyandClickonMyerpGetdataBtn();
		
		
		
	}
}