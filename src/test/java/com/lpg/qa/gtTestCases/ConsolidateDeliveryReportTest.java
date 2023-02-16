package com.lpg.qa.gtTestCases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.ConsolidateDeliveryReport;



	public class ConsolidateDeliveryReportTest extends LpgTestBase{

		WebDriver driver;

		// Open browser ==> Test Registration page ==> close the browser.
		
		@BeforeClass
		public void setup() {
			intializeBrowser("chrome");
		}
		
		@AfterClass
		public void teardown() {
//			TestBase.driver.close();
		}
		
		@Test
		public void ConsolidateDeliveryReportPagetest() throws InterruptedException{
			ConsolidateDeliveryReport ccl= new ConsolidateDeliveryReport(LpgTestBase.driver);
			ccl.verifyMyerpagancycode();
			ccl.verifyMyerpUserid();
			ccl.verifyMyerpPassword();
			ccl.VerifyandClickonMyerpLoginBtn();
			ccl.VerifyMyerpGenralReportModule();
			ccl.VerifyMyerpConsolidateDeliveryReport();
			ccl.VerifyMyerpFromDate();
			ccl.VerifyMyerpTodate();
			ccl.verifyMyerpSelectDeliveryMan();
			ccl.verifyMyerpSelectProduct();
			ccl.VerifyandClickonMyerpGetDataBtn();
			
		
			
			
			
			
			
		
		
		}
	}


