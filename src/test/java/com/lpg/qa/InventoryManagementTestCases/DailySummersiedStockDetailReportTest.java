package com.lpg.qa.InventoryManagementTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.InventoryManagement.DailySummersiedStockDetailReport;



	public class DailySummersiedStockDetailReportTest extends LpgTestBase{

		WebDriver driver;
		
		@BeforeClass
		public void setup() {
			intializeBrowser("chrome");
		}
		
		@AfterClass
		public void teardown() {
//			TestBase.driver.close();
		}
		
		@Test
		public void DailySummersiedStockDetailReportPagetest() throws InterruptedException{
			DailySummersiedStockDetailReport ccl= new DailySummersiedStockDetailReport(LpgTestBase.driver);
			ccl.verifyMyerpagancycode();
			ccl.verifyMyerpUserid();
			ccl.verifyMyerpPassword();
			ccl.VerifyandClickonMyerpLoginBtn();
			ccl.VerifyMyerpGenralReportModule();
			ccl.VerifyMyerpDailySummersiedStockReport();
			ccl.VerifyMyerpSelectDate();
			ccl.VerifyandClickonMyerpGetDataBtn();
		
			
			
			 
			
			 
		
		
		}
	}


