package com.lpg.qa.InventoryManagementTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.InventoryManagement.DailyStatementReport;



	public class DailyStatementReportTest extends LpgTestBase{

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
		public void DailyStatementReportPagetest() throws InterruptedException{
			DailyStatementReport ccl= new DailyStatementReport(LpgTestBase.driver);
			ccl.verifyMyerpagancycode();
			ccl.verifyMyerpUserid();
			ccl.verifyMyerpPassword();
			ccl.VerifyandClickonMyerpLoginBtn();
			ccl.VerifyMyerpGenralReportModule();
			ccl.VerifyMyerpDailyComplaintReport();
			ccl.VerifyMyerpSelectDate();
			ccl.verifyMyerpSelectGodown();;
			ccl.VerifyandClickonMyerpGetDataBtn();
			ccl.VerifyandClickonMyerpGetDataBtn();
		
			
			
			
			
			 
		
		
		}
	}


