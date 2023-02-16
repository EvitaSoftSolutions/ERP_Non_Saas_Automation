package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.UpdatedCommercialDelivery;

public class UpdatedCommercialDeliveryTest  extends LpgTestBase{

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
	public void UpdatedCommercialDeliveryPageTest() throws InterruptedException {
		UpdatedCommercialDelivery ucd=new  UpdatedCommercialDelivery(LpgTestBase.driver); 

		
		
		/*
		 * ucd.verifyMyerpagancycode(); ucd.verifyMyerpUserid();
		 * ucd.verifyMyerpPassword(); ucd.VerifyandClickonMyerpLoginBtn();
		 */
		ucd.setup(driver);
		ucd.VerifyandClickonMyerpGodownTransactionModule();
		ucd.VerifyandClickonMyerpGTUpdatedCommercialDeliveryForm();
		ucd.VerifyandClickonMyerpUCDGetDataBtn();
		ucd.VerifyMyerpUSelectGodown();
		ucd.VerifyandClickonMyerpGTSelectProduct();
		ucd.VerifyandClickonMyerpUCDFullCylTxtbox();
		ucd.VerifyandClickonMyerpUCDEmptyCylTxtbox();
		ucd.VerifyandClickonMyerpUCDSVCylTextbox();
		ucd.VerifyandClickonMyerpUCDSubmitBtn();
		ucd.VerifyMyerpGenralReportModule();
		ucd.VerifyMyerpDailyComplaintReport();
		ucd.VerifyMyerpSelectDate();
		ucd.verifyMyerpSelectGodown();
		ucd.VerifyandClickonMyerpGetDataBtn();
		ucd.VerifyandClickonMyerpReportSearchBarBtn();
		ucd.VerifyandClickonMyerpFindBtn();





	}
}
