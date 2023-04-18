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
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//		TestBase.driver.close();
	}

	@Test
	public void ComsaleListtest() throws InterruptedException{
		ComsaleListForm csl= new ComsaleListForm(LpgTestBase.driver);
		/*
		 * csl.verifyMyerpagancycode(); csl.verifyMyerpusrname();
		 * csl.verifyMyerppassword(); csl.verifyMyerploginbtn();
		 */
		csl.setup(driver);

		csl.verifyMyerpCommercialcylsale(); 
		csl.verifyMyerpComsalelist();
		csl.verifyMyerpComsaleDate(); 
		csl.Deliverymanname();
		csl.verifyMyerpSubmitbtn();
		csl.verifyMyerpRECEditbtn();
		csl.verifyMyerpEChallanno(); 
		csl.verifyMyerpEListEmptycylReceived();
		csl.verifyMyerpSubmitbtn2();

	/*csl.verifyMyerpCommercialcylsale();
		csl.verifyMyerpComsalelist();
		csl.verifyMyerpComsaleDate();
		csl.Deliverymanname();
		csl.verifyMyerpSubmitbtn();
		csl.verifyMyerpCSEditbtn();
		csl.verifyMyerpEListEmptycylReceived();
		csl.verifyMyerpCashamount();
		csl.verifyMyerpSubmitbtn2();
	*/

	}
}
