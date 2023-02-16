package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.TvTypeform;

public class TvTypeTest extends LpgTestBase{

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
	public void TvTypetest() throws InterruptedException{
		TvTypeform tv = new TvTypeform(LpgTestBase.driver);
		tv.verifyMyerpagancycode();
		tv.verifyMyerpusrname();
		tv.verifyMyerppassword();
		tv.verifyMyerploginbtn();
		tv.verifyMyerpMasterModule();
		tv.verifyMyerpGeneralMaster();
		tv.verifyMyerpPageNavigation1();
		tv.verifyMyerpPageNavigation2();
		tv.verifyMyerpTVTypeMaster();
		tv.verifyMyerpTVTypeName();
		tv.verifyMyerpChkactive();
		tv.verifyMyerpClearbtn();
		tv.verifyMyerpTVTypeName1();
		tv.verifyMyerpChkactive1();
		tv.verifyMyerpSubmitbtn();
        tv.verifyMyerpOKButton();
        tv.VerifyandClickonPSearchbar1();
        tv.verifyMyerpEditbtn();
        tv.verifyMyerpConfirmbtn();
        tv.verifyMyerptvname2();
        tv.verifyMyerpChkactive2();
        tv.verifyMyerpUpdateButton();
        tv.verifyMyerpupdateokbtn();
        tv.verifyMyerpexportbtn();
        tv.VerifyandClickonPSearchbar2();
		
		
		
	
		
	}
}
