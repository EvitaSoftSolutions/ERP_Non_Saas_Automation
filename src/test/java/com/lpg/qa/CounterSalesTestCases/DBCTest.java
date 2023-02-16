package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.DBCForm;


public class DBCTest extends LpgTestBase{

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
	public void DBCtest() throws InterruptedException{
		DBCForm d=new DBCForm(LpgTestBase.driver);
		d.verifyMyerpagancycode();
		d.verifyMyerpusrname();
		d.verifyMyerppassword();
		d.verifyMyerploginbtn();
		d.verifyMyerpCounterSales();
		d.verifyMyerpClickDbc();
		d.verifyMyerpConsumerNumber();
		d.verifyMyerpSearchbtn();
		d.verifyMyerpSVNumber();
		d.ModofPayment();
		d.verifyMyerpCashPayment();
		d.verifyMyerpProduct();
		d.verifyMyerpUnitcost();
		d.verifyMyerpSubmitbtn();
		
	}
}
