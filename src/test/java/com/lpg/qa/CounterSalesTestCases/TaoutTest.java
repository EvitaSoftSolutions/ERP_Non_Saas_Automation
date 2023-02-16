package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.TaoutForm;



public class TaoutTest extends LpgTestBase{

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
	public void Taouttest() throws InterruptedException{
		TaoutForm to=new TaoutForm(LpgTestBase.driver);
		to.verifyMyerpagancycode();
		to.verifyMyerpusrname();
		to.verifyMyerppassword();
		to.verifyMyerploginbtn();
		to.verifyMyerpCounterSales();
		to.verifyMyerpTaout();
		to.verifyMyerpConsumerno();
		to.verifyMyerpSerchbtn();

	}
}
