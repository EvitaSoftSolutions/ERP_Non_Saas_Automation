package com.lpg.qa.InventoryManagementTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.InventoryManagement.StockCheckForm;


public class StockCheckTest extends LpgTestBase{

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
	public void StockChecktest() throws InterruptedException{
		StockCheckForm sc= new StockCheckForm(LpgTestBase.driver);
		sc.verifyMyerpagancycode();
		sc.verifyMyerpusrname();
		sc.verifyMyerppassword();
		sc.verifyMyerploginbtn();
		sc.verifyMyerpInventoryManagement();
		sc.verifyMyerpStockcheck();
		sc.Godown();
		sc.Product();
		sc.verifyMyerpClearbtn();
		sc.Godown1();
		sc.Product1();
		sc.verifyMyerpSubmitbtn();
		
	}
}
