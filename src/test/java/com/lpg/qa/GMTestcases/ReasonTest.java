package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.ReasonForm;



public class ReasonTest extends LpgTestBase{

	WebDriver driver;

	// Open browser ==> Test Registration page ==> ==>close the browser.
	
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
//		TestBase.driver.close();
	}
	
	@Test
	public void Reasontest() throws InterruptedException{
		ReasonForm re = new ReasonForm(LpgTestBase.driver);
		re.verifyMyerpagancycode();
		re.verifyMyerpusrname();
		re.verifyMyerppassword();
		re.verifyMyerploginbtn();
		re.verifyMyerpMasterModule();
		re.verifyMyerpGeneralMaster();
		re.verifyMyerpPageNavigation1();
		re.verifyMyerpPageNavigation2();
		re.verifyMyerpReasonopn();
		re.verifyMyerpReasonName();
		re.verifyMyerpResonDescription();
		re.verifyMyerpCheckActivebtn();
		re.verifyMyerpClearbtn();
		re.verifyMyerpReasonName1();
		re.verifyMyerpResonDescription1();
		re.verifyMyerpCheckActivebtn1();
		re.verifyMyerpSubmitbtn();
		re.verifyMyerpokbuttonclick();
		re.VerifyandClickonPSearchbar1();
		re.verifyMyerpEditbtn();
		re.verifyMyerpConfirmbtn();
		re.verifyMyerpReasonName2();
		re.verifyMyerpResonDescription2();
		re.verifyMyerpUpdatebtn();
		re.verifyMyerpupdateokbtn();
		//re.verifyMyerpexportbtn();
		re.VerifyandClickonPSearchbar2();
	
	}
}
