package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.AcceptedLoad;



		public class AcceptedLoadTest extends LpgTestBase{

			WebDriver driver;
		   
			@BeforeClass
			public void setup() {
				driver=intializeBrowser("chrome");
			}
			
			@AfterClass
			public void teardown() {
			//	TestBase.driver.close();
			}	
			
			@Test
			public void   AcceptedLoadPageTest() throws InterruptedException {
				 AcceptedLoad ptvto=new   AcceptedLoad(LpgTestBase.driver); 
				
					/*
					 * ptvto.verifyMyerpagancycode(); ptvto.verifyMyerpUserid();
					 * ptvto.verifyMyerpPassword(); ptvto.VerifyandClickonMyerpLoginBtn();
					 */
				 ptvto.setup(driver);
				 ptvto.VerifyandClickonMyerpGodownTransactionModule();
				 ptvto.VerifyandClickonMyerpGTAccepteLoadForm();
				 ptvto.VerifyandClickonMyerpGTAccepteLoadInvoceNum();
				 ptvto.VerifyandClickonMyerpGTALsubmitbtn();
				 ptvto.VerifyandClickonMyerpGTSearchInvoceNum();
				 ptvto.VerifyandClickonMyerpGTInvoiceNumber();
				// ptvto.VerifyandClickonMyerpGTAccountTextBox();
				// ptvto.VerifyandClickonMyerpGTClearBtn();
			     ptvto.VerifyMyerpALSelectCompany();
				 ptvto.VerifyMyerpALSelectSupplier();
				 ptvto.VerifyandClickonMyerpALAccountTextbox();
				 ptvto.VerifyandClickonMyerpALSubmitBtn();
				
				 
			}
		}