package com.lpg.qa.GMTestcases;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.UploadSapConsumerDetails;


	public class UploadSapConsumerDetailsTest extends LpgTestBase{

		WebDriver driver;
		
		
		@BeforeClass
		public void setup() {
			driver=intializeBrowser("chrome");
		}
		
		@AfterClass
		public void teardown() {
//			TestBase.driver.close();
		}
		
		@Test
		public void UploadSapConsumerDetailsPageTest() throws InterruptedException{
			UploadSapConsumerDetails uscd = new UploadSapConsumerDetails(LpgTestBase.driver);
			/*
			 * am.verifyMyerpagancycode(); am.verifyMyerpusrname();
			 * am.verifyMyerppassword(); am.verifyMyerploginbtn();
			 */
			uscd.setup(driver);
			uscd.verifyMyerpMasterModule();
			uscd.verifyMyerpGeneralMaster();
			uscd.verifyMyerpPageNavigation();
			uscd.verifyMyerpUploadSapConsumerDetails();
			uscd.VerifyMyerpNLChooseFILE();
			uscd.VerifyMyerpImportBtn();
			uscd.VerifyMyerpsampleexelBtn();
		

			
		}
	
}
