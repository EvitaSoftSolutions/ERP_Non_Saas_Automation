package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.Territory;


public class TerritoryTest  extends LpgTestBase{

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
		public void TerritoryPageTest() throws InterruptedException {
			Territory tt=new Territory(LpgTestBase.driver); 
			tt.verifyMyerpagancycode();
			tt.verifyMyerpUserid();
			tt.verifyMyerpPassword();
			tt.VerifyandClickonMyerpLoginBtn();
			tt.VerifyMyerpMasterModule();
			tt.VerifyMyerpGenralMasterModule();
			tt.VerifyTerritoryform();
	        tt.VerifyTerritoryName1();
			tt.VerifyTerritoryDescription1();
			tt.VerifyandClickonTActiveBtn1();
			tt.VerifyandClickonClearBtn();
			tt.VerifyTerritoryName(); 
			tt.VerifyTerritoryDescription();
			tt.VerifyandClickonTActiveBtn();
			tt.VerifyandClickonSubmitBtn();
			tt.VerifyandClickonTsubmitokbtn(); 
			tt.VerifyandClickonTSearchbar();
			tt.VerifyandClickonTeditbtn();
			tt.VerifyandClickonTtyesupdateitbtn();
			tt.VerifyTerritoryDescription2();
			tt.VerifyandClickonTupdatebtn();
			tt.VerifyandClickontupdateokbtn();
			tt.VerifyandClickonTExportbtn();
			tt.VerifyandClickonTSearchbar2();
			
		   } 
	}


