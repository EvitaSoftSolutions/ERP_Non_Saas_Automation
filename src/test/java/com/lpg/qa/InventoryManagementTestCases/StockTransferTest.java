package com.lpg.qa.InventoryManagementTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.InventoryManagement.StockTransferForm;



public class StockTransferTest  extends LpgTestBase{

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
	public void StockTransfertest() throws InterruptedException{
		StockTransferForm st= new StockTransferForm(LpgTestBase.driver);
		st.verifyMyerpagancycode();
		st.verifyMyerpusrname();
		st.verifyMyerppassword();
		st.verifyMyerploginbtn();
		st.verifyMyerpInventoryManagement();
		st.verifyMyerpStockTransfer();
		st.Fromgodown();
		st.Togodown();
		st.Product();
		st.verifyMyerpTransferfullcyl();
		st.verifyMyerpTransferEmptycyl();
		st.verifyMyerpTransferDefectivecyl();
		st.verifyMyerpClearbtn();
		st.Fromgodown1();
		st.Togodown1();
		st.Product1();
		st.verifyMyerpTransferfullcyl1();
		st.verifyMyerpTransferEmptycyl1();
		st.verifyMyerpTransferDefectivecyl1();
		st.verifyMyerpsubmitbtn();
		
	}
}
