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
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//	LpgTestBase.driver.close();
	}	

	@Test
	public void LedgersConfigrationPageTest() throws InterruptedException {
		LedgersConfigration lc=new LedgersConfigration(LpgTestBase.driver); 

		/*
		 * lc.verifyMyerpagancycode(); lc.verifyMyerpUserid(); lc.verifyMyerpPassword();
		 * lc.VerifyandClickonMyerpLoginBtn();
		 */
		lc.setup(driver);
		lc.VerifyMyerpMasterModule();
		lc.VerifyMyerpAccountMasterModule();
		lc.VerifyMyerpLegersConfigForm();
		lc.SelectBeyondSaleCash();
		lc.SelectBeyondSaleCash(); 
		lc.Select14KgDelivery();
		lc.SelectCGST();
		lc.SelectSGST();
		lc.SelectIGST();
		lc.SelectOutputCGST();
		lc.SelectOutputSGST();
		lc.SelectOutputIGST();
		lc.Select14KgCashSale();
		lc.Select14KgBankDeposit();
		lc.SelectCounterSaleCash();
		lc.SelectCounterSaleOnline();
		lc.SelectCounterSaleSwipe();
		lc.SelectBeyondSaleOnline();
		lc.SelectBeyondSaleSwipe();
		lc.SelectBeyondSale();
		lc.SelectPaybleToCompany();
		lc.SelectCylinderDeposit();
		lc.SelectSellDebit();
		lc.Select14KgSale();
		lc.SelectCylinderLost();
		lc.SelectDPRLost();
		lc.SelectDBTL();
		lc.SelectCommercialSaleCash();
		lc.SelectRoundOff();
		lc.SelectCommercialSale();
		lc.SelectTVOUTSUSPENSE();
		lc.SelectBPCLReceivable();
		lc.SelectDiscount();
		lc.Select14KgSaleDebit();
		//lc.VerifyMyerpLCClearBtn();
		lc.VerifyMyerpLCSubmitBtn();

	}
}