package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.UpdatedAcceptedLoad;


		public  class UpdatedAcceptedLoadTest extends LpgTestBase{

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
			public void UpdatedAcceptedLoadPageTest() throws InterruptedException {
				UpdatedAcceptedLoad ptvto=new  UpdatedAcceptedLoad(LpgTestBase.driver); 
				
				 ptvto.verifyMyerpagancycode();
				 ptvto.verifyMyerpUserid();
				 ptvto.verifyMyerpPassword();
				 ptvto.VerifyandClickonMyerpLoginBtn();
				 ptvto.VerifyandClickonMyerpGodownTransactionModule();
				 ptvto.VerifyandClickonMyerpGTUpdatedAccepteLoadForm();
				 ptvto.VerifyandClickonMyerpGTInvoiceNumber();
				 ptvto.VerifyandClickonMyerpUALSearchButton();
				 
				 
			}
		}