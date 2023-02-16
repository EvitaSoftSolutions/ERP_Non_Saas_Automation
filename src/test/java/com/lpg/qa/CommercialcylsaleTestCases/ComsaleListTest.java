package com.lpg.qa.CommercialcylsaleTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.commercialcylsale.ComsaleListForm;



public class ComsaleListTest extends LpgTestBase{

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
	public void ComsaleListtest() throws InterruptedException{
		ComsaleListForm csl= new ComsaleListForm(LpgTestBase.driver);
		csl.verifyMyerpagancycode();
		csl.verifyMyerpusrname();
		csl.verifyMyerppassword();
		csl.verifyMyerploginbtn();
		csl.verifyMyerpCommercialcylsale();
		csl.verifyMyerpComsalelist();
		csl.Deliverymanname();
		csl.verifyMyerpSubmitbtn();
		csl.verifyMyerpEditbtn();
		csl.verifyMyerpDelete();
		
	}
}
