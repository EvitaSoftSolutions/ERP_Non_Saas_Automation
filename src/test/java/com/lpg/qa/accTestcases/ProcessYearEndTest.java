package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.ProcessYearEnd;


public class ProcessYearEndTest extends LpgTestBase{

	WebDriver driver;

	// Open browser ==> Test Registration page ==> close the browser.
	
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
//		TestBase.driver.close();
	}
	
	@Test
	public void ProcessYearEndPageTest() throws InterruptedException{
		ProcessYearEnd pm=new ProcessYearEnd(LpgTestBase.driver);
		pm.verifyMyerpagancycode();
		pm.verifyMyerpusrname();
		pm.verifyMyerppassword();
		pm.verifyMyerploginbtn();
		pm.verifyMyerpMaster();
		pm.verifyMyerpAccountMaster();
		pm.verifyMyerPageNav();
		pm.verifyMyerpProcessYearEndForm();
		pm.verifyMyerpSelecctYear();
		pm.verifyMyerpCloseyear();
		pm.verifyMyerpSelecctYear();
		pm.verifyMyerpClearBtn();
		
		
		
	}
}