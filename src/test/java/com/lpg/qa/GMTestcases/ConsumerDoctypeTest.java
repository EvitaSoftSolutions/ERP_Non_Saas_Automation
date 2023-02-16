package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.ConsumerDoctypeForm;

public class ConsumerDoctypeTest extends LpgTestBase{

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
	public void ConsumerDoctypetest() throws InterruptedException{
		ConsumerDoctypeForm cdt = new ConsumerDoctypeForm(LpgTestBase.driver); 
		cdt.verifyMyerpagancycode();
		cdt.verifyMyerpusrname();
		cdt.verifyMyerppassword();
		cdt.verifyMyerploginbtn();
		cdt.verifyMyerpMasterModule();
		cdt.verifyMyerpGeneralMaster();
		cdt.verifyMyerpPageNavigation1();
		cdt.verifyMyerpPageNavigation2();
		cdt.verifyMyerpconsumerdoclogin();
		cdt.verifyMyerpdoctypename();
		cdt.verifyMyerpCheckactbtn();
		cdt.verifyMyerpClearbtn();
		cdt.verifyMyerpdoctypename1();
		cdt.verifyMyerpCheckactbtn1();
		cdt.verifyMyerpsubmitbtn();
		cdt.verifyMyerpOkBtnclick();
		cdt.VerifyandClickonPSearchbar1();
		cdt.verifyMyerpEditbutton();
		cdt.verifyMyerpConfirmBtnClick();
		cdt.verifyMyerpChengeName();
		cdt.verifyMyerpClickckecbox();
		cdt.verifyMyerpUpdatebtn();
		cdt.verifyMyerpupdateokbtn();
		cdt.verifyMyerpexportbtn();
		cdt.VerifyandClickonPSearchbar2();
		
	}
}
