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
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//		LpgTestBase.driver.close();
	}

	@Test
	public void DBCtest() throws InterruptedException{
		DBCForm d=new DBCForm(LpgTestBase.driver);
		d.setup(driver);
		
		/*d.verifyMyerpagancycode();
		d.verifyMyerpusrname();
		d.verifyMyerppassword();
		 * d.verifyMyerploginbtn();
		 */
		
		  d.verifyMyerpCounterSales();
		  d.verifyMyerpClickDbc();
		  d.verifyMyerpConsumerNumber(); 
		  d.verifyMyerpSearchbtn();
		  d.verifyMyerpSVNumber(); 
		  d.ModofPayment();
		  d.verifyMyerpCashPayment();
		  d.verifyMyerpProduct();
		  d.verifyMyerpQuantity();
		  d.verifyMyerpUnitcost();
		  d.verifyMyerpSubmitbtn();
		  d.verifyMyerpViewReport(); 
		  d.verifyMyerpPrint();
		 

		d.verifyMyerpCounterSales();
		d.verifyMyerpClickDbc();
		d.verifyMyerpUpdateDBC();
		d.verifyMyerpDOCNO();
		d.verifyMyerpGetDataBtn();
		d.verifyMyerpUpdateDBCBtn();
		d.verifyMyerpUPrint();
		d.verifyMyerpUViewReport();

		d.VerifyandClickonMyerpGeneralReport();
		d.VerifyandClickonMyerpConterInvoiceDetails();
		d.verifyMyerpSelectCompany();
		d.VerifyandClickonMyerpCounterSaleVoucherNumber();
		d.VerifyandClickonMyerpGetdataBtn();
		d.VerifyandClickonMyerpPrintInvoiceBtn();

		d.VerifyandClickonMyerpGeneralReport();
		d.VerifyandClickonMyerpCountersaleRegister();
		d.VerifyandClickonMyerpPlaseFromSelectDate();
		d.verifyMyerpSelectCompany();
		d.verifyMyerpSelectPaymentMode();
		d.VerifyandClickonMyerpConsumerNumber();
		d.VerifyandClickonMyerpGetdataBtn();



	}
}
