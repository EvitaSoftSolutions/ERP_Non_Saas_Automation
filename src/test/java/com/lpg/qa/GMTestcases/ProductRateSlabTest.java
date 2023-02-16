package com.lpg.qa.GMTestcases;



	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.ProductRateSlab;
	

	public class ProductRateSlabTest   extends LpgTestBase{

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
		public void LoginPageTest() throws InterruptedException {
			ProductRateSlab ps=new ProductRateSlab(LpgTestBase.driver); 
			ps.verifyMyerpagancycode();
			ps.verifyMyerpUserid();
			ps.verifyMyerpPassword();
			ps.VerifyandClickonMyerpLoginBtn();
			ps.VerifyMyerpMasterModule();
			ps.VerifyMyerpGenralMasterModule();
			ps.VerifyMyerpProductRSlab();
			ps.setselectproduct();
			ps.setselectarea();
		    ps.VerifyMyerpPurchaseRate();
		    ps.VerifyMyerpPurchaseMRP();
		    ps.VerifyMyerpPurchasDeposit();
		   // ps.VerifyMyerpProductDate1();
		    ps.selectcompany();
		    ps.VerifyMyerpProductActiveBtn();
		    ps.VerifyMyerpProductClearBtn();
		    ps.setselectproduct1();
			ps.setselectarea1();
		    ps.VerifyMyerpPurchaseRate1();
		    ps.VerifyMyerpPurchaseMRP1();
		    ps.VerifyMyerpPurchasDeposit1();
		    ps.VerifyMyerpProductDate();
		    ps.selectcompany1();
		    ps.VerifyMyerpProductActiveBtn1();
		    ps.VerifyMyerpProductSubmitBtn();
            ps.VerifyandClickonPSearchbar();
		    ps.VerifyMyerpProductEditBtn();
		    ps.VerifyMyerpPYesUpdateBtnBtn();
		    ps.VerifyMyerpPurchaseRate2();
		    ps.VerifyMyerpPurchaseMRP2();
		    ps.VerifyMyerpProductUpdateBtn();
		    ps.VerifyandClickonPSearchbar2();
		    ps.VerifyMyerpPRSExportBtn();
		   
		    
		} 
	}

