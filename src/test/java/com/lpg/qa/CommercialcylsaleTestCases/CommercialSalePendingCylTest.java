package com.lpg.qa.CommercialcylsaleTestCases;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
    import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.commercialcylsale.CommercialSalePendingCyl;


	public class CommercialSalePendingCylTest extends LpgTestBase{

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
		public void CommercialSalePendingCylPagetest() throws InterruptedException{
			CommercialSalePendingCyl ccl= new CommercialSalePendingCyl(LpgTestBase.driver);
			ccl.verifyMyerpagancycode();
			ccl.verifyMyerpUserid();
			ccl.verifyMyerpPassword();
			ccl.VerifyandClickonMyerpLoginBtn();
			ccl.VerifyMyerpGenralReportModule();
			ccl.VerifyMyerpCommercialCylSalePendingRegister();
			ccl.VerifyMyerpFromDate();
			ccl.verifyMyerpSelectDeliveryMan();
			ccl.verifyMyerpSelectParty();
			ccl.VerifyandClickonMyerpGetDataBtn();
			
			
		}
	}
