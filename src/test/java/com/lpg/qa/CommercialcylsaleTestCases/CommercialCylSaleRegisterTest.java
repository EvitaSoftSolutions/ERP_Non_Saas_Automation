 package com.lpg.qa.CommercialcylsaleTestCases;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
    import com.lpg.qa.Base.LpgTestBase;
    import com.lpg.qa.commercialcylsale.CommercialCylSaleRegister;


	public class CommercialCylSaleRegisterTest extends LpgTestBase{

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
		public void CommercialCylSaleRegisterPagetest() throws InterruptedException{
			CommercialCylSaleRegister ccl= new CommercialCylSaleRegister(LpgTestBase.driver);
			ccl.verifyMyerpagancycode();
			ccl.verifyMyerpUserid();
			ccl.verifyMyerpPassword();
			ccl.VerifyandClickonMyerpLoginBtn();
			ccl.VerifyMyerpGenralReportModule();
			ccl.VerifyMyerpCommercialCylSaleRegister();
			ccl.VerifyMyerpFromDate();
			ccl.VerifyMyerpTodate();
			ccl.verifyMyerpSelectDeliveryMan();
			ccl.verifyMyerpSelectProduct();
			ccl.verifyMyerpSelectParty();
			ccl.VerifyandClickonMyerpGetDataBtn();
			ccl.VerifyandClickonMyerpGetDataBtn();
		
			
			
			
			
			
		
		
		}
	}


