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
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//	TestBase.driver.close();
	}


	@Test
	public void LoginPageTest() throws InterruptedException {
		ProductRateSlab ps=new ProductRateSlab(LpgTestBase.driver); 
		/*
		 * ps.verifyMyerpagancycode(); ps.verifyMyerpUserid(); ps.verifyMyerpPassword();
		 * ps.VerifyandClickonMyerpLoginBtn();
		 */
		ps.setup(driver);
		ps.VerifyMyerpMasterModule();
		ps.VerifyMyerpGenralMasterModule();
		ps.VerifyMyerpProductRSlab();
		ps.setselectproduct();
		ps.setselectarea();
		ps.VerifyMyerpPurchaseRate();
		ps.VerifyMyerpPurchaseMRP();
		ps.VerifyMyerpPurchasDeposit();
		ps.VerifyMyerpProductDate1();
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
		ps.setselectproduct2();
		ps.setselectarea2();
		ps.VerifyMyerpPurchaseRate2();
		ps.VerifyMyerpPurchaseMRP2();
		ps.VerifyMyerpPurchasDeposit2();
		ps.VerifyMyerpProductDate2();
		ps.selectcompany2();
		ps.VerifyMyerpProductActiveBtn2();
		ps.VerifyMyerpProductSubmitBtn2();
		ps.setselectproduct3();
		ps.setselectarea3();
		ps.VerifyMyerpPurchaseRate3();
		ps.VerifyMyerpPurchaseMRP3();
		ps.VerifyMyerpPurchasDeposit3();
		ps.VerifyMyerpProductDate3();
		ps.selectcompany3();
		ps.VerifyMyerpProductActiveBtn3();
		ps.VerifyMyerpProductSubmitBtn3();
		ps.setselectproduct4();
		ps.setselectarea4();
		ps.VerifyMyerpPurchaseRate4();
		ps.VerifyMyerpPurchaseMRP4();
		ps.VerifyMyerpPurchasDeposit4();
		ps.VerifyMyerpProductDate4();
		ps.selectcompany4();
		ps.VerifyMyerpProductActiveBtn4();
		ps.VerifyMyerpProductSubmitBtn4();
		ps.setselectproduct5();
		ps.setselectarea5();
		ps.VerifyMyerpPurchaseRate5();
		ps.VerifyMyerpPurchaseMRP5();
		ps.VerifyMyerpPurchasDeposit5();
		ps.VerifyMyerpProductDate5();
		ps.selectcompany5();
		ps.VerifyMyerpProductActiveBtn5();
		ps.VerifyMyerpProductSubmitBtn5();
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

