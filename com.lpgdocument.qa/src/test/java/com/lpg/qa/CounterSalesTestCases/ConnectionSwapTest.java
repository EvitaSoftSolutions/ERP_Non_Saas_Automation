package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.ConnectionSwapForm;


public class ConnectionSwapTest extends LpgTestBase{

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
	public void ConnectionSwaptest() throws InterruptedException{
		ConnectionSwapForm cs=new ConnectionSwapForm(LpgTestBase.driver);
		cs.verifyMyerpagancycode();
		cs.verifyMyerpusrname();
		cs.verifyMyerppassword();
		cs.verifyMyerploginbtn();
		cs.verifyMyerpCounterSales();
		cs.verifyMyerpConnectionswap();
		cs.verifyMyerpConsumerno();
		cs.verifyMyerpSearch();
		cs.Cylrecied();
		cs.Product();
		cs.verifyMyerpClearbtn();
		cs.verifyMyerpSearch1();
		cs.Cylrecied1();
		cs.Product1();
		cs.verifyMyerpsubmitbtn();
	
	
	}
}
