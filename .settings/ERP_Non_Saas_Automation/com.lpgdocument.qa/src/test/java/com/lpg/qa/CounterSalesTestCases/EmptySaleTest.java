package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.EmptySaleForm;


public class EmptySaleTest extends LpgTestBase{

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
	public void EmptySaletest() throws InterruptedException{
		EmptySaleForm es= new EmptySaleForm(LpgTestBase.driver);
		es.verifyMyerpagancycode();
		es.verifyMyerpusrname();
		es.verifyMyerppassword();
		es.verifyMyerploginbtn();
		es.verifyMyerpCounterSales();
		es.verifyMyerpEmptysale();
		es.verifyMyerpInvoiceno();
		es.verifyMyerpConsumerno();
		es.Consumertype();
		es.verifyMyerpConsumername();
		es.verifyMyerpContact();
		es.verifyMyerpAddress();
		es.verifyMyerpCity();
		es.verifyMyerpEmail();
		es.verifyMyerpPincode();
		es.Modeofpayment();
		es.verifyMyerpCashAmount();
		es.verifyMyerpProduct();
		es.verifyMyerpquantity();
		es.verifyMyerpClearbtn();
		es.verifyMyerpInvoiceno1();
		es.verifyMyerpConsumerno1();
		es.Consumertype1();
		es.verifyMyerpConsumername1();
		es.verifyMyerpContact1();
		es.verifyMyerpAddress1();
		es.verifyMyerpCity1();
		es.verifyMyerpEmail1();
		es.verifyMyerpPincode1();
		es.Modeofpayment1();
		es.verifyMyerpCashAmount1();
		es.verifyMyerpProduct1();
		es.verifyMyerpquantity1();
		es.verifyMyerpSubmitben();
	
	}
}
