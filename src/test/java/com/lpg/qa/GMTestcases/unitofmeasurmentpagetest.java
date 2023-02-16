package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.unitofmeasurementpageform;


public class unitofmeasurmentpagetest extends LpgTestBase{

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
	public void UnitofmeasurmentpageTest() throws InterruptedException{
		unitofmeasurementpageform um = new unitofmeasurementpageform(LpgTestBase.driver);
		um.verifyMyerpagancycode();
		um.verifyMyerpusrname();
		um.verifyMyerppassword();
		um.verifyMyerploginbtn();
		um.verifyMyerpMasterModule();
		um.verifyMyerpGeneralMaster();
		um.verifyMyerpUnitofMeasurment();
		um.verifyMyerpUnitName();
		um.verifyMyerpUnitShortName();
		um.verifyMyerpUnitDescription();
		um.verifyMyerpUnitActivbtn();
		um.verifyMyerpClearbutton();
		um.verifyMyerpUnitName();
		um.verifyMyerpUnitShortName();
		um.verifyMyerpUnitDescription();
		um.verifyMyerpUnitActivbtn();
		um.verifyMyerpSubmitbtn();
		um.verifyMyerpOKButton();
		um.VerifyandClickonPSearchbar1();
		um.verifyMyerpEditbutton();
		um.verifyMyerpConfirmbutton();
		um.verifyMyerpUnitName1();
		um.verifyMyerpUnitDescription1();
		um.verifyMyerpUnitShortName1();
		um.verifyMyerpUpdatebtn();
		um.verifyMyerpupdateokbtn();
		um.verifyMyerpexportbtn();
		um.VerifyandClickonPSearchbar2();
		
	}
}
