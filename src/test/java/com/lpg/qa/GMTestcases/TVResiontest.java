package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.TVResionForm;


public class TVResiontest extends LpgTestBase{

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
	public void TVResionTest() throws InterruptedException{
		TVResionForm tr = new TVResionForm(LpgTestBase.driver);
		tr.verifyMyerpagancycode();
		tr.verifyMyerpusrname();
		tr.verifyMyerppassword();
		tr.verifyMyerploginbtn();
		tr.verifyMyerpMasterModule();
		tr.verifyMyerpGeneralMaster();
		tr.verifyMyerpPageNavigation1();
		tr.verifyMyerpPageNavigation2();
		tr.verifyMyerpTvreason();
		tr.verifyMyerpTvReasionName();
		tr.verifyMyerpChkactivebtn();
		tr.verifyMyerpClearbtn();
		tr.verifyMyerpTvreasionname();
		tr.verifyMyerpChkActivebtn();
		tr.verifyMyerpSubmitbtn();
		tr.verifyMyerpOKButton();
		tr.VerifyandClickonPSearchbar1();
		tr.verifyMyerpEditbtn();
		tr.verifyMyerpConfirmbtn();
		tr.verifyMyerpTxtTvresionname1();
		tr.verifyMyerpChkactivebtn1();
		tr.verifyMyerpUpdatebtn();
		tr.verifyMyerpupdateokbtn();
		tr.verifyMyerpexportbtn();
		tr.VerifyandClickonPSearchbar2();
		
		
	}
}
