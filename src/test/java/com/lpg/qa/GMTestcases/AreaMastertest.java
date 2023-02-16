package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.AreaMasterform;

public class AreaMastertest extends LpgTestBase{

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
	public void AreaMasterTest() throws InterruptedException{
		AreaMasterform am = new AreaMasterform(LpgTestBase.driver);
		am.verifyMyerpagancycode();
		am.verifyMyerpusrname();
		am.verifyMyerppassword();
		am.verifyMyerploginbtn();
		am.verifyMyerpMasterModule();
		am.verifyMyerpGeneralMaster();
		am.verifyMyerpPageNavigation();
		am.verifyMyerpAreaMaster();
		am.verifyMyerpAreaName();
		am.verifyMyerpDescription();
		am.verifyMyerpCheckbox();
		am.verifyMyerpclearbtn();
		am.verifyMyerpAreaName1();
		am.verifyMyerpDescription1();
		am.verifyMyerpCheckbox1();
		am.verifyMyerpSubmitbtn();
		am.verifyMyerpsubmitokbtn();
		am.verifyMyerpsearchbar();
		am.verifyMyerpeditbtn();
		am.verifyMyerpeditokbtn();
		am.verifyMyerpAreaName2();
		am.verifyMyerpDescription2();
		am.verifyMyerpupdatebtn();
		am.verifyMyerpupdateokbtn();
		am.verifyMyerpexportbtn();
		am.VerifyandClickonPSearchbar2();

		
	}
}
