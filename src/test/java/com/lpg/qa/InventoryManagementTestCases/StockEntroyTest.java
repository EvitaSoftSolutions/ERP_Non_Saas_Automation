package com.lpg.qa.InventoryManagementTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.InventoryManagement.StockEntroyForm;



public class StockEntroyTest extends LpgTestBase{

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
	public void StockEntorytest() throws InterruptedException{
		StockEntroyForm se= new StockEntroyForm(LpgTestBase.driver);
		se.verifyMyerpagancycode();
		se.verifyMyerpusrname();
		se.verifyMyerppassword();
		se.verifyMyerploginbtn();
		se.verifyMyerpInventoryManagement();
		se.verifyMyerpStockentry();
		se.Godownin();
		se.Productid();
		se.verifyMyerpOpeningfull();
		se.verifyMyerpOpeningEmpty();
		se.verifyMyerpDefective();
		se.verifyMyerpCredit();
		se.verifyMyerpMinstock();
		se.verifyMyerpValuavtion();
		se.verifyMyerpClearbtn();
		se.Godownin1();
		se.Productid1();
		se.verifyMyerpOpeningfull1();
		se.verifyMyerpOpeningEmpty1();
		se.verifyMyerpDefective1();
		se.verifyMyerpCredit1();
		se.verifyMyerpMinstock1();
		se.verifyMyerpValuavtion1();
		se.verifyMyerpSubmitbtn();
		
	}
}
