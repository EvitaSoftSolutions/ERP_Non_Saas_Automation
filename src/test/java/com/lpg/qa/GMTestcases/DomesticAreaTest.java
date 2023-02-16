package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.DomesticAreaForm;


public class DomesticAreaTest extends LpgTestBase{

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
	public void DomesticAreatest() throws InterruptedException{
		DomesticAreaForm da = new DomesticAreaForm(LpgTestBase.driver);
		da.verifyMyerpagancycode();
		da.verifyMyerpusrname();
		da.verifyMyerppassword();
		da.verifyMyerploginbtn();
		da.verifyMyerpMasterModule();
		da.verifyMyerpGeneralMaster();
		da.verifyMyerpPageNavigation1();
		da.verifyMyerpPageNavigation2();
		da.verifyMyerpDomesticArea();
		da.verifyMyerpAreaName();
		da.verifyMyerpAreaDescription();
		da.verifyMyerpCheckActivebtn();
		da.verifyMyerpClearButton();
		da.verifyMyerpAreaName1();
		da.verifyMyerpAreaDescription1();
		da.verifyMyerpCheckActivebtn1();
		da.verifyMyerpSubmitButton();
		da.verifyMyerpOkbtnclick();
		da.VerifyandClickonPSearchbar1();
		da.verifyMyerpEditbtn();
		da.verifyMyerpConfirmbtn();
		da.verifyMyerpAreaName2();
		da.verifyMyerpDescription();
		da.verifyMyerpUpdatebtn();
		da.verifyMyerpupdateokbtn();
		//da.verifyMyerpexportbtn();
		da.VerifyandClickonPSearchbar2();
		
	}
}
