package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.SubscriptionVoucherForm;



public class SubscriptionVoucherTest extends LpgTestBase{

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
	public void SubscriptionVouchertest() throws InterruptedException{
		SubscriptionVoucherForm sv=new SubscriptionVoucherForm(LpgTestBase.driver);

		sv.setup(driver);
		/*
		 * sv.verifyMyerpagancycode(); sv.verifyMyerpusrname();
		 * sv.verifyMyerppassword(); sv.verifyMyerploginbtn();
		 
		
		 sv.verifyMyerpCounterSales(); 
		 sv.verifyMyerpSubscriptionVoucher();
		  sv.verifyMyerpInvoiceno();
		  sv.verifyMyerpGstIn();
		  sv.verifyMyerpDomesticserno(); 
		  sv.verifyMyerpSvno();
		  sv.verifyMyerpConsumerno(); 
		  sv.SelDconsumertype();
		  sv.AreaSelect();
		  sv.ConnectionCategory(); 
		  sv.verifyMyerpRegistration();
		  sv.verifyMyerponsumerName(); 
		  sv.verifyMyerpContact();
		  sv.verifyMyerpAddress();
		  sv.verifyMyerpCity(); 
		  sv.verifyMyerpBlueBookno();
		  sv.verifyMyerpEmail();
		  sv.ModeofPayment(); 
		  sv.verifyMyerpCashAmount();
		  sv.verifyMyerpProduct(); 
		  sv.verifyMyerpClearbtn();
		  sv.verifyMyerpInvoiceno1(); 
		  sv.verifyMyerpGstIn1();
		  sv.verifyMyerpDomesticserno1(); 
		  sv.verifyMyerpSvno1();
		  sv.verifyMyerpConsumerno1(); 
		  sv.SelDconsumertype1(); 
		  sv.AreaSelect1();
		  sv.ConnectionCategory1(); 
		  sv.verifyMyerpRegistration1();
		  sv.verifyMyerponsumerName1();
		  sv.verifyMyerpContact1();
		 sv.verifyMyerpAddress1(); 
		 sv.verifyMyerpCity1(); 
		 sv.verifyMyerpBlueBookno1();
		 sv.verifyMyerpEmail1();
		 sv.ModeofPayment1(); 
		 sv.verifyMyerpCashAmount1();
		 sv.verifyMyerpProduct1(); 
		 sv.verifyMyerpUnitcost();
		 sv.verifyMyerpSubmitbtn(); 
		 //sv.verifyMyerpPrint();*/
		// sv.verifyMyerpViewReport();

		sv.verifyMyerpCounterSales();
		sv.verifyMyerpSubscriptionVoucher();
		sv.verifyMyerpUpdateSunscriptionVoucherForm();
		sv.verifyMyerpDocumentno();  
		sv.verifyMyerpGetDataBtn();
		sv.verifyMyerpremoveservice3();
		sv.verifyMyerpremoveservice4();
		/*sv.verifyMyerpUTXTSERVICE3();
		sv.verifyMyerpUTXTSERVICE4();
		sv.verifyMyerpUTXTUNITCost3();
		sv.verifyMyerpUTXTUNITCost4();
		*/
		sv.verifyMyerpUpdatesubmitBtn();
		//sv.verifyMyerpDeleteBtn();

		sv.VerifyandClickonMyerpGeneralReport();
		sv.VerifyandClickonMyerpConterInvoiceDetails();
		sv.verifyMyerpSelectCompany();
		sv.VerifyandClickonMyerpCounterSaleVoucherNumber();
		sv.VerifyandClickonMyerpGetdataBtn();
	//	sv.VerifyandClickonMyerpPrintInvoiceBtn();

	//    sv.VerifyandClickonMyerpGeneralReport(); 
		sv.VerifyandClickonMyerpCountersaleRegister();
		sv.VerifyandClickonMyerpPlaseFromSelectDate();
		sv.VerifyandClickonMyerpPlaseToSelectDate();
		sv.verifyMyerpSelectCompany();
		sv.verifyMyerpSelectPaymentMode();
	    sv.VerifyandClickonMyerpConsumerNumber();
		sv.VerifyandClickonMyerpGetdataBtn();
	}

}
