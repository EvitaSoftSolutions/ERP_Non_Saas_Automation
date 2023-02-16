package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.PartialPurchase;



public class PartialPurchaseTest extends LpgTestBase{

			WebDriver driver;
		   
			@BeforeClass
			public void setup() {
				driver=intializeBrowser("chrome");
			}
			
			@AfterClass
			public void teardown() {
			//	LpgTestBase.driver.close();
			}	
			
			@Test
			public void PartialPurchasePageTest() throws InterruptedException {
				PartialPurchase pp=new  PartialPurchase(LpgTestBase.driver); 
				
				pp.setup(driver);
				pp.VerifyandClickonMyerpGodownTransactionModule();
				pp.VerifyandClickonMyerpGTPartialPurchaseForm();
				pp.VerifyandClickonMyerpGTPPInvoiceNumber();
				pp.VerifyandClickonMyerpGTPPErvNumber();
				pp.VerifyMyerpPPSelectGodown();
				pp.VerifyMyerpPPSelectVehicle();
				pp.VerifyandClickonMyerpGTPPProduct();
				pp.VerifyandClickonMyerpGTPPQauntity();
				pp.VerifyandClickonMyerpGTPPLost();
				pp.VerifyandClickonMyerpGTPPDefective();
				pp.VerifyandClickonMyerpGTPPSubmitBtn();
				pp.VerifyandClickonMyerpGTAccepteLoadForm();
				pp.VerifyandClickonMyerpGTAccepteLoadInvoceNum();
				pp.VerifyandClickonMyerpGTSearchInvoceNum();
				
				
				
			
				 
				 }
		}
