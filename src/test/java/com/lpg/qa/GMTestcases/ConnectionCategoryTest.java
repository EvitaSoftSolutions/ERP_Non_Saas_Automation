package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.ConnectionCategoryForm;


public class ConnectionCategoryTest extends LpgTestBase{

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
	public void ConnectionCategorytest() throws InterruptedException{
		ConnectionCategoryForm cc = new ConnectionCategoryForm(LpgTestBase.driver); 
		cc.verifyMyerpagancycode();
		cc.verifyMyerpusrname();
		cc.verifyMyerppassword();
		cc.verifyMyerploginbtn();
		cc.verifyMyerpMasterModule();
		cc.verifyMyerpGeneralMaster();
		cc.verifyMyerpPageNavigation1();
		cc.verifyMyerpPageNavigation2();
		cc.verifyMyerpConnectionCategory();
		cc.verifyMyerpCategoryName();
		cc.verifyMyerpCkkactivebtn();
		cc.verifyMyerpClearbutton();
		cc.verifyMyerpCategoryName1();
		cc.verifyMyerpCkkactivebtn1();
		cc.verifyMyerpSubmitbutton();
		cc.verifyMyerpOKButton();
		cc.VerifyandClickonPSearchbar1();
		cc.verifyMyerpEditbutton();
		cc.verifyMyerpConfirmbutton();
		cc.verifyMyerpUpdateCategory();
		cc.verifyMyerpUpdatebtn();
		cc.verifyMyerpupdateokbtn();
		cc.verifyMyerpexportbtn();
		cc.VerifyandClickonPSearchbar2();
		
	}

}
