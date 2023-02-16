package com.lpg.qa.InventoryManagementTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.InventoryManagement.StockEntroyOtherProductForm;


public class StockEntroyOtherProductTest extends LpgTestBase{

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
	public void StockEntoryOtherProducttest() throws InterruptedException{
		StockEntroyOtherProductForm op= new StockEntroyOtherProductForm(LpgTestBase.driver);
		op.verifyMyerpagancycode();
		op.verifyMyerpusrname();
		op.verifyMyerppassword();
		op.verifyMyerploginbtn();
		op.verifyMyerpInventoryManagement();
		op.verifyMyerpStockentry();
		op.verifyMyerpOtherProduct();
		op.Godown();
		op.Product();
		op.verifyMyerpOpeningValue();
		op.Company();
		op.verifyMyerpOpeningqty();
		op.verifyMyerpClearbtn();
		op.Godown1();
		op.Product1();
		op.Company1();
		op.verifyMyerpSubmitbtn();

	}
}
