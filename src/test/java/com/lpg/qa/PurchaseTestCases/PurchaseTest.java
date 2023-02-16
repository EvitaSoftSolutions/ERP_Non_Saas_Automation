package com.lpg.qa.PurchaseTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.PurchasePages.PurchaseForme;


public class PurchaseTest extends LpgTestBase{

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
	public void Purchasetest() throws InterruptedException{
		PurchaseForme p=new PurchaseForme(LpgTestBase.driver);
		p.verifyMyerpagancycode();
		p.verifyMyerpusrname();
		p.verifyMyerppassword();
		p.verifyMyerploginbtn();
		p.verifyMyerpPurchaseModule();
		p.verifyMyerpPurchase();
		p.CompSelect1();
		p.verifyMyerpInvoiceNumber1();
		p.verifyMyerERVnumber1();
		p.SelGodown1();
		p.Supplierid1();
		p.verifyMyerpDeleveryAddress1();
		p.verifyMyerpSipmdocno1();
		p.verifyMyerpDeliveryNumber1();
		p.VehicleSelect1();
		p.verifyMyerpNarration1();
		p.verifyMyerpAccount1();
		p.verifyMyerpProduct1();
		p.verifyMyerpClearbtn();
		p.CompSelect();
		p.verifyMyerpInvoiceNumber();
		p.verifyMyerERVnumber();
		p.SelGodown();
		p.Supplierid();
		p.verifyMyerpDeleveryAddress();
		p.verifyMyerpSipmdocno();
		p.verifyMyerpDeliveryNumber();
		p.VehicleSelect();
		p.verifyMyerpNarration();
		p.verifyMyerpAccount();
		p.verifyMyerpProduct();
		p.verifyMyerpQTY();
		p.verifyMyerpSubmitbtn();
		
	}
}
