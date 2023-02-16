package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.LoadReceivedDetailReport;


public class LoadReceivedDetailReportTest extends LpgTestBase{

	WebDriver driver;

	// Open browser ==> Test Registration page ==> close the browser.
	
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
//		TestBase.driver.close();
	}
	
	@Test
	public void LoadReceivedDetailReportPgeTest() throws InterruptedException{
		LoadReceivedDetailReport ccl= new LoadReceivedDetailReport(LpgTestBase.driver);
		ccl.verifyMyerpagancycode();
		ccl.verifyMyerpUserid();
		ccl.verifyMyerpPassword();
		ccl.VerifyandClickonMyerpLoginBtn();
		ccl.VerifyMyerpGenralReportModule();
		ccl.VerifyMyerpLoadReceivedDetailRegister();
		ccl.VerifyMyerpFromDate();
		ccl.VerifyMyerpTodate();
		ccl.VerifyandClickonMyerpGetDataBtn();
		
	}
}
