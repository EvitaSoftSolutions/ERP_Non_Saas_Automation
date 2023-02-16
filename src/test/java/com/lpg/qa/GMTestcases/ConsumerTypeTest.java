package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.ConsumerTypeForm;


public class ConsumerTypeTest extends LpgTestBase{

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
	public void ConsumerTypetest() throws InterruptedException{
		ConsumerTypeForm ct = new ConsumerTypeForm(LpgTestBase.driver); 
		ct.verifyMyerpagancycode();
		ct.verifyMyerpusrname();
		ct.verifyMyerppassword();
		ct.verifyMyerploginbtn();
		ct.verifyMyerpMasterModule();
		ct.verifyMyerpGeneralMaster();
		ct.verifyMyerpPageNavigation1();
		ct.verifyMyerpPageNavigation2();
		ct.verifyMyerpConsumertype();
		ct.verifyMyerpConsuTyname();
		ct.verifyMyerpConsumerTypeshortname();
		ct.verifyMyerpCheckbutton();
		ct.verifyMyerpClearbutton();
		ct.verifyMyerpConsuTyname();
		ct.verifyMyerpConsumerTypeshortname();
		ct.verifyMyerpCheckbutton();
		ct.verifyMyerpSubmitButton();
		ct.verifyMyerpOKButton();
		ct.VerifyandClickonPSearchbar1();
		ct.verifyMyerpEditButton();
		ct.verifyMyerpConfirmbutton();
		ct.verifyMyerpChengeName();
		ct.verifyMyerpSotname();
		ct.verifyMyerpUpdatebtn();
		ct.verifyMyerpupdateokbtn();
		ct.verifyMyerpexportbtn();
		ct.VerifyandClickonPSearchbar2();
		
	}
}
