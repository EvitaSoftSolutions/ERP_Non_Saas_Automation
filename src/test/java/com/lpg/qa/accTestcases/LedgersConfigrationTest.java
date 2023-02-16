package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.LedgersConfigration;


	public class LedgersConfigrationTest extends LpgTestBase{

		WebDriver driver;
	   
		@BeforeClass
		public void setup() {
			intializeBrowser("chrome");
		}
		
		@AfterClass
		public void teardown() {
		//	TestBase.driver.close();
		}	
		
		@Test
		public void LedgersConfigrationPageTest() throws InterruptedException {
			LedgersConfigration lc=new LedgersConfigration(LpgTestBase.driver); 
			
			lc.verifyMyerpagancycode();
			lc.verifyMyerpUserid();
			lc.verifyMyerpPassword();
			lc.VerifyandClickonMyerpLoginBtn();
			lc.VerifyMyerpMasterModule();
			lc.VerifyMyerpAccountMasterModule();
			lc.VerifyMyerpLegersConfigForm();
			lc.VerifyMyerpLCClearBtn();
			lc.VerifyMyerpLCSubmitBtn();
		
		}
	}