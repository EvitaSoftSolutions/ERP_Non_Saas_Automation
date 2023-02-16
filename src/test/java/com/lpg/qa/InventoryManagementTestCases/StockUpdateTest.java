package com.lpg.qa.InventoryManagementTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.InventoryManagement.StockUpdateForm;


public class StockUpdateTest extends LpgTestBase{

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
	public void StockUpdatetest() throws InterruptedException{
		StockUpdateForm su= new StockUpdateForm(LpgTestBase.driver);
		su.verifyMyerpagancycode();
		su.verifyMyerpusrname();
		su.verifyMyerppassword();
		su.verifyMyerploginbtn();
		su.verifyMyerpInventoryManagement();
		su.verifyMyerpstockupdate();
		su.verifyMyerpselectdate();
		su.Godown();
		su.verifyMyerpgetdata();
		su.verifyMyerpopeningfull();
		su.verifyMyerpsubmitbtn();
		
	}
}
