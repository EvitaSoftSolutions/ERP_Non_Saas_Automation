package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.Godownpageform;




public class Godownpagetest extends LpgTestBase{

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
	public void GodownpageTest()  throws InterruptedException{
		Godownpageform gt= new Godownpageform(LpgTestBase.driver);
		/*
		 * gt.verifyMyerpagancycode(); gt.verifyMyerpusrname();
		 * gt.verifyMyerppassword(); gt.verifyMyerploginbtn();
		 */
		gt.setup(driver);
		gt.verifyMyerpMasterModule();
		gt.verifyMyerpGeneralMaster();
		gt.verifyMyerpPageNavigation();
		gt.verifyMyerpGodownTransaction();
		gt.verifyMyerpGodownName();
		gt.verifyMyerpGodownAddress();
		gt.verifyMyerpCheckActive();
		gt.verifyMyerpSubmitBtn();
		gt.verifyMyerpOKButton();
		gt.VerifyandClickonPSearchbar1();
		gt.verifyMyerpEditbutton();
		gt.verifyMyerpConfirmbutton();
		gt.verifyMyerpGodownAddress1();
		gt.verifyMyerpUpdatebtn();
		gt.verifyMyerpupdateokbtn();
		gt.verifyMyerpexportbtn();
		gt.VerifyandClickonPSearchbar2();
		
		
		
	

	}
}