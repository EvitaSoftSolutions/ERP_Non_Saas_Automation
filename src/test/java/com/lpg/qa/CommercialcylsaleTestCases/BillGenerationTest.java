package com.lpg.qa.CommercialcylsaleTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.commercialcylsale.BillGenerationForm;



public class BillGenerationTest extends LpgTestBase{

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
	public void BillGenerationPagetest() throws InterruptedException{
		BillGenerationForm bg= new BillGenerationForm(LpgTestBase.driver);
		/*
		 * bg.verifyMyerpagancycode(); bg.verifyMyerpusrname();
		 * bg.verifyMyerppassword(); bg.verifyMyerploginbtn();
		 */
		
		bg.setup(driver);
	 bg.verifyMyerpAccounts();

		bg.verifyMyerpBillgeneration(); bg.Billingtype();
		bg.verifyMyerpBillingdate(); bg.verifyMyerpinvoicenumber();
		//bg.verifyMyerpclearbtn(); //not working //bg.Billingtype();
		//bg.verifyMyerpBillingdate(); //bg.verifyMyerpinvoicenumber();
		bg.verifyMyerpSubmitbtn(); 

		bg.verifyMyerpAccounts();
		bg.VerifyMyerpGenralReportModule();
		bg.VerifyMyerpCommercialCylSaleRegister();
		bg.VerifyMyerpFromDate();
		bg.VerifyMyerpTodate();
		bg.verifyMyerpSelectDeliveryMan();
		bg.verifyMyerpSelectProduct();
		bg.verifyMyerpSelectParty();
		bg.VerifyandClickonMyerpGetDataBtn();


		bg.verifyMyerpCommercialcylsale();
		bg.verifyMyerpComsalelist();
		bg.verifyMyerpComsaleDate();
		bg.Deliverymanname();
		bg.verifyMyerpSubmitbtn1();
		bg.verifyMyerpCSEditbtn();
		bg.verifyMyerpCashamount();
		bg.verifyMyerpCScancelbillbtn();
		//bg.verifyMyerpCashamount();
		//bg.verifyMyerpSubmitbtn2();







	}
}
