package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.UserAccessform;



public class UserAccesstest extends LpgTestBase{

	WebDriver driver;

	// Open browser ==> Test Registration page ==> ==>close the browser.
	
	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
//		TestBase.driver.close();
	}
	
	@Test
	public void UserAccessPageTest() throws InterruptedException{
		UserAccessform ua = new UserAccessform(LpgTestBase.driver);
		/*
		 * ua.verifyMyerpagancycode(); ua.verifyMyerpusrname();
		 * ua.verifyMyerppassword(); ua.verifyMyerploginbtn();
		 */
		ua.setup(driver);
		ua.verifyMyerpMasterModule();
		ua.verifyMyerpGeneralMaster();
		ua.verifyMyerpPageNavigation();
		ua.verifyMyerpUserAccessForm();
		ua.verifyMyerpSelectusername();
		ua.verifyMyerpGetDataBtn();
		ua.verifyMyerpChektax1();
		ua.verifyMyerpChecktax2();
		ua.verifyMyerpChecktax3();
		ua.verifyMyerpChecktax4();
		ua.verifyMyerpChecktax5();
		ua.verifyMyerpSubmitbtn();
		ua.verifyMyerpSelectusername1();
		ua.verifyMyerpGetDataBtn1();
		
	}
}
