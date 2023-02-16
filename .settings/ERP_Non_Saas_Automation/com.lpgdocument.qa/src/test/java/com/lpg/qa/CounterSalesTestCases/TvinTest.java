package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.TvinForm;


public class TvinTest extends LpgTestBase{

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
	public void Tvintest() throws InterruptedException{
		TvinForm tv=new TvinForm(LpgTestBase.driver);
		tv.verifyMyerpagancycode();
		tv.verifyMyerpusrname();
		tv.verifyMyerppassword();
		tv.verifyMyerploginbtn();
		tv.verifyMyerpCounterSales();
		tv.verifyMyerpTvinlogin();
		tv.verifyMyerpInvoiceno();
		tv.verifyMyerpConsumergstin();
		tv.verifyMyerpDocumentserialno();
		tv.verifyMyerpSvno();
		tv.verifyMyerpconsumerno();
		tv.SelectConsumertype();
		tv.SelectArea();
		tv.Connectioncategory();
		tv.verifyMyerpRegistrationno();
		tv.verifyMyerpconsumername();
		tv.verifyMyerpAdress();
		tv.verifyMyerpEntercity();
		tv.verifyMyerpContact();
		tv.verifyMyerpEmail();
		tv.verifyMyerpPredistibutorcode();
		tv.verifyMyerpPreconsumerno();
		tv.Predocumenttype();
		tv.verifyMyerpPreoilcompany();
		tv.verifyMyerpBluebookno();
		tv.Modeofpayment();
		tv.verifyMyerpCashAmount();
		tv.verifyMyerpProduct();
		tv.verifyMyerpQuantity();
		tv.verifyMyerpUnitcost();
		tv.verifyMyerpClearbtn();
		tv.verifyMyerpInvoiceno1();
		tv.verifyMyerpConsumergstin1();
		tv.verifyMyerpDocumentserialno1();
		tv.verifyMyerpSvno1();
		tv.verifyMyerpconsumerno1();
		tv.SelectConsumertype1();
		tv.SelectArea1();
		tv.Connectioncategory1();
		tv.verifyMyerpRegistrationno1();
		tv.verifyMyerpconsumername1();
		tv.verifyMyerpAdress1();
		tv.verifyMyerpEntercity1();
		tv.verifyMyerpContact1();
		tv.verifyMyerpEmail1();
		tv.verifyMyerpPredistibutorcode1();
		tv.verifyMyerpPreconsumerno1();
		tv.Predocumenttype1();
		tv.verifyMyerpPreoilcompany1();
		tv.verifyMyerpBluebookno1();
		tv.Modeofpayment1();
		tv.verifyMyerpCashAmount1();
		tv.verifyMyerpProduct1();
		tv.verifyMyerpQuantity1();
		tv.verifyMyerpUnitcost1();
		tv.verifyMyerpSubmitbtn();
		
	}
}
