package com.lpg.qa.CommercialcylsaleTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.commercialcylsale.CommCreCylListForm;


public class CommCreCylListTest extends LpgTestBase{

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
	public void CommCreCylListtest() throws InterruptedException{
		CommCreCylListForm ccl= new CommCreCylListForm(LpgTestBase.driver);
		ccl.verifyMyerpagancycode();
		ccl.verifyMyerpusrname();
		ccl.verifyMyerppassword();
		ccl.verifyMyerploginbtn();
		ccl.verifyMyerpCommercialcylsale();
		ccl.verifyMyerpListcomcret();
		ccl.Ddlparty();
		ccl.verifyMyerpGetData();
		
		
		
	
	
	}
}
