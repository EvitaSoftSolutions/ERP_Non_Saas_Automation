package com.lpg.deliveycashcollectionTestcase;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.deliverycashcollection.DomesticCash;


 public class DomesticCashTest extends LpgTestBase{

			WebDriver driver;
		   
			@BeforeClass
			public void setup() {
				intializeBrowser("chrome");
			}
			
			@AfterClass
			public void teardown() {
			//	TestBase.driver.close();
			}	
			
			@Test
			public void DomesticCashPageTest() throws InterruptedException {
				DomesticCash dcc=new  DomesticCash(LpgTestBase.driver); 
				
				dcc.verifyMyerpagancycode();
				dcc.verifyMyerpUserid();
				dcc.verifyMyerpPassword();
				dcc.VerifyandClickonMyerpLoginBtn();
				dcc.VerifyandClickonMyerpDeliveryCashCollectionModule();
				dcc.VerifyandClickonMyerpDomesticCashForm();
				dcc.VerifyandClickonMyerpDCCalender();
				dcc.VerifyandClickonDCMyerpGetDataBtn();
				dcc.VerifyandClickonMyerpDCSelectBtn();
				dcc.VerifyandClickonMyerpDCInvoiceNumber();
				dcc.VerifyandClickonMyerpDCConsumerNumber();
				dcc.VerifyandClickonMyerpDCCashReceivedAmount();
				dcc.VerifyandClickonMyerpDCCancelBtn();
				dcc.VerifyandClickonMyerpDCSelectBtn();
				dcc.VerifyandClickonMyerpDCInvoiceNumber();
				dcc.VerifyandClickonMyerpDCConsumerNumber();
				dcc.VerifyandClickonMyerpDCCashReceivedAmount();
			//	dcc.VerifyandClickonMyerpDCSaveBtn();
			//	dcc.VerifyandClickonMyerpDCExportBtn();
			//  dcc.VerifyandClickonMyerpDCSelectBtn();
			//	dcc.VerifyandClickonMyerpDCInvoiceNumber();
			//	dcc.VerifyandClickonMyerpDCConsumerNumber();
			//	dcc.VerifyandClickonMyerpDCCashReceivedAmount();
				dcc.VerifyandClickonMyerpDCDeleteBtn();
				
				
			
				
			
				 
				 }
		}
